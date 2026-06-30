package pg2;

/* loaded from: classes3.dex */
public final class i0 extends ug5.h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f435653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nn0.c f435654f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f435655g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pg2.j0 f435656h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ c50.e1 f435657i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f435658m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f435659n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f435660o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ android.view.View f435661p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ boolean f435662q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ yz5.q f435663r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f435664s;

    public i0(boolean z17, nn0.c cVar, boolean z18, pg2.j0 j0Var, c50.e1 e1Var, boolean z19, android.graphics.Rect rect, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.view.View view, boolean z27, yz5.q qVar, long j17) {
        this.f435653e = z17;
        this.f435654f = cVar;
        this.f435655g = z18;
        this.f435656h = j0Var;
        this.f435657i = e1Var;
        this.f435658m = z19;
        this.f435659n = rect;
        this.f435660o = h0Var;
        this.f435661p = view;
        this.f435662q = z27;
        this.f435663r = qVar;
        this.f435664s = j17;
    }

    @Override // ug5.h
    public void a(android.animation.Animator animation, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        super.a(animation, performer);
        ug5.g gVar = performer.f509191a;
        java.lang.Object obj = gVar.f509128i.get("key_first_frame_render");
        java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onPerformAnimationEnd firstFrameRender=");
        sb6.append(booleanValue);
        sb6.append(" isAudioMode=");
        boolean z17 = this.f435658m;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSurfaceViewService", sb6.toString());
        java.util.HashMap hashMap = gVar.f509128i;
        java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
        hashMap.put("key_enter_anim_complete", bool2);
        if (!this.f435662q && !z17) {
            pg2.j0.aj(this.f435656h, performer, this.f435654f, this.f435657i, null, 8, null);
        }
        ez2.e eVar = ez2.g.f339435a;
        if (eVar != null) {
            eVar.e();
        }
        nn0.c cVar = this.f435654f;
        nn0.c cVar2 = cVar instanceof nn0.c ? cVar : null;
        if (cVar2 != null) {
            cVar2.Y(new android.graphics.RectF());
        }
        android.content.Intent intent = new android.content.Intent();
        ug5.x.d(intent, performer, java.lang.String.valueOf(this.f435664s));
        this.f435663r.mo147xb9724478(bool2, performer, intent);
    }

    @Override // ug5.h
    public void b(ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        android.content.Intent intent = new android.content.Intent();
        ug5.x.d(intent, performer, java.lang.String.valueOf(this.f435664s));
        this.f435663r.mo147xb9724478(java.lang.Boolean.FALSE, performer, intent);
    }

    @Override // ug5.h
    public void c(android.animation.Animator animation, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        super.c(animation, performer);
        ez2.e eVar = ez2.g.f339435a;
        if (eVar != null) {
            c50.e1 e1Var = this.f435657i;
            eVar.f(e1Var != null ? e1Var.f120131b : 240L);
        }
        android.view.View view = this.f435661p;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$triggerLiveEnterAnim$fluentPerformer$3", "onPerformAnimationStart", "(Landroid/animation/Animator;Lcom/tencent/mm/ui/fluent/ViewFluentPerformer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$triggerLiveEnterAnim$fluentPerformer$3", "onPerformAnimationStart", "(Landroid/animation/Animator;Lcom/tencent/mm/ui/fluent/ViewFluentPerformer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Float.valueOf(0.0f));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$triggerLiveEnterAnim$fluentPerformer$3", "onPerformAnimationStart", "(Landroid/animation/Animator;Lcom/tencent/mm/ui/fluent/ViewFluentPerformer;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$triggerLiveEnterAnim$fluentPerformer$3", "onPerformAnimationStart", "(Landroid/animation/Animator;Lcom/tencent/mm/ui/fluent/ViewFluentPerformer;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // ug5.h
    public void d(float f17, android.graphics.Rect clipRect, android.graphics.Rect canvasRect, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clipRect, "clipRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvasRect, "canvasRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        super.d(f17, clipRect, canvasRect, performer);
        if (this.f435653e) {
            android.graphics.Rect rect = this.f435659n;
            int i17 = rect.top - ((int) ((r0 - r0) * f17));
            int i18 = rect.left - ((int) ((r1 - r1) * f17));
            float width = rect.width();
            int width2 = rect.width();
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f435660o;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveSurfaceViewService", "onPerformClipRectUpdate animatedFraction: " + f17 + " currentRect: " + new android.graphics.Rect(i18, i17, ((int) (width - ((width2 - ((android.graphics.Rect) h0Var.f391656d).width()) * f17))) + i18, ((int) (rect.height() - ((rect.height() - ((android.graphics.Rect) h0Var.f391656d).height()) * f17))) + i17) + " clipRect: " + clipRect + " canvasRect: " + canvasRect);
        } else {
            nn0.c cVar = this.f435654f;
            if (!(cVar instanceof nn0.c)) {
                cVar = null;
            }
            if (cVar != null) {
                cVar.Y(ug5.x.g(clipRect, canvasRect));
            }
        }
        android.view.View view = this.f435661p;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$triggerLiveEnterAnim$fluentPerformer$3", "onPerformClipRectUpdate", "(FLandroid/graphics/Rect;Landroid/graphics/Rect;Lcom/tencent/mm/ui/fluent/ViewFluentPerformer;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$triggerLiveEnterAnim$fluentPerformer$3", "onPerformClipRectUpdate", "(FLandroid/graphics/Rect;Landroid/graphics/Rect;Lcom/tencent/mm/ui/fluent/ViewFluentPerformer;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // ug5.h
    public void e(android.content.Context context, boolean z17, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        super.e(context, z17, performer);
        pg2.j0.Ai(this.f435656h, performer, z17);
        android.view.View view = this.f435661p;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$triggerLiveEnterAnim$fluentPerformer$3", "onPerformCompleted", "(Landroid/content/Context;ZLcom/tencent/mm/ui/fluent/ViewFluentPerformer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/fluent/performer/FinderLiveSurfaceViewService$triggerLiveEnterAnim$fluentPerformer$3", "onPerformCompleted", "(Landroid/content/Context;ZLcom/tencent/mm/ui/fluent/ViewFluentPerformer;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
        boolean z17 = this.f435653e;
        ug5.g gVar = performer.f509191a;
        if (z17) {
            gVar.f509128i.put("key_first_frame_render", java.lang.Boolean.TRUE);
        } else {
            ez2.e eVar = ez2.g.f339435a;
            if (eVar != null) {
                eVar.d();
            }
            nn0.c cVar = this.f435654f;
            performer.f("key_player_view", new java.lang.ref.WeakReference(cVar.o()));
            java.util.HashMap hashMap = gVar.f509128i;
            java.lang.Boolean bool = java.lang.Boolean.TRUE;
            hashMap.put("key_enter_anim_from_opt", bool);
            if (this.f435655g) {
                gVar.f509128i.put("key_first_frame_render", bool);
                pg2.j0.aj(this.f435656h, performer, this.f435654f, this.f435657i, null, 8, null);
            } else if (!this.f435658m) {
                pg2.j0 j0Var = this.f435656h;
                j0Var.getClass();
                cVar.J(new pg2.i(performer, j0Var));
            }
        }
        java.lang.Object d17 = performer.d("key_ball_info");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d = d17 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d ? (com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d) d17 : null;
        if (c12886x91aa2b6d == null || (Bi = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Bi()) == null) {
            return;
        }
        Bi.k(c12886x91aa2b6d, 0.001f);
    }
}
