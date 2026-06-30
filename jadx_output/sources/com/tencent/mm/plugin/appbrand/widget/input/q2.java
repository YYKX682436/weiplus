package com.tencent.mm.plugin.appbrand.widget.input;

/* loaded from: classes7.dex */
public class q2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.widget.input.AppBrandNumberKeyboardView f91624d;

    public q2(com.tencent.mm.plugin.appbrand.widget.input.AppBrandNumberKeyboardView appBrandNumberKeyboardView) {
        this.f91624d = appBrandNumberKeyboardView;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/input/AppBrandNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.appbrand.widget.input.AppBrandNumberKeyboardView appBrandNumberKeyboardView = this.f91624d;
        if (appBrandNumberKeyboardView.f91271y == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (view.getId() == com.tencent.mm.R.id.tenpay_keyboard_x) {
            int i17 = appBrandNumberKeyboardView.f91269w;
            if (i17 == 1) {
                str = "X";
            } else {
                if (i17 != 2) {
                    yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                    return;
                }
                str = ".";
            }
        } else {
            java.lang.String str2 = null;
            for (int i18 = 0; i18 < appBrandNumberKeyboardView.f91270x.size(); i18++) {
                if (view.getId() == appBrandNumberKeyboardView.f91270x.valueAt(i18)) {
                    str2 = java.lang.String.valueOf(appBrandNumberKeyboardView.f91270x.keyAt(i18));
                }
            }
            str = str2;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        } else {
            appBrandNumberKeyboardView.f91271y.commitText(str, str.length());
            yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/input/AppBrandNumberKeyboardView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
        }
    }
}
