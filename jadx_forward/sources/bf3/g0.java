package bf3;

/* loaded from: classes7.dex */
public final class g0 {

    /* renamed from: d, reason: collision with root package name */
    public static boolean f101163d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f101164e;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ f06.v[] f101161b = {p3321xbce91901.jvm.p3324x21ffc6bd.i0.d(new p3321xbce91901.jvm.p3324x21ffc6bd.u(bf3.g0.class, "disableShowAlert", "getDisableShowAlert()Z", 0))};

    /* renamed from: a, reason: collision with root package name */
    public static final bf3.g0 f101160a = new bf3.g0();

    /* renamed from: c, reason: collision with root package name */
    public static final nf.r f101162c = new nf.r(java.lang.Boolean.FALSE);

    public final void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBServerUtil", "start load so");
        bf3.c0 c0Var = new bf3.c0();
        ah.d.f86246b = c0Var;
        g8.c.f350941a = new ah.b(c0Var);
        ah.d.a();
        ah.d.b("wxa-runtime-binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBServerUtil", "load so done");
    }

    public final void b(java.lang.String serialTag, yz5.a theThing) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(serialTag, "serialTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(theThing, "theThing");
        ((ku5.t0) ku5.t0.f394148d).b(new bf3.d0(theThing), serialTag);
    }

    public final java.nio.ByteBuffer c(jc3.x pkgManagement, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pkgManagement, "pkgManagement");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        ik1.b0 b0Var = new ik1.b0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1 mo49307xcc440832 = pkgManagement.b().mo49307xcc440832(path, b0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo49307xcc440832, "readFile(...)");
        if (mo49307xcc440832 == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.j1.OK) {
            return (java.nio.ByteBuffer) b0Var.f373357a;
        }
        return null;
    }
}
