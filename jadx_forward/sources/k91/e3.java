package k91;

/* loaded from: classes7.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public static final k91.e3 f387103a = new k91.e3();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f387104b = new java.util.concurrent.CopyOnWriteArrayList(kz5.c0.d("wxfedb0854e2b1820d", "wx97b7aebac2183fd2", "wxa06c02b5c00ff39b", "wxf337cbaa27790d8e"));

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.CopyOnWriteArrayList f387105c = new java.util.concurrent.CopyOnWriteArrayList(kz5.c0.d("wxfedb0854e2b1820d", "wxa06c02b5c00ff39b", "wxf337cbaa27790d8e"));

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f387106d = new java.util.concurrent.ConcurrentHashMap(kz5.c1.l(new jz5.l("wxfedb0854e2b1820d", "gh_a23053671f48@app"), new jz5.l("wx97b7aebac2183fd2", "gh_232f4c80080c@app"), new jz5.l("wxa06c02b5c00ff39b", "gh_f93dfd4799d3@app"), new jz5.l("wxf337cbaa27790d8e", "gh_c9d570035c3b@app")));

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f387107e = new java.util.concurrent.ConcurrentHashMap(kz5.c1.l(new jz5.l("wxfedb0854e2b1820d", java.lang.Integer.valueOf(ce1.f.f4364x366c91de)), new jz5.l("wx97b7aebac2183fd2", java.lang.Integer.valueOf(ce1.f.f4364x366c91de)), new jz5.l("wxa06c02b5c00ff39b", java.lang.Integer.valueOf(ce1.f.f4364x366c91de)), new jz5.l("wxf337cbaa27790d8e", java.lang.Integer.valueOf(ce1.f.f4364x366c91de))));

    public final void a(java.lang.String username, java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NonStandardAppConstants", "register, username:" + username + ", appId:" + appId + ", scene:" + i17);
        f387104b.add(appId);
        f387106d.put(appId, username);
        f387107e.put(appId, java.lang.Integer.valueOf(i17));
    }
}
