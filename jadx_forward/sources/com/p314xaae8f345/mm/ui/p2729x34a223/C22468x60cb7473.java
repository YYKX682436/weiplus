package com.p314xaae8f345.mm.ui.p2729x34a223;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB%\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/tencent/mm/ui/pref/MoreTabSnsPreference;", "Lcom/tencent/mm/plugin/newtips/NormalIconNewTipPreference;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.pref.MoreTabSnsPreference */
/* loaded from: classes8.dex */
public final class C22468x60cb7473 extends com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.C16742x4f474056 {

    /* renamed from: i2, reason: collision with root package name */
    public int f291058i2;

    public C22468x60cb7473(android.content.Context context) {
        super(context);
        this.f291058i2 = -1;
    }

    public final void p0() {
        android.widget.ImageView imageView;
        android.graphics.drawable.Drawable drawable;
        android.graphics.drawable.Drawable drawable2;
        int i17 = this.f291058i2;
        if (i17 == -1) {
            return;
        }
        if (i17 != 0) {
            android.widget.ImageView imageView2 = this.L1;
            if (imageView2 == null || (drawable2 = imageView2.getDrawable()) == null) {
                return;
            }
            drawable2.setColorFilter(this.f291058i2, android.graphics.PorterDuff.Mode.SRC_ATOP);
            return;
        }
        android.widget.ImageView imageView3 = this.L1;
        if ((imageView3 != null ? imageView3.getDrawable() : null) == null || (imageView = this.L1) == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        drawable.clearColorFilter();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        p0();
    }

    public C22468x60cb7473(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f291058i2 = -1;
    }

    public C22468x60cb7473(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f291058i2 = -1;
    }
}
