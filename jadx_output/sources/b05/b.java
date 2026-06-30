package b05;

/* loaded from: classes12.dex */
public final class b extends p13.t {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b05.c f16969q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(b05.c cVar, p13.u uVar) {
        super(uVar);
        this.f16969q = cVar;
    }

    @Override // p13.c
    public java.lang.String getName() {
        return "SearchWeShopTask";
    }

    @Override // p13.c
    public int k() {
        return 49;
    }

    @Override // p13.t
    public void p(p13.v ftsResult) {
        kotlin.jvm.internal.o.g(ftsResult, "ftsResult");
        p13.u uVar = this.f351135n;
        ftsResult.f351159d = p13.r.b(uVar.f351141c, true);
        ftsResult.f351160e = new java.util.ArrayList();
        java.util.HashSet hashSet = new java.util.HashSet();
        b05.i iVar = this.f16969q.f16971f;
        android.database.Cursor H = iVar != null ? iVar.H(ftsResult.f351159d, o13.d.f342221g, uVar.f351146h, null, true, true) : null;
        if (H != null) {
            while (H.moveToNext()) {
                try {
                    p13.z zVar = new p13.z();
                    zVar.c(H);
                    if (!hashSet.contains(java.lang.Long.valueOf(zVar.f351186d)) && !uVar.f351148j.contains(zVar.f351187e)) {
                        zVar.a();
                        ftsResult.f351160e.add(zVar);
                        hashSet.add(java.lang.Long.valueOf(zVar.f351186d));
                    }
                } finally {
                    H.close();
                }
            }
        }
        if (H != null) {
        }
        java.util.Comparator comparator = uVar.f351150l;
        if (comparator != null) {
            java.util.Collections.sort(ftsResult.f351160e, comparator);
        }
    }
}
