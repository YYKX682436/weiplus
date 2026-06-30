package yr3;

/* loaded from: classes11.dex */
public final class q0 implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yr3.s0 f546521a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.u5 f546522b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f546523c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 f546524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 f546525e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f546526f;

    public q0(yr3.s0 s0Var, r45.u5 u5Var, android.widget.TextView textView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 c15315xe70278e1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 c15315xe70278e12, android.widget.TextView textView2) {
        this.f546521a = s0Var;
        this.f546522b = u5Var;
        this.f546523c = textView;
        this.f546524d = c15315xe70278e1;
        this.f546525e = c15315xe70278e12;
        this.f546526f = textView2;
    }

    @Override // s40.t0
    /* renamed from: onLiveStatusCallback */
    public void mo44975x964762a2(long j17, int i17, java.lang.Object obj) {
        yr3.s0 s0Var = this.f546521a;
        if (j17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s0Var.f546549g, "query fail, liveId = 0");
        }
        r45.u5 u5Var = this.f546522b;
        if (!u5Var.f468564f.equals(this.f546523c.getTag(com.p314xaae8f345.mm.R.id.bph))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s0Var.f546549g, "recycled");
            return;
        }
        if (obj != null && (obj instanceof r45.l71)) {
            r45.l71 l71Var = (r45.l71) obj;
            if (((r45.nw1) l71Var.m75936x14adae67(1)) != null) {
                eq1.h hVar = eq1.h.f337345a;
                r45.nw1 nw1Var = (r45.nw1) l71Var.m75936x14adae67(1);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 liveOnIcon = this.f546524d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liveOnIcon, "$liveOnIcon");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15315xe70278e1 liveEndIcon = this.f546525e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(liveEndIcon, "$liveEndIcon");
                hVar.j(nw1Var, liveOnIcon, liveEndIcon);
                ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).A(u5Var.f468564f, (r45.nw1) l71Var.m75936x14adae67(1));
            }
        }
        java.lang.String str = "";
        if (obj != null && (obj instanceof r45.l71)) {
            r45.l71 l71Var2 = (r45.l71) obj;
            if (!x51.t1.b(l71Var2.m75945x2fec8307(4))) {
                str = l71Var2.m75945x2fec8307(4);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            }
        }
        boolean b17 = x51.t1.b(str);
        android.widget.TextView textView = this.f546526f;
        if (b17) {
            textView.setVisibility(8);
        } else {
            textView.setText(str);
            textView.setVisibility(0);
        }
    }
}
