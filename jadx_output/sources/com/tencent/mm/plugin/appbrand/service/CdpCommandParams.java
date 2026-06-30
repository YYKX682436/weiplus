package com.tencent.mm.plugin.appbrand.service;

@kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/service/CdpCommandParams;", "Landroid/os/Parcelable;", "api-protocol.api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final /* data */ class CdpCommandParams implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<com.tencent.mm.plugin.appbrand.service.CdpCommandParams> CREATOR = new com.tencent.mm.plugin.appbrand.service.l0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f88604d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f88605e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f88606f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f88607g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f88608h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.w3 f88609i;

    public CdpCommandParams(java.lang.String sessionId, java.lang.String cmdId, java.lang.String taskId, java.lang.String method, java.lang.String cdpCommand, r45.w3 addBypMsg) {
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        kotlin.jvm.internal.o.g(taskId, "taskId");
        kotlin.jvm.internal.o.g(method, "method");
        kotlin.jvm.internal.o.g(cdpCommand, "cdpCommand");
        kotlin.jvm.internal.o.g(addBypMsg, "addBypMsg");
        this.f88604d = sessionId;
        this.f88605e = cmdId;
        this.f88606f = taskId;
        this.f88607g = method;
        this.f88608h = cdpCommand;
        this.f88609i = addBypMsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.mm.plugin.appbrand.service.CdpCommandParams)) {
            return false;
        }
        com.tencent.mm.plugin.appbrand.service.CdpCommandParams cdpCommandParams = (com.tencent.mm.plugin.appbrand.service.CdpCommandParams) obj;
        return kotlin.jvm.internal.o.b(this.f88604d, cdpCommandParams.f88604d) && kotlin.jvm.internal.o.b(this.f88605e, cdpCommandParams.f88605e) && kotlin.jvm.internal.o.b(this.f88606f, cdpCommandParams.f88606f) && kotlin.jvm.internal.o.b(this.f88607g, cdpCommandParams.f88607g) && kotlin.jvm.internal.o.b(this.f88608h, cdpCommandParams.f88608h) && kotlin.jvm.internal.o.b(this.f88609i, cdpCommandParams.f88609i);
    }

    public int hashCode() {
        return (((((((((this.f88604d.hashCode() * 31) + this.f88605e.hashCode()) * 31) + this.f88606f.hashCode()) * 31) + this.f88607g.hashCode()) * 31) + this.f88608h.hashCode()) * 31) + this.f88609i.hashCode();
    }

    public java.lang.String toString() {
        return "CdpCommandParams(sessionId=" + this.f88604d + ", cmdId=" + this.f88605e + ", taskId=" + this.f88606f + ", method=" + this.f88607g + ", cdpCommand=" + this.f88608h + ", addBypMsg=" + this.f88609i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        kotlin.jvm.internal.o.g(out, "out");
        out.writeString(this.f88604d);
        out.writeString(this.f88605e);
        out.writeString(this.f88606f);
        out.writeString(this.f88607g);
        out.writeString(this.f88608h);
        r45.w3 w3Var = this.f88609i;
        kotlin.jvm.internal.o.g(w3Var, "<this>");
        byte[] byteArray = w3Var.toByteArray();
        out.writeInt(byteArray.length);
        out.writeByteArray(byteArray);
    }
}
