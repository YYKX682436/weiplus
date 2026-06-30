package com.p314xaae8f345.mm.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/PocketMoneyEntryInfo;", "Landroid/os/Parcelable;", "CREATOR", "com/tencent/mm/ui/sg", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.PocketMoneyEntryInfo */
/* loaded from: classes9.dex */
public final /* data */ class C21431x397c46b6 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final com.p314xaae8f345.mm.ui.sg f39393x681a0c0c = new com.p314xaae8f345.mm.ui.sg(null);

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f278570d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f278571e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f278572f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f278573g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f278574h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f278575i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f278576m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f278577n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f278578o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f278579p;

    public C21431x397c46b6(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, java.lang.String str10, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i17 & 1) != 0 ? null : str;
        str2 = (i17 & 2) != 0 ? null : str2;
        str3 = (i17 & 4) != 0 ? null : str3;
        str4 = (i17 & 8) != 0 ? null : str4;
        str5 = (i17 & 16) != 0 ? null : str5;
        str6 = (i17 & 32) != 0 ? null : str6;
        str7 = (i17 & 64) != 0 ? null : str7;
        str8 = (i17 & 128) != 0 ? null : str8;
        str9 = (i17 & 256) != 0 ? null : str9;
        str10 = (i17 & 512) != 0 ? null : str10;
        this.f278570d = str;
        this.f278571e = str2;
        this.f278572f = str3;
        this.f278573g = str4;
        this.f278574h = str5;
        this.f278575i = str6;
        this.f278576m = str7;
        this.f278577n = str8;
        this.f278578o = str9;
        this.f278579p = str10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m78812xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.ui.C21431x397c46b6)) {
            return false;
        }
        com.p314xaae8f345.mm.ui.C21431x397c46b6 c21431x397c46b6 = (com.p314xaae8f345.mm.ui.C21431x397c46b6) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f278570d, c21431x397c46b6.f278570d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f278571e, c21431x397c46b6.f278571e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f278572f, c21431x397c46b6.f278572f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f278573g, c21431x397c46b6.f278573g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f278574h, c21431x397c46b6.f278574h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f278575i, c21431x397c46b6.f278575i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f278576m, c21431x397c46b6.f278576m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f278577n, c21431x397c46b6.f278577n) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f278578o, c21431x397c46b6.f278578o) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f278579p, c21431x397c46b6.f278579p);
    }

    /* renamed from: hashCode */
    public int m78813x8cdac1b() {
        java.lang.String str = this.f278570d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f278571e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f278572f;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f278573g;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f278574h;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f278575i;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        java.lang.String str7 = this.f278576m;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        java.lang.String str8 = this.f278577n;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        java.lang.String str9 = this.f278578o;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        java.lang.String str10 = this.f278579p;
        return hashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m78814x9616526c() {
        return "PocketMoneyInfo{pocketMoneyMsgTitle=" + this.f278570d + ",pocketMoneyMsgDesc=" + this.f278571e + ", pocketMoneyMsgThumbUrl=" + this.f278572f + ", pocketMoneyMsgSourceDisplayName=" + this.f278573g + ", pocketMoneyMsgSourceUserName=" + this.f278574h + ", pocketMoneyMsgItemPayMsgId=" + this.f278575i + ", pocketMoneyMsgItemSourceIcon=" + this.f278576m + ", pocketMoneyReqKidKey=" + this.f278577n + ", pocketMoneyReqContext=" + this.f278578o + ", pocketMoneyReqTokenSessionId=" + this.f278579p + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeString(this.f278570d);
        dest.writeString(this.f278571e);
        dest.writeString(this.f278572f);
        dest.writeString(this.f278573g);
        dest.writeString(this.f278574h);
        dest.writeString(this.f278575i);
        dest.writeString(this.f278576m);
        dest.writeString(this.f278577n);
        dest.writeString(this.f278578o);
        dest.writeString(this.f278579p);
    }
}
