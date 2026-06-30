package com.tencent.mm.plugin.appbrand.jsapi.transitcard.task;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\t\b\u0016¢\u0006\u0004\b\u0010\u0010\u0011B!\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0013B\u0011\b\u0016\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/transitcard/task/CheckSupportTask;", "Lcom/tencent/mm/plugin/appbrand/jsapi/transitcard/task/AbsTransitCardTask;", "Lhe1/h;", "B", "", "o", "Ljava/lang/String;", "I", "()Ljava/lang/String;", "K", "(Ljava/lang/String;)V", "issuerID", "p", "H", "J", "actionType", "<init>", "()V", "appId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "CREATOR", "je1/b", "luggage-commons-jsapi-transitcard-ext_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes15.dex */
public final class CheckSupportTask extends com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.AbsTransitCardTask {
    public static final je1.b CREATOR = new je1.b(null);

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public java.lang.String issuerID;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    public java.lang.String actionType;

    public CheckSupportTask() {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.AbsTransitCardTask
    public he1.h B() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.CheckSupportTask", "buildCommand, issuerID=" + I() + ", actionType=" + H());
        return new he1.a(I(), H());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.AbsTransitCardTask
    public void E(android.os.Parcel in6) {
        kotlin.jvm.internal.o.g(in6, "in");
        java.lang.String readString = in6.readString();
        if (readString == null) {
            readString = "";
        }
        K(readString);
        java.lang.String readString2 = in6.readString();
        J(readString2 != null ? readString2 : "");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.transitcard.task.AbsTransitCardTask
    public void G(android.os.Parcel dest, int i17) {
        kotlin.jvm.internal.o.g(dest, "dest");
        dest.writeString(I());
        dest.writeString(H());
    }

    public final java.lang.String H() {
        java.lang.String str = this.actionType;
        if (str != null) {
            return str;
        }
        kotlin.jvm.internal.o.o("actionType");
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

    public final void J(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.actionType = str;
    }

    public final void K(java.lang.String str) {
        kotlin.jvm.internal.o.g(str, "<set-?>");
        this.issuerID = str;
    }

    public CheckSupportTask(java.lang.String appId, java.lang.String issuerID, java.lang.String actionType) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(issuerID, "issuerID");
        kotlin.jvm.internal.o.g(actionType, "actionType");
        this.f83472f = appId;
        K(issuerID);
        J(actionType);
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.TransitCard.CheckSupportTask", "constructor, appId=" + appId + ", issuerID=" + issuerID + ", actionType=" + actionType);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckSupportTask(android.os.Parcel parcel) {
        super(parcel);
        kotlin.jvm.internal.o.g(parcel, "parcel");
    }
}
