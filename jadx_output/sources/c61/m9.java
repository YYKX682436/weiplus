package c61;

/* loaded from: classes3.dex */
public final class m9 extends ug5.h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zy2.g5 f39162e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f39163f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f39164g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.p f39165h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c61.s9 f39166i;

    public m9(zy2.g5 g5Var, android.content.Intent intent, long j17, yz5.p pVar, c61.s9 s9Var) {
        this.f39162e = g5Var;
        this.f39163f = intent;
        this.f39164g = j17;
        this.f39165h = pVar;
        this.f39166i = s9Var;
    }

    @Override // ug5.h
    public void a(android.animation.Animator animation, ug5.v performer) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.a(animation, performer);
        ez2.e eVar = ez2.g.f257902a;
        if (eVar != null) {
            eVar.e();
        }
        java.lang.String str = pm0.v.u(this.f39164g) + '_' + this.f39162e.hashCode();
        android.content.Intent intent = this.f39163f;
        ug5.x.d(intent, performer, str);
        this.f39165h.invoke(java.lang.Boolean.FALSE, intent);
    }

    @Override // ug5.h
    public void c(android.animation.Animator animation, ug5.v performer) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.c(animation, performer);
        ez2.e eVar = ez2.g.f257902a;
        if (eVar != null) {
            eVar.f(240L);
        }
    }

    @Override // ug5.h
    public void d(float f17, android.graphics.Rect clipRect, android.graphics.Rect canvasRect, ug5.v performer) {
        kotlin.jvm.internal.o.g(clipRect, "clipRect");
        kotlin.jvm.internal.o.g(canvasRect, "canvasRect");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.d(f17, clipRect, canvasRect, performer);
    }

    @Override // ug5.h
    public void e(android.content.Context context, boolean z17, ug5.v performer) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.e(context, z17, performer);
        this.f39166i.Bi(performer, z17);
    }

    @Override // ug5.h
    public void f() {
        ez2.e eVar = ez2.g.f257902a;
        if (eVar != null) {
            eVar.c();
        }
    }

    @Override // ug5.h
    public void g(android.content.Context context, ug5.v performer) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(performer, "performer");
        super.g(context, performer);
        ez2.e eVar = ez2.g.f257902a;
        if (eVar != null) {
            eVar.d();
        }
        com.tencent.mars.xlog.Log.i("FinderVideoSurfaceViewService", "onPerformStart " + performer.f427660c);
        zy2.g5 g5Var = this.f39162e;
        zy2.p7 p7Var = g5Var instanceof zy2.p7 ? (zy2.p7) g5Var : null;
        if (p7Var != null) {
            p7Var.setFirstVideoFrameRenderedAfterSurfaceChange(new c61.k9(g5Var, performer));
        }
        android.view.KeyEvent.Callback callback = performer.f427660c;
        mk4.b bVar = callback instanceof mk4.b ? (mk4.b) callback : null;
        if (bVar != null) {
            bVar.setSurfaceListener(new c61.l9(g5Var));
        }
    }
}
