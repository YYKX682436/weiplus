package com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006HÖ\u0001¨\u0006\r"}, d2 = {"Lcom/tencent/luggage/sdk/processes/main/LuggageInitTask;", "Lcom/tencent/mm/plugin/appbrand/ipc/MainProcessTask;", "Ljz5/f0;", "z", "Landroid/os/Parcel;", "parcel", "", "flags", "writeToParcel", "", "processName", "<init>", "(Ljava/lang/String;)V", "luggage-wechat-full-sdk_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.luggage.sdk.processes.main.LuggageInitTask */
/* loaded from: classes7.dex */
public final class C3944x3dc04ceb extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.p445x3305b9.C3944x3dc04ceb> f15710x681a0c0c = new ye.b();

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f129183f;

    public C3944x3dc04ceb(java.lang.String processName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(processName, "processName");
        this.f129183f = processName;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel out, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(out, "out");
        out.writeString(this.f129183f);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r rVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LuggageInitTask", "runInMainProcess for " + this.f129183f);
        if (i95.n0.h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc.class)) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.fc.class)).mo48900x42891314();
        }
        synchronized (com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r.f129214e) {
            rVar = com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.r.f129215f;
            if (rVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("INSTANCE_");
                throw null;
            }
        }
        java.util.Iterator it = rVar.h(new ye.c(this)).iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.h) it.next()).s();
        }
    }
}
