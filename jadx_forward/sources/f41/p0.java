package f41;

/* loaded from: classes11.dex */
public final class p0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569 f341039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f341040e;

    public p0(boolean z17, com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569 c11205xa3c55569) {
        this.f341040e = z17;
        this.f341039d = c11205xa3c55569;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = this.f341040e;
        com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569 c11205xa3c55569 = this.f341039d;
        if (!z17) {
            com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569.c(c11205xa3c55569);
            return;
        }
        int i17 = com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569.f153776v;
        c11205xa3c55569.m0().scrollTo(0, c11205xa3c55569.f());
        c11205xa3c55569.g();
    }
}
