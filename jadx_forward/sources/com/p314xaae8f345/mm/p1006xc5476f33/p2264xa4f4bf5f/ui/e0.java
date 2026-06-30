package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public abstract class e0 extends android.app.Dialog {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f255354d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f575806il);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 w1Var;
        java.lang.Object m143895xf1229813;
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2 j2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.j2) this;
        android.view.Window window = j2Var.getWindow();
        if (window != null) {
            window.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f576150rr);
        }
        android.view.View inflate = android.view.LayoutInflater.from(j2Var.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569828pd, (android.view.ViewGroup) null, false);
        j2Var.setContentView(inflate);
        if (inflate instanceof android.widget.RelativeLayout) {
            ((android.widget.RelativeLayout) inflate).addView(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.c0(j2Var, j2Var.getContext()));
        }
        j2Var.f255354d = (android.widget.LinearLayout) j2Var.findViewById(com.p314xaae8f345.mm.R.id.hw_);
        j2Var.findViewById(com.p314xaae8f345.mm.R.id.cz9).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.d0(j2Var));
        ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Vi();
        ((qj4.v) ((bi4.z0) i95.n0.c(bi4.z0.class))).Ri();
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        o04.e eVar2 = new o04.e(pj4.p0.class, 9, true);
        android.content.Context context = j2Var.f255528e;
        ((md0.e) eVar).Zi(context, eVar2);
        pj4.p0 p0Var = (pj4.p0) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(context, 9, pj4.p0.class);
        if (p0Var != null) {
            ((s50.g0) ((u50.v) i95.n0.c(u50.v.class))).getClass();
            p0Var.f436769d = o13.n.l(1);
        }
        bi4.h1 h1Var = j2Var.f255529f;
        h1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.MultipleTextStatusCardDialog", "initUI: " + context + ", forbidShowSetStatusButton=false, allowShowHeaderAvatar=false");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.d2 d2Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.d2(j2Var);
        bi4.k1 a17 = bi4.k1.a();
        a17.f102600g = h1Var.f102583b;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1 w1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.w1(j2Var.f255528e, null, d2Var, "SCENE_MULTIPLE_DIALOG", null, false, a17, 50, null);
        android.widget.LinearLayout linearLayout = j2Var.f255354d;
        if (linearLayout != null) {
            linearLayout.addView(w1Var2, -1, -2);
        }
        int a18 = i65.a.a(context, 12.0f);
        android.view.View m71904x23098797 = w1Var2.m71904x23098797();
        float f17 = a18;
        if (m71904x23098797 != null) {
            m71904x23098797.setOutlineProvider(new bk4.e2(true, true, f17));
        }
        if (m71904x23098797 != null) {
            m71904x23098797.setClipToOutline(true);
        }
        bi4.i1 i1Var = h1Var.f102586e;
        if (i1Var != null) {
            android.view.View m71904x230987972 = w1Var2.m71904x23098797();
            if (m71904x230987972.getForeground() != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TextStatus.MultipleTextStatusCardDialog", "applyCardStroke: view.foreground already in use, skip stroke to avoid override");
            } else {
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    bi4.n0 f18 = j2Var.f();
                    m71904x230987972.setForeground(new wj4.d(f18 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q3) f18).f255729m : null, i1Var, f17));
                    m71904x230987972.invalidate();
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
                if (m143898xd4a2fc34 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TextStatus.MultipleTextStatusCardDialog", m143898xd4a2fc34, "applyCardStroke: set foreground failed, downgrade to no-stroke", new java.lang.Object[0]);
                }
            }
        }
        si4.a G = ai4.m0.f86706a.G();
        java.lang.String str = h1Var.f102582a;
        java.util.List q17 = G.q(str);
        w1Var2.j(q17);
        android.widget.LinearLayout linearLayout2 = j2Var.f255354d;
        if (linearLayout2 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = linearLayout2.getLayoutParams();
            android.widget.RelativeLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.RelativeLayout.LayoutParams ? (android.widget.RelativeLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.topMargin += com.p314xaae8f345.mm.ui.bl.a(j2Var.getContext()) + (com.p314xaae8f345.mm.ui.dl.g() ? 0 : com.p314xaae8f345.mm.ui.v9.b(j2Var.getContext()));
            }
            linearLayout2.setBackground(null);
            w1Var = w1Var2;
            linearLayout2.post(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.c2(w1Var2, j2Var, q17, linearLayout2, linearLayout2));
        } else {
            w1Var = w1Var2;
        }
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context : null;
        if (activityC21401x6ce6f73f != null) {
            j2Var.f255533m.J0(activityC21401x6ce6f73f);
        }
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((uj4.m) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(uj4.m.class)).P6((android.view.ViewGroup) w1Var.findViewById(com.p314xaae8f345.mm.R.id.hwd), str);
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(67108864);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.5f);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    public void show() {
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(Integer.MIN_VALUE);
        }
        super.show();
    }
}
