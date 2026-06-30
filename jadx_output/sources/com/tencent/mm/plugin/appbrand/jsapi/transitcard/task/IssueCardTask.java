package com.tencent.mm.plugin.appbrand.jsapi.transitcard.task;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 +2\u00020\u0001:\u0001,B\t\b\u0016¢\u0006\u0004\b$\u0010%BM\b\u0016\u0012\u0006\u0010&\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0004\u0012\b\b\u0002\u0010#\u001a\u00020\u0004¢\u0006\u0004\b$\u0010'B\u0011\b\u0016\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b$\u0010*J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\nR\"\u0010\u001f\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\b\"\u0004\b\u001e\u0010\nR\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\b\"\u0004\b\"\u0010\n¨\u0006-"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/transitcard/task/IssueCardTask;", "Lcom/tencent/mm/plugin/appbrand/jsapi/transitcard/task/AbsTransitCardTask;", "Lhe1/h;", "B", "", "o", "Ljava/lang/String;", "I", "()Ljava/lang/String;", "P", "(Ljava/lang/String;)V", "issuerID", "p", "K", "R", "orderNo", "q", "M", "X", "sign", "r", "N", "Y", com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "s", "J", "Q", "operation", "t", "H", "O", "entrustId", "u", "L", "U", "paymentMode", "<init>", "()V", "appId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "je1/g", "luggage-commons-jsapi-transitcard-ext_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class IssueCardTask extends com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.AbsTransitCardTask {
    public static final je1.g CREATOR = new je1.g(null);

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public java.lang.String issuerID;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public java.lang.String orderNo;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    public java.lang.String sign;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    public java.lang.String timestamp;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    public java.lang.String operation;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    public java.lang.String entrustId;

    /* renamed from: u, reason: collision with root package name and from kotlin metadata */
    public java.lang.String paymentMode;

    public IssueCardTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.AbsTransitCardTask
    public he1.h B() {
        return new he1.f(I(), K(), M(), N(), J(), H(), L());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.AbsTransitCardTask
    public void E(android.os.Parcel in6) {
        kotlin.jvm.internal.o.g(in6, "in");
        java.lang.String readString = in6.readString();
        if (readString == null) {
            readString = "";
        }
        P(readString);
        java.lang.String readString2 = in6.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        R(readString2);
        java.lang.String readString3 = in6.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        X(readString3);
        java.lang.String readString4 = in6.readString();
        if (readString4 == null) {
            readString4 = "";
        }
        Y(readString4);
        java.lang.String readString5 = in6.readString();
        if (readString5 == null) {
            readString5 = "";
        }
        Q(readString5);
        java.lang.String readString6 = in6.readString();
        if (readString6 == null) {
            readString6 = "";
        }
        O(readString6);
        java.lang.String readString7 = in6.readString();
        U(readString7 != null ? readString7 : "");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.AbsTransitCardTask
    public void G(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(I());
        dest.writeString(K());
        dest.writeString(M());
        dest.writeString(N());
        dest.writeString(J());
        dest.writeString(H());
        dest.writeString(L());
    }

    public final java.lang.String H() {
        java.lang.String str = this.entrustId;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("entrustId");
        throw null;
    }

    public final java.lang.String I() {
        java.lang.String str = this.issuerID;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("issuerID");
        throw null;
    }

    public final java.lang.String J() {
        java.lang.String str = this.operation;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("operation");
        throw null;
    }

    public final java.lang.String K() {
        java.lang.String str = this.orderNo;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("orderNo");
        throw null;
    }

    public final java.lang.String L() {
        java.lang.String str = this.paymentMode;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("paymentMode");
        throw null;
    }

    public final java.lang.String M() {
        java.lang.String str = this.sign;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("sign");
        throw null;
    }

    public final java.lang.String N() {
        java.lang.String str = this.timestamp;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP);
        throw null;
    }

    public final void O(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.entrustId = str;
    }

    public final void P(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.issuerID = str;
    }

    public final void Q(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.operation = str;
    }

    public final void R(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.orderNo = str;
    }

    public final void U(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.paymentMode = str;
    }

    public final void X(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.sign = str;
    }

    public final void Y(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.timestamp = str;
    }

    public /* synthetic */ IssueCardTask(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i17, kotlin.jvm.internal.i iVar) {
        this(str, str2, str3, str4, str5, str6, (i17 & 64) != 0 ? "" : str7, (i17 & 128) != 0 ? "" : str8);
    }

    public IssueCardTask(java.lang.String appId, java.lang.String issuerID, java.lang.String orderNo, java.lang.String sign, java.lang.String timestamp, java.lang.String operation, java.lang.String entrustId, java.lang.String paymentMode) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(issuerID, "issuerID");
        kotlin.jvm.internal.o.g(orderNo, "orderNo");
        kotlin.jvm.internal.o.g(sign, "sign");
        kotlin.jvm.internal.o.g(timestamp, "timestamp");
        kotlin.jvm.internal.o.g(operation, "operation");
        kotlin.jvm.internal.o.g(entrustId, "entrustId");
        kotlin.jvm.internal.o.g(paymentMode, "paymentMode");
        this.f83472f = appId;
        P(issuerID);
        R(orderNo);
        X(sign);
        Y(timestamp);
        Q(operation);
        O(entrustId);
        U(paymentMode);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IssueCardTask(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.o.g(parcel, "parcel");
    }
}
