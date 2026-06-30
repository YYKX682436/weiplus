package pg2;

/* loaded from: classes3.dex */
public final class e0 extends ug5.h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mn0.b0 f435630e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c50.e1 f435631f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.q f435632g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f435633h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ pg2.j0 f435634i;

    public e0(mn0.b0 b0Var, c50.e1 e1Var, yz5.q qVar, long j17, pg2.j0 j0Var) {
        this.f435630e = b0Var;
        this.f435631f = e1Var;
        this.f435632g = qVar;
        this.f435633h = j17;
        this.f435634i = j0Var;
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
        mn0.b0 b0Var = this.f435630e;
        nn0.c cVar = b0Var instanceof nn0.c ? (nn0.c) b0Var : null;
        if (cVar != null) {
            cVar.Y(new android.graphics.RectF());
        }
        android.content.Intent intent = new android.content.Intent();
        ug5.x.d(intent, performer, java.lang.String.valueOf(this.f435633h));
        this.f435632g.mo147xb9724478(java.lang.Boolean.TRUE, performer, intent);
    }

    @Override // ug5.h
    public void b(ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        android.content.Intent intent = new android.content.Intent();
        ug5.x.d(intent, performer, java.lang.String.valueOf(this.f435633h));
        this.f435632g.mo147xb9724478(java.lang.Boolean.FALSE, performer, intent);
    }

    @Override // ug5.h
    public void c(android.animation.Animator animation, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        super.c(animation, performer);
        ez2.e eVar = ez2.g.f339435a;
        if (eVar != null) {
            c50.e1 e1Var = this.f435631f;
            eVar.f(e1Var != null ? e1Var.f120131b : 240L);
        }
    }

    @Override // ug5.h
    public void d(float f17, android.graphics.Rect clipRect, android.graphics.Rect canvasRect, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipRect, "clipRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvasRect, "canvasRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        super.d(f17, clipRect, canvasRect, performer);
        mn0.b0 b0Var = this.f435630e;
        nn0.c cVar = b0Var instanceof nn0.c ? (nn0.c) b0Var : null;
        if (cVar != null) {
            cVar.Y(ug5.x.g(clipRect, canvasRect));
        }
    }

    @Override // ug5.h
    public void e(android.content.Context context, boolean z17, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        super.e(context, z17, performer);
        pg2.j0.Ai(this.f435634i, performer, z17);
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
        gp1.v Bi;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        super.g(context, performer);
        ez2.e eVar = ez2.g.f339435a;
        if (eVar != null) {
            eVar.d();
        }
        mn0.b0 b0Var = this.f435630e;
        performer.f("key_player_view", new java.lang.ref.WeakReference(((mn0.y) b0Var).o()));
        performer.f509191a.f509128i.put("key_first_frame_render", java.lang.Boolean.TRUE);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = (com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) performer.f509193c;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf != null) {
            ((mn0.y) b0Var).O(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, new pg2.d0(this.f435631f, performer, elapsedRealtime));
        }
        java.lang.Object d17 = performer.d("key_ball_info");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = d17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d ? (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) d17 : null;
        if (c12886x91aa2b6d == null || (Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi()) == null) {
            return;
        }
        Bi.k(c12886x91aa2b6d, 0.001f);
    }
}
