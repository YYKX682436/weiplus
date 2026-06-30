package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.tencent.mm.plugin.appbrand.jsapi.JsApiOpenWeRunSetting$OpenWeRunSetting */
/* loaded from: classes12.dex */
public class C11931x604547f3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11931x604547f3> f33664x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ua();

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 f160119f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f160120g;

    /* renamed from: h, reason: collision with root package name */
    public final int f160121h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f160122i = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f160123m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f160124n;

    public C11931x604547f3(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiOpenWeRunSetting", "OpenWeRunSetting");
        this.f160119f = k0Var;
        this.f160120g = lVar;
        this.f160121h = i17;
        this.f160124n = z17;
    }

    public static void B(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11931x604547f3 c11931x604547f3) {
        if (!c11931x604547f3.f160124n || c11931x604547f3.f160122i) {
            ((ue4.w) ((ve4.e) i95.n0.c(ve4.e.class))).getClass();
            boolean e17 = com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.c0.e();
            c11931x604547f3.f160123m = e17;
            if (c11931x604547f3.f160124n && e17) {
                ((ue4.w) ((ve4.e) i95.n0.c(ve4.e.class))).getClass();
                if (((ue4.r) i95.n0.c(ue4.r.class)).wi() != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2233x6892774.p2234x633fb29.d wi6 = ((ue4.r) i95.n0.c(ue4.r.class)).wi();
                    long a17 = wi6.a();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Sport.DeviceStepManager", "forceUploadDeviceStep %d", java.lang.Long.valueOf(a17));
                    wi6.d(a17);
                }
            }
        }
        c11931x604547f3.c();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f160122i = parcel.readByte() != 0;
        this.f160123m = parcel.readByte() != 0;
        this.f160124n = parcel.readByte() != 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeByte(this.f160122i ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f160123m ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f160124n ? (byte) 1 : (byte) 0);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void y() {
        boolean z17 = this.f160124n;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.k0 k0Var = this.f160119f;
        int i17 = this.f160121h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f160120g;
        if (z17 && !this.f160122i) {
            lVar.a(i17, k0Var.o("fail device not support"));
            x();
            return;
        }
        if (this.f160123m) {
            lVar.a(i17, k0Var.o("ok"));
            x();
            return;
        }
        android.content.Context mo50352x76847179 = lVar.mo50352x76847179();
        if (mo50352x76847179 == null) {
            lVar.a(i17, k0Var.o("fail:internal error invalid android context"));
            x();
            return;
        }
        k91.z0 z0Var = (k91.z0) lVar.b(k91.z0.class);
        if (z0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(z0Var.f387374d)) {
            lVar.a(i17, k0Var.o("fail"));
            x();
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("OpenWeRunSettingName", z0Var.f387374d);
        intent.setClass(mo50352x76847179, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12649xf1df9617.class);
        nf.g.a(mo50352x76847179).j(intent, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ta(this));
        x();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ra raVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ra(this);
        if (gm0.j1.i().f354741a.f354832d) {
            raVar.run();
        } else {
            gm0.j1.i().m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.sa(this, raVar));
        }
    }

    public C11931x604547f3(android.os.Parcel parcel) {
        v(parcel);
    }
}
