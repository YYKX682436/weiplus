package pg2;

/* loaded from: classes3.dex */
public final class v extends ug5.h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mn0.b0 f435723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.q f435724f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f435725g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pg2.j0 f435726h;

    public v(mn0.b0 b0Var, yz5.q qVar, long j17, pg2.j0 j0Var) {
        this.f435723e = b0Var;
        this.f435724f = qVar;
        this.f435725g = j17;
        this.f435726h = j0Var;
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
        mn0.b0 b0Var = this.f435723e;
        nn0.c cVar = b0Var instanceof nn0.c ? (nn0.c) b0Var : null;
        if (cVar != null) {
            cVar.Y(new android.graphics.RectF());
        }
        android.content.Intent intent = new android.content.Intent();
        ug5.x.d(intent, performer, java.lang.String.valueOf(this.f435725g));
        this.f435724f.mo147xb9724478(java.lang.Boolean.TRUE, performer, intent);
    }

    @Override // ug5.h
    public void b(ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        android.content.Intent intent = new android.content.Intent();
        ug5.x.d(intent, performer, java.lang.String.valueOf(this.f435725g));
        this.f435724f.mo147xb9724478(java.lang.Boolean.FALSE, performer, intent);
    }

    @Override // ug5.h
    public void e(android.content.Context context, boolean z17, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        super.e(context, z17, performer);
        pg2.j0.Ai(this.f435726h, performer, z17);
    }

    @Override // ug5.h
    public void g(android.content.Context context, ug5.v performer) {
        gp1.v Bi;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        super.g(context, performer);
        performer.f509191a.f509128i.put("key_first_frame_render", java.lang.Boolean.TRUE);
        java.lang.Object d17 = performer.d("key_ball_info");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = d17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d ? (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) d17 : null;
        if (c12886x91aa2b6d == null || (Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi()) == null) {
            return;
        }
        Bi.k(c12886x91aa2b6d, 0.001f);
    }
}
