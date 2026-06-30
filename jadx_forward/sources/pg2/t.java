package pg2;

/* loaded from: classes3.dex */
public final class t extends ug5.h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pg2.j0 f435716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f435717f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f435718g;

    public t(pg2.j0 j0Var, yz5.p pVar, long j17) {
        this.f435716e = j0Var;
        this.f435717f = pVar;
        this.f435718g = j17;
    }

    @Override // ug5.h
    public void a(android.animation.Animator animation, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        super.a(animation, performer);
        ez2.e eVar = ez2.g.f339435a;
        if (eVar != null) {
            eVar.e();
        }
        android.content.Intent intent = new android.content.Intent();
        ug5.x.d(intent, performer, java.lang.String.valueOf(this.f435718g));
        this.f435717f.mo149xb9724478(java.lang.Boolean.TRUE, intent);
    }

    @Override // ug5.h
    public void b(ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        android.content.Intent intent = new android.content.Intent();
        ug5.x.d(intent, performer, java.lang.String.valueOf(this.f435718g));
        this.f435717f.mo149xb9724478(java.lang.Boolean.FALSE, intent);
    }

    @Override // ug5.h
    public void c(android.animation.Animator animation, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        super.c(animation, performer);
        ez2.e eVar = ez2.g.f339435a;
        if (eVar != null) {
            eVar.f(240L);
        }
    }

    @Override // ug5.h
    public void e(android.content.Context context, boolean z17, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        super.e(context, z17, performer);
        pg2.j0.Ai(this.f435716e, performer, z17);
    }

    @Override // ug5.h
    public void f() {
        ez2.e eVar = ez2.g.f339435a;
        if (eVar != null) {
            eVar.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ug5.h
    public void g(android.content.Context context, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        super.g(context, performer);
        ez2.e eVar = ez2.g.f339435a;
        if (eVar != null) {
            eVar.d();
        }
        pg2.j0 j0Var = this.f435716e;
        j0Var.getClass();
        java.lang.Object d17 = performer.d("liveUrl");
        java.lang.String str = d17 instanceof java.lang.String ? (java.lang.String) d17 : null;
        if (!(str == null || str.length() == 0)) {
            java.lang.Object d18 = performer.d("playerInfoData");
            mn0.l0 l0Var = d18 instanceof mn0.l0 ? (mn0.l0) d18 : null;
            java.lang.Object d19 = performer.d("liveSdkChannelParams");
            r45.ka4 ka4Var = d19 instanceof r45.ka4 ? (r45.ka4) d19 : null;
            int X = nn0.c.X(false);
            nn0.c cVar = new nn0.c(context, (X == 5 || X == 6) ? 2 : 0, false);
            cVar.K(mn0.d0.f411244g, 2);
            cVar.f(true);
            cVar.F(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.n2.f197173a, "FinderLiveSurfaceViewService", true, null, ka4Var, 0, 0, 52, null));
            cVar.G(true);
            cVar.Q(0);
            cVar.J(new pg2.a0(performer, str, cVar, ka4Var, j0Var, context, l0Var));
            java.lang.String a17 = qg2.e.f444332a.a(str, ka4Var);
            if (l0Var != null) {
                cVar.N(l0Var);
            }
            mn0.b0.D(cVar, a17, 1, ka4Var, j0Var.Ui(context, l0Var != null ? l0Var.f411306d : 0L, l0Var != null ? l0Var.f411305c : 0L), false, false, 48, null);
            r2 = cVar;
        }
        performer.f("key_player", r2);
    }
}
