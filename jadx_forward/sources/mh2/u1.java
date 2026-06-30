package mh2;

/* loaded from: classes10.dex */
public final class u1 extends mh2.a {

    /* renamed from: c, reason: collision with root package name */
    public final mh2.y f408001c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f408002d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f408003e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f408004f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f408005g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f408006h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 f408007i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.Boolean f408008j;

    /* renamed from: k, reason: collision with root package name */
    public om2.d0 f408009k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f408010l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(android.content.Context context, mh2.y service, boolean z17) {
        super(context, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f408001c = service;
        this.f408002d = z17;
        this.f408003e = "KtvOutPreviewWidget_" + hashCode();
        this.f408004f = (android.widget.ImageView) this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.qrn);
        this.f408005g = (android.widget.TextView) this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.s7a);
        this.f408006h = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.nh8);
        this.f408007i = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502) this.f407825b.findViewById(com.p314xaae8f345.mm.R.id.qxy);
    }

    @Override // mh2.a
    public int a() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dri;
    }

    @Override // mh2.a
    public void c(om2.d0 singState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(singState, "singState");
        this.f408009k = singState;
        mh2.y yVar = this.f408001c;
        this.f408007i.b(yVar.a());
        yVar.b(new mh2.s1(this));
        if (this.f408002d) {
            zl2.r4 r4Var = zl2.r4.f555483a;
            android.view.View view = this.f407825b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "<get-view>(...)");
            r4Var.k(view, yVar.c());
        }
        boolean z17 = singState instanceof om2.v;
        android.content.Context context = this.f407824a;
        android.widget.TextView textView = this.f408005g;
        if (z17) {
            h(false);
            textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mjj));
            i(null);
            return;
        }
        if (singState instanceof om2.x) {
            h(true);
            textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mjl));
            om2.o oVar = ((om2.x) singState).f427921a;
            g(oVar.f427894b);
            i(oVar.f427893a);
            return;
        }
        if (singState instanceof om2.e0) {
            h(true);
            textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mjl));
            om2.o oVar2 = ((om2.e0) singState).f427832a;
            g(oVar2.f427894b);
            i(oVar2.f427893a);
            return;
        }
        if (singState instanceof om2.c0) {
            h(true);
            textView.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mjk));
            om2.o oVar3 = ((om2.c0) singState).f427813a;
            g(oVar3.f427894b);
            i(oVar3.f427893a);
        }
    }

    public final void f(boolean z17) {
        if (this.f408009k instanceof om2.v) {
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408008j, java.lang.Boolean.valueOf(z17)) && this.f408007i.c() == z17) {
            return;
        }
        pm0.v.X(new mh2.t1(this, z17));
    }

    public final void g(r45.xn1 xn1Var) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa;
        if (xn1Var == null || (c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var.m75936x14adae67(0)) == null) {
            return;
        }
        android.widget.ImageView avatar = this.f408004f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(avatar, "avatar");
        b(avatar, c19782x23db1cfa);
        boolean S3 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.S3(c19782x23db1cfa.m76197x6c03c64c());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1513xc350790d.p1514x3792f9.C14246xaa893502 c14246xaa893502 = this.f408007i;
        if (S3) {
            if (c14246xaa893502 != null) {
                c14246xaa893502.m56875xb4464262(jj2.e.f381512d);
            }
        } else if (c14246xaa893502 != null) {
            c14246xaa893502.m56875xb4464262(jj2.e.f381513e);
        }
    }

    public final void h(boolean z17) {
        android.widget.ImageView imageView = this.f408004f;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f408006h;
        if (z17) {
            imageView.setVisibility(0);
            c22699x3dcdb352.setVisibility(8);
        } else {
            c22699x3dcdb352.setVisibility(0);
            imageView.setVisibility(8);
            this.f408007i.setVisibility(8);
        }
    }

    public final void i(java.lang.String str) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f408010l, str)) {
            return;
        }
        this.f408010l = str;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f408003e, "currSingerUserId: " + str);
    }
}
