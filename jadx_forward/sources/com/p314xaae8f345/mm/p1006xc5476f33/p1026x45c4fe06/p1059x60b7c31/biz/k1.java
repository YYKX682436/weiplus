package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000fB\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/biz/k1;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "", "requestCode", "resultCode", "Landroid/content/Intent;", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "mmOnActivityResult", "<init>", "()V", "d", "com/tencent/mm/plugin/appbrand/jsapi/biz/j1", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class k1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.j1 f161508d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.j1(null);

    /* renamed from: e, reason: collision with root package name */
    private static final java.lang.String f161509e = "BindPhoneTask";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        if (((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.c()) {
            m50420x7b736e5c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12036x5e04952a(1, 0));
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        m50421x3c6fed6a().m78545xde66c1f2(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12035x6271c722 c12035x6271c722 = abstractC11887x3610e10c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12035x6271c722 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12035x6271c722) abstractC11887x3610e10c : null;
        java.lang.Integer valueOf = c12035x6271c722 != null ? java.lang.Integer.valueOf(c12035x6271c722.getEnterType()) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.a[] aVarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.a.f161484d;
        if (valueOf == null || valueOf.intValue() != 1) {
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.g(intent, m50421x3c6fed6a(), 1000);
        } else {
            intent.putExtra("back_to_status", false);
            ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.h(m50421x3c6fed6a(), intent, 1000);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v, com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 != 1000) {
            return;
        }
        boolean c17 = ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.c();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(f161509e, "mmOnActivityResult: " + c17);
        m50420x7b736e5c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.biz.C12036x5e04952a(0, c17 ? 1 : 0));
    }
}
