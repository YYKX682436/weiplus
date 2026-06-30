package com.tencent.mm.plugin.ball.model;

/* loaded from: classes14.dex */
public class BallReportInfo implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.ball.model.BallReportInfo> CREATOR = new np1.e();

    /* renamed from: d, reason: collision with root package name */
    public int f93084d;

    /* renamed from: e, reason: collision with root package name */
    public int f93085e;

    /* renamed from: f, reason: collision with root package name */
    public int f93086f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f93087g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f93088h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f93089i;

    /* renamed from: m, reason: collision with root package name */
    public int f93090m;

    /* renamed from: n, reason: collision with root package name */
    public int f93091n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f93092o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f93093p;

    /* renamed from: q, reason: collision with root package name */
    public int f93094q;

    public BallReportInfo(android.os.Parcel parcel) {
        this.f93084d = parcel.readInt();
        this.f93085e = parcel.readInt();
        this.f93086f = parcel.readInt();
        this.f93087g = parcel.readString();
        this.f93088h = parcel.readString();
        this.f93089i = parcel.readString();
        this.f93090m = parcel.readInt();
        this.f93092o = parcel.readString();
        this.f93093p = parcel.readString();
        this.f93094q = parcel.readInt();
        this.f93091n = parcel.readInt();
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
                    case com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject.TYPE_OPENSDK_WEWORK_OBJECT /* 49 */:
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

    public java.lang.String toString() {
        return "BallReportInfo{generateType=" + this.f93084d + ", generateScene=" + this.f93085e + ", bizScene=" + this.f93086f + ", bizId='" + this.f93087g + "', bizSubId='" + this.f93088h + "', bizName='" + this.f93089i + "', opType=" + this.f93090m + ", internal_sessionId='" + this.f93092o + "', internal_aggregationSessionId='" + this.f93093p + "', internal_taskOrder=" + this.f93094q + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f93084d);
        parcel.writeInt(this.f93085e);
        parcel.writeInt(this.f93086f);
        parcel.writeString(this.f93087g);
        parcel.writeString(this.f93088h);
        parcel.writeString(this.f93089i);
        parcel.writeInt(this.f93090m);
        parcel.writeString(this.f93092o);
        parcel.writeString(this.f93093p);
        parcel.writeInt(this.f93094q);
        parcel.writeInt(this.f93091n);
    }

    public BallReportInfo(org.json.JSONObject jSONObject) {
        this.f93092o = jSONObject.optString("r_internal_sessionId", null);
        this.f93093p = jSONObject.optString("r_internal_aggregationSessionId", null);
        this.f93094q = jSONObject.optInt("r_internal_taskOrder", 1);
    }
}
