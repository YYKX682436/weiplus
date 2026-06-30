package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class r0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219193q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, p13.u uVar) {
        super(uVar);
        this.f219193q = lVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchChatroomTask";
    }

    @Override // p13.c
    public int k() {
        return 19;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        p13.u uVar = this.f432668n;
        p13.r b17 = p13.r.b(uVar.f432674c, true);
        vVar.f432692d = b17;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar = this.f219193q;
        android.database.Cursor H = lVar.f219121g.H(b17, new int[]{131075}, null, null, true, true);
        java.util.HashMap hashMap = new java.util.HashMap();
        while (H.moveToNext()) {
            p13.z zVar = new p13.z();
            zVar.c(H);
            if (!uVar.f432681j.contains(zVar.f432720e)) {
                p13.y yVar = (p13.y) hashMap.get(zVar.f432720e);
                if (yVar == null || o13.n.b(o13.d.f423765r, zVar.f432718c, yVar.f432718c) < 0) {
                    hashMap.put(zVar.f432720e, zVar);
                }
                if (java.lang.Thread.interrupted() || this.f432599f) {
                    H.close();
                    throw new java.lang.InterruptedException();
                }
            }
        }
        H.close();
        java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.size());
        for (p13.z zVar2 : hashMap.values()) {
            zVar2.a();
            zVar2.b(vVar.f432692d);
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l.n(zVar2);
            arrayList.add(zVar2);
            if (java.lang.Thread.interrupted() || this.f432599f) {
                throw new java.lang.InterruptedException();
            }
        }
        java.util.Comparator comparator = uVar.f432683l;
        if (comparator != null) {
            java.util.Collections.sort(arrayList, comparator);
        }
        vVar.f432693e = new java.util.ArrayList(hashMap.size());
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        for (int i17 = 0; i17 < arrayList.size(); i17++) {
            p13.y yVar2 = (p13.y) arrayList.get(i17);
            stringBuffer.append(yVar2.f432731p);
            stringBuffer.append("|");
            stringBuffer.append(yVar2.f432721f);
            stringBuffer.append(" ");
            vVar.f432693e.add(yVar2);
            if (i17 >= uVar.f432680i) {
                break;
            }
        }
        if (((java.util.ArrayList) vVar.f432692d.f432666e).size() > 1 && lVar.f219121g.O(vVar.f432692d)) {
            p13.y yVar3 = new p13.y();
            yVar3.f432720e = "create_chatroom\u200b";
            vVar.f432693e.add(0, yVar3);
            stringBuffer.append(" needCreateChatroom");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTS5SearchContactLogic", "rank score: %s", stringBuffer.toString());
    }
}
