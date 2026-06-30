package com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/luggage/sdk/processes/main/RuntimeInfo;", "Landroid/os/Parcelable;", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.luggage.sdk.processes.main.RuntimeInfo */
/* loaded from: classes7.dex */
public final /* data */ class C3952x9062a486 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3952x9062a486> f15718x681a0c0c = new ye.m();

    /* renamed from: d, reason: collision with root package name */
    public final int f129192d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f129193e;

    /* renamed from: f, reason: collision with root package name */
    public final int f129194f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f129195g;

    /* renamed from: h, reason: collision with root package name */
    public final int f129196h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f129197i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f129198m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 f129199n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f129200o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f129201p;

    public C3952x9062a486(int i17, java.lang.String appId, int i18, boolean z17, int i19, java.lang.String instanceId, java.lang.String userName, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11808xe47dc718 initConfig, boolean z18, java.lang.String stackTrace) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(instanceId, "instanceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initConfig, "initConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stackTrace, "stackTrace");
        this.f129192d = i17;
        this.f129193e = appId;
        this.f129194f = i18;
        this.f129195g = z17;
        this.f129196h = i19;
        this.f129197i = instanceId;
        this.f129198m = userName;
        this.f129199n = initConfig;
        this.f129200o = z18;
        this.f129201p = stackTrace;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m32238xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3952x9062a486)) {
            return false;
        }
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3952x9062a486 c3952x9062a486 = (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3952x9062a486) obj;
        return this.f129192d == c3952x9062a486.f129192d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f129193e, c3952x9062a486.f129193e) && this.f129194f == c3952x9062a486.f129194f && this.f129195g == c3952x9062a486.f129195g && this.f129196h == c3952x9062a486.f129196h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f129197i, c3952x9062a486.f129197i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f129198m, c3952x9062a486.f129198m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f129199n, c3952x9062a486.f129199n) && this.f129200o == c3952x9062a486.f129200o && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f129201p, c3952x9062a486.f129201p);
    }

    /* renamed from: hashCode */
    public int m32239x8cdac1b() {
        return (((((((((((((((((java.lang.Integer.hashCode(this.f129192d) * 31) + this.f129193e.hashCode()) * 31) + java.lang.Integer.hashCode(this.f129194f)) * 31) + java.lang.Boolean.hashCode(this.f129195g)) * 31) + java.lang.Integer.hashCode(this.f129196h)) * 31) + this.f129197i.hashCode()) * 31) + this.f129198m.hashCode()) * 31) + this.f129199n.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f129200o)) * 31) + this.f129201p.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m32240x9616526c() {
        return "RuntimeInfo(processIndex=" + this.f129192d + ", appId=" + this.f129193e + ", versionType=" + this.f129194f + ", isGame=" + this.f129195g + ", appType=" + this.f129196h + ", instanceId=" + this.f129197i + ", userName=" + this.f129198m + ", initConfig=" + this.f129199n + ", isPersistentApp=" + this.f129200o + ", stackTrace=" + this.f129201p + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f129192d);
        out.writeString(this.f129193e);
        out.writeInt(this.f129194f);
        out.writeInt(this.f129195g ? 1 : 0);
        out.writeInt(this.f129196h);
        out.writeString(this.f129197i);
        out.writeString(this.f129198m);
        out.writeParcelable(this.f129199n, i17);
        out.writeInt(this.f129200o ? 1 : 0);
        out.writeString(this.f129201p);
    }
}
