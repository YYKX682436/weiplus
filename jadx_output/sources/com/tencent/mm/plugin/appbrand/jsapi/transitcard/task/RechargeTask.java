package com.tencent.mm.plugin.appbrand.jsapi.transitcard.task;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0001$B\t\b\u0016¢\u0006\u0004\b\u001c\u0010\u001dB9\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u001c\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\n¨\u0006%"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/transitcard/task/RechargeTask;", "Lcom/tencent/mm/plugin/appbrand/jsapi/transitcard/task/AbsTransitCardTask;", "Lhe1/h;", "B", "", "o", "Ljava/lang/String;", "H", "()Ljava/lang/String;", "M", "(Ljava/lang/String;)V", "issuerID", "p", "J", "O", "orderNo", "q", "K", "P", "sign", "r", "L", "Q", com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP, "s", "I", "N", "operation", "<init>", "()V", "appId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "je1/h", "luggage-commons-jsapi-transitcard-ext_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class RechargeTask extends com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.AbsTransitCardTask {
    public static final je1.h CREATOR = new je1.h(null);

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

    public RechargeTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.AbsTransitCardTask
    public he1.h B() {
        return new he1.g(H(), J(), K(), L(), I());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.AbsTransitCardTask
    public void E(android.os.Parcel in6) {
        kotlin.jvm.internal.o.g(in6, "in");
        java.lang.String readString = in6.readString();
        if (readString == null) {
            readString = "";
        }
        M(readString);
        java.lang.String readString2 = in6.readString();
        if (readString2 == null) {
            readString2 = "";
        }
        O(readString2);
        java.lang.String readString3 = in6.readString();
        if (readString3 == null) {
            readString3 = "";
        }
        P(readString3);
        java.lang.String readString4 = in6.readString();
        if (readString4 == null) {
            readString4 = "";
        }
        Q(readString4);
        java.lang.String readString5 = in6.readString();
        N(readString5 != null ? readString5 : "");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.AbsTransitCardTask
    public void G(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(H());
        dest.writeString(J());
        dest.writeString(K());
        dest.writeString(L());
        dest.writeString(I());
    }

    public final java.lang.String H() {
        java.lang.String str = this.issuerID;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("issuerID");
        throw null;
    }

    public final java.lang.String I() {
        java.lang.String str = this.operation;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("operation");
        throw null;
    }

    public final java.lang.String J() {
        java.lang.String str = this.orderNo;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("orderNo");
        throw null;
    }

    public final java.lang.String K() {
        java.lang.String str = this.sign;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("sign");
        throw null;
    }

    public final java.lang.String L() {
        java.lang.String str = this.timestamp;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o(com.google.android.gms.measurement.AppMeasurement.Param.TIMESTAMP);
        throw null;
    }

    public final void M(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.issuerID = str;
    }

    public final void N(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.operation = str;
    }

    public final void O(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.orderNo = str;
    }

    public final void P(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.sign = str;
    }

    public final void Q(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.timestamp = str;
    }

    public RechargeTask(java.lang.String appId, java.lang.String issuerID, java.lang.String orderNo, java.lang.String sign, java.lang.String timestamp, java.lang.String operation) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(issuerID, "issuerID");
        kotlin.jvm.internal.o.g(orderNo, "orderNo");
        kotlin.jvm.internal.o.g(sign, "sign");
        kotlin.jvm.internal.o.g(timestamp, "timestamp");
        kotlin.jvm.internal.o.g(operation, "operation");
        this.f83472f = appId;
        M(issuerID);
        O(orderNo);
        P(sign);
        Q(timestamp);
        N(operation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RechargeTask(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.o.g(parcel, "parcel");
    }
}
