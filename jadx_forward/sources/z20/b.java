package z20;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public z20.e f551070a = z20.e.f551076e;

    /* renamed from: b, reason: collision with root package name */
    public bw5.q9 f551071b;

    static {
        new z20.a(null);
    }

    public b() {
        bw5.q9 q9Var = bw5.q9.f113531v;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(q9Var, "getDefaultInstance(...)");
        this.f551071b = q9Var;
    }

    public final void a() {
        int i17 = y02.d1.f540131d;
        y02.b1 b1Var = (y02.b1) p3380x6a61f93.p3387xf51c6630.C30622x21b27ad2.m170331x21b0d463();
        if (b1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ECS.Tracker", "EcsTracker_UrCpp.sharedInstance() is null");
            return;
        }
        int ordinal = this.f551070a.ordinal();
        if (ordinal == 0) {
            bw5.q9 info = this.f551071b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
            byte[] mo14344x5f01b1f6 = info.mo14344x5f01b1f6();
            long m105978x2737f10 = ((y02.d1) b1Var).m105978x2737f10();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
            p3380x6a61f93.p3387xf51c6630.C30622x21b27ad2.m170335x21b35347(m105978x2737f10, mo14344x5f01b1f6);
            return;
        }
        if (ordinal == 2) {
            bw5.q9 info2 = this.f551071b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info2, "info");
            byte[] mo14344x5f01b1f62 = info2.mo14344x5f01b1f6();
            long m105978x2737f102 = ((y02.d1) b1Var).m105978x2737f10();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f62);
            p3380x6a61f93.p3387xf51c6630.C30622x21b27ad2.m170337x21b85e24(m105978x2737f102, mo14344x5f01b1f62, 1);
            return;
        }
        if (ordinal != 3) {
            bw5.q9 info3 = this.f551071b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info3, "info");
            byte[] mo14344x5f01b1f63 = info3.mo14344x5f01b1f6();
            long m105978x2737f103 = ((y02.d1) b1Var).m105978x2737f10();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f63);
            p3380x6a61f93.p3387xf51c6630.C30622x21b27ad2.m170332x21b23190(m105978x2737f103, mo14344x5f01b1f63);
            return;
        }
        bw5.q9 info4 = this.f551071b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info4, "info");
        byte[] mo14344x5f01b1f64 = info4.mo14344x5f01b1f6();
        long m105978x2737f104 = ((y02.d1) b1Var).m105978x2737f10();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f64);
        p3380x6a61f93.p3387xf51c6630.C30622x21b27ad2.m170337x21b85e24(m105978x2737f104, mo14344x5f01b1f64, 2);
    }

    public final z20.b b(java.lang.String str) {
        if (str != null) {
            this.f551071b.f113544s.add(str);
        }
        return this;
    }

    public final z20.b c(java.lang.String str) {
        if (str != null) {
            bw5.q9 q9Var = this.f551071b;
            q9Var.f113535g = str;
            q9Var.f113546u[4] = true;
        }
        return this;
    }

    public final void d() {
        a();
        int i17 = y02.d1.f540131d;
        y02.b1 b1Var = (y02.b1) p3380x6a61f93.p3387xf51c6630.C30622x21b27ad2.m170331x21b0d463();
        if (b1Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ECS.Tracker", "EcsTracker_UrCpp.sharedInstance() is null");
            return;
        }
        bw5.q9 q9Var = this.f551071b;
        boolean[] zArr = q9Var.f113546u;
        boolean z17 = zArr[1];
        java.lang.String str = "";
        java.lang.String str2 = (z17 && z17) ? q9Var.f113532d : "";
        boolean z18 = zArr[2];
        if (z18 && z18) {
            str = q9Var.f113533e;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        p3380x6a61f93.p3387xf51c6630.C30622x21b27ad2.m170336x21b829d3(((y02.d1) b1Var).m105978x2737f10(), str2, str, 1);
    }

    public final z20.b e(java.util.Map map) {
        if (map != null) {
            bw5.q9 q9Var = this.f551071b;
            q9Var.f113542q = new org.json.JSONObject(map).toString();
            q9Var.f113546u[12] = true;
        }
        return this;
    }

    public final z20.b f(java.lang.String str) {
        if (str != null) {
            bw5.q9 q9Var = this.f551071b;
            q9Var.f113533e = str;
            q9Var.f113546u[2] = true;
        }
        return this;
    }
}
