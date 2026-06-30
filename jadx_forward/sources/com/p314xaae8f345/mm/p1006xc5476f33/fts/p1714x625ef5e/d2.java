package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class d2 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 f219030q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 l2Var, p13.u uVar) {
        super(uVar);
        this.f219030q = l2Var;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchConvTalkerMessageTask";
    }

    @Override // p13.c
    public int k() {
        return 29;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        o("start");
        p13.u uVar = this.f432668n;
        java.lang.String str = uVar.f432674c;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l2 l2Var = this.f219030q;
        vVar.f432692d = p13.r.c(str, false, l2Var.f219151t);
        p13.r b17 = p13.r.b(uVar.f432676e, true);
        java.util.HashMap hashMap = new java.util.HashMap();
        android.database.Cursor Q = ((w13.b) ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).cj(3)).Q(b17, uVar.f432677f, o13.d.f423758k, o13.d.f423762o);
        while (Q.moveToNext()) {
            p13.z zVar = new p13.z();
            zVar.f432720e = Q.getString(0);
            zVar.f432717b = Q.getInt(1);
            zVar.f432718c = Q.getInt(2);
            zVar.f432736u = b17;
            if (!hashMap.containsKey(zVar.f432720e)) {
                hashMap.put(zVar.f432720e, zVar);
            }
            if (hashMap.size() > 100) {
                break;
            }
        }
        Q.close();
        o("findHitContact");
        android.database.Cursor O = l2Var.f219142h.O(vVar.f432692d, uVar.f432675d, hashMap.keySet());
        java.util.HashMap hashMap2 = new java.util.HashMap();
        while (((android.database.CursorWrapper) O).moveToNext()) {
            p13.z zVar2 = new p13.z();
            zVar2.d(O);
            zVar2.f432736u = vVar.f432692d;
            zVar2.f432730o = 1;
            java.util.List arrayList = hashMap2.containsKey(zVar2.f432722g) ? (java.util.List) hashMap2.get(zVar2.f432722g) : new java.util.ArrayList();
            arrayList.add(zVar2);
            hashMap2.put(zVar2.f432722g, arrayList);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.fts.e) O).close();
        vVar.f432693e = new java.util.ArrayList();
        for (java.util.Map.Entry entry : hashMap2.entrySet()) {
            p13.y yVar = (p13.y) hashMap.get(entry.getKey());
            if (yVar != null) {
                java.util.Collections.sort((java.util.List) entry.getValue(), uVar.f432683l);
                yVar.f432730o = entry.getValue();
                yVar.f432721f = ((p13.y) ((java.util.List) entry.getValue()).get(0)).f432721f;
                vVar.f432693e.add(yVar);
            }
        }
        java.util.Collections.sort(vVar.f432693e, uVar.f432683l);
        o("findHitMessage");
    }
}
