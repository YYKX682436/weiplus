package dy0;

/* loaded from: classes5.dex */
public final class c implements android.view.View.OnScrollChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10994x5f336d41 f326081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f326082b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.HorizontalScrollView f326083c;

    public c(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10994x5f336d41 c10994x5f336d41, android.view.View view, android.widget.HorizontalScrollView horizontalScrollView) {
        this.f326081a = c10994x5f336d41;
        this.f326082b = view;
        this.f326083c = horizontalScrollView;
    }

    @Override // android.view.View.OnScrollChangeListener
    public final void onScrollChange(android.view.View view, int i17, int i18, int i19, int i27) {
        zj0.b bVar = new zj0.b();
        bVar.c(view);
        bVar.b(i17);
        bVar.b(i18);
        bVar.b(i19);
        bVar.b(i27);
        yj0.a.b("com/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar$initViews$1", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V", this, bVar.a());
        android.view.View sideShadow = this.f326082b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sideShadow, "$sideShadow");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10994x5f336d41.a(this.f326081a, sideShadow, this.f326083c.canScrollHorizontally(1));
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/widgets/ComposingBottomToolBar$initViews$1", "android/view/View$OnScrollChangeListener", "onScrollChange", "(Landroid/view/View;IIII)V");
    }
}
