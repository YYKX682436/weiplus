package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29;

/* renamed from: com.tencent.mm.plugin.ball.model.BallReportInfo */
/* loaded from: classes14.dex */
public class C12887x942bef81 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12887x942bef81> f35358x681a0c0c = new np1.e();

    /* renamed from: d, reason: collision with root package name */
    public int f174617d;

    /* renamed from: e, reason: collision with root package name */
    public int f174618e;

    /* renamed from: f, reason: collision with root package name */
    public int f174619f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f174620g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f174621h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f174622i;

    /* renamed from: m, reason: collision with root package name */
    public int f174623m;

    /* renamed from: n, reason: collision with root package name */
    public int f174624n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f174625o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f174626p;

    /* renamed from: q, reason: collision with root package name */
    public int f174627q;

    public C12887x942bef81(android.os.Parcel parcel) {
        this.f174617d = parcel.readInt();
        this.f174618e = parcel.readInt();
        this.f174619f = parcel.readInt();
        this.f174620g = parcel.readString();
        this.f174621h = parcel.readString();
        this.f174622i = parcel.readString();
        this.f174623m = parcel.readInt();
        this.f174625o = parcel.readString();
        this.f174626p = parcel.readString();
        this.f174627q = parcel.readInt();
        this.f174624n = parcel.readInt();
    }

    public static java.lang.String a(int i17) {
        if (i17 == 1) {
            return "weapp";
        }
        if (i17 == 2) {
            return "webview";
        }
        if (i17 == 3) {
            return "wenote";
        }
        if (i17 == 4) {
            return "file";
        }
        if (i17 == 7) {
            return "weapp";
        }
        if (i17 == 8) {
            return "k1kVideo";
        }
        if (i17 == 9) {
            return "voip";
        }
        if (i17 == 17 || i17 == 19) {
            return "weapp";
        }
        if (i17 == 36) {
            return "ting";
        }
        if (i17 == 32) {
            return "finder";
        }
        if (i17 == 33) {
            return "weapp";
        }
        if (i17 == 39) {
            return "tingRadioChannel";
        }
        if (i17 == 40) {
            return "wxaBgAudio";
        }
        switch (i17) {
            case 21:
                return "live";
            case 22:
                return "finder";
            case 23:
                return "music";
            default:
                switch (i17) {
                    case 48:
                        return "live";
                    case com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504.IMediaObject.f33159x41d5d4eb /* 49 */:
                    case 52:
                        return "finder";
                    case 50:
                        return "article";
                    case 51:
                        return "sessionImage";
                    case 53:
                        return "tingChatRoom";
                    default:
                        switch (i17) {
                            case 64:
                                return "tingMusic";
                            case 65:
                                return "bizAudio";
                            case 66:
                                return "quickPlayer";
                            case 67:
                                return "basicPlayer";
                            case 68:
                                return "standAlone";
                            default:
                                return "" + i17;
                        }
                }
        }
    }

    public static int b(int i17) {
        if (i17 == 1) {
            return 2;
        }
        if (i17 == 2) {
            return 1;
        }
        if (i17 == 16) {
            return 4;
        }
        if (i17 == 32) {
            return 5;
        }
        if (i17 == 64) {
            return 6;
        }
        if (i17 != 4096) {
            return (i17 == 32768 || i17 == 65536) ? 8 : 0;
        }
        return 3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: toString */
    public java.lang.String m54061x9616526c() {
        return "BallReportInfo{generateType=" + this.f174617d + ", generateScene=" + this.f174618e + ", bizScene=" + this.f174619f + ", bizId='" + this.f174620g + "', bizSubId='" + this.f174621h + "', bizName='" + this.f174622i + "', opType=" + this.f174623m + ", internal_sessionId='" + this.f174625o + "', internal_aggregationSessionId='" + this.f174626p + "', internal_taskOrder=" + this.f174627q + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f174617d);
        parcel.writeInt(this.f174618e);
        parcel.writeInt(this.f174619f);
        parcel.writeString(this.f174620g);
        parcel.writeString(this.f174621h);
        parcel.writeString(this.f174622i);
        parcel.writeInt(this.f174623m);
        parcel.writeString(this.f174625o);
        parcel.writeString(this.f174626p);
        parcel.writeInt(this.f174627q);
        parcel.writeInt(this.f174624n);
    }

    public C12887x942bef81(org.json.JSONObject jSONObject) {
        this.f174625o = jSONObject.optString("r_internal_sessionId", null);
        this.f174626p = jSONObject.optString("r_internal_aggregationSessionId", null);
        this.f174627q = jSONObject.optInt("r_internal_taskOrder", 1);
    }
}
