package zv;

/* loaded from: classes9.dex */
public final class z3 implements e31.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d f557684a;

    public z3(com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d c10465x1b7ee7d) {
        this.f557684a = c10465x1b7ee7d;
    }

    @Override // e31.i
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f557684a.f146722d, "onSubscribeMsgStatusChanged error");
    }

    @Override // e31.i
    public void b(java.lang.String templateId, e31.j result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d c10465x1b7ee7d = this.f557684a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c10465x1b7ee7d.f146722d, "onSubscribeMsgStatusChanged templateId: " + templateId + ", businessType: " + result.f328616i + ", isSubscribed: " + result.f328608a + ", isSwitchOpened: " + result.f328609b);
        pm0.v.X(new zv.y3(c10465x1b7ee7d, result, kz5.b0.c(new com.p314xaae8f345.p2845xc516c4b6.p2849xb0941fd.C23604xea4c9143(templateId, java.lang.Long.valueOf((long) result.f328616i), java.lang.Boolean.valueOf(result.f328608a), java.lang.Boolean.valueOf(result.f328614g), java.lang.Boolean.valueOf(result.f328615h))), templateId));
    }
}
