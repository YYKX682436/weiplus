package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class nd implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11544x7f79c0cd f167597d;

    public nd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11544x7f79c0cd c11544x7f79c0cd) {
        this.f167597d = c11544x7f79c0cd;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "MicroMsg.AppBrand.ReportStorageSizeTask#" + this.f167597d.f156410f;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11544x7f79c0cd c11544x7f79c0cd = this.f167597d;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11544x7f79c0cd.B(c11544x7f79c0cd);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.ReportStorageSizeTask", "doReport appId:%s, e:%s", c11544x7f79c0cd.f156410f, th6);
        }
    }
}
