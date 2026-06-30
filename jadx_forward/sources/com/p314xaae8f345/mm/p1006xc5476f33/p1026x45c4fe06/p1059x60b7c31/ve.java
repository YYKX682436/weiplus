package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes4.dex */
public class ve implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11949xef27fc0b f165051d;

    public ve(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11949xef27fc0b c11949xef27fc0b) {
        this.f165051d = c11949xef27fc0b;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() != 1949) {
            return 0;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11949xef27fc0b c11949xef27fc0b = this.f165051d;
        if (i17 == 0 && i18 == 0) {
            c11949xef27fc0b.f160189n = true;
        } else {
            c11949xef27fc0b.f160189n = false;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiUploadWeRunData", "UploadMiniAppStepTask fail: errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        }
        c11949xef27fc0b.c();
        return 0;
    }
}
