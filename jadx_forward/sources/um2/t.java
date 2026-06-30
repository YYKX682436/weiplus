package um2;

/* loaded from: classes3.dex */
public final class t implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.SoftReference f510493d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f510494e;

    public t(java.lang.ref.SoftReference softReference, java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f510493d = softReference;
        this.f510494e = tag;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        um2.x5 x5Var;
        java.lang.String str;
        r45.ve2 ve2Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.ref.SoftReference softReference = this.f510493d;
        if (softReference != null && (x5Var = (um2.x5) softReference.get()) != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f510494e, "prepare shopping:" + booleanValue + ",list empty:" + ((mm2.f6) x5Var.c(mm2.f6.class)).f410572o.f446213a.isEmpty());
            if (booleanValue) {
                st2.f2.f493820a.a(x5Var.f101142a);
                gk2.e liveData = x5Var.f101142a;
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = x5Var.f101138b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
                if (((zy2.qa) i95.n0.c(zy2.qa.class)) != null) {
                    android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                    r45.dv1 dv1Var = ((mm2.f6) liveData.a(mm2.f6.class)).f410571n;
                    if (dv1Var == null || (ve2Var = (r45.ve2) dv1Var.m75936x14adae67(5)) == null || (str = ve2Var.m75945x2fec8307(0)) == null) {
                        str = "";
                    }
                    boolean z17 = st2.f2.f493821b;
                    boolean z18 = st2.f2.f493822c;
                    java.lang.String liveid = java.lang.String.valueOf(((mm2.e1) liveData.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0));
                    java.lang.String finderid = xy2.c.e(context);
                    java.lang.String sessionid = java.lang.String.valueOf(((mm2.c1) liveData.a(mm2.c1.class)).f410394p2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveid, "liveid");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderid, "finderid");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sessionid, "sessionid");
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6532x1fe58935 c6532x1fe58935 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6532x1fe58935();
                    c6532x1fe58935.f138849d = c6532x1fe58935.b("appuin", "", true);
                    c6532x1fe58935.f138850e = 0L;
                    c6532x1fe58935.f138851f = 10;
                    c6532x1fe58935.f138853h = c6532x1fe58935.b("prewarmpath", str, true);
                    c6532x1fe58935.f138854i = z17 ? 1 : 0;
                    c6532x1fe58935.f138855j = z18 ? 1 : 0;
                    c6532x1fe58935.f138856k = c6532x1fe58935.b("liveid", liveid, true);
                    c6532x1fe58935.f138857l = c6532x1fe58935.b("finderid", finderid, true);
                    c6532x1fe58935.f138858m = c6532x1fe58935.b("shopwindowid", "", true);
                    c6532x1fe58935.f138859n = c6532x1fe58935.b("sessionid", sessionid, true);
                    c6532x1fe58935.f138852g = c6532x1fe58935.b("networktype", java.lang.String.valueOf(by5.y.a(context2)), true);
                    c6532x1fe58935.f138860o = c01.id.c();
                    c6532x1fe58935.k();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
