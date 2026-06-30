package zv;

/* loaded from: classes9.dex */
public final class k4 implements e31.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d f557547a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f557548b;

    public k4(com.p314xaae8f345.mm.p689xc5a27af6.p697xfe7cbaae.C10465x1b7ee7d c10465x1b7ee7d, java.lang.String str) {
        this.f557547a = c10465x1b7ee7d;
        this.f557548b = str;
    }

    @Override // e31.i
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f557547a.f146722d, "[BRS] updateTemplateMsgScopeItemScopeRecv: onError failed to update scope recv for " + this.f557548b);
    }

    @Override // e31.i
    public void b(java.lang.String templateId, e31.j result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateId, "templateId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f557547a.f146722d, "[BRS] updateTemplateMsgScopeItemScopeRecv: onUpdated templateId=".concat(templateId));
    }
}
