package aq4;

/* loaded from: classes4.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2340x67608bd.p2341x37c711.C18825x1657575c f94740d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f94741e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2338x6b0147b.p2340x67608bd.p2341x37c711.C18825x1657575c c18825x1657575c, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2);
        this.f94740d = c18825x1657575c;
        this.f94741e = interfaceC29045xdcb5ca57;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f94740d.f257641o, "export callback " + java.lang.Thread.currentThread().getName());
        java.lang.String c17 = this.f94740d.f93992e.f93999b.c("KEY_EXPORT_BACKGROUND_WORK_TAG_ID");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f94740d.f257641o, "export callback >> code: " + intValue + ", errMsg: " + errMsg + ", workTagId: " + c17);
        ((ku5.t0) ku5.t0.f394148d).h(new aq4.b(this.f94740d, c17, this.f94741e, intValue), "sns_background_thread");
        return jz5.f0.f384359a;
    }
}
