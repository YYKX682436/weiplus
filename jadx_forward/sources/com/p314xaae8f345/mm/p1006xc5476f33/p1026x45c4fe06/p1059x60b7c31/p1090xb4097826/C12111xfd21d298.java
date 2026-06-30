package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.finder.JsApiGetFinderAccount$GetFinderAccountTask */
/* loaded from: classes7.dex */
public class C12111xfd21d298 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.C12111xfd21d298> f34267x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.o();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f162691f;

    /* renamed from: g, reason: collision with root package name */
    public final int f162692g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f162693h;

    public C12111xfd21d298(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17) {
        this.f162691f = e9Var;
        this.f162692g = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f162693h = parcel.readString();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeString(this.f162693h);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f162691f;
        java.lang.String mo48798x74292566 = e9Var.mo48798x74292566();
        java.lang.String str = this.f162693h;
        int i17 = this.f162692g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Finder.JsApiGetFinderAccount", "runInClientProcess callback, appId[%s], msg[%s], callbackId[%d], isRunning[%b]", mo48798x74292566, str, java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(e9Var.mo50262x39e05d35()));
        e9Var.a(i17, this.f162693h);
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).getClass();
        g92.b.f351302e.u2("JsApiGetFinderAccount").l().K(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1090xb4097826.n(this));
    }

    public C12111xfd21d298(android.os.Parcel parcel) {
        v(parcel);
    }
}
