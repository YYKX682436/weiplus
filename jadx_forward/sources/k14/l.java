package k14;

/* loaded from: classes12.dex */
public class l implements com.p314xaae8f345.mm.app.g3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k14.n f384890a;

    public l(k14.n nVar) {
        this.f384890a = nVar;
    }

    @Override // com.p314xaae8f345.mm.app.g3
    public void a(java.lang.String str) {
        d(-1, 0L, 0L, false);
    }

    @Override // com.p314xaae8f345.mm.app.g3
    public void b(int i17, java.lang.String str) {
        d(0, 0L, 0L, true);
    }

    @Override // com.p314xaae8f345.mm.app.g3
    public void c(java.lang.String str, int i17, long j17, long j18) {
        d(i17, j17, j18, false);
        boolean z17 = this.f384890a.f384894a;
    }

    public final void d(int i17, long j17, long j18, boolean z17) {
        if (i17 >= 0 && i17 < 100 && !z17) {
            k14.m mVar = k14.n.f384892f;
            if (mVar != null) {
                mVar.a(i17, j17, j18, z17);
                return;
            }
            return;
        }
        k14.m mVar2 = k14.n.f384892f;
        if (mVar2 != null) {
            mVar2.a(i17, j17, j18, z17);
            k14.n.f384892f = null;
        }
        this.f384890a.f384894a = false;
    }
}
