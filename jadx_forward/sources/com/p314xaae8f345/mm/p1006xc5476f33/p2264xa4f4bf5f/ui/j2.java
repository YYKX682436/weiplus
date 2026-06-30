package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class j2 extends com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.e0 implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f255528e;

    /* renamed from: f, reason: collision with root package name */
    public final bi4.h1 f255529f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18622xe469ff12 f255530g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f255531h;

    /* renamed from: i, reason: collision with root package name */
    public final android.os.Handler f255532i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.b2 f255533m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(android.content.Context mContext, bi4.h1 req) {
        super(mContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mContext, "mContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        this.f255528e = mContext;
        this.f255529f = req;
        this.f255532i = new android.os.Handler(android.os.Looper.getMainLooper());
        this.f255533m = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.b2(this);
    }

    public static final void b(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2 j2Var, yz5.a aVar) {
        java.lang.Object m143895xf1229813;
        j2Var.getClass();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            super.dismiss();
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TextStatus.MultipleTextStatusCardDialog", m143898xd4a2fc34, "finishDismissAndCallback: super.dismiss failed", new java.lang.Object[0]);
        }
        j2Var.i();
        aVar.mo152xb9724478();
    }

    public static final void c(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2 j2Var, java.lang.String str) {
        j2Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.MultipleTextStatusCardDialog", "onClickSetStatusButton");
        android.content.Context context = j2Var.f255528e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.e2 e2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.e2(context instanceof android.app.Activity ? (android.app.Activity) context : null, j2Var, str);
        if (j2Var.f255531h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.MultipleTextStatusCardDialog", "dismissWithCompletion: already dismissing, just run onEnd");
            e2Var.mo152xb9724478();
            return;
        }
        j2Var.f255531h = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.MultipleTextStatusCardDialog", "dismissWithCompletion: start, preset=" + j2Var.e().f102580a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782.class)).U6();
        android.widget.LinearLayout linearLayout = j2Var.f255354d;
        android.os.Handler handler = j2Var.f255532i;
        if (linearLayout != null) {
            boolean[] zArr = {false};
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.a2 a2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.a2(zArr, j2Var, e2Var);
            handler.postDelayed(a2Var, j2Var.e().f102581b + 100);
            j2Var.h(linearLayout, j2Var.e(), new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.z1(zArr, j2Var, a2Var, e2Var));
            return;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            super.dismiss();
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        handler.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.y1(j2Var, e2Var));
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        if (this.f255531h) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.MultipleTextStatusCardDialog", "dismiss: already dismissing, skip");
            return;
        }
        this.f255531h = true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dismiss: ");
        bi4.n0 f17 = f();
        sb6.append(f17 != null ? java.lang.Integer.valueOf(f17.hashCode()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.MultipleTextStatusCardDialog", sb6.toString());
        android.content.Context context = this.f255528e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782.class)).U6();
        android.widget.LinearLayout linearLayout = this.f255354d;
        if (linearLayout != null) {
            h(linearLayout, e(), null);
        }
        super.dismiss();
        ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ni();
        ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Di();
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context : null;
        if (activityC21401x6ce6f73f != null) {
            this.f255533m.x8(activityC21401x6ce6f73f);
        }
    }

    public final bi4.g1 e() {
        bi4.g1 g1Var = this.f255529f.f102585d;
        return g1Var == null ? new bi4.g1(bi4.f1.f102574d, 0L, 2, null) : g1Var;
    }

    public final bi4.n0 f() {
        android.content.Context context = this.f255528e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2274x2e7b10.C18676x82a91782.class)).P6();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    public final void h(android.view.View view, bi4.g1 g1Var, yz5.a aVar) {
        sa5.m mVar;
        int ordinal = g1Var.f102580a.ordinal();
        if (ordinal == 0) {
            mVar = new sa5.m(0, 1, null);
            mVar.i(new sa5.u(sa5.s.f486903a));
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            mVar = new sa5.m(0, 1, null);
            mVar.i(new sa5.u(sa5.r.f486902a));
        }
        long j17 = g1Var.f102581b;
        if (aVar == null) {
            sa5.d.b(view, mVar, j17, null);
        } else {
            sa5.d.b(view, mVar, j17, new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.g2(aVar));
        }
    }

    public final void i() {
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ni();
            ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Di();
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        android.content.Context context = this.f255528e;
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context : null;
        if (activityC21401x6ce6f73f != null) {
            this.f255533m.x8(activityC21401x6ce6f73f);
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.e0, android.app.Dialog
    public void onStart() {
        super.onStart();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.e0, android.app.Dialog
    public void show() {
        sa5.l lVar;
        super.show();
        android.widget.LinearLayout linearLayout = this.f255354d;
        if (linearLayout == null) {
            return;
        }
        bi4.g1 e17 = e();
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h2 h2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.h2(this);
        int ordinal = e17.f102580a.ordinal();
        if (ordinal == 0) {
            lVar = new sa5.l(0.0f, 1, null);
            lVar.i(new sa5.t(0.0f, 0.0f, sa5.s.f486903a, 3, null));
        } else {
            if (ordinal != 1) {
                throw new jz5.j();
            }
            lVar = new sa5.l(0.0f, 1, null);
            lVar.i(new sa5.t(0.0f, 0.0f, sa5.r.f486902a, 3, null));
        }
        sa5.d.a(linearLayout, lVar, e17.f102581b, new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.f2(h2Var));
    }
}
