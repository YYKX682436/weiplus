package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f216322a;

    /* renamed from: b, reason: collision with root package name */
    public final int f216323b;

    /* renamed from: c, reason: collision with root package name */
    public final int f216324c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f216325d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f216326e;

    /* renamed from: f, reason: collision with root package name */
    public int f216327f;

    /* renamed from: g, reason: collision with root package name */
    public final long f216328g;

    /* renamed from: h, reason: collision with root package name */
    public long f216329h;

    /* renamed from: i, reason: collision with root package name */
    public long f216330i;

    /* renamed from: j, reason: collision with root package name */
    public long f216331j;

    /* renamed from: k, reason: collision with root package name */
    public int f216332k;

    public j1(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feed, int i17, int i18, boolean z17, java.lang.String sessionId, int i19, long j17, long j18, long j19, long j27, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        long j28 = (i27 & 64) != 0 ? 0L : j17;
        long j29 = (i27 & 128) != 0 ? 0L : j18;
        long j37 = (i27 & 256) != 0 ? 0L : j19;
        long j38 = (i27 & 512) == 0 ? j27 : 0L;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        this.f216322a = feed;
        this.f216323b = i17;
        this.f216324c = i18;
        this.f216325d = z17;
        this.f216326e = sessionId;
        this.f216327f = i19;
        this.f216328g = j28;
        this.f216329h = j29;
        this.f216330i = j37;
        this.f216331j = j38;
    }

    public final org.json.JSONObject a() {
        java.lang.String str;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedId", pm0.v.u(this.f216322a.m76784x5db1b11()));
        jSONObject.put("commentScene", java.lang.String.valueOf(this.f216323b));
        jSONObject.put("tabType", java.lang.String.valueOf(this.f216324c));
        jSONObject.put("fromPreload", java.lang.String.valueOf(this.f216325d));
        jSONObject.put(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, java.lang.String.valueOf(this.f216326e));
        int i17 = this.f216327f;
        if (i17 == 0) {
            str = "None";
        } else if (i17 == 1) {
            str = "Dispatched";
        } else if (i17 == 2) {
            str = "Consumed";
        } else if (i17 == 3) {
            str = "Focused";
        } else if (i17 != 4) {
            str = "Unknown#" + i17;
        } else {
            str = "UnFocused";
        }
        jSONObject.put("status", str);
        jSONObject.put("dispatchTime", java.lang.String.valueOf(this.f216328g));
        jSONObject.put("consumeTime", java.lang.String.valueOf(this.f216329h));
        jSONObject.put("focusTime", java.lang.String.valueOf(this.f216330i));
        jSONObject.put("unFocusTime", java.lang.String.valueOf(this.f216331j));
        return jSONObject;
    }

    /* renamed from: equals */
    public boolean m63151xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j1 j1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.j1) obj;
        return j1Var.f216322a.m76784x5db1b11() == this.f216322a.m76784x5db1b11() && j1Var.f216323b == this.f216323b && j1Var.f216324c == this.f216324c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(j1Var.f216326e, this.f216326e) && j1Var.f216325d == this.f216325d;
    }

    /* renamed from: hashCode */
    public int m63152x8cdac1b() {
        return (((((((int) this.f216322a.m76784x5db1b11()) * 31) + this.f216323b) * 31) + this.f216324c) * 31) + java.lang.Boolean.hashCode(this.f216325d);
    }

    /* renamed from: toString */
    public java.lang.String m63153x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FeedDispatchInfo](feedId=");
        sb6.append(pm0.v.u(this.f216322a.m76784x5db1b11()));
        sb6.append(", commentScene=");
        sb6.append(this.f216323b);
        sb6.append(", tabType=");
        sb6.append(this.f216324c);
        sb6.append(", fromPreload=");
        sb6.append(this.f216325d);
        sb6.append(", sessionId=");
        sb6.append(this.f216326e);
        sb6.append(", status=");
        int i17 = this.f216327f;
        if (i17 == 0) {
            str = "None";
        } else if (i17 == 1) {
            str = "Dispatched";
        } else if (i17 == 2) {
            str = "Consumed";
        } else if (i17 == 3) {
            str = "Focused";
        } else if (i17 != 4) {
            str = "Unknown#" + i17;
        } else {
            str = "UnFocused";
        }
        sb6.append(str);
        sb6.append(", dispatchTime=");
        sb6.append(this.f216328g);
        sb6.append(", consumeTime=");
        sb6.append(this.f216329h);
        sb6.append(", focusTime=");
        sb6.append(this.f216330i);
        sb6.append(", unfocusTime=");
        sb6.append(this.f216331j);
        return sb6.toString();
    }
}
