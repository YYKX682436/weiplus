package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578;

/* loaded from: classes7.dex */
public final class d extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.m {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.c
    public void j(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 imageView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageView, "imageView");
        imageView.setVisibility(0);
        imageView.setImageResource(com.p314xaae8f345.mm.R.raw.f79831xac58b109);
        imageView.m82040x7541828(this.f171650e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560087ao));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.m
    public java.lang.String m() {
        java.lang.String string = this.f171650e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571796q0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1208x40828578.m, android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f = this.f171650e;
        android.content.Intent intent = activityC1102x9ee2d9f.getIntent();
        int i17 = intent != null && intent.getIntExtra("extra_get_usage_reason", 3) == 9 ? 2 : 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c5 c5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12644x463f8168.f170888f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activityC1102x9ee2d9f, "getActivity(...)");
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("extra_get_usage_reason", 8);
        intent2.putExtra("extra_get_usage_prescene", i17);
        intent2.putExtra("extra_enter_scene", 1);
        c5Var.a(activityC1102x9ee2d9f, intent2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.n0 n0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.n0.f169655d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(activityC1102x9ee2d9f, "getActivity(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(19468, 5, "", "", "", "", "", java.lang.Long.valueOf(n0Var.a(activityC1102x9ee2d9f).f169306d));
    }
}
