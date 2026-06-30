package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice$StartRecordVoice */
/* loaded from: classes7.dex */
public class C11994xe5437c33 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.C11994xe5437c33> f33772x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.c3();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d3 f160652f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f160653g;

    /* renamed from: h, reason: collision with root package name */
    public int f160654h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f160655i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f160656m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f160657n = false;

    /* renamed from: o, reason: collision with root package name */
    public int f160658o;

    /* renamed from: p, reason: collision with root package name */
    public int f160659p;

    public C11994xe5437c33(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.d3 d3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int i17, int i18) {
        this.f160652f = d3Var;
        this.f160653g = e9Var;
        this.f160658o = i17;
        this.f160654h = i18;
        this.f160655i = e9Var.mo48798x74292566();
        cv.i1 i1Var = (cv.i1) i95.n0.c(cv.i1.class);
        java.lang.String fromuser = this.f160655i;
        ((bv.p0) i1Var).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fromuser, "fromuser");
        java.lang.String n07 = w21.g1.n0(fromuser, "silk_");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n07, "genFileName(...)");
        ik1.b0 b0Var = new ik1.b0();
        if (e9Var.mo50354x59eafec1().mo49624x5d68c543(b0Var) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
            this.f160656m = new com.p314xaae8f345.mm.vfs.r6((java.lang.String) b0Var.f373357a, n07).o();
        } else {
            this.f160656m = new com.p314xaae8f345.mm.vfs.r6(e9Var.mo50352x76847179().getCacheDir(), n07).o();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160654h = parcel.readInt();
        this.f160655i = parcel.readString();
        this.f160656m = parcel.readString();
        this.f160657n = parcel.readByte() != 0;
        this.f160658o = parcel.readInt();
        this.f160659p = parcel.readInt();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f160654h);
        parcel.writeString(this.f160655i);
        parcel.writeString(this.f160656m);
        parcel.writeByte(this.f160657n ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.f160658o);
        parcel.writeInt(this.f160659p);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        if (this.f160659p == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartRecordVoice", "fail:record_error");
            this.f160653g.a(this.f160654h, this.f160652f.o("fail:record_error"));
            return;
        }
        if (this.f160657n) {
            java.util.HashMap hashMap = new java.util.HashMap(1);
            ik1.b0 b0Var = new ik1.b0();
            if (this.f160653g.mo50354x59eafec1().mo49619x6aa75256(new com.p314xaae8f345.mm.vfs.r6(this.f160656m), "silk", true, b0Var) == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
                hashMap.put("tempFilePath", (java.lang.String) b0Var.f373357a);
                this.f160653g.a(this.f160654h, this.f160652f.p("ok", hashMap));
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiStartRecordVoice", "AppBrandLocalMediaObject obj is null");
                hashMap.put("tempFilePath", "");
                this.f160653g.a(this.f160654h, this.f160652f.o("fail"));
            }
        } else {
            this.f160653g.a(this.f160654h, this.f160652f.o("fail"));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiStartRecordVoice", "runInClientProcess, appId = %s, startRecordOk = %b", this.f160655i, java.lang.Boolean.valueOf(this.f160657n));
        this.f160652f.D(false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        java.util.Set set = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s0.f172083a;
        ik1.h0.a().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1063x58d9bd6.b3(this));
    }

    public C11994xe5437c33(android.os.Parcel parcel) {
        v(parcel);
    }
}
