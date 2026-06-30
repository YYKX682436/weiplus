package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p883x90995feb.p884x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dB#\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001c\u0010 J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006!"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/image_composing/view/ImageItemView;", "Lcom/tencent/mm/ui/widget/RoundCornerFrameLayout;", "", "selected", "Ljz5/f0;", "setSelected", "Lcom/tencent/mm/ui/widget/MMRoundCornerImageView;", "f", "Lcom/tencent/mm/ui/widget/MMRoundCornerImageView;", "getImageView", "()Lcom/tencent/mm/ui/widget/MMRoundCornerImageView;", "imageView", "Landroid/view/View;", "g", "Landroid/view/View;", "getSelectedView", "()Landroid/view/View;", "selectedView", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "h", "Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "getPlusView", "()Lcom/tencent/mm/ui/widget/imageview/WeImageView;", "plusView", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.mj_publisher.finder.image_composing.view.ImageItemView */
/* loaded from: classes3.dex */
public final class C10928xc73f1ab3 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.C22642x62f5b194 {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d imageView;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final android.view.View selectedView;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 plusView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10928xc73f1ab3(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d(context2);
        this.imageView = c22628xfde5d61d;
        android.view.View view = new android.view.View(getContext());
        this.selectedView = view;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(getContext());
        this.plusView = c22699x3dcdb352;
        int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        int dimension = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj);
        int dimension2 = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        int dimension3 = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        float dimension4 = getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        m81432x205ac394(dimension4);
        c22628xfde5d61d.m81387x205ac394((int) dimension4);
        c22628xfde5d61d.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        view.setBackgroundColor(color);
        int i17 = (dimension * 2) + dimension2;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i17, i17);
        layoutParams.gravity = 17;
        addView(view, layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(dimension2, dimension2);
        layoutParams2.gravity = 17;
        addView(c22628xfde5d61d, layoutParams2);
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(dimension3, dimension3);
        layoutParams3.gravity = 17;
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80871xf5f07ba7);
        c22699x3dcdb352.m82040x7541828(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.adi));
        addView(c22699x3dcdb352, layoutParams3);
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(i17, i17);
        layoutParams4.gravity = 17;
        setLayoutParams(layoutParams4);
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d getImageView() {
        return this.imageView;
    }

    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 getPlusView() {
        return this.plusView;
    }

    public final android.view.View getSelectedView() {
        return this.selectedView;
    }

    @Override // android.view.View
    public void setSelected(boolean z17) {
        super.setSelected(z17);
        android.view.View view = this.selectedView;
        if (z17) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/image_composing/view/ImageItemView", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/image_composing/view/ImageItemView", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(4);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/image_composing/view/ImageItemView", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/image_composing/view/ImageItemView", "setSelected", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10928xc73f1ab3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d(context2);
        this.imageView = c22628xfde5d61d;
        android.view.View view = new android.view.View(getContext());
        this.selectedView = view;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(getContext());
        this.plusView = c22699x3dcdb352;
        int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        int dimension = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj);
        int dimension2 = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        int dimension3 = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        float dimension4 = getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        m81432x205ac394(dimension4);
        c22628xfde5d61d.m81387x205ac394((int) dimension4);
        c22628xfde5d61d.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        view.setBackgroundColor(color);
        int i17 = (dimension * 2) + dimension2;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i17, i17);
        layoutParams.gravity = 17;
        addView(view, layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(dimension2, dimension2);
        layoutParams2.gravity = 17;
        addView(c22628xfde5d61d, layoutParams2);
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(dimension3, dimension3);
        layoutParams3.gravity = 17;
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80871xf5f07ba7);
        c22699x3dcdb352.m82040x7541828(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.adi));
        addView(c22699x3dcdb352, layoutParams3);
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(i17, i17);
        layoutParams4.gravity = 17;
        setLayoutParams(layoutParams4);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10928xc73f1ab3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.content.Context context2 = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d(context2);
        this.imageView = c22628xfde5d61d;
        android.view.View view = new android.view.View(getContext());
        this.selectedView = view;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(getContext());
        this.plusView = c22699x3dcdb352;
        int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
        int dimension = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561177bj);
        int dimension2 = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        int dimension3 = (int) getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        float dimension4 = getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl);
        m81432x205ac394(dimension4);
        c22628xfde5d61d.m81387x205ac394((int) dimension4);
        c22628xfde5d61d.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        view.setBackgroundColor(color);
        int i18 = (dimension * 2) + dimension2;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i18, i18);
        layoutParams.gravity = 17;
        addView(view, layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(dimension2, dimension2);
        layoutParams2.gravity = 17;
        addView(c22628xfde5d61d, layoutParams2);
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(dimension3, dimension3);
        layoutParams3.gravity = 17;
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80871xf5f07ba7);
        c22699x3dcdb352.m82040x7541828(b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.adi));
        addView(c22699x3dcdb352, layoutParams3);
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(i18, i18);
        layoutParams4.gravity = 17;
        setLayoutParams(layoutParams4);
    }
}
