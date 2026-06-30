package com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui;

/* loaded from: classes.dex */
public final class h0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f254551a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18571x56e85567 f254552b;

    public h0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18571x56e85567 activityC18571x56e85567) {
        this.f254551a = u3Var;
        this.f254552b = activityC18571x56e85567;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        this.f254551a.dismiss();
        int i17 = fVar.f152149b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18571x56e85567 activityC18571x56e85567 = this.f254552b;
        if (i17 == 0 && fVar.f152148a == 0) {
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6955xb3c7260f c6955xb3c7260f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6955xb3c7260f();
            c6955xb3c7260f.f142612d = 1L;
            c6955xb3c7260f.f142613e = 2L;
            c6955xb3c7260f.f142614f = 2L;
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18571x56e85567.f254349q;
            c6955xb3c7260f.f142615g = c6955xb3c7260f.b("targetUsername", activityC18571x56e85567.U6(), true);
            return java.lang.Boolean.valueOf(c6955xb3c7260f.k());
        }
        java.lang.String str = fVar.f152150c;
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2262xa3787f7d.ui.ActivityC18571x56e85567.f254349q;
        android.widget.TextView textView = (android.widget.TextView) activityC18571x56e85567.findViewById(com.p314xaae8f345.mm.R.id.dhj);
        textView.setVisibility(0);
        if (str == null) {
            str = activityC18571x56e85567.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571923tn);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
        }
        textView.setText(str);
        return jz5.f0.f384359a;
    }
}
