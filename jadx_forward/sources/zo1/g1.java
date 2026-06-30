package zo1;

/* loaded from: classes5.dex */
public final class g1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f556150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CountDownLatch f556151e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f556152f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, java.util.concurrent.CountDownLatch countDownLatch, java.lang.String str) {
        super(2);
        this.f556150d = f0Var;
        this.f556151e = countDownLatch;
        this.f556152f = str;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).intValue();
        java.util.ArrayList<com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g> pkgs = (java.util.ArrayList) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgs, "pkgs");
        int i17 = 0;
        for (com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.g gVar : pkgs) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CreatePackageUI", "preNum=" + i17 + ", curPkgName=" + gVar.f297364f + " deviceId=" + gVar.f297365g.f297522e);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar.f297365g.f297522e, this.f556152f)) {
                java.lang.String str = gVar.f297364f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getPackageName(...)");
                if (r26.i0.y(str, "WXGBACKUPPACKAGEPREFIX_", false)) {
                    java.util.regex.Pattern compile = java.util.regex.Pattern.compile("\\d+");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
                    java.lang.String str2 = gVar.f297364f;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getPackageName(...)");
                    java.util.regex.Matcher matcher = compile.matcher(str2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(matcher, "matcher(...)");
                    r26.m a17 = r26.u.a(matcher, 23, str2);
                    i17 = a17 != null ? java.lang.Math.max(i17, java.lang.Integer.parseInt(((r26.q) a17).c())) : java.lang.Math.max(i17, 1);
                }
            }
        }
        this.f556150d.f391649d = i17;
        this.f556151e.countDown();
        return jz5.f0.f384359a;
    }
}
