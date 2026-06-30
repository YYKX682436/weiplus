package u71;

/* loaded from: classes13.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final u71.z f506649a = new u71.z();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f506650b;

    public final synchronized void a() {
        if (f506650b) {
            return;
        }
        f506650b = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URInit", "init ur");
        com.p314xaae8f345.p3118xeeebfacc.InterfaceC26837xb803b88e.Companion companion = com.p314xaae8f345.p3118xeeebfacc.InterfaceC26837xb803b88e.INSTANCE;
        companion.m106019x16e18715(new u71.u());
        companion.m106018x32c4e6("unit_rc");
        com.p314xaae8f345.p3118xeeebfacc.InterfaceC26835x7da05cf3.INSTANCE.m106008xf0589755(new u71.v());
        com.p314xaae8f345.p3118xeeebfacc.ur.C26849x3e7c1ac7.INSTANCE.m106065x752372b9(u71.w.f506646d);
        com.p314xaae8f345.p3118xeeebfacc.ur.C26862xd751037c.INSTANCE.m106119xe6b09e32(u71.x.f506647d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URInit", "init ur end");
    }
}
