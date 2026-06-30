package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class j4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 f166223d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f166224e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 q4Var, yz5.p pVar) {
        super(2);
        this.f166223d = q4Var;
        this.f166224e = pVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6 err = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6) obj;
        java.lang.String str = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(err, "err");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.q4 q4Var = this.f166223d;
        if (!q4Var.f166605o.get() || com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6.f166021f == err) {
            this.f166224e.mo149xb9724478(err, str);
            int i17 = q4Var.f166603m;
            if (i17 > 0) {
                r81.f.INSTANCE.b(i17, 191);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6 a6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.a6.f166027o;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 request = q4Var.f166592b;
            if (a6Var == err) {
                int i18 = k91.l3.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.w0.b(request.f166384d, 0)) ? 776 : 368;
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.A(i18, 118);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.v0.i(request.f166384d, request.f166388h.a(), request.f166387g, i18, 118, 1);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.CommonPkgFetcher", "onError, request:" + request + ", err:" + err);
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x6.f166945a.getClass();
            java.util.Map map = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j6.f166226b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.wi().getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.mj();
            try {
                java.util.Set g17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.j6.f166228d.g(request);
                if (g17 != null) {
                    java.util.Iterator it = g17.iterator();
                    while (it.hasNext()) {
                        ((yz5.p) it.next()).mo149xb9724478(err, str);
                    }
                }
            } finally {
                ((java.util.concurrent.ConcurrentHashMap) map).remove(request);
            }
        }
        return jz5.f0.f384359a;
    }
}
