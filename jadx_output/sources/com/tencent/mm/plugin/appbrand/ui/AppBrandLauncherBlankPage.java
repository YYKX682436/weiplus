package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public final class AppBrandLauncherBlankPage extends com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment {
    public static android.view.ViewGroup p0(android.content.Context context, java.lang.String str) {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(1);
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setImageResource(com.tencent.mm.R.raw.app_brand_launcher_blank_tip_icon);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(i65.a.b(context, 50), i65.a.b(context, 50));
        layoutParams.topMargin = i65.a.b(context, 91);
        layoutParams.gravity = 1;
        linearLayout.addView(imageView, layoutParams);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setTextSize(2, 14.0f);
        textView.setTextColor(android.graphics.Color.parseColor("#B2B2B2"));
        textView.setGravity(17);
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = i65.a.b(context, 16);
        layoutParams2.gravity = 1;
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment
    public int getLayoutId() {
        return -1;
    }

    @Override // com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherUI.Fragment
    public void initView() {
        ((android.view.ViewGroup) this.f89369g).addView(p0(getActivity(), getArguments() == null ? null : getArguments().getString("extra_tip")), new android.view.ViewGroup.LayoutParams(-1, -1));
        com.tencent.mm.plugin.appbrand.report.v0.c(this.f89367e, "", 0, "", 0, "", this.f89368f);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (getActivity() != null) {
            getActivity().setTitle(getArguments() == null ? "" : getArguments().getString("extra_title"));
        }
    }
}
