package com.tencent.mm.live.core.view;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/live/core/view/LiveVideoViewCompatCover;", "Landroid/widget/FrameLayout;", "Lcom/tencent/rtmp/ui/TXCloudVideoView;", "getVideoView", "Landroid/graphics/Bitmap;", "bitmap", "Ljz5/f0;", "setCoverImage", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class LiveVideoViewCompatCover extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f68623d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.live.core.view.LiveVideoView f68624e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVideoViewCompatCover(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        b();
    }

    public final void a() {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2 = this.f68623d;
        boolean z17 = false;
        if (imageView2 != null && imageView2.isShown()) {
            z17 = true;
        }
        com.tencent.mars.xlog.Log.i("LiveVideoViewCompatCover", "hideCoverImage coverShown=" + z17);
        if (z17 && (imageView = this.f68623d) != null) {
            imageView.post(new mo0.g(this));
        }
    }

    public final void b() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.live.core.view.LiveVideoView liveVideoView = new com.tencent.mm.live.core.view.LiveVideoView(context);
        liveVideoView.a(false).getHolder().setFormat(-3);
        this.f68624e = liveVideoView;
        addView(liveVideoView);
        android.widget.ImageView imageView = new android.widget.ImageView(getContext());
        this.f68623d = imageView;
        imageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.ImageView imageView2 = this.f68623d;
        if (imageView2 != null) {
            imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        android.widget.ImageView imageView3 = this.f68623d;
        if (imageView3 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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

    public final com.tencent.rtmp.ui.TXCloudVideoView getVideoView() {
        com.tencent.mm.live.core.view.LiveVideoView liveVideoView = this.f68624e;
        if (liveVideoView != null) {
            return liveVideoView;
        }
        kotlin.jvm.internal.o.o("liveVideoView");
        throw null;
    }

    public final void setCoverImage(android.graphics.Bitmap bitmap) {
        kotlin.jvm.internal.o.g(bitmap, "bitmap");
        com.tencent.mars.xlog.Log.i("LiveVideoViewCompatCover", "setCoverImage");
        addView(this.f68623d);
        android.widget.ImageView imageView = this.f68623d;
        if (imageView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
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
        com.tencent.mm.live.core.view.LiveVideoView liveVideoView = this.f68624e;
        if (liveVideoView == null) {
            kotlin.jvm.internal.o.o("liveVideoView");
            throw null;
        }
        liveVideoView.setAlpha(0.0f);
        android.widget.ImageView imageView2 = this.f68623d;
        if (imageView2 != null) {
            imageView2.setImageBitmap(bitmap);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LiveVideoViewCompatCover(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        b();
    }
}
