package com.tencent.mm.live.core.mini;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0006\u001a\u00020\u0002H&J\u0012\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H&J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0002H\u0016J\u0012\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/live/core/mini/AbsLiveMiniView;", "Landroid/widget/FrameLayout;", "", "state", "Ljz5/f0;", "setState", "getCurrentState", "", "coverUrl", "setBgCoverUrl", "visibility", "setLiveFloatUpperView", "Landroid/graphics/Bitmap;", "bitmap", "setFloatBitmapCover", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "style", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public abstract class AbsLiveMiniView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f68573d = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbsLiveMiniView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public abstract void a(int i17);

    public void b(boolean z17, boolean z18) {
    }

    public abstract int c();

    public void d() {
    }

    public void e(boolean z17) {
    }

    public abstract void f(int i17);

    public abstract int getCurrentState();

    public abstract void setBgCoverUrl(java.lang.String str);

    public void setFloatBitmapCover(android.graphics.Bitmap bitmap) {
    }

    public void setLiveFloatUpperView(int i17) {
    }

    public abstract void setState(int i17);
}
