package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes8.dex */
public class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f272399a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f272400b;

    /* renamed from: c, reason: collision with root package name */
    public final int f272401c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f272402d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f272403e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f272404f;

    /* renamed from: g, reason: collision with root package name */
    public final int f272405g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f272406h;

    public i0(java.lang.String str, android.content.Context context) {
        this.f272399a = -7829368;
        this.f272400b = false;
        this.f272401c = -1593835521;
        this.f272402d = false;
        this.f272403e = false;
        this.f272404f = false;
        this.f272405g = 0;
        this.f272406h = false;
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "chatbg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatBgAttr", "parse chatbgattr failed, values is null");
            return;
        }
        try {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q1(java.lang.Integer.valueOf((java.lang.String) d17.get(".chatbg.$version")));
            if (((java.lang.String) d17.get(".chatbg.$time_color")) == null) {
                return;
            }
            this.f272399a = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1(java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) d17.get(".chatbg.$time_color"), 16)), context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
            this.f272400b = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1(java.lang.Boolean.valueOf((java.lang.String) d17.get(".chatbg.$time_show_shadow_color")));
            this.f272401c = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1(java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) d17.get(".chatbg.$time_shadow_color"), 16)), 0L);
            this.f272402d = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1(java.lang.Boolean.valueOf((java.lang.String) d17.get(".chatbg.$time_show_background")));
            this.f272403e = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1(java.lang.Boolean.valueOf((java.lang.String) d17.get(".chatbg.$time_light_background")));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1(java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) d17.get(".chatbg.$voice_second_color"), 16)), -16777216L);
            this.f272404f = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1(java.lang.Boolean.valueOf((java.lang.String) d17.get(".chatbg.$voice_second_show_shadow_color")));
            this.f272405g = (int) com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k1(java.lang.Long.valueOf(java.lang.Long.parseLong((java.lang.String) d17.get(".chatbg.$voice_second_shadow_color"), 16)), 0L);
            this.f272406h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.n1(java.lang.Boolean.valueOf((java.lang.String) d17.get(".chatbg.$voice_second_show_background")));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChatBgAttr", "parse chatbgattr failed");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChatBgAttr", e17, "", new java.lang.Object[0]);
        }
    }
}
