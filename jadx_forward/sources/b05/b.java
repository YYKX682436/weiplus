package b05;

/* loaded from: classes12.dex */
public final class b extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b05.c f98502q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(b05.c cVar, p13.u uVar) {
        super(uVar);
        this.f98502q = cVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "SearchWeShopTask";
    }

    @Override // p13.c
    public int k() {
        return 49;
    }

    @Override // p13.t
    public void p(p13.v ftsResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ftsResult, "ftsResult");
        p13.u uVar = this.f432668n;
        ftsResult.f432692d = p13.r.b(uVar.f432674c, true);
        ftsResult.f432693e = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        b05.i iVar = this.f98502q.f98504f;
        android.database.Cursor H = iVar != null ? iVar.H(ftsResult.f432692d, o13.d.f423754g, uVar.f432679h, null, true, true) : null;
        if (H != null) {
            while (H.moveToNext()) {
                try {
                    p13.z zVar = new p13.z();
                    zVar.c(H);
                    if (!hashSet.contains(java.lang.Long.valueOf(zVar.f432719d)) && !uVar.f432681j.contains(zVar.f432720e)) {
                        zVar.a();
                        ftsResult.f432693e.add(zVar);
                        hashSet.add(java.lang.Long.valueOf(zVar.f432719d));
                    }
                } finally {
                    H.close();
                }
            }
        }
        if (H != null) {
        }
        java.util.Comparator comparator = uVar.f432683l;
        if (comparator != null) {
            java.util.Collections.sort(ftsResult.f432693e, comparator);
        }
    }
}
