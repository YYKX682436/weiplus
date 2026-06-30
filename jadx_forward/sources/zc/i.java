package zc;

/* loaded from: classes11.dex */
public final class i implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 f552882a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f552883b;

    public i(com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238, boolean z17) {
        this.f552882a = c3646xcf902238;
        this.f552883b = z17;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result
    /* renamed from: error */
    public void mo65718x5c4d208(java.lang.String errorCode, java.lang.String str, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorCode, "errorCode");
        kd.c.b("LiteApp.WxaLiteAppWidgetAdapter", "flutter navigate back.error: " + errorCode + ", " + str + ", " + obj, new java.lang.Object[0]);
        this.f552882a.f127508q.finish();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result
    /* renamed from: notImplemented */
    public void mo65719xbc9fa82f() {
        kd.c.b("LiteApp.WxaLiteAppWidgetAdapter", "flutter navigate back.notImplemented", new java.lang.Object[0]);
        this.f552882a.f127508q.finish();
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result
    /* renamed from: success */
    public void mo65720x90b54003(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Boolean");
        if (((java.lang.Boolean) obj).booleanValue()) {
            kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "flutter navigate back.do nothing in ui navigateback method", new java.lang.Object[0]);
            return;
        }
        com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238 = this.f552882a;
        c3646xcf902238.f127507p.m89766xc55eddf8(new com.p314xaae8f345.p2845xc516c4b6.p2866xadfe2b3.C24276x40fcfc58(c3646xcf902238.f127498d, this.f552883b), new zc.h(c3646xcf902238));
    }
}
