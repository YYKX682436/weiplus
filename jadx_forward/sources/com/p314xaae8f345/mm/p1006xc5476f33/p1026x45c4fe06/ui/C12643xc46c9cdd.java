package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.AppBrandLauncherBlankPage */
/* loaded from: classes7.dex */
public final class C12643xc46c9cdd extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.Fragment {
    public static android.view.ViewGroup p0(android.content.Context context, java.lang.String str) {
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
        linearLayout.setOrientation(1);
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f78454x976ecc51);
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

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.Fragment
    /* renamed from: getLayoutId */
    public int mo52909x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12645x113db0da.Fragment
    /* renamed from: initView */
    public void mo52910x10010bd5() {
        ((android.view.ViewGroup) this.f170902g).addView(p0(mo7430x19263085(), m7436x8619eaa0() == null ? null : m7436x8619eaa0().getString("extra_tip")), new android.view.ViewGroup.LayoutParams(-1, -1));
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.c(this.f170900e, "", 0, "", 0, "", this.f170901f);
    }

    @Override // com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        if (mo7430x19263085() != null) {
            mo7430x19263085().setTitle(m7436x8619eaa0() == null ? "" : m7436x8619eaa0().getString("extra_title"));
        }
    }
}
