package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class w0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219253q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, p13.u uVar) {
        super(uVar);
        this.f219253q = lVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchContactTask";
    }

    @Override // p13.c
    public int k() {
        return 20;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        p13.u uVar = this.f432668n;
        p13.r b17 = p13.r.b(uVar.f432674c, true);
        vVar.f432692d = b17;
        android.database.Cursor R = this.f219253q.f219121g.R(b17, uVar.f432678g);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(uVar.f432681j);
        int i17 = 0;
        while (R.moveToNext()) {
            if (hashSet.add(R.getString(4))) {
                p13.z zVar = new p13.z();
                zVar.c(R);
                if (i17 >= zVar.f432718c) {
                    arrayList.add(zVar);
                } else {
                    if (arrayList.size() > uVar.f432680i) {
                        break;
                    }
                    i17 = zVar.f432718c;
                    arrayList.add(zVar);
                }
                if (java.lang.Thread.interrupted() || this.f432599f) {
                    R.close();
                    throw new java.lang.InterruptedException("Task is Cancel: " + uVar.f432674c);
                }
            }
        }
        R.close();
        vVar.f432693e = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p13.z zVar2 = (p13.z) it.next();
            zVar2.a();
            zVar2.b(vVar.f432692d);
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l.n(zVar2);
            vVar.f432693e.add(zVar2);
        }
        java.util.Comparator comparator = uVar.f432683l;
        if (comparator != null) {
            java.util.Collections.sort(vVar.f432693e, comparator);
        }
    }
}
