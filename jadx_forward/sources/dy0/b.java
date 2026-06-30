package dy0;

/* loaded from: classes5.dex */
public final class b implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10994x5f336d41 f326078d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f326079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.HorizontalScrollView f326080f;

    public b(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10994x5f336d41 c10994x5f336d41, android.view.View view, android.widget.HorizontalScrollView horizontalScrollView) {
        this.f326078d = c10994x5f336d41;
        this.f326079e = view;
        this.f326080f = horizontalScrollView;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        view.removeOnLayoutChangeListener(this);
        android.view.View view2 = this.f326079e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view2);
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10994x5f336d41.a(this.f326078d, view2, this.f326080f.canScrollHorizontally(1));
    }
}
