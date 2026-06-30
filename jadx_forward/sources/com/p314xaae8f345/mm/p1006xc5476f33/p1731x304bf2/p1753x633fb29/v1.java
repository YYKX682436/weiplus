package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29;

/* loaded from: classes8.dex */
public class v1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1753x633fb29.t1 {

    /* renamed from: a, reason: collision with root package name */
    public final m53.e2 f222027a;

    public v1(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null) {
            this.f222027a = new m53.e2();
        } else {
            this.f222027a = (m53.e2) fVar;
        }
    }

    public v1(byte[] bArr) {
        m53.e2 e2Var = new m53.e2();
        this.f222027a = e2Var;
        if (bArr == null || bArr.length == 0) {
            return;
        }
        try {
            e2Var.mo11468x92b714fd(bArr);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.GamePBDataDownloadGuidance", "Parsing Failed: %s", e17.getMessage());
        }
    }
}
