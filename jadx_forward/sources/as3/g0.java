package as3;

/* loaded from: classes11.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16917xf24b9dac f95039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zy2.xb f95040e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f95041f;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16917xf24b9dac c16917xf24b9dac, zy2.xb xbVar, boolean z17) {
        this.f95039d = c16917xf24b9dac;
        this.f95040e = xbVar;
        this.f95041f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.C14876x9baef275) this.f95040e).f204835m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.p1967x373aa5.C16917xf24b9dac c16917xf24b9dac = this.f95039d;
        c16917xf24b9dac.m67717xb8dfca8a(i17 + i65.a.b(c16917xf24b9dac.getContext(), 8));
        if (this.f95041f) {
            c16917xf24b9dac.d(0, c16917xf24b9dac.foldHeight, 0.0f, 1.0f);
        } else {
            c16917xf24b9dac.d(c16917xf24b9dac.foldHeight, 0, 1.0f, 0.0f);
        }
    }
}
