package ox0;

/* loaded from: classes5.dex */
public final class q implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10986x82320575 f431096d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 f431097e;

    public q(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10986x82320575 c10986x82320575, com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad63) {
        this.f431096d = c10986x82320575;
        this.f431097e = c4023x59e5ad63;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        view.removeOnLayoutChangeListener(this);
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4023x59e5ad63 c4023x59e5ad63 = this.f431097e;
        float f17 = c4023x59e5ad63.m32761xf6b22cd6().f129332x / c4023x59e5ad63.m32761xf6b22cd6().f129333y;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10986x82320575 c10986x82320575 = this.f431096d;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p907x2eba90.C10986x82320575.c(c10986x82320575, f17);
        c10986x82320575.d();
    }
}
