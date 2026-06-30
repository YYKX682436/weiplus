package com.tencent.mm.plugin.appbrand.page.capsulebar;

@kotlin.Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&B#\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010'\u001a\u00020\u0013¢\u0006\u0004\b%\u0010(J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u0012\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0012\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0018\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0019H$J\n\u0010\u001b\u001a\u0004\u0018\u00010\fH$R\u001a\u0010 \u001a\u00020\u00058\u0014X\u0094D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006)"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/page/capsulebar/BaseAppBrandSingleCloseCapsuleBar;", "Landroid/widget/FrameLayout;", "Lmi1/q0;", "Lmi1/f2;", "", "", "url", "Ljz5/f0;", "setWxaIconUrl", "", "percent", "setHeaderAlpha", "Landroid/view/View;", "getView", "desc", "setDesc", "Landroid/view/View$OnClickListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setTitleClickListener", "", "color", "setStyleColor", "onClickListener", "setOptionButtonOnClickListener", "setHomeButtonOnClickListener", "Landroid/widget/ImageView;", "getWxaIcon", "getCloseButton", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public abstract class BaseAppBrandSingleCloseCapsuleBar extends android.widget.FrameLayout implements mi1.q0, mi1.f2 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String TAG;

    /* renamed from: e, reason: collision with root package name */
    public boolean f86498e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAppBrandSingleCloseCapsuleBar(android.content.Context context) {
        super(com.tencent.mm.plugin.appbrand.jsapi.coverview.d.a(context));
        kotlin.jvm.internal.o.g(context, "context");
        this.TAG = "MicroMsg.BaseAppBrandSingleCloseCapsuleBar";
    }

    public void e(float f17) {
        for (android.view.View view : getViewsNeedResponseAlphaAnimation()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/page/capsulebar/BaseAppBrandSingleCloseCapsuleBar", "animateHeaderAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/appbrand/page/capsulebar/BaseAppBrandSingleCloseCapsuleBar", "animateHeaderAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            if (f17 == 0.0f) {
                view.setClickable(false);
            } else if (!view.isClickable()) {
                view.setClickable(true);
            }
        }
    }

    public void f(java.lang.String str, com.tencent.mm.plugin.appbrand.config.WeAppHalfScreenHeaderTipsListener weAppHalfScreenHeaderTipsListener, yz5.a onCloseClick) {
        kotlin.jvm.internal.o.g(onCloseClick, "onCloseClick");
    }

    public void g(boolean z17) {
    }

    public abstract android.view.View getCloseButton();

    public java.lang.String getTAG() {
        return this.TAG;
    }

    public final android.view.View getView() {
        return this;
    }

    public abstract /* synthetic */ java.util.List getViewsNeedResponseAlphaAnimation();

    public abstract android.widget.ImageView getWxaIcon();

    public int h(int i17) {
        throw new java.lang.RuntimeException("must override this method");
    }

    public abstract /* synthetic */ void setCloseBtnListener(android.view.View.OnClickListener onClickListener);

    public void setDesc(java.lang.String desc) {
        kotlin.jvm.internal.o.g(desc, "desc");
    }

    public void setHeaderAlpha(float f17) {
        com.tencent.mars.xlog.Log.i(getTAG(), "setHeaderAlpha percent[" + f17 + ']');
        e(((f17 * 255.0f) / ((float) 100)) / 255.0f);
    }

    public void setHomeButtonOnClickListener(android.view.View.OnClickListener onClickListener) {
    }

    public void setOptionButtonOnClickListener(android.view.View.OnClickListener onClickListener) {
    }

    public abstract /* synthetic */ void setShareBtnListener(android.view.View.OnClickListener onClickListener);

    public void setStyleColor(int i17) {
    }

    public abstract /* synthetic */ void setTitle(java.lang.String str);

    public void setTitleClickListener(android.view.View.OnClickListener onClickListener) {
    }

    public void setWxaIconUrl(java.lang.String str) {
        if (getWxaIcon() == null) {
            return;
        }
        if (str == null || str.length() == 0) {
            android.widget.ImageView wxaIcon = getWxaIcon();
            if (wxaIcon != null) {
                wxaIcon.setImageDrawable(b3.l.getDrawable(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.drawable.cbh));
                return;
            }
            return;
        }
        l01.b bVar = l01.d0.f314761a;
        android.widget.ImageView wxaIcon2 = getWxaIcon();
        kotlin.jvm.internal.o.d(wxaIcon2);
        bVar.a(wxaIcon2, str, com.tencent.mm.R.drawable.cbh, l01.q0.f314787d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAppBrandSingleCloseCapsuleBar(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(com.tencent.mm.plugin.appbrand.jsapi.coverview.d.a(context), attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.TAG = "MicroMsg.BaseAppBrandSingleCloseCapsuleBar";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAppBrandSingleCloseCapsuleBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(com.tencent.mm.plugin.appbrand.jsapi.coverview.d.a(context), attributeSet, i17, 0);
        kotlin.jvm.internal.o.g(context, "context");
        this.TAG = "MicroMsg.BaseAppBrandSingleCloseCapsuleBar";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAppBrandSingleCloseCapsuleBar(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(com.tencent.mm.plugin.appbrand.jsapi.coverview.d.a(context), attributeSet, i17, i18);
        kotlin.jvm.internal.o.g(context, "context");
        this.TAG = "MicroMsg.BaseAppBrandSingleCloseCapsuleBar";
    }
}
