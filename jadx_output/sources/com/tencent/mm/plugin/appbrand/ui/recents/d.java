package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public final class d extends com.tencent.mm.plugin.appbrand.ui.recents.m {
    @Override // com.tencent.mm.plugin.appbrand.ui.recents.c
    public void j(com.tencent.mm.ui.widget.imageview.WeImageView imageView) {
        kotlin.jvm.internal.o.g(imageView, "imageView");
        imageView.setVisibility(0);
        imageView.setImageResource(com.tencent.mm.R.raw.icons_filled_myminiprogram);
        imageView.setIconColor(this.f90117e.getResources().getColor(com.tencent.mm.R.color.f478554ao));
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.m
    public java.lang.String m() {
        java.lang.String string = this.f90117e.getString(com.tencent.mm.R.string.f490263q0);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.recents.m, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        androidx.fragment.app.FragmentActivity fragmentActivity = this.f90117e;
        android.content.Intent intent = fragmentActivity.getIntent();
        int i17 = intent != null && intent.getIntExtra("extra_get_usage_reason", 3) == 9 ? 2 : 0;
        com.tencent.mm.plugin.appbrand.ui.c5 c5Var = com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherFolderUI.f89355f;
        kotlin.jvm.internal.o.f(fragmentActivity, "getActivity(...)");
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("extra_get_usage_reason", 8);
        intent2.putExtra("extra_get_usage_prescene", i17);
        intent2.putExtra("extra_enter_scene", 1);
        c5Var.a(fragmentActivity, intent2);
        com.tencent.mm.plugin.appbrand.report.n0 n0Var = com.tencent.mm.plugin.appbrand.report.n0.f88122d;
        kotlin.jvm.internal.o.f(fragmentActivity, "getActivity(...)");
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19468, 5, "", "", "", "", "", java.lang.Long.valueOf(n0Var.a(fragmentActivity).f87773d));
    }
}
