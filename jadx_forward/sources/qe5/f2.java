package qe5;

/* loaded from: classes12.dex */
public final class f2 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f443637d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.o2 f443638e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f443639f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f443640g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f443641h;

    /* renamed from: i, reason: collision with root package name */
    public final qe5.d2 f443642i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f443637d = jz5.h.b(new qe5.e2(this));
        this.f443639f = true;
        this.f443640g = ((jb0.g) ((jt.x) i95.n0.c(jt.x.class))).Ai(3);
        this.f443642i = new qe5.d2(this);
    }

    public final kd5.e T6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            return (kd5.e) Q6.mo140437x75286adb();
        }
        return null;
    }

    public final em.d0 U6() {
        return (em.d0) ((jz5.n) this.f443637d).mo141623x754a37bb();
    }

    public final void V6() {
        j75.f Q6;
        kd5.e T6 = T6();
        if (T6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.OpenFileWayUIC", "initOpenWayRecyclerView: downloadState is null");
            return;
        }
        java.lang.String str = T6.F;
        if (str.length() == 0) {
            str = null;
        }
        if (str == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.OpenFileWayUIC", "initOpenWayRecyclerView: filePath is null");
            return;
        }
        W6(true);
        if (this.f443638e == null) {
            java.lang.String str2 = T6.f388426x;
            ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
            java.lang.String e17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.e(str2);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getMimeTypeByExt(...)");
            jt.v vVar = (jt.v) i95.n0.c(jt.v.class);
            android.app.Activity m80379x76847179 = m80379x76847179();
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2 g2Var = new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.g2(e17, str);
            g2Var.f270845e = T6.f388412g;
            g2Var.f270846f = T6.f388413h;
            g2Var.f270843c = T6.f388425w;
            g2Var.f270844d = T6.f388426x;
            g2Var.f270848h = 3;
            ((ht.a) vVar).getClass();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.u0 u0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.u0(m80379x76847179, g2Var, this.f443642i);
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 i17 = U6().i();
            if (u0Var.f272530p == null) {
                com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.r0 r0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.r0(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.C19700x845b0472(), u0Var.g());
                u0Var.f272530p = r0Var;
                r0Var.B = u0Var.f272532r;
            }
            i17.mo7960x6cab2c8d(u0Var.f272530p);
            u0Var.f272531q = new qe5.b2(this);
            this.f443638e = u0Var;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 i18 = U6().i();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i18, "getDownloadOtherAppList(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(U6().g(), "getDownloadOpenBtn(...)");
        android.widget.TextView m17 = U6().m();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m17, "getFileOpenTipTv(...)");
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.o2 o2Var = this.f443638e;
        if (o2Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.File.OpenFileWayUIC", "initOpenWayAdapterBuilder: openWayAdapterBuilder is null");
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.u0 u0Var2 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.u0) o2Var;
        u0Var2.m();
        java.util.ArrayList arrayList = u0Var2.f272538f;
        this.f443639f = arrayList == null || arrayList.isEmpty();
        kd5.e T62 = T6();
        if (T62 != null && T62.G) {
            if (this.f443639f) {
                X6(0);
                m17.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ne9);
            } else {
                U6().g().setVisibility(0);
                i18.setVisibility(0);
                i18.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(m80379x76847179(), 0, false));
                m17.setText(com.p314xaae8f345.mm.R.C30867xcad56011.brw);
                if (i18.m7950x883dc776() == 0) {
                    i18.N(new qe5.a2(this));
                }
            }
        }
        kd5.e T63 = T6();
        if (T63 == null || !T63.G || (Q6 = Q6()) == null) {
            return;
        }
        Q6.B3(new kd5.v(false));
    }

    public final void W6(boolean z17) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            kd5.n nVar = new kd5.n(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291259n);
            nVar.f388437c = z17;
            Q6.B3(nVar);
        }
    }

    public final void X6(int i17) {
        boolean z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.OpenFileWayUIC", "open by other way visible: " + i17);
        U6().m().setVisibility(i17);
        boolean z18 = this.f443639f;
        if (z18 || !this.f443640g) {
            if (i17 == 0 && z18) {
                android.view.ViewGroup.LayoutParams layoutParams = U6().g().getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, i65.a.f(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561267dr));
            }
            U6().g().setVisibility(i17);
            U6().i().setVisibility(8);
        } else {
            U6().i().setVisibility(i17);
            U6().g().setVisibility(8);
        }
        kd5.e T6 = T6();
        boolean z19 = false;
        boolean z27 = T6 != null ? T6.L : false;
        if (i17 != 0 || !z27) {
            kd5.e T62 = T6();
            if (T62 != null && T62.M) {
                z19 = true;
            }
            if (z19) {
                U6().o().setVisibility(8);
                U6().p().setVisibility(8);
                U6().m().setVisibility(8);
                return;
            }
            return;
        }
        sc5.g gVar = sc5.g.f488105a;
        kd5.e T63 = T6();
        java.lang.String str = T63 != null ? T63.f388426x : null;
        kd5.e T64 = T6();
        java.lang.String str2 = T64 != null ? T64.C : null;
        if (gVar.c(str)) {
            z17 = (str2 == null || str2.length() == 0) ^ true ? sc5.g.f488107c : sc5.g.f488106b;
        } else {
            z17 = false;
        }
        if (z17) {
            U6().g().setVisibility(8);
            U6().i().setVisibility(8);
            U6().m().setVisibility(8);
            U6().o().setVisibility(0);
            android.widget.Button o17 = U6().o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getOpenOriginFileBtn(...)");
            com.p314xaae8f345.mm.ui.kk.d(o17, com.p314xaae8f345.mm.ui.zk.e(m80379x76847179(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu));
            U6().p().setVisibility(0);
            if (this.f443641h) {
                return;
            }
            kd5.e T65 = T6();
            if (T65 != null && !T65.L) {
                z19 = true;
            }
            if (z19) {
                j75.f Q6 = Q6();
                if (Q6 != null) {
                    kd5.n nVar = new kd5.n(com.p314xaae8f345.mm.ui.p2731xc84c5534.p.f291257i);
                    nVar.f388437c = true;
                    Q6.B3(nVar);
                }
                this.f443641h = true;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new qe5.c2(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (this.f443640g) {
            kd5.e T6 = T6();
            if (T6 != null && T6.G) {
                kd5.e T62 = T6();
                if ((T62 == null || T62.L) ? false : true) {
                    V6();
                }
            }
        }
    }
}
