package bg2;

/* loaded from: classes2.dex */
public final class j0 extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f101713e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14312x717356dc f101714f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f101715g;

    /* renamed from: h, reason: collision with root package name */
    public bm2.o1 f101716h;

    /* renamed from: i, reason: collision with root package name */
    public long f101717i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f101718m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f101719n;

    /* renamed from: o, reason: collision with root package name */
    public int f101720o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f101719n = true;
    }

    public static final void Y6(bg2.j0 j0Var) {
        android.view.View view;
        uc2.i iVar;
        j0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        in5.s0 s0Var = j0Var.f498674d.f498682i;
        if (s0Var == null || (view = s0Var.f3639x46306858) == null || (iVar = (uc2.i) j0Var.O6(uc2.i.class)) == null) {
            return;
        }
        ((sb2.o) iVar).Y6(view, intent);
    }

    @Override // tc2.c
    public void P6() {
        in5.s0 s0Var = this.f498674d.f498682i;
        android.view.ViewGroup viewGroup = s0Var != null ? (android.view.ViewGroup) s0Var.p(com.p314xaae8f345.mm.R.id.djv) : null;
        this.f101713e = viewGroup;
        this.f101714f = viewGroup != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14312x717356dc) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.dju) : null;
        android.view.ViewGroup viewGroup2 = this.f101713e;
        this.f101715g = viewGroup2 != null ? (android.view.ViewGroup) viewGroup2.findViewById(com.p314xaae8f345.mm.R.id.djx) : null;
    }

    @Override // tc2.c
    public void Q6() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.kr0 m59293x6b032749;
        r45.qg6 qg6Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject2;
        r45.kr0 m59293x6b0327492;
        r45.qg6 qg6Var2;
        android.content.Context context;
        this.f101719n = true;
        bg2.d2 d2Var = (bg2.d2) N6(bg2.d2.class);
        int i17 = 0;
        boolean z17 = d2Var != null ? d2Var.f101546i : false;
        this.f101718m = z17;
        if (!z17) {
            android.view.ViewGroup viewGroup = this.f101713e;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(8);
            return;
        }
        android.view.ViewGroup viewGroup2 = this.f101713e;
        if (viewGroup2 != null) {
            viewGroup2.setVisibility(0);
        }
        bg2.u uVar = (bg2.u) N6(bg2.u.class);
        bm2.o1 o1Var = new bm2.o1(uVar != null ? uVar.f102074o : null);
        o1Var.f103714n = new bg2.e0(this);
        this.f101716h = o1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14312x717356dc c14312x717356dc = this.f101714f;
        tc2.g gVar = this.f498674d;
        if (c14312x717356dc != null) {
            c14312x717356dc.mo7960x6cab2c8d(o1Var);
            in5.s0 s0Var = gVar.f498682i;
            c14312x717356dc.mo7967x900dcbe1((s0Var == null || (context = s0Var.f374654e) == null) ? null : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1547x31c90fad.C14423xb0a0cdaf(context));
            c14312x717356dc.m82895x25bfb969(i65.a.b(c14312x717356dc.getContext(), 112));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14312x717356dc c14312x717356dc2 = this.f101714f;
        if (c14312x717356dc2 != null) {
            ym5.a1.h(c14312x717356dc2, new bg2.f0(this));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar.f498681h;
        int m75939xb282bd08 = ((abstractC14490x69736cb5 == null || (feedObject2 = abstractC14490x69736cb5.getFeedObject()) == null || (m59293x6b0327492 = feedObject2.m59293x6b032749()) == null || (qg6Var2 = (r45.qg6) m59293x6b0327492.m75936x14adae67(3)) == null) ? 0 : qg6Var2.m75939xb282bd08(2)) * 1000;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveConvertCommentUIController", "delayShowMs:" + m75939xb282bd08);
        if (m75939xb282bd08 > 0) {
            android.view.ViewGroup viewGroup3 = this.f101713e;
            if (viewGroup3 != null) {
                viewGroup3.setAlpha(0.0f);
            }
            bg2.u uVar2 = (bg2.u) N6(bg2.u.class);
            if (uVar2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(uVar2.f102067e, "setBarrier true");
                uVar2.f102073n = true;
            }
            p3325xe03a0797.p3326xc267989b.y0 y0Var = gVar.f498680g;
            if (y0Var != null) {
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bg2.g0(m75939xb282bd08, this, null), 3, null);
                return;
            }
            return;
        }
        android.view.ViewGroup viewGroup4 = this.f101713e;
        if (viewGroup4 != null) {
            viewGroup4.setAlpha(1.0f);
        }
        if (this.f101719n) {
            this.f101719n = false;
            bg2.y0 y0Var2 = (bg2.y0) N6(bg2.y0.class);
            if (y0Var2 != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = gVar.f498681h;
                if (abstractC14490x69736cb52 != null && (feedObject = abstractC14490x69736cb52.getFeedObject()) != null && (m59293x6b032749 = feedObject.m59293x6b032749()) != null && (qg6Var = (r45.qg6) m59293x6b032749.m75936x14adae67(3)) != null) {
                    i17 = qg6Var.m75939xb282bd08(2);
                }
                y0Var2.Y6(3L, i17 * 1000, "{comment_msg_cnt:" + this.f101720o + '}');
            }
        }
    }

    @Override // tc2.c
    public void U6() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewGroup viewGroup = this.f101715g;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        this.f101718m = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14312x717356dc c14312x717356dc = this.f101714f;
        if (c14312x717356dc == null || (animate = c14312x717356dc.animate()) == null) {
            return;
        }
        animate.cancel();
    }

    public final void Z6() {
        android.content.Context context;
        android.content.res.Resources resources;
        java.lang.String string;
        bg2.u uVar;
        boolean z17 = this.f101718m;
        if (z17) {
            java.lang.String str = null;
            if (z17 && (uVar = (bg2.u) N6(bg2.u.class)) != null) {
                int i17 = uVar.f102069g;
                bm2.o1 o1Var = this.f101716h;
                java.util.ArrayList arrayList = o1Var != null ? o1Var.f103713m : null;
                java.util.List list = uVar.f102070h;
                this.f101720o = list.size();
                if ((arrayList != null ? arrayList.size() : 0) < i17) {
                    int min = java.lang.Math.min(list.size(), i17);
                    int size = arrayList != null ? arrayList.size() : 0;
                    if (arrayList != null) {
                        arrayList.clear();
                    }
                    java.util.List K0 = kz5.n0.K0(list, min);
                    if (arrayList != null) {
                        arrayList.addAll(K0);
                    }
                    bm2.o1 o1Var2 = this.f101716h;
                    if (o1Var2 != null) {
                        o1Var2.m8153xd399a4d9(size, java.lang.Math.max(min - size, 0));
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.C14312x717356dc c14312x717356dc = this.f101714f;
                    if (c14312x717356dc != null) {
                        c14312x717356dc.post(new bg2.h0(this));
                    }
                }
            }
            if (this.f101718m) {
                bg2.u uVar2 = (bg2.u) N6(bg2.u.class);
                java.util.List list2 = uVar2 != null ? uVar2.f102070h : null;
                int size2 = (list2 != null ? list2.size() : 0) - (uVar2 != null ? uVar2.f102069g : 5);
                if (size2 <= 0) {
                    return;
                }
                android.view.ViewGroup viewGroup = this.f101715g;
                android.widget.TextView textView = viewGroup != null ? (android.widget.TextView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.djw) : null;
                if (textView != null) {
                    com.p314xaae8f345.mm.ui.fk.a(textView);
                }
                java.lang.String valueOf = size2 <= 99 ? java.lang.String.valueOf(size2) : "99+";
                if (textView != null) {
                    in5.s0 s0Var = this.f498674d.f498682i;
                    if (s0Var != null && (context = s0Var.f374654e) != null && (resources = context.getResources()) != null && (string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.dzs)) != null) {
                        str = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{valueOf}, 1));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "format(...)");
                    }
                    textView.setText(str);
                }
                android.view.ViewGroup viewGroup2 = this.f101715g;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                android.view.ViewGroup viewGroup3 = this.f101715g;
                if (viewGroup3 != null) {
                    viewGroup3.setOnClickListener(new bg2.i0(this));
                }
            }
        }
    }

    @Override // tc2.h
    /* renamed from: onLiveMsg */
    public void mo10406x5aa1c816(r45.r71 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        Z6();
    }

    @Override // tc2.h
    /* renamed from: onLiveStart */
    public void mo10403x39a513b7(r45.hc1 hc1Var) {
        Z6();
    }
}
