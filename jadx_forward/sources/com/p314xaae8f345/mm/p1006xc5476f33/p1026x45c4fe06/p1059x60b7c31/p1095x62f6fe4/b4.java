package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public class b4 implements lo.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f163256a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f163257b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c4 f163258c;

    public b4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c4 c4Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var, int i17) {
        this.f163258c = c4Var;
        this.f163256a = d0Var;
        this.f163257b = i17;
    }

    @Override // lo.j
    public void a(int i17, java.lang.String str, java.util.ArrayList arrayList) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiChooseMessageFile", "resultCode:%d filePaths:%s", java.lang.Integer.valueOf(i17), arrayList);
        if (i17 == -1) {
            ik1.h0.a().m77784x795fa299(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.a4(this, arrayList));
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c4 c4Var = this.f163258c;
        int i18 = this.f163257b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f163256a;
        if (i17 == 0) {
            d0Var.a(i18, c4Var.o("fail:cancel"));
            return;
        }
        if (i17 != 1) {
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            d0Var.a(i18, c4Var.o("fail"));
            return;
        }
        d0Var.a(i18, c4Var.o("fail:" + str));
    }
}
