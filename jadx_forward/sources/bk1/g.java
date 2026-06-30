package bk1;

/* loaded from: classes4.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f102837d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.C12718xe1f0c9d6 f102838e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f f102839f;

    public g(android.view.ViewGroup viewGroup, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.C12718xe1f0c9d6 c12718xe1f0c9d6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1231xe821e364.C12808x5de4409f c12808x5de4409f) {
        this.f102837d = viewGroup;
        this.f102838e = c12718xe1f0c9d6;
        this.f102839f = c12808x5de4409f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int measuredHeight = this.f102837d.getMeasuredHeight();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1205xbf8a9d65.C12718xe1f0c9d6 c12718xe1f0c9d6 = this.f102838e;
        this.f102839f.i(new bk1.f(c12718xe1f0c9d6, measuredHeight - i65.a.f(c12718xe1f0c9d6.mo7438x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df)));
    }
}
