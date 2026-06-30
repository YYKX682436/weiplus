package d04;

/* loaded from: classes13.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 f306994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f306995e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 c17327x39ee10a4, boolean z17) {
        super(0);
        this.f306994d = c17327x39ee10a4;
        this.f306995e = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2045xd1075a44.C17327x39ee10a4 c17327x39ee10a4 = this.f306994d;
        android.widget.ImageView imageView = c17327x39ee10a4.L1;
        if (imageView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurView");
            throw null;
        }
        imageView.setVisibility(8);
        android.widget.ImageView imageView2 = c17327x39ee10a4.L1;
        if (imageView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("blurView");
            throw null;
        }
        imageView2.setImageBitmap(null);
        android.widget.ImageView imageView3 = c17327x39ee10a4.J1;
        if (imageView3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomBlurView");
            throw null;
        }
        imageView3.setVisibility(8);
        android.widget.ImageView imageView4 = c17327x39ee10a4.J1;
        if (imageView4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bottomBlurView");
            throw null;
        }
        imageView4.setImageBitmap(null);
        android.widget.ImageView imageView5 = c17327x39ee10a4.K1;
        if (imageView5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
            throw null;
        }
        imageView5.setVisibility(8);
        android.widget.ImageView imageView6 = c17327x39ee10a4.K1;
        if (imageView6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.i6.f34488x24728b);
            throw null;
        }
        imageView6.setImageBitmap(null);
        c17327x39ee10a4.u(!this.f306995e);
        android.view.View view = c17327x39ee10a4.I1;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("maskView");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.ImageView imageView7 = c17327x39ee10a4.M1;
        if (imageView7 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("successMarkView");
            throw null;
        }
        imageView7.setVisibility(8);
        android.view.View view2 = c17327x39ee10a4.O1;
        if (view2 != null) {
            view2.setTranslationY(0.0f);
        }
        java.lang.Object obj = c17327x39ee10a4.N1;
        if (obj == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("scanProductListView");
            throw null;
        }
        android.view.View view3 = (android.view.View) obj;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(java.lang.Float.valueOf(1.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/scanner/ui/widget/ScanCodeProductMergeMaskView$onPreviewReady$callback$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        c17327x39ee10a4.R1 = false;
        c17327x39ee10a4.S1 = false;
        c17327x39ee10a4.T1 = false;
        c17327x39ee10a4.V1 = null;
        c17327x39ee10a4.M();
        return jz5.f0.f384359a;
    }
}
