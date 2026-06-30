package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class vg implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f196249d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.zf f196250e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.r0 f196251f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f196252g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f196253h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f196254i;

    public vg(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar, dk2.zf zfVar, in5.r0 r0Var, android.view.View view, android.view.View view2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f196249d = mgVar;
        this.f196250e = zfVar;
        this.f196251f = r0Var;
        this.f196252g = view;
        this.f196253h = view2;
        this.f196254i = h0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg commentPlugin = this.f196249d;
        if (itemId == 163) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(commentPlugin, "commentPlugin");
            dk2.zf msg = this.f196250e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("PARAM_MEMBERS_PROFILE_USERNAME", msg.a());
            bundle.putInt("PARAM_MEMBERS_PROFILE_SOURCE_TYPE", 2);
            bundle.putString("PARAM_MEMBERS_PROFILE_MESSAGE_ID", msg.v());
            bundle.putLong("PARAM_MEMBERS_PROFILE_MESSAGE_SEQ", msg.m());
            commentPlugin.f195036p.mo46557x60d69242(qo0.b.f446909l1, bundle);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zq zqVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.zq.f215023a;
            android.content.Context context = commentPlugin.f446856d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            zqVar.d(1, context, commentPlugin.S0(), this.f196251f.f374653d, this.f196252g, this.f196249d, menuItem, i17, this.f196250e);
        }
        this.f196253h.setBackground((android.graphics.drawable.Drawable) this.f196254i.f391656d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.oc.f214314a.a();
    }
}
