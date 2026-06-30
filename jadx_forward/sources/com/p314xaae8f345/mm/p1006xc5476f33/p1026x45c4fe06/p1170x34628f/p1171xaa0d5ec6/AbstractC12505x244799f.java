package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.p1171xaa0d5ec6;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u001b\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&B#\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\u0006\u0010'\u001a\u00020\u0013¢\u0006\u0004\b%\u0010(J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u0012\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0012\u0010\u0017\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0016J\u0012\u0010\u0018\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0010H\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0019H$J\n\u0010\u001b\u001a\u0004\u0018\u00010\fH$R\u001a\u0010 \u001a\u00020\u00058\u0014X\u0094D¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006)"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/page/capsulebar/BaseAppBrandSingleCloseCapsuleBar;", "Landroid/widget/FrameLayout;", "Lmi1/q0;", "Lmi1/f2;", "", "", "url", "Ljz5/f0;", "setWxaIconUrl", "", "percent", "setHeaderAlpha", "Landroid/view/View;", "getView", "desc", "setDesc", "Landroid/view/View$OnClickListener;", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1928x4237fde6.CastExtraArgs.f5946x7ee2b4b4, "setTitleClickListener", "", "color", "setStyleColor", "onClickListener", "setOptionButtonOnClickListener", "setHomeButtonOnClickListener", "Landroid/widget/ImageView;", "getWxaIcon", "getCloseButton", "d", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.page.capsulebar.BaseAppBrandSingleCloseCapsuleBar */
/* loaded from: classes7.dex */
public abstract class AbstractC12505x244799f extends android.widget.FrameLayout implements mi1.q0, mi1.f2 {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final java.lang.String TAG;

    /* renamed from: e, reason: collision with root package name */
    public boolean f168031e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12505x244799f(android.content.Context context) {
        super(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.d.a(context));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.TAG = "MicroMsg.BaseAppBrandSingleCloseCapsuleBar";
    }

    public void e(float f17) {
        for (android.view.View view : mo52136x3e107575()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
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

    public void f(java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11818x81f6960b c11818x81f6960b, yz5.a onCloseClick) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onCloseClick, "onCloseClick");
    }

    public void g(boolean z17) {
    }

    /* renamed from: getCloseButton */
    public abstract android.view.View mo52135xc732de14();

    public java.lang.String getTAG() {
        return this.TAG;
    }

    /* renamed from: getView */
    public final android.view.View m52147xfb86a31b() {
        return this;
    }

    /* renamed from: getViewsNeedResponseAlphaAnimation */
    public abstract /* synthetic */ java.util.List mo52136x3e107575();

    /* renamed from: getWxaIcon */
    public abstract android.widget.ImageView mo52137xa711ea03();

    public int h(int i17) {
        throw new java.lang.RuntimeException("must override this method");
    }

    /* renamed from: setCloseBtnListener */
    public abstract /* synthetic */ void mo52138xaaa7669a(android.view.View.OnClickListener onClickListener);

    /* renamed from: setDesc */
    public void mo52145x76492e13(java.lang.String desc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
    }

    /* renamed from: setHeaderAlpha */
    public void m52148xb526290f(float f17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(getTAG(), "setHeaderAlpha percent[" + f17 + ']');
        e(((f17 * 255.0f) / ((float) 100)) / 255.0f);
    }

    /* renamed from: setHomeButtonOnClickListener */
    public void m52149x4dad334a(android.view.View.OnClickListener onClickListener) {
    }

    /* renamed from: setOptionButtonOnClickListener */
    public void m52150x39261f4(android.view.View.OnClickListener onClickListener) {
    }

    /* renamed from: setShareBtnListener */
    public abstract /* synthetic */ void mo52140x13b38e53(android.view.View.OnClickListener onClickListener);

    /* renamed from: setStyleColor */
    public void m52151x23320e34(int i17) {
    }

    /* renamed from: setTitle */
    public abstract /* synthetic */ void mo52141x53bfe316(java.lang.String str);

    /* renamed from: setTitleClickListener */
    public void mo52146x8f9a66e6(android.view.View.OnClickListener onClickListener) {
    }

    /* renamed from: setWxaIconUrl */
    public void m52152x4bd4ce78(java.lang.String str) {
        if (mo52137xa711ea03() == null) {
            return;
        }
        if (str == null || str.length() == 0) {
            android.widget.ImageView mo52137xa711ea03 = mo52137xa711ea03();
            if (mo52137xa711ea03 != null) {
                mo52137xa711ea03.setImageDrawable(b3.l.m9707x4a96be14(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30861xcebc809e.cbh));
                return;
            }
            return;
        }
        l01.b bVar = l01.d0.f396294a;
        android.widget.ImageView mo52137xa711ea032 = mo52137xa711ea03();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo52137xa711ea032);
        bVar.a(mo52137xa711ea032, str, com.p314xaae8f345.mm.R.C30861xcebc809e.cbh, l01.q0.f396320d);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12505x244799f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.d.a(context), attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.TAG = "MicroMsg.BaseAppBrandSingleCloseCapsuleBar";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12505x244799f(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.d.a(context), attributeSet, i17, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.TAG = "MicroMsg.BaseAppBrandSingleCloseCapsuleBar";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC12505x244799f(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18) {
        super(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.d.a(context), attributeSet, i17, i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.TAG = "MicroMsg.BaseAppBrandSingleCloseCapsuleBar";
    }
}
