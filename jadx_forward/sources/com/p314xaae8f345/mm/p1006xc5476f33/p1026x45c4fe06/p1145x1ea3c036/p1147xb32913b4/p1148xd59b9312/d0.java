package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312;

/* loaded from: classes7.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.l0 f167112d;

    public d0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.l0 l0Var) {
        this.f167112d = l0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        android.app.Activity r07 = this.f167112d.f167189a.r0();
        if (r07 == null) {
            return;
        }
        final ul1.j jVar = new ul1.j(r07, true);
        jVar.a(r07.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lbn));
        android.view.View findViewById = jVar.getContentView().findViewById(com.p314xaae8f345.mm.R.id.lbi);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast", "setLoading", "(Z)Lcom/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast", "setLoading", "(Z)Lcom/tencent/mm/plugin/appbrand/widget/prompt/AppBrandPopupToast;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView = jVar.f510118d;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = r07 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r07 : null;
        if (activityC0065xcd7aa112 != null && (mo273xed6858b4 = activityC0065xcd7aa112.mo273xed6858b4()) != null) {
            mo273xed6858b4.a(new p012xc85e97e9.p093xedfae76a.f() { // from class: com.tencent.mm.plugin.appbrand.luggage.export.functionalpage.NewSDKInvokeProcess$navigateBack$1$1$1
                @Override // p012xc85e97e9.p093xedfae76a.f, p012xc85e97e9.p093xedfae76a.h
                /* renamed from: onDestroy */
                public void mo7795xac79a11b(p012xc85e97e9.p093xedfae76a.y owner) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
                    ul1.j.this.dismiss();
                }
            });
        }
        jVar.b(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
    }
}
