package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/jsapi/auth/d2;", "Lcom/tencent/mm/plugin/appbrand/ipc/v;", "Lcom/tencent/mm/plugin/appbrand/ipc/AppBrandProxyUIProcessTask$ProcessRequest;", "request", "Ljz5/f0;", "handleRequest", "<init>", "()V", "plugin-appbrand-integration_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class d2 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v {
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.v
    /* renamed from: handleRequest */
    public void mo50332x63bc5f47(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.AbstractC11887x3610e10c abstractC11887x3610e10c) {
        if (!(abstractC11887x3610e10c instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12000xa5c06d42)) {
            m50420x7b736e5c(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12001x1574efee("", -1, "unknown request"));
            return;
        }
        wd0.i1 i1Var = (wd0.i1) i95.n0.c(wd0.i1.class);
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf m50421x3c6fed6a = m50421x3c6fed6a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m50421x3c6fed6a, "getActivityContext(...)");
        wd0.b bVar = new wd0.b();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12000xa5c06d42 c12000xa5c06d42 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.C12000xa5c06d42) abstractC11887x3610e10c;
        bVar.f526222a = c12000xa5c06d42.getBusinessId();
        java.lang.String displayName = c12000xa5c06d42.getDisplayName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayName, "<set-?>");
        bVar.f526223b = displayName;
        java.lang.String m50423x2fec8307 = m50423x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.mjq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m50423x2fec8307, "getString(...)");
        bVar.f526224c = m50423x2fec8307;
        java.lang.String usageDescription = c12000xa5c06d42.getUsageDescription();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(usageDescription, "<set-?>");
        bVar.f526225d = usageDescription;
        bVar.f526226e = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.b2(abstractC11887x3610e10c);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.c2 c2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.c2(this);
        ((vd0.a) i1Var).getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ApplyForPhoneNumberUtil", "requestTicket: " + bVar);
        v65.i.b(new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("MicroMsg.ApplyForPhoneNumberUtil", m50421x3c6fed6a, 0, 4, null), null, new k14.a(c2Var, m50421x3c6fed6a, bVar, null), 1, null);
    }
}
