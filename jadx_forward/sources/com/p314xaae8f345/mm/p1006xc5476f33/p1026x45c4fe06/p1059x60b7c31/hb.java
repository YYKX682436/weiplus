package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public class hb implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l f162821a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f162822b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.mb f162823c;

    public hb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.mb mbVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, int i17) {
        this.f162823c = mbVar;
        this.f162821a = lVar;
        this.f162822b = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.u
    /* renamed from: onReceiveResult */
    public void mo50331x8a4d1541(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11888x1a859600 abstractC11888x1a859600) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11935xa93fa76f c11935xa93fa76f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.C11935xa93fa76f) abstractC11888x1a859600;
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(c11935xa93fa76f == null ? -1000 : c11935xa93fa76f.f160130d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiPrivateAddContact", "onReceiveResult resultCode:%d", objArr);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.mb mbVar = this.f162823c;
        int i17 = this.f162822b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar = this.f162821a;
        if (c11935xa93fa76f == null) {
            lVar.a(i17, mbVar.o("fail"));
            return;
        }
        int i18 = c11935xa93fa76f.f160130d;
        if (i18 != -2) {
            if (i18 == -1) {
                lVar.a(i17, mbVar.o("fail"));
                return;
            } else if (i18 == 0) {
                lVar.a(i17, mbVar.o("cancel"));
                return;
            } else if (i18 != 1) {
                return;
            }
        }
        lVar.a(i17, mbVar.o("ok"));
    }
}
