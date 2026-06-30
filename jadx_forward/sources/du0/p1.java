package du0;

/* loaded from: classes5.dex */
public abstract class p1 extends du0.g {

    /* renamed from: i, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f324942i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f324943m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f324944n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f324945o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f324946p;

    /* renamed from: q, reason: collision with root package name */
    public ev0.c f324947q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f324948r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f324949s;

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f324950t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f324948r = jz5.h.b(new du0.n1(this));
        this.f324949s = jz5.h.b(new du0.c1(this));
    }

    public void C6() {
    }

    public final void U6(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a followAudioInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(followAudioInfo, "followAudioInfo");
        Z6();
        V6(followAudioInfo);
        ev0.c cVar = this.f324947q;
        if (cVar != null) {
            cVar.g().mo68195x60eb836b(kz5.b0.c(followAudioInfo));
        }
        ev0.c cVar2 = this.f324947q;
        if (cVar2 != null) {
            cVar2.g().mo68301x28690f2a(followAudioInfo);
        }
    }

    public void V6(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        q7(c16997xb0aa383a);
    }

    public void W6(float f17) {
    }

    public void X6(float f17) {
    }

    public boolean Y6(boolean z17) {
        return true;
    }

    public final ev0.c Z6() {
        ev0.c cVar = this.f324947q;
        if (cVar == null) {
            cVar = new ev0.c(c7().l2().f150881m, m80379x76847179(), new du0.d1(this));
            cVar.p(c7().N5(), b7());
            cVar.f303894k = new du0.e1(this);
            cVar.f303895l = new du0.f1(this);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(i95.n0.c(m40.k0.class), "getService(...)");
            cVar.f303896m = new du0.g1(!((c61.p7) ((m40.k0) r1)).hj(m40.j0.f404946i), null);
            cVar.b(new du0.h1(this), new du0.i1(cVar, this), new du0.j1(cVar, this), 200);
        }
        this.f324947q = cVar;
        return cVar;
    }

    public float a7() {
        return 0.5f;
    }

    public com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a b7() {
        return null;
    }

    public final yt0.c c7() {
        return (yt0.c) ((jz5.n) this.f324948r).mo141623x754a37bb();
    }

    public ex0.o d7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        return null;
    }

    public float e7() {
        return 0.5f;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f7() {
        return this.f324950t;
    }

    public int g7() {
        ev0.c cVar = this.f324947q;
        if (cVar != null) {
            return cVar.f();
        }
        return 0;
    }

    public boolean h7() {
        return false;
    }

    public boolean i7() {
        return false;
    }

    public final void k7(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        ex0.o d76 = d7(segmentID);
        if (d76 != null) {
            d76.f338688r = (du0.s1) ou0.d.a(m158354x19263085(), du0.s1.class);
            p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new du0.m1(d76, this, null), 3, null);
        }
    }

    public rv0.n1 l7() {
        return null;
    }

    public abstract yt0.c m7();

    public final void n7(boolean z17) {
        if (z17) {
            android.view.View view = this.f324946p;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("removeMusicBtn");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/common/uic/MusicTipUIC", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/common/uic/MusicTipUIC", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f324946p;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("removeMusicBtn");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/common/uic/MusicTipUIC", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/common/uic/MusicTipUIC", "onHaveMusicChanged", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void o7() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMediaItemsChanged: isShowing=");
        ev0.c cVar = this.f324947q;
        sb6.append(cVar != null ? java.lang.Boolean.valueOf(cVar.f303887d) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MusicTipUIC", sb6.toString());
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f324942i;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        this.f324942i = p3325xe03a0797.p3326xc267989b.l.d(m158345xefc66565(), null, null, new du0.o1(this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[RETURN] */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onBackPressed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo2274xbdc3c5dc() {
        /*
            r4 = this;
            ev0.c r0 = r4.f324947q
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1d
            boolean r3 = r0.f303887d
            if (r3 != 0) goto Lb
            goto Lf
        Lb:
            boolean r3 = r0.f303887d
            if (r3 != 0) goto L11
        Lf:
            r0 = r2
            goto L19
        L11:
            cu0.y r0 = r0.g()
            r0.mo68201x76500a7f(r2)
            r0 = r1
        L19:
            if (r0 != r1) goto L1d
            r0 = r1
            goto L1e
        L1d:
            r0 = r2
        L1e:
            if (r0 == 0) goto L21
            return r1
        L21:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: du0.p1.mo2274xbdc3c5dc():boolean");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        android.view.ViewGroup viewGroup = this.f324943m;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicTipContainer");
            throw null;
        }
        viewGroup.setOnClickListener(new du0.k1(this));
        android.view.View view = this.f324946p;
        if (view != null) {
            view.setOnClickListener(new du0.l1(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("removeMusicBtn");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f324942i;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        ev0.c cVar = this.f324947q;
        if (cVar != null) {
            cVar.e();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        ev0.c cVar = this.f324947q;
        if (cVar == null || !cVar.f303887d) {
            return;
        }
        ev0.t.c(cVar.f303886c, false, null, 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        ev0.c cVar = this.f324947q;
        if (cVar == null || !cVar.f303887d) {
            return;
        }
        cVar.f303886c.d();
    }

    @Override // du0.g, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        android.view.View mo144222x4ff8c0f0 = mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.ufk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo144222x4ff8c0f0, "findViewById(...)");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) mo144222x4ff8c0f0;
        this.f324943m = viewGroup;
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.viv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f324944n = (android.widget.TextView) findViewById;
        android.view.ViewGroup viewGroup2 = this.f324943m;
        if (viewGroup2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicTipContainer");
            throw null;
        }
        android.view.View findViewById2 = viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.u7d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f324945o = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) findViewById2;
        android.view.ViewGroup viewGroup3 = this.f324943m;
        if (viewGroup3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicTipContainer");
            throw null;
        }
        android.view.View findViewById3 = viewGroup3.findViewById(com.p314xaae8f345.mm.R.id.f565035hw1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f324946p = findViewById3;
    }

    public void p7(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, boolean z17, boolean z18) {
    }

    public void q7(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        this.f324950t = c16997xb0aa383a;
        java.lang.String str = c16997xb0aa383a != null ? c16997xb0aa383a.f237256t : null;
        if (str == null) {
            s7();
            return;
        }
        android.widget.TextView textView = this.f324944n;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicNameTv");
            throw null;
        }
        textView.setText(str);
        android.widget.TextView textView2 = this.f324944n;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicNameTv");
            throw null;
        }
        textView2.requestFocus();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f324945o;
        if (c22699x3dcdb352 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicIconIv");
            throw null;
        }
        c22699x3dcdb352.m82040x7541828(b3.l.m9702x7444d5ad(m80379x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77734x48893d19));
        n7(true);
    }

    public void r7(zw0.b entrance) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(entrance, "entrance");
        Z6();
        ev0.c cVar = this.f324947q;
        if (cVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a f76 = f7();
            boolean z17 = !(this instanceof nu0.d4);
            boolean i76 = i7();
            boolean h76 = h7();
            int g76 = g7();
            if (!cVar.f303887d) {
                cVar.f303889f = i76;
                cVar.f303888e = f76;
                cVar.f303890g = g76;
                cVar.g().e().p(z17, i76);
                com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0 e0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0) cVar.g().e().b(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0.class);
                if (e0Var != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e0.B(e0Var, h76, false, false, 2, null);
                    if (h76 && !e0Var.s(1)) {
                        e0Var.y();
                    }
                }
                cVar.g().mo68201x76500a7f(true);
            }
        }
        ((du0.b1) T6(du0.b1.class)).O6();
    }

    public final void s7() {
        android.view.ViewGroup viewGroup = this.f324943m;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicTipContainer");
            throw null;
        }
        java.lang.String r17 = i65.a.r(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.lng);
        android.widget.TextView textView = this.f324944n;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicNameTv");
            throw null;
        }
        textView.setText(r17);
        android.widget.TextView textView2 = this.f324944n;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicNameTv");
            throw null;
        }
        textView2.requestFocus();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f324945o;
        if (c22699x3dcdb352 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("musicIconIv");
            throw null;
        }
        c22699x3dcdb352.m82040x7541828(b3.l.m9702x7444d5ad(m80379x76847179(), com.p314xaae8f345.mm.R.C30859x5a72f63.ac8));
        n7(false);
    }
}
