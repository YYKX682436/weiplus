package c61;

/* loaded from: classes3.dex */
public final class m9 extends ug5.h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zy2.g5 f120695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f120696f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f120697g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f120698h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c61.s9 f120699i;

    public m9(zy2.g5 g5Var, android.content.Intent intent, long j17, yz5.p pVar, c61.s9 s9Var) {
        this.f120695e = g5Var;
        this.f120696f = intent;
        this.f120697g = j17;
        this.f120698h = pVar;
        this.f120699i = s9Var;
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
        java.lang.String str = pm0.v.u(this.f120697g) + '_' + this.f120695e.hashCode();
        android.content.Intent intent = this.f120696f;
        ug5.x.d(intent, performer, str);
        this.f120698h.mo149xb9724478(java.lang.Boolean.FALSE, intent);
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
    public void d(float f17, android.graphics.Rect clipRect, android.graphics.Rect canvasRect, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipRect, "clipRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvasRect, "canvasRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        super.d(f17, clipRect, canvasRect, performer);
    }

    @Override // ug5.h
    public void e(android.content.Context context, boolean z17, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        super.e(context, z17, performer);
        this.f120699i.Bi(performer, z17);
    }

    @Override // ug5.h
    public void f() {
        ez2.e eVar = ez2.g.f339435a;
        if (eVar != null) {
            eVar.c();
        }
    }

    @Override // ug5.h
    public void g(android.content.Context context, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        super.g(context, performer);
        ez2.e eVar = ez2.g.f339435a;
        if (eVar != null) {
            eVar.d();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderVideoSurfaceViewService", "onPerformStart " + performer.f509193c);
        zy2.g5 g5Var = this.f120695e;
        zy2.p7 p7Var = g5Var instanceof zy2.p7 ? (zy2.p7) g5Var : null;
        if (p7Var != null) {
            p7Var.mo61223x32e9c3b6(new c61.k9(g5Var, performer));
        }
        android.view.KeyEvent.Callback callback = performer.f509193c;
        mk4.b bVar = callback instanceof mk4.b ? (mk4.b) callback : null;
        if (bVar != null) {
            bVar.mo71928xb06c83bf(new c61.l9(g5Var));
        }
    }
}
