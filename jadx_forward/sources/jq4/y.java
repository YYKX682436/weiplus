package jq4;

/* loaded from: classes5.dex */
public abstract class y extends jq4.z0 {
    public boolean A;

    /* renamed from: w, reason: collision with root package name */
    public wu5.c f382755w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f382756x;

    /* renamed from: y, reason: collision with root package name */
    public yz5.a f382757y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f382758z;

    public static /* synthetic */ void y(jq4.y yVar, android.content.Context context, android.content.Intent intent, long j17, int i17, boolean z17, java.lang.String str, boolean z18, int i18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showCard");
        }
        yVar.x(context, intent, j17, i17, z17, str, (i19 & 64) != 0 ? false : z18, (i19 & 128) != 0 ? 1 : i18);
    }

    public void A(java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showRejectCard: ");
        sb6.append(toUser);
        sb6.append(" and ");
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.z) ((oo3.i) i95.n0.c(oo3.i.class))).getClass();
        sb6.append(((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f145049b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipFloatCardManager", sb6.toString());
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.z) ((oo3.i) i95.n0.c(oo3.i.class))).getClass();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f145049b, toUser) || this.A) {
            super.s();
            return;
        }
        this.f382756x = true;
        int i17 = this.f382772h;
        long j17 = this.f382771g;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "voip_banner_after_reject");
        hashMap.put("voip_roomid", java.lang.Integer.valueOf(i17));
        hashMap.put("voip_roomKey", java.lang.Long.valueOf(j17));
        hashMap.put("voip_banner_after_reject_from", 1);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap, 26804);
        this.f382782r = 2;
        wu5.c cVar = this.f382755w;
        if (cVar != null) {
            cVar.cancel(false);
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        jq4.s sVar = new jq4.s(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f382755w = t0Var.z(sVar, 2500L, false);
        if (this.f382781q == null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            z(context, toUser);
            return;
        }
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.by), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj));
        android.view.View view = this.f382781q;
        if (view != null) {
            ofInt.addUpdateListener(new jq4.w(view, this));
        }
        android.view.View view2 = this.f382769e;
        android.view.View findViewById = view2 != null ? view2.findViewById(com.p314xaae8f345.mm.R.id.lsu) : null;
        android.view.View view3 = this.f382769e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = view3 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view3.findViewById(com.p314xaae8f345.mm.R.id.gww) : null;
        android.view.View view4 = this.f382769e;
        android.view.View findViewById2 = view4 != null ? view4.findViewById(com.p314xaae8f345.mm.R.id.mlr) : null;
        android.view.View view5 = this.f382769e;
        android.view.View findViewById3 = view5 != null ? view5.findViewById(com.p314xaae8f345.mm.R.id.mlq) : null;
        android.view.View view6 = this.f382769e;
        if (view6 != null) {
            view6.setOnClickListener(new jq4.t(this, toUser));
        }
        android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561265dp), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df));
        ofInt2.addUpdateListener(new jq4.x(findViewById));
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new jq4.u(c22699x3dcdb352, findViewById, findViewById2, findViewById3));
        android.animation.ValueAnimator ofInt3 = android.animation.ValueAnimator.ofInt(28, 0);
        ofInt3.addUpdateListener(new jq4.v(c22699x3dcdb352));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.play(ofInt).with(ofInt2).with(ofInt3).with(ofFloat);
        animatorSet.start();
    }

    @Override // jq4.z0
    public void b(boolean z17, boolean z18, boolean z19) {
        if (z19 && this.f382782r == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipFloatCardManager", "dismiss card, current card is incoming card, skip");
            return;
        }
        if (this.f382755w == null) {
            super.b(z17, z18, z19);
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).rj(".ui.voip.VoipFloatView");
            this.f382782r = 0;
            if (this.f382756x) {
                int i17 = this.f382772h;
                long j17 = this.f382771g;
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("view_id", "voip_banner_after_reject");
                hashMap.put("voip_roomid", java.lang.Integer.valueOf(i17));
                hashMap.put("voip_roomKey", java.lang.Long.valueOf(j17));
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_unexp", hashMap, 26804);
            }
        }
    }

    @Override // jq4.z0
    public int d() {
        return this.f382758z ? com.p314xaae8f345.mm.R.C30861xcebc809e.f562255b3 : com.p314xaae8f345.mm.R.C30861xcebc809e.f562252b0;
    }

    @Override // jq4.z0
    public int e() {
        return this.A ? com.p314xaae8f345.mm.R.C30864xbddafb2a.dci : com.p314xaae8f345.mm.R.C30864xbddafb2a.baq;
    }

    @Override // jq4.z0
    public int f() {
        return this.f382758z ? com.p314xaae8f345.mm.R.C30867xcad56011.f575003kc3 : this.A ? com.p314xaae8f345.mm.R.C30867xcad56011.lgj : com.p314xaae8f345.mm.R.C30867xcad56011.f575002kc2;
    }

    @Override // jq4.z0
    public void k(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        int i17 = this.f382782r;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("VoipFloatCardManager", "onAccept, cardType is null, ignore");
            return;
        }
        if (i17 != 3) {
            android.view.View view = this.f382769e;
            if (view != null) {
                ku5.u0 u0Var = ku5.t0.f394148d;
                jq4.a aVar = new jq4.a(view, intent, this);
                ku5.t0 t0Var = (ku5.t0) u0Var;
                t0Var.getClass();
                t0Var.z(aVar, 200L, false);
            }
            b(false, false, false);
        }
    }

    @Override // jq4.z0
    public android.animation.Animator n() {
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.z) ((oo3.i) i95.n0.c(oo3.i.class))).getClass();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f145049b, this.f382775k)) {
            return super.n();
        }
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.addUpdateListener(new jq4.b(this));
        ofFloat.setDuration(300L);
        ofFloat.start();
        return ofFloat;
    }

    @Override // jq4.z0
    public void o() {
        if (this.f382756x) {
            int i17 = this.f382772h;
            long j17 = this.f382771g;
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("view_id", "voip_banner_after_reject");
            hashMap.put("voip_roomid", java.lang.Integer.valueOf(i17));
            hashMap.put("voip_roomKey", java.lang.Long.valueOf(j17));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_slide_up", hashMap, 26804);
        }
        if (this.f382758z) {
            rq4.s.f480631a.a(this.f382771g, 2, 2);
        } else {
            rq4.s.f480631a.a(this.f382771g, 2, 1);
        }
        if (this.f382756x) {
            int i18 = this.f382772h;
            long j18 = this.f382771g;
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put("view_id", "voip_banner_after_reject");
            hashMap2.put("voip_roomid", java.lang.Integer.valueOf(i18));
            hashMap2.put("voip_roomKey", java.lang.Long.valueOf(j18));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_slide_up", hashMap2, 26804);
        }
    }

    @Override // jq4.z0
    public void p(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        int i17 = this.f382782r;
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("VoipFloatCardManager", "onFullscreen, cardType is null, ignore");
            return;
        }
        if (i17 == 3) {
            j();
            yz5.a aVar = this.f382757y;
            if (aVar != null) {
                aVar.mo152xb9724478();
                return;
            }
            return;
        }
        b(true, false, false);
        android.view.View view = this.f382769e;
        ku5.u0 u0Var = ku5.t0.f394148d;
        jq4.c cVar = new jq4.c(view, intent, this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(cVar, 200L, false);
        if (this.f382758z) {
            rq4.s.f480631a.a(this.f382771g, 1, 2);
        } else {
            rq4.s.f480631a.a(this.f382771g, 1, 1);
        }
    }

    @Override // jq4.z0
    public void q() {
        if (this.f382782r == 3) {
            j();
        }
    }

    @Override // jq4.z0
    public void s() {
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.z) ((oo3.i) i95.n0.c(oo3.i.class))).getClass();
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) c01.d9.f()).f145049b, this.f382775k) || this.A) {
            super.s();
            return;
        }
        this.f382756x = true;
        int i17 = this.f382772h;
        long j17 = this.f382771g;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "voip_banner_after_reject");
        hashMap.put("voip_roomid", java.lang.Integer.valueOf(i17));
        hashMap.put("voip_roomKey", java.lang.Long.valueOf(j17));
        hashMap.put("voip_banner_after_reject_from", 1);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap, 26804);
        this.f382782r = 2;
        wu5.c cVar = this.f382755w;
        if (cVar != null) {
            cVar.cancel(false);
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        jq4.d dVar = new jq4.d(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f382755w = t0Var.z(dVar, 2500L, false);
        android.animation.ValueAnimator ofInt = android.animation.ValueAnimator.ofInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.by), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj));
        android.view.View view = this.f382781q;
        if (view != null) {
            ofInt.addUpdateListener(new jq4.h(view, this));
        }
        android.view.View view2 = this.f382769e;
        android.view.View findViewById = view2 != null ? view2.findViewById(com.p314xaae8f345.mm.R.id.lsu) : null;
        android.view.View view3 = this.f382769e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = view3 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view3.findViewById(com.p314xaae8f345.mm.R.id.gww) : null;
        android.view.View view4 = this.f382769e;
        android.view.View findViewById2 = view4 != null ? view4.findViewById(com.p314xaae8f345.mm.R.id.mlr) : null;
        android.view.View view5 = this.f382769e;
        android.view.View findViewById3 = view5 != null ? view5.findViewById(com.p314xaae8f345.mm.R.id.mlq) : null;
        android.view.View view6 = this.f382769e;
        if (view6 != null) {
            view6.setOnClickListener(new jq4.e(this));
        }
        android.animation.ValueAnimator ofInt2 = android.animation.ValueAnimator.ofInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561265dp), com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df));
        ofInt2.addUpdateListener(new jq4.i(findViewById));
        android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new jq4.f(c22699x3dcdb352, findViewById, findViewById2, findViewById3));
        android.animation.ValueAnimator ofInt3 = android.animation.ValueAnimator.ofInt(28, 0);
        ofInt3.addUpdateListener(new jq4.g(c22699x3dcdb352));
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        animatorSet.setDuration(300L);
        animatorSet.play(ofInt).with(ofInt2).with(ofInt3).with(ofFloat);
        animatorSet.start();
        r();
    }

    public void x(android.content.Context context, android.content.Intent intent, long j17, int i17, boolean z17, java.lang.String toUser, boolean z18, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        wu5.c cVar = this.f382755w;
        if (cVar != null || this.f382756x) {
            if (cVar != null) {
                cVar.cancel(false);
            }
            this.f382755w = null;
            jq4.z0.c(this, true, false, false, 2, null);
            this.f382756x = false;
        }
        this.f382782r = i18;
        rq4.s sVar = rq4.s.f480631a;
        int i19 = z17 ? 2 : 1;
        rq4.r rVar = rq4.s.f480633c;
        rVar.f480629d = 1;
        rVar.f480628c = i19;
        rq4.s.f480632b = java.lang.System.currentTimeMillis();
        v(context, intent, j17, i17, toUser, z18);
        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).qj(".ui.voip.VoipFloatView");
    }

    public void z(android.content.Context context, java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        if (this.f382769e != null) {
            return;
        }
        this.f382756x = true;
        wu5.c cVar = this.f382755w;
        if (cVar != null) {
            cVar.cancel(false);
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        jq4.j jVar = new jq4.j(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f382755w = t0Var.z(jVar, 2500L, false);
        if (this.f382782r != 2) {
            jq4.z0.c(this, true, false, false, 6, null);
        }
        int i17 = this.f382772h;
        long j17 = this.f382771g;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "voip_banner_after_reject");
        hashMap.put("voip_roomid", java.lang.Integer.valueOf(i17));
        hashMap.put("voip_roomKey", java.lang.Long.valueOf(j17));
        hashMap.put("voip_banner_after_reject_from", 2);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_exp", hashMap, 26804);
        this.f382782r = 2;
        this.f382771g = this.f382771g;
        this.f382775k = toUser;
        com.p314xaae8f345.mm.app.w.INSTANCE.a(this.f382786v);
        if (this.f382765a == null) {
            p3325xe03a0797.p3326xc267989b.c0 a17 = p3325xe03a0797.p3326xc267989b.v2.a(null, 1, null);
            this.f382767c = p3325xe03a0797.p3326xc267989b.z0.a(p3325xe03a0797.p3326xc267989b.q1.f392103c.mo7096x348d9a(a17));
            this.f382765a = a17;
        }
        if (this.f382768d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("VoipFloatCardManager", "Load windowManager: " + getClass());
            java.lang.Object systemService = context.getSystemService("window");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            this.f382768d = new jq4.d0((android.view.WindowManager) systemService);
        }
        if (this.f382769e == null) {
            this.f382785u = new android.view.GestureDetector(context, this.f382784t);
            this.f382769e = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bar, (android.view.ViewGroup) null, false);
        }
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        layoutParams.type = fp.h.c(26) ? 2038 : 2002;
        layoutParams.flags = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.f0.f34795x366c91de;
        layoutParams.format = 1;
        layoutParams.packageName = context.getPackageName();
        layoutParams.gravity = 49;
        layoutParams.width = -1;
        layoutParams.height = -2;
        android.view.View view = this.f382769e;
        if (view != null) {
            android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.kfz);
            imageView.post(new jq4.m(this, imageView));
            w();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.0f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager", "showFinishCard", "(Landroid/content/Context;Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager", "showFinishCard", "(Landroid/content/Context;Ljava/lang/String;)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager", "showFinishCard", "(Landroid/content/Context;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/voip/floatcard/AnimatedVoipBaseFloatCardManager", "showFinishCard", "(Landroid/content/Context;Ljava/lang/String;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.ViewManager viewManager = this.f382768d;
            if (viewManager != null) {
                viewManager.addView(view, layoutParams);
            }
            view.post(new jq4.q(this, view));
            view.setOnClickListener(new jq4.r(this, toUser));
        }
    }
}
