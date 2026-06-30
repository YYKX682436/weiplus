package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class hm implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f210869a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 f210870b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f210871c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210872d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f210873e;

    public hm(in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1638x1b0fa33b.C15003x1d0c0ec1 c15003x1d0c0ec1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, java.lang.String str, java.lang.String str2) {
        this.f210869a = s0Var;
        this.f210870b = c15003x1d0c0ec1;
        this.f210871c = abstractC14490x69736cb5;
        this.f210872d = str;
        this.f210873e = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // ly1.a
    public java.util.Map b(java.lang.String str) {
        cw2.da videoView;
        in5.s0 s0Var = this.f210869a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) s0Var.p(com.p314xaae8f345.mm.R.id.e_k);
        int mo56685x3d7f3f1d = (c15196x85976f5f == null || (videoView = c15196x85976f5f.getVideoView()) == null) ? 0 : (int) ((((float) videoView.mo56685x3d7f3f1d()) / ((float) videoView.mo56695x7723e6ff())) * 100);
        int i17 = this.f210870b.viewModel.f383386f;
        if ((str != null && str.equals("view_clk")) != false) {
            i17 = ~i17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        android.content.Context context = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.util.Map c17 = d2Var.c(context);
        c17.putAll(kz5.c1.k(new jz5.l("feed_id", pm0.v.u(this.f210871c.mo2128x1ed62e84())), new jz5.l("session_buffer", this.f210872d), new jz5.l("playpercent", java.lang.Integer.valueOf(mo56685x3d7f3f1d)), new jz5.l("thank_status", java.lang.Integer.valueOf(i17)), new jz5.l("share_username", this.f210873e)));
        return c17;
    }
}
