package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/service/CdpCommandParams;", "Landroid/os/Parcelable;", "api-protocol.api_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.service.CdpCommandParams */
/* loaded from: classes7.dex */
public final /* data */ class C12575x278fd8e2 implements android.os.Parcelable {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12575x278fd8e2> f35171x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.l0();

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f170137d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f170138e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f170139f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f170140g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f170141h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.w3 f170142i;

    public C12575x278fd8e2(java.lang.String sessionId, java.lang.String cmdId, java.lang.String taskId, java.lang.String method, java.lang.String cdpCommand, r45.w3 addBypMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionId, "sessionId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdId, "cmdId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(method, "method");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cdpCommand, "cdpCommand");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(addBypMsg, "addBypMsg");
        this.f170137d = sessionId;
        this.f170138e = cmdId;
        this.f170139f = taskId;
        this.f170140g = method;
        this.f170141h = cdpCommand;
        this.f170142i = addBypMsg;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: equals */
    public boolean m52553xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12575x278fd8e2)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12575x278fd8e2 c12575x278fd8e2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12575x278fd8e2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170137d, c12575x278fd8e2.f170137d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170138e, c12575x278fd8e2.f170138e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170139f, c12575x278fd8e2.f170139f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170140g, c12575x278fd8e2.f170140g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170141h, c12575x278fd8e2.f170141h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f170142i, c12575x278fd8e2.f170142i);
    }

    /* renamed from: hashCode */
    public int m52554x8cdac1b() {
        return (((((((((this.f170137d.hashCode() * 31) + this.f170138e.hashCode()) * 31) + this.f170139f.hashCode()) * 31) + this.f170140g.hashCode()) * 31) + this.f170141h.hashCode()) * 31) + this.f170142i.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m52555x9616526c() {
        return "CdpCommandParams(sessionId=" + this.f170137d + ", cmdId=" + this.f170138e + ", taskId=" + this.f170139f + ", method=" + this.f170140g + ", cdpCommand=" + this.f170141h + ", addBypMsg=" + this.f170142i + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f170137d);
        out.writeString(this.f170138e);
        out.writeString(this.f170139f);
        out.writeString(this.f170140g);
        out.writeString(this.f170141h);
        r45.w3 w3Var = this.f170142i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(w3Var, "<this>");
        byte[] mo14344x5f01b1f6 = w3Var.mo14344x5f01b1f6();
        out.writeInt(mo14344x5f01b1f6.length);
        out.writeByteArray(mo14344x5f01b1f6);
    }
}
