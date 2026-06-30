package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0001$B\t\b\u0016¢\u0006\u0004\b\u001c\u0010\u001dB9\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u001b\u001a\u00020\u0004¢\u0006\u0004\b\u001c\u0010\u001fB\u0011\b\u0016\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\u001c\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010\u0006\u001a\u0004\b\u0015\u0010\b\"\u0004\b\u0016\u0010\nR\"\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u0019\u0010\b\"\u0004\b\u001a\u0010\n¨\u0006%"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/transitcard/task/RechargeTask;", "Lcom/tencent/mm/plugin/appbrand/jsapi/transitcard/task/AbsTransitCardTask;", "Lhe1/h;", "B", "", "o", "Ljava/lang/String;", "H", "()Ljava/lang/String;", "M", "(Ljava/lang/String;)V", "issuerID", "p", "J", "O", "orderNo", "q", "K", "P", "sign", "r", "L", "Q", com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6, "s", "I", "N", "operation", "<init>", "()V", "appId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "je1/h", "luggage-commons-jsapi-transitcard-ext_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.RechargeTask */
/* loaded from: classes15.dex */
public final class C12258x89a7d0ec extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585.AbstractC12251x248fbcf6 {

    /* renamed from: CREATOR */
    public static final je1.h f34893x681a0c0c = new je1.h(null);

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

    public C12258x89a7d0ec() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585.AbstractC12251x248fbcf6
    public he1.h B() {
        return new he1.g(H(), J(), K(), L(), I());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585.AbstractC12251x248fbcf6
    public void E(android.os.Parcel in6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(in6, "in");
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

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585.AbstractC12251x248fbcf6
    public void G(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("issuerID");
        throw null;
    }

    public final java.lang.String I() {
        java.lang.String str = this.operation;
        if (str != null) {
            return str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("operation");
        throw null;
    }

    public final java.lang.String J() {
        java.lang.String str = this.orderNo;
        if (str != null) {
            return str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("orderNo");
        throw null;
    }

    public final java.lang.String K() {
        java.lang.String str = this.sign;
        if (str != null) {
            return str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("sign");
        throw null;
    }

    public final java.lang.String L() {
        java.lang.String str = this.timestamp;
        if (str != null) {
            return str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.Param.f7359xa96138f6);
        throw null;
    }

    public final void M(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.issuerID = str;
    }

    public final void N(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.operation = str;
    }

    public final void O(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.orderNo = str;
    }

    public final void P(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.sign = str;
    }

    public final void Q(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.timestamp = str;
    }

    public C12258x89a7d0ec(java.lang.String appId, java.lang.String issuerID, java.lang.String orderNo, java.lang.String sign, java.lang.String timestamp, java.lang.String operation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(issuerID, "issuerID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(orderNo, "orderNo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sign, "sign");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timestamp, "timestamp");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(operation, "operation");
        this.f165005f = appId;
        M(issuerID);
        O(orderNo);
        P(sign);
        Q(timestamp);
        N(operation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12258x89a7d0ec(android.os.Parcel parcel) {
        super(parcel);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
    }
}
