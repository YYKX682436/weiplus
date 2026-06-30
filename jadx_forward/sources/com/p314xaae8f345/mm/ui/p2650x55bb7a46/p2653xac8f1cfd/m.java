package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes14.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final long f280987a;

    /* renamed from: b, reason: collision with root package name */
    public final long f280988b;

    /* renamed from: c, reason: collision with root package name */
    public final int f280989c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f280990d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f280991e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f280992f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f280993g;

    /* renamed from: h, reason: collision with root package name */
    public final int f280994h;

    /* renamed from: i, reason: collision with root package name */
    public long f280995i;

    /* renamed from: j, reason: collision with root package name */
    public long f280996j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f280997k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f280998l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f280999m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f281000n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f281001o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f281002p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f281003q;

    public m(long j17, long j18, int i17, java.lang.String wxaMsgSenderUsername, java.lang.String appId, java.lang.String username, java.lang.String enterPath, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxaMsgSenderUsername, "wxaMsgSenderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterPath, "enterPath");
        this.f280987a = j17;
        this.f280988b = j18;
        this.f280989c = i17;
        this.f280990d = wxaMsgSenderUsername;
        this.f280991e = appId;
        this.f280992f = username;
        this.f280993g = enterPath;
        this.f280994h = i18;
        this.f280996j = -1L;
        this.f281003q = "";
    }

    public final long a() {
        if (0 < this.f280996j) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            this.f280995i += currentTimeMillis - this.f280996j;
            this.f280996j = currentTimeMillis;
        }
        return this.f280995i;
    }

    public final void b(java.lang.Long l17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgWxaReportComponent", "markEndExpose, msgId: " + this.f280987a);
        if (!this.f280999m) {
            if (0 < this.f280996j) {
                this.f280995i += (l17 != null ? l17.longValue() : java.lang.System.currentTimeMillis()) - this.f280996j;
                this.f280996j = -1L;
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgWxaReportComponent", "markEndExpose, already revoked or has not exposed");
    }

    public final void c(java.lang.Long l17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgWxaReportComponent", "markStartExpose, msgId: " + this.f280987a);
        if (!this.f280999m) {
            if (!(0 < this.f280996j)) {
                this.f280996j = l17 != null ? l17.longValue() : java.lang.System.currentTimeMillis();
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsgWxaReportComponent", "markStartExpose, already revoked or exposed");
    }

    /* renamed from: equals */
    public boolean m79494xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m mVar = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.m) obj;
        return this.f280987a == mVar.f280987a && this.f280988b == mVar.f280988b && this.f280989c == mVar.f280989c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f280990d, mVar.f280990d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f280991e, mVar.f280991e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f280992f, mVar.f280992f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f280993g, mVar.f280993g) && this.f280994h == mVar.f280994h;
    }

    /* renamed from: hashCode */
    public int m79495x8cdac1b() {
        return (((((((((((((java.lang.Long.hashCode(this.f280987a) * 31) + java.lang.Long.hashCode(this.f280988b)) * 31) + java.lang.Integer.hashCode(this.f280989c)) * 31) + this.f280990d.hashCode()) * 31) + this.f280991e.hashCode()) * 31) + this.f280992f.hashCode()) * 31) + this.f280993g.hashCode()) * 31) + java.lang.Integer.hashCode(this.f280994h);
    }

    /* renamed from: toString */
    public java.lang.String m79496x9616526c() {
        return "AppMsgWxaStatInfo(msgId=" + this.f280987a + ", wxaMsgId=" + this.f280988b + ", wxaMsgType=" + this.f280989c + ", wxaMsgSenderUsername='" + this.f280990d + "', appId='" + this.f280991e + "', username='" + this.f280992f + "', enterPath='" + this.f280993g + "', scene=" + this.f280994h + ", exposeTimePeriod=" + a() + ')';
    }
}
