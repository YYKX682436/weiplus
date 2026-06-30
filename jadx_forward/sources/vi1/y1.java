package vi1;

/* loaded from: classes7.dex */
public final class y1 extends vi1.f implements eb1.d {
    public final java.util.ArrayList A;
    public yz5.l B;
    public yz5.a C;
    public yz5.a D;
    public yz5.a E;
    public yz5.a F;
    public yz5.a G;
    public yz5.l H;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f519040y;

    /* renamed from: z, reason: collision with root package name */
    public vi1.l0 f519041z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(android.content.Context context, java.lang.String appId, xi1.g windowAndroid) {
        super(context, windowAndroid);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(windowAndroid, "windowAndroid");
        this.f519040y = appId;
        this.A = new java.util.ArrayList();
        this.B = vi1.p1.f518959d;
        this.C = vi1.s1.f518979d;
        this.D = vi1.r1.f518972d;
        this.E = vi1.t1.f518987d;
        this.F = vi1.q1.f518966d;
        this.G = vi1.u1.f518997d;
        this.H = vi1.v1.f519002d;
        this.f518848v = new vi1.m1(this);
        this.f518840n.setOnClickListener(new vi1.n1(this));
        this.f518844r.setOnClickListener(new vi1.o1(this));
        this.f518842p.setVisibility(0);
    }

    @Override // fl1.b2
    public boolean a() {
        return false;
    }

    @Override // eb1.d
    public si1.i0 b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y component, java.lang.String appId, vi1.j2 j2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 phoneItem, vi1.f0 f0Var) {
        xi1.g mo50261xee5260a9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(phoneItem, "phoneItem");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = component.t3();
        if (t37 == null || (mo50261xee5260a9 = t37.mo48803xee5260a9()) == null) {
            mo50261xee5260a9 = component.mo50261xee5260a9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo50261xee5260a9);
        }
        xi1.g gVar = mo50261xee5260a9;
        int measuredHeight = this.f518834e.getMeasuredHeight();
        int c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1225x5fb57ca.l2.c(getContext()) + com.p314xaae8f345.mm.ui.zk.a(getContext(), 150);
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new vi1.z3(context, measuredHeight < c17 ? c17 : measuredHeight, gVar, appId, j2Var, phoneItem, f0Var);
    }

    @Override // eb1.d
    public void f(boolean z17) {
        int i17 = z17 ? 0 : 8;
        android.widget.ImageView imageView = this.f518840n;
        imageView.setVisibility(i17);
        if (!z17) {
            imageView.setOnClickListener(null);
            return;
        }
        android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(getContext(), com.p314xaae8f345.mm.R.raw.f79553xad1ac4b4, b3.l.m9702x7444d5ad(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77640xad7ef2a));
        this.f518849w = e17;
        imageView.setVisibility(8);
        if (e17 != null) {
            imageView.setImageDrawable(this.f518849w);
            imageView.setVisibility(0);
        }
        imageView.setContentDescription(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571837r9));
        imageView.setOnClickListener(new vi1.x1(this));
    }

    @Override // si1.k0
    public si1.j0 h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1 r1Var) {
        xi1.g mo50261xee5260a9;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar = component instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y ? (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y) component : null;
        if (yVar == null || (t37 = yVar.t3()) == null || (mo50261xee5260a9 = t37.mo48803xee5260a9()) == null) {
            mo50261xee5260a9 = component.mo50261xee5260a9();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo50261xee5260a9);
        }
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        fl1.z1 z1Var = new fl1.z1(r1Var, str, context, this.f518834e.getMeasuredHeight(), mo50261xee5260a9);
        z1Var.k(this.f518850x);
        return z1Var;
    }

    @Override // si1.i0
    public void r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        c(this.f518850x);
        i(component).c(this);
    }

    @Override // eb1.d
    /* renamed from: setDialogApplyWording */
    public void mo2002x2c9d82b4(java.lang.String wording) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        android.widget.TextView textView = this.f518841o;
        textView.setText(wording);
        textView.setVisibility(r26.n0.N(wording) ? 8 : 0);
    }

    @Override // eb1.d
    /* renamed from: setDialogRequestDesc */
    public void mo2003xb6e62716(java.lang.String wording) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        this.f518838i.setText(wording);
    }

    @Override // eb1.d
    /* renamed from: setDialogSubDesc */
    public void mo2004x25fbcd47(java.lang.String desc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        android.widget.TextView textView = this.f518839m;
        textView.setVisibility(0);
        textView.setText(desc);
    }

    @Override // eb1.d
    /* renamed from: setOnAccept */
    public void mo2007xb0af2a49(yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lVar, "<set-?>");
        this.B = lVar;
    }

    @Override // eb1.d
    /* renamed from: setOnAddPhoneNumber */
    public void mo2008x588d8f37(yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<set-?>");
        this.F = aVar;
    }

    @Override // eb1.d
    /* renamed from: setOnCancel */
    public void mo2009xb401a3bb(yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<set-?>");
        this.D = aVar;
    }

    @Override // eb1.d
    /* renamed from: setOnDeny */
    public void mo2010x1be4cf8d(yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<set-?>");
        this.C = aVar;
    }

    @Override // eb1.d
    /* renamed from: setOnExplain */
    public void mo2011x5d5ef7d6(yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<set-?>");
        this.E = aVar;
    }

    @Override // eb1.d
    /* renamed from: setOnManagePhoneNumber */
    public void mo2012x52ce4bd1(yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<set-?>");
        this.G = aVar;
    }

    @Override // eb1.d
    /* renamed from: setOnPhoneItemSelect */
    public void mo2013x505f4ddc(yz5.l lVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lVar, "<set-?>");
        this.H = lVar;
    }

    @Override // eb1.d
    /* renamed from: setPhoneItems */
    public void mo2014xae77f4f4(java.util.ArrayList value) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        java.util.ArrayList arrayList = this.A;
        arrayList.clear();
        arrayList.addAll(value);
        ik1.h0.b(new vi1.w1(this));
    }
}
