package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/chattool/ChatToolParams;", "Landroid/os/Parcelable;", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.chattool.ChatToolParams */
/* loaded from: classes9.dex */
public final /* data */ class C12064xbfcfaad6 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12064xbfcfaad6> f34027x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.g();

    /* renamed from: d, reason: collision with root package name */
    public final boolean f161878d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f161879e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f161880f;

    /* renamed from: g, reason: collision with root package name */
    public final int f161881g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f161882h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f161883i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f161884m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f161885n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f161886o;

    /* renamed from: p, reason: collision with root package name */
    public final int f161887p;

    public C12064xbfcfaad6(boolean z17, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, boolean z18, java.lang.String str5, java.lang.String str6, int i18) {
        this.f161878d = z17;
        this.f161879e = str;
        this.f161880f = str2;
        this.f161881g = i17;
        this.f161882h = str3;
        this.f161883i = str4;
        this.f161884m = z18;
        this.f161885n = str5;
        this.f161886o = str6;
        this.f161887p = i18;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m50821xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12064xbfcfaad6)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12064xbfcfaad6 c12064xbfcfaad6 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1080x55bb90f0.C12064xbfcfaad6) obj;
        return this.f161878d == c12064xbfcfaad6.f161878d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161879e, c12064xbfcfaad6.f161879e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161880f, c12064xbfcfaad6.f161880f) && this.f161881g == c12064xbfcfaad6.f161881g && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161882h, c12064xbfcfaad6.f161882h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161883i, c12064xbfcfaad6.f161883i) && this.f161884m == c12064xbfcfaad6.f161884m && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161885n, c12064xbfcfaad6.f161885n) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161886o, c12064xbfcfaad6.f161886o) && this.f161887p == c12064xbfcfaad6.f161887p;
    }

    /* renamed from: hashCode */
    public int m50822x8cdac1b() {
        int hashCode = java.lang.Boolean.hashCode(this.f161878d) * 31;
        java.lang.String str = this.f161879e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f161880f;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Integer.hashCode(this.f161881g)) * 31;
        java.lang.String str3 = this.f161882h;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f161883i;
        int hashCode5 = (((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f161884m)) * 31;
        java.lang.String str5 = this.f161885n;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f161886o;
        return ((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f161887p);
    }

    /* renamed from: toString */
    public java.lang.String m50823x9616526c() {
        return "ChatToolParams(needEntrance=" + this.f161878d + ", appId=" + this.f161879e + ", entrancePath=" + this.f161880f + ", showSourceView=" + this.f161881g + ", iconUrl=" + this.f161882h + ", nickName=" + this.f161883i + ", useForChatTool=" + this.f161884m + ", sendToUserName=" + this.f161885n + ", chatToolRoom=" + this.f161886o + ", versionType=" + this.f161887p + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeInt(this.f161878d ? 1 : 0);
        out.writeString(this.f161879e);
        out.writeString(this.f161880f);
        out.writeInt(this.f161881g);
        out.writeString(this.f161882h);
        out.writeString(this.f161883i);
        out.writeInt(this.f161884m ? 1 : 0);
        out.writeString(this.f161885n);
        out.writeString(this.f161886o);
        out.writeInt(this.f161887p);
    }
}
