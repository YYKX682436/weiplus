package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public class i0 extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l f219094q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l lVar, p13.u uVar) {
        super(uVar);
        this.f219094q = lVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchContactLogic.SearchTask";
    }

    @Override // p13.c
    public int k() {
        return 11;
    }

    @Override // p13.t
    public void p(p13.v vVar) {
        boolean z17;
        p13.y yVar;
        p13.u uVar = this.f432668n;
        p13.r b17 = p13.r.b(uVar.f432674c, true);
        vVar.f432692d = b17;
        android.database.Cursor H = this.f219094q.f219121g.H(b17, uVar.f432678g, uVar.f432679h, null, true, true);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        while (H.moveToNext()) {
            p13.z zVar = new p13.z();
            zVar.c(H);
            if (!uVar.f432681j.contains(zVar.f432720e)) {
                int[] iArr = o13.d.f423757j;
                int i17 = zVar.f432717b;
                java.util.HashMap hashMap3 = o13.n.f423774a;
                boolean z18 = false;
                int i18 = 0;
                while (true) {
                    if (i18 >= 6) {
                        z17 = false;
                        break;
                    } else {
                        if (iArr[i18] == i17) {
                            z17 = true;
                            break;
                        }
                        i18++;
                    }
                }
                if (z17) {
                    p13.y yVar2 = (p13.y) hashMap.get(zVar.f432720e);
                    if (yVar2 == null || o13.n.b(o13.d.f423765r, zVar.f432718c, yVar2.f432718c) < 0) {
                        hashMap.put(zVar.f432720e, zVar);
                    }
                } else {
                    int[] iArr2 = o13.d.f423760m;
                    int i19 = zVar.f432717b;
                    int i27 = 0;
                    while (true) {
                        if (i27 >= 2) {
                            break;
                        }
                        if (iArr2[i27] == i19) {
                            z18 = true;
                            break;
                        }
                        i27++;
                    }
                    if (z18 && ((yVar = (p13.y) hashMap2.get(java.lang.Long.valueOf(zVar.f432719d))) == null || o13.n.b(o13.d.f423765r, zVar.f432718c, yVar.f432718c) < 0)) {
                        hashMap2.put(java.lang.Long.valueOf(zVar.f432719d), zVar);
                    }
                }
                if (java.lang.Thread.interrupted() || this.f432599f) {
                    H.close();
                    throw new java.lang.InterruptedException();
                }
            }
        }
        H.close();
        if (java.lang.Thread.interrupted() || this.f432599f) {
            throw new java.lang.InterruptedException();
        }
        vVar.f432693e = new java.util.ArrayList(hashMap.size());
        for (p13.z zVar2 : hashMap.values()) {
            zVar2.a();
            zVar2.b(vVar.f432692d);
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.l.n(zVar2);
            vVar.f432693e.add(zVar2);
        }
        vVar.f432693e.addAll(hashMap2.values());
        if (java.lang.Thread.interrupted() || this.f432599f) {
            throw new java.lang.InterruptedException();
        }
        java.util.Comparator comparator = uVar.f432683l;
        if (comparator != null) {
            java.util.Collections.sort(vVar.f432693e, comparator);
        }
    }
}
