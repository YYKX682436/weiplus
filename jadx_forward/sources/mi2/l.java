package mi2;

/* loaded from: classes10.dex */
public final class l extends mi2.h {
    public boolean A;
    public final ni2.h0 B;

    /* renamed from: w, reason: collision with root package name */
    public int f408304w;

    /* renamed from: x, reason: collision with root package name */
    public int f408305x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f408306y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f408307z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, zh2.c pluginAbility, yz5.p dismiss) {
        super(context, pluginAbility, dismiss);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dismiss, "dismiss");
        android.view.View view = this.f408290n;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.qrj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.B = new ni2.h0(findViewById, pluginAbility, new mi2.i(this));
        android.view.ViewGroup.LayoutParams layoutParams = this.f199917g.f526370d.getLayoutParams();
        if (layoutParams != null) {
            android.view.View view2 = this.f408290n;
            if (view2 != null) {
                layoutParams.height = (com.p314xaae8f345.mm.ui.bl.b(view2.getContext()).y * 2) / 3;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
                throw null;
            }
        }
    }

    @Override // mi2.h
    public void F() {
        int i17 = (int) ((mm2.o4) this.f408286h.g().a(mm2.o4.class)).U.f458662d;
        this.f408304w = i17;
        this.f408305x = i17;
        super.F();
        this.f408306y = false;
        this.f408307z = false;
        this.A = false;
        G();
    }

    public final void G() {
        android.widget.TextView textView;
        boolean z17 = this.f408306y;
        android.view.View view = this.f199916f;
        if (z17 || this.f408307z || this.A) {
            textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
            if (textView != null) {
                textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560027f));
                textView.setEnabled(true);
                return;
            }
            return;
        }
        textView = view instanceof android.widget.TextView ? (android.widget.TextView) view : null;
        if (textView != null) {
            textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77636xad7ef29));
            textView.setEnabled(false);
        }
    }

    @Override // mi2.h
    public void O() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f408289m, "commitSecondaryDraftOnCancel: discard drafts, no cgi");
        this.f408305x = this.f408304w;
        this.f408307z = false;
        this.A = false;
        G();
    }

    @Override // mi2.h
    public long P() {
        return this.f408305x;
    }

    @Override // mi2.h
    public void Q(int i17) {
        this.f408305x = i17;
        this.f408307z = pm0.v.z(this.f408304w, 16) != pm0.v.z(i17, 16);
        G();
    }

    @Override // mi2.h
    public void R(long j17) {
        this.f408305x = (int) j17;
        long j18 = this.f408304w;
        zl2.r4 r4Var = zl2.r4.f555483a;
        this.A = (r4Var.x2(j18) == r4Var.x2(j17) && r4Var.y2(j18) == r4Var.y2(j17) && r4Var.w2(j18) == r4Var.w2(j17) && r4Var.z2(j18) == r4Var.z2(j17)) ? false : true;
        G();
    }

    @Override // mi2.h
    public void S() {
        M();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View c() {
        return f();
    }

    @Override // mi2.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dko;
    }

    @Override // mi2.h, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        this.B.h();
        super.t();
        android.view.View view = this.f408290n;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 c1095x65355f89 = view instanceof p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89 ? (p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) view : null;
        if (c1095x65355f89 != null) {
            c1095x65355f89.scrollTo(0, 0);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void v() {
        bj2.b bVar;
        this.f408298t = false;
        ni2.h0 h0Var = this.B;
        if (h0Var.i()) {
            a();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onMicSettingSet openMicSettingFlag: ");
            sb6.append(this.f408304w);
            sb6.append(" newMicSettingFlag: ");
            sb6.append(this.f408305x);
            sb6.append(" isMicWayChange: ");
            sb6.append(this.f408307z);
            sb6.append(" isMicConditionChange: ");
            sb6.append(this.A);
            sb6.append(" isMicModeChange: ");
            sb6.append(this.f408306y);
            sb6.append(" focusUserId: ");
            sb6.append(h0Var.f418852u);
            sb6.append(" clickMicMode: ");
            sb6.append(h0Var.f418854w);
            sb6.append(" isOpenFocus: ");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = h0Var.f418849r;
            sb6.append(viewOnClickListenerC22631x1cc07cc8.f292896x);
            sb6.append(" anchorSeatPos: ");
            bj2.b bVar2 = h0Var.B;
            sb6.append(bVar2.f102679e);
            sb6.append(' ');
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f408289m, sb6.toString());
            int i17 = this.f408304w;
            int i18 = this.f408305x;
            zh2.c cVar = this.f408286h;
            if (i17 != i18) {
                this.f408304w = i18;
                ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458662d = this.f408305x;
            }
            if (this.A) {
                pm0.v.X(new mi2.j(this));
            }
            cVar.e(this.f408304w);
            ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458666h = viewOnClickListenerC22631x1cc07cc8.f292896x;
            dk2.xf k17 = cVar.k();
            if (k17 != null) {
                bVar = bVar2;
                ((dk2.r4) k17).q0(((mm2.e1) cVar.g().a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) cVar.g().a(mm2.e1.class)).f410516m, this.f408304w, h0Var.f418852u, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458665g, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458666h, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458667i, ((mm2.o4) cVar.g().a(mm2.o4.class)).U.f458668m, new mi2.k(this));
            } else {
                bVar = bVar2;
            }
            if (this.f408306y) {
                qo0.c f17 = cVar.f();
                qo0.b bVar3 = qo0.b.Q4;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString("PARAM_FINDER_LIVE_FORCE_USER_ID", h0Var.f418852u);
                bundle.putInt("PARAM_FINDER_LIVE_MIC_MODE", h0Var.f418854w);
                bundle.putInt("PARAM_FINDER_LIVE_MIC_ANCHOR_POSITION", bVar.f102679e);
                f17.mo46557x60d69242(bVar3, bundle);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void w() {
        super.w();
        zh2.c cVar = this.f408286h;
        r45.il4 il4Var = ((mm2.o4) cVar.g().a(mm2.o4.class)).U;
        java.lang.Object mo3195x754a37bb = ((mm2.o4) cVar.g().a(mm2.o4.class)).A.mo3195x754a37bb();
        if (il4Var == null || mo3195x754a37bb == null) {
            return;
        }
        xh2.c cVar2 = (xh2.c) mo3195x754a37bb;
        xh2.c a17 = cVar2.a();
        if (il4Var.f458666h) {
            if (cVar2.f536066c == 0) {
                a17.f536066c = 1;
            }
            if (cVar2.f536066c == 2) {
                a17.f536066c = 3;
            }
        }
        this.B.j(il4Var, a17, this.f408305x);
    }

    @Override // mi2.h
    public java.lang.String z() {
        return "NormalMoreActionWidget";
    }
}
