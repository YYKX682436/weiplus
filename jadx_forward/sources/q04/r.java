package q04;

@j95.b
/* loaded from: classes4.dex */
public final class r extends i95.w implements xs.j1 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f440931d = "MicroMsg.SecData.SecDataService";

    public void Ai(int i17, java.lang.String str, java.lang.Class cls, o04.q qVar) {
        jz5.f0 f0Var;
        m134976x2690a4ac();
        if (str != null) {
            pm0.v.O("SecDBTag", new q04.i(i17, str, this, cls, qVar));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            pm0.v.O("SecDBTag", new q04.j(qVar));
        }
    }

    public void Bi(int i17, java.lang.String str, java.lang.Class cls, o04.q qVar) {
        jz5.f0 f0Var;
        m134976x2690a4ac();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f440931d, "getWithoutClear subType:" + i17 + " id:" + str);
        if (str != null) {
            pm0.v.O("SecDBTag", new q04.k(i17, str, this, cls, qVar));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            pm0.v.O("SecDBTag", new q04.l(qVar));
        }
    }

    public com.p314xaae8f345.mm.p2495xc50a8b8b.f Di(int i17, java.lang.String str, java.lang.Class cls) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        m134976x2690a4ac();
        if (str == null) {
            return null;
        }
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(r04.a.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(r04.a.class);
        }
        r04.b X6 = ((r04.d) ((r04.a) a17).P6(r04.d.class)).X6(i17 + '_' + str);
        if (X6 != null) {
            r0 = cls != null ? (com.p314xaae8f345.mm.p2495xc50a8b8b.f) cls.newInstance() : null;
            if (r0 != null) {
                try {
                    r0.mo11468x92b714fd(X6.f66000x225a93cf);
                } catch (java.lang.Exception unused) {
                }
            }
        }
        return r0;
    }

    public void Ni(int i17, java.lang.String str, o04.q qVar) {
        jz5.f0 f0Var;
        m134976x2690a4ac();
        if (str != null) {
            pm0.v.O("SecDBTag", new q04.n(i17, str, qVar));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            pm0.v.O("SecDBTag", new q04.o(qVar));
        }
    }

    public boolean Ri(int i17, java.lang.String str) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        m134976x2690a4ac();
        if (str == null) {
            return false;
        }
        synchronized (jm0.k.f381803i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(r04.a.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(r04.a.class);
        }
        r04.d dVar = (r04.d) ((r04.a) a17).P6(r04.d.class);
        java.lang.String id6 = i17 + '_' + str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        r04.b X6 = dVar.X6(id6);
        return (X6 != null ? com.p314xaae8f345.mm.sdk.p2605x8fb0427b.p2606x335620.AbstractC21005xe7f8081b.S6(dVar, X6, false, false, 6, null) : 0) > 0;
    }

    public void Ui(int i17, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (str != null) {
            java.lang.String str2 = i17 + '_' + str;
            java.util.HashMap hashMap = r04.c.f449888a;
            java.util.HashMap hashMap2 = r04.c.f449888a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protobuf.BaseProtoBuf");
            hashMap2.put(str2, fVar);
        }
    }

    public void Vi(int i17, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, o04.q qVar) {
        jz5.f0 f0Var;
        m134976x2690a4ac();
        if (str != null) {
            pm0.v.O("SecDBTag", new q04.p(i17, str, this, str, fVar, 259200000L, qVar));
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            pm0.v.O("SecDBTag", new q04.q(qVar, fVar));
        }
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p012xc85e97e9.p093xedfae76a.c1 a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        try {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SEC_DATA_DB_VERSION_INT;
            java.lang.Object m17 = c17.m(u3Var, 0);
            java.lang.String str = gm0.j1.u().h() + "secdata/";
            java.lang.String str2 = str + "SecData.db";
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m17, 2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f440931d, "diff version, delete old db;");
                com.p314xaae8f345.mm.vfs.w6.f(str);
            }
            synchronized (jm0.k.f381803i) {
                gm0.j1.b().c();
                if (!jm0.k.class.isAssignableFrom(r04.a.class)) {
                    throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
                }
                a17 = new p012xc85e97e9.p093xedfae76a.j1(gm0.j1.b().f354778h, new jm0.h()).a(r04.a.class);
            }
            if (((r04.a) a17).O6(str2)) {
                gm0.j1.u().c().x(u3Var, 2);
            }
            pm0.v.O("SecDBTag", new q04.m(this));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(this.f440931d, e17, "create sec data db", new java.lang.Object[0]);
        }
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.HashMap hashMap = r04.c.f449888a;
        r04.c.f449888a.clear();
    }

    @Override // i95.w
    /* renamed from: onCreate */
    public void mo8845x3e5a77bb(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo8845x3e5a77bb(context);
    }

    public com.p314xaae8f345.mm.p2495xc50a8b8b.f wi(int i17, java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.lang.String str2 = i17 + '_' + str;
        java.util.HashMap hashMap = r04.c.f449888a;
        return (com.p314xaae8f345.mm.p2495xc50a8b8b.f) r04.c.f449888a.get(str2);
    }
}
