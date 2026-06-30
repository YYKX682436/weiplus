package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010\u0018\u001a\u00020\u0013\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002H\u0014J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u0019\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/launching/ShowFallbackErrorReloadUIRequest;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "Ljava/lang/Class;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "getTaskClass", "", "preferRunOnUiThreadForStartingProcessProxyUI", "Landroid/os/Parcel;", "parcel", "", "flags", "Ljz5/f0;", "writeToParcel", "Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;", "d", "Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;", "getInitConfig", "()Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;", "initConfig", "Lcom/tencent/mm/plugin/appbrand/report/AppBrandStatObject;", "e", "Lcom/tencent/mm/plugin/appbrand/report/AppBrandStatObject;", "b", "()Lcom/tencent/mm/plugin/appbrand/report/AppBrandStatObject;", "statObject", "", "f", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "retryMsg", "<init>", "(Lcom/tencent/mm/plugin/appbrand/config/AppBrandInitConfigWC;Lcom/tencent/mm/plugin/appbrand/report/AppBrandStatObject;Ljava/lang/String;)V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.appbrand.launching.ShowFallbackErrorReloadUIRequest */
/* loaded from: classes7.dex */
public final class C12352x4b255c79 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12352x4b255c79> f35064x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.hc();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 initConfig;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 statObject;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String retryMsg;

    public C12352x4b255c79(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 initConfig, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 statObject, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initConfig, "initConfig");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statObject, "statObject");
        this.initConfig = initConfig;
        this.statObject = statObject;
        this.retryMsg = str;
    }

    /* renamed from: a, reason: from getter */
    public final java.lang.String getRetryMsg() {
        return this.retryMsg;
    }

    /* renamed from: b, reason: from getter */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 getStatObject() {
        return this.statObject;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 getInitConfig() {
        return this.initConfig;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: getTaskClass */
    public java.lang.Class<? extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v> mo50317x8a7a03d() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.jc.class;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c
    /* renamed from: preferRunOnUiThreadForStartingProcessProxyUI */
    public boolean mo50402xf764f604() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeParcelable(this.initConfig, i17);
        out.writeParcelable(this.statObject, i17);
        out.writeString(this.retryMsg);
    }
}
