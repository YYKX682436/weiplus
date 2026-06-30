package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\t\b\u0016¢\u0006\u0004\b\u0016\u0010\u0017B'\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e¢\u0006\u0004\b\u0016\u0010\u0019B\u0011\b\u0016\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u0016\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\"\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR(\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/transitcard/task/GetCardInfoTask;", "Lcom/tencent/mm/plugin/appbrand/jsapi/transitcard/task/AbsTransitCardTask;", "Lhe1/h;", "B", "Ljz5/f0;", "z", "", "o", "Ljava/lang/String;", "I", "()Ljava/lang/String;", "K", "(Ljava/lang/String;)V", "issuerID", "", "p", "Ljava/util/List;", "H", "()Ljava/util/List;", "J", "(Ljava/util/List;)V", "fields", "<init>", "()V", "appId", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "je1/e", "luggage-commons-jsapi-transitcard-ext_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.GetCardInfoTask */
/* loaded from: classes15.dex */
public final class C12255x4bc520d9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585.AbstractC12251x248fbcf6 {

    /* renamed from: CREATOR */
    public static final je1.e f34890x681a0c0c = new je1.e(null);

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public java.lang.String issuerID;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public java.util.List fields;

    public C12255x4bc520d9() {
        J(kz5.p0.f395529d);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585.AbstractC12251x248fbcf6
    public he1.h B() {
        return new he1.d(I(), H());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585.AbstractC12251x248fbcf6
    public void E(android.os.Parcel in6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(in6, "in");
        java.lang.String readString = in6.readString();
        if (readString == null) {
            readString = "";
        }
        K(readString);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        in6.readStringList(arrayList);
        J(arrayList);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585.AbstractC12251x248fbcf6
    public void G(android.os.Parcel dest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dest, "dest");
        dest.writeString(I());
        dest.writeStringList(H());
    }

    public final java.util.List<java.lang.String> H() {
        java.util.List<java.lang.String> list = this.fields;
        if (list != null) {
            return list;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("fields");
        throw null;
    }

    public final java.lang.String I() {
        java.lang.String str = this.issuerID;
        if (str != null) {
            return str;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("issuerID");
        throw null;
    }

    public final void J(java.util.List<java.lang.String> list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "<set-?>");
        this.fields = list;
    }

    public final void K(java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        this.issuerID = str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1113x8e2f4f63.p1114x363585.AbstractC12251x248fbcf6, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        ee1.e b17 = ee1.g.b(this.f165005f, kz5.p0.f395529d, kz5.b0.c(I()));
        if (b17 instanceof ee1.c) {
            if (((ee1.c) b17).f333108b.contains(I())) {
                C();
                c();
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.TransitCard.GetCardInfoTask", "permission denied for issuerID=%s, appId=%s", I(), this.f165005f);
            this.f165009m = false;
            this.f165006g = 10010;
            java.lang.String str = "permission denied for issuerID=" + I();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            this.f165007h = str;
            c();
            return;
        }
        if (b17 instanceof ee1.b) {
            java.lang.Object[] objArr = new java.lang.Object[3];
            ee1.b bVar = (ee1.b) b17;
            objArr[0] = java.lang.Integer.valueOf(bVar.f333104a);
            objArr[1] = java.lang.Integer.valueOf(bVar.f333105b);
            java.lang.String str2 = bVar.f333106c;
            objArr[2] = str2 == null ? "" : str2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.GetCardInfoTask", "filter CGI network error, errType=%d, errCode=%d, errMsg=%s", objArr);
            this.f165009m = false;
            this.f165006g = 10013;
            java.lang.String str3 = "filter cgi failed: " + str2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
            this.f165007h = str3;
            c();
            return;
        }
        if (b17 instanceof ee1.a) {
            ee1.a aVar = (ee1.a) b17;
            int i17 = aVar.f333102a;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.String str4 = aVar.f333103b;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.GetCardInfoTask", "filter CGI biz error, retCode=%d, retMsg=%s", valueOf, str4);
            this.f165009m = false;
            this.f165006g = i17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str4, "<set-?>");
            this.f165007h = str4;
            c();
            return;
        }
        if (b17 instanceof ee1.d) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("filter CGI timeout: ");
            java.lang.String str5 = ((ee1.d) b17).f333109a;
            sb6.append(str5);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.TransitCard.GetCardInfoTask", sb6.toString());
            this.f165009m = false;
            this.f165006g = 10017;
            java.lang.String str6 = "filter cgi timeout: " + str5;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str6, "<set-?>");
            this.f165007h = str6;
            c();
        }
    }

    public C12255x4bc520d9(java.lang.String appId, java.lang.String issuerID, java.util.List<java.lang.String> fields) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(issuerID, "issuerID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fields, "fields");
        this.f165005f = appId;
        K(issuerID);
        J(fields);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12255x4bc520d9(android.os.Parcel parcel) {
        super(parcel);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parcel, "parcel");
    }
}
