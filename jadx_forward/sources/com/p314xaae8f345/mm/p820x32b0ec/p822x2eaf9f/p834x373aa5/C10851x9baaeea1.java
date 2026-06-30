package com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/live/core/view/LiveVideoViewCompatCover;", "Landroid/widget/FrameLayout;", "Lcom/tencent/rtmp/ui/TXCloudVideoView;", "getVideoView", "Landroid/graphics/Bitmap;", "bitmap", "Ljz5/f0;", "setCoverImage", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.live.core.view.LiveVideoViewCompatCover */
/* loaded from: classes3.dex */
public final class C10851x9baaeea1 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f150156d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 f150157e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10851x9baaeea1(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        b();
    }

    public final void a() {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2 = this.f150156d;
        boolean z17 = false;
        if (imageView2 != null && imageView2.isShown()) {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVideoViewCompatCover", "hideCoverImage coverShown=" + z17);
        if (z17 && (imageView = this.f150156d) != null) {
            imageView.post(new mo0.g(this));
        }
    }

    public final void b() {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614 = new com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614(context);
        c10850xc00cf614.a(false).getHolder().setFormat(-3);
        this.f150157e = c10850xc00cf614;
        addView(c10850xc00cf614);
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.f150156d = imageView;
        imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.ImageView imageView2 = this.f150156d;
        if (imageView2 != null) {
            imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        android.widget.ImageView imageView3 = this.f150156d;
        if (imageView3 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(imageView3, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(imageView3, arrayList2.toArray(), "com/tencent/mm/live/core/view/LiveVideoViewCompatCover", "initCoverImageView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(imageView3, "com/tencent/mm/live/core/view/LiveVideoViewCompatCover", "initCoverImageView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(imageView3, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
    }

    /* renamed from: getVideoView */
    public final com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf m46540x4ee17f0a() {
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614 = this.f150157e;
        if (c10850xc00cf614 != null) {
            return c10850xc00cf614;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveVideoView");
        throw null;
    }

    /* renamed from: setCoverImage */
    public final void m46541x65d825e6(android.graphics.Bitmap bitmap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveVideoViewCompatCover", "setCoverImage");
        addView(this.f150156d);
        android.widget.ImageView imageView = this.f150156d;
        if (imageView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(imageView, arrayList2.toArray(), "com/tencent/mm/live/core/view/LiveVideoViewCompatCover", "setCoverImage", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(imageView, "com/tencent/mm/live/core/view/LiveVideoViewCompatCover", "setCoverImage", "(Landroid/graphics/Bitmap;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(imageView, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p820x32b0ec.p822x2eaf9f.p834x373aa5.C10850xc00cf614 c10850xc00cf614 = this.f150157e;
        if (c10850xc00cf614 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveVideoView");
            throw null;
        }
        c10850xc00cf614.setAlpha(0.0f);
        android.widget.ImageView imageView2 = this.f150156d;
        if (imageView2 != null) {
            imageView2.setImageBitmap(bitmap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10851x9baaeea1(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        b();
    }
}
