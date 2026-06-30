package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"com/tencent/mm/plugin/wallet_core/utils/WCPaySessionInfoRecorder$JsApiPayInfo", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/plugin/wallet_core/utils/o0", "wallet-api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.wallet_core.utils.WCPaySessionInfoRecorder$JsApiPayInfo */
/* loaded from: classes7.dex */
public final /* data */ class C19156xb6112c3 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.o0 f38705x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.o0(null);

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n0 f262371d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.s0 f262372e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.q0 f262373f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f262374g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f262375h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f262376i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f262377m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f262378n;

    /* renamed from: o, reason: collision with root package name */
    public final long f262379o;

    public C19156xb6112c3(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n0 chatType, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.s0 sendType, com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.q0 sessionType, java.lang.String sessionName, java.lang.String timelineObjId, java.lang.String msgSvrId, java.lang.String msgSendUserName, java.lang.String initRawUrl, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatType, "chatType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sendType, "sendType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionType, "sessionType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionName, "sessionName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timelineObjId, "timelineObjId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgSvrId, "msgSvrId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgSendUserName, "msgSendUserName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initRawUrl, "initRawUrl");
        this.f262371d = chatType;
        this.f262372e = sendType;
        this.f262373f = sessionType;
        this.f262374g = sessionName;
        this.f262375h = timelineObjId;
        this.f262376i = msgSvrId;
        this.f262377m = msgSendUserName;
        this.f262378n = initRawUrl;
        this.f262379o = j17;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m73945xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19156xb6112c3)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19156xb6112c3 c19156xb6112c3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.C19156xb6112c3) obj;
        return this.f262371d == c19156xb6112c3.f262371d && this.f262372e == c19156xb6112c3.f262372e && this.f262373f == c19156xb6112c3.f262373f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f262374g, c19156xb6112c3.f262374g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f262375h, c19156xb6112c3.f262375h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f262376i, c19156xb6112c3.f262376i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f262377m, c19156xb6112c3.f262377m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f262378n, c19156xb6112c3.f262378n) && this.f262379o == c19156xb6112c3.f262379o;
    }

    /* renamed from: hashCode */
    public int m73946x8cdac1b() {
        return (((((((((((((((this.f262371d.hashCode() * 31) + this.f262372e.hashCode()) * 31) + this.f262373f.hashCode()) * 31) + this.f262374g.hashCode()) * 31) + this.f262375h.hashCode()) * 31) + this.f262376i.hashCode()) * 31) + this.f262377m.hashCode()) * 31) + this.f262378n.hashCode()) * 31) + java.lang.Long.hashCode(this.f262379o);
    }

    /* renamed from: toString */
    public java.lang.String m73947x9616526c() {
        return "JsApiPayInfo(chatType=" + this.f262371d + ", sendType=" + this.f262372e + ", sessionType=" + this.f262373f + ", sessionName=" + this.f262374g + ", timelineObjId=" + this.f262375h + ", msgSvrId=" + this.f262376i + ", msgSendUserName=" + this.f262377m + ", initRawUrl=" + this.f262378n + ", initTimestamp=" + this.f262379o + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeInt(this.f262371d.f262482d);
        dest.writeInt(this.f262372e.f262518d);
        dest.writeInt(this.f262373f.f262502d);
        dest.writeString(this.f262374g);
        dest.writeString(this.f262375h);
        dest.writeString(this.f262376i);
        dest.writeString(this.f262377m);
        dest.writeString(this.f262378n);
        dest.writeLong(this.f262379o);
    }

    public /* synthetic */ C19156xb6112c3(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, str2, i17, str3, str4, (i18 & 32) != 0 ? "" : str5, (i18 & 64) != 0 ? 0L : j17);
    }

    public C19156xb6112c3(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j17) {
        this(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n0.f262472e.a(str), com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.s0.f262513e.a(str2), com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.q0.f262498e.a(i17), str3 == null ? "" : str3, "", str4 == null ? "" : str4, str2 == null ? "" : str2, str5 == null ? "" : str5, j17);
    }

    public C19156xb6112c3(java.lang.String str, java.lang.String str2) {
        this(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.n0.f262472e.b(str), com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.s0.f262513e.a(str), com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.q0.f262499f, "", "", "", "", "", 0L);
    }
}
