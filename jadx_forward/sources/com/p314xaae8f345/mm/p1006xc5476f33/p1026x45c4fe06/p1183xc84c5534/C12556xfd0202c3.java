package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534;

@com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v0
/* renamed from: com.tencent.mm.plugin.appbrand.report.AppBrandIDKeyBatchReport$IDKeyBatchReportTask */
/* loaded from: classes7.dex */
final class C12556xfd0202c3 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb {

    /* renamed from: CREATOR */
    public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12556xfd0202c3> f35152x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.o();

    /* renamed from: f, reason: collision with root package name */
    public int f169301f;

    /* renamed from: g, reason: collision with root package name */
    public int f169302g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f169303h;

    /* renamed from: i, reason: collision with root package name */
    public int f169304i;

    /* renamed from: m, reason: collision with root package name */
    public r45.uc7 f169305m;

    public C12556xfd0202c3() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void v(android.os.Parcel parcel) {
        this.f169301f = parcel.readInt();
        this.f169302g = parcel.readInt();
        this.f169303h = parcel.readString();
        this.f169304i = parcel.readInt();
        if (3 == this.f169301f) {
            try {
                r45.uc7 uc7Var = new r45.uc7();
                this.f169305m = uc7Var;
                uc7Var.mo11468x92b714fd(parcel.createByteArray());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDKeyBatchReport", "parse WxaAppRecord from parcel, e = %s", e17);
                this.f169305m = null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb, android.os.Parcelable
    public void writeToParcel(android.os.Parcel parcel, int i17) {
        parcel.writeInt(this.f169301f);
        parcel.writeInt(this.f169302g);
        parcel.writeString(this.f169303h);
        parcel.writeInt(this.f169304i);
        if (3 == this.f169301f) {
            try {
                parcel.writeByteArray(this.f169305m.mo14344x5f01b1f6());
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDKeyBatchReport", "write WxaAppRecord to parcel, e = %s", e17);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11896x2d96b4fb
    public void z() {
        int i17 = this.f169301f;
        if (1 == i17) {
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f169303h) && gm0.j1.b().f354787q) {
                android.util.Pair y07 = ((t81.b) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.fj(t81.b.class)).y0("appId", this.f169303h, 5, this.f169304i);
                if (((java.lang.Boolean) y07.first).booleanValue()) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandIDKeyBatchReport", "report blocked by appid(%s) scene(%d) ", this.f169303h, java.lang.Integer.valueOf(this.f169304i));
                    r81.f.INSTANCE.b(((java.lang.Integer) y07.second).intValue(), com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3029xaf3f29eb.C26321xaee9b201.f52302xff8c0727);
                    return;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.t.a(0);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.t.b();
            return;
        }
        if (2 == i17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.t.e();
            return;
        }
        if (3 == i17) {
            r45.uc7 uc7Var = this.f169305m;
            java.util.concurrent.locks.ReentrantReadWriteLock reentrantReadWriteLock = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.t.f169934a;
            if (uc7Var == null) {
                return;
            }
            ((ku5.t0) ku5.t0.f394148d).h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.s(uc7Var), "MicroMsg.AppBrandIDKeyBatchReport");
        }
    }

    public C12556xfd0202c3(android.os.Parcel parcel) {
        v(parcel);
    }
}
