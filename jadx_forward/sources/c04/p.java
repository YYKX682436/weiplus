package c04;

/* loaded from: classes13.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a f119219d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f119220e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a c17324xa321818a, boolean z17) {
        super(0);
        this.f119219d = c17324xa321818a;
        this.f119220e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a.A1;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a c17324xa321818a = this.f119219d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17323x5eec4c96 c17323x5eec4c96 = c17324xa321818a.f241172x;
        if (c17323x5eec4c96 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("animationDotsView");
            throw null;
        }
        c17323x5eec4c96.setVisibility(0);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17323x5eec4c96 c17323x5eec4c962 = c17324xa321818a.f241172x;
        if (c17323x5eec4c962 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("animationDotsView");
            throw null;
        }
        c17323x5eec4c962.mo13988x2d8c4542();
        android.widget.ImageView imageView = c17324xa321818a.C;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurView");
            throw null;
        }
        imageView.setVisibility(8);
        android.widget.ImageView imageView2 = c17324xa321818a.C;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurView");
            throw null;
        }
        imageView2.setImageBitmap(null);
        android.widget.ImageView imageView3 = c17324xa321818a.A;
        if (imageView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomBlurView");
            throw null;
        }
        imageView3.setVisibility(8);
        android.widget.ImageView imageView4 = c17324xa321818a.A;
        if (imageView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomBlurView");
            throw null;
        }
        imageView4.setImageBitmap(null);
        android.widget.ImageView imageView5 = c17324xa321818a.B;
        if (imageView5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
            throw null;
        }
        imageView5.setVisibility(8);
        android.widget.ImageView imageView6 = c17324xa321818a.B;
        if (imageView6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
            throw null;
        }
        imageView6.setImageBitmap(null);
        c17324xa321818a.u(!this.f119220e);
        android.view.View view = c17324xa321818a.f241178z;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("maskView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view2 = c17324xa321818a.f241175y;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("successMarkView");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/scanner/ui/scangoods/widget/ScanGoodsMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View view3 = c17324xa321818a.D;
        if (view3 != null) {
            view3.setTranslationY(0.0f);
        }
        c17324xa321818a.R = false;
        c17324xa321818a.S = false;
        c17324xa321818a.T = false;
        c17324xa321818a.V = null;
        c17324xa321818a.x();
        return jz5.f0.f384359a;
    }
}
