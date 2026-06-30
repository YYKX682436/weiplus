package su3;

/* loaded from: classes5.dex */
public final class m extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f494328f;

    /* renamed from: o, reason: collision with root package name */
    public yz5.p f494334o;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f494326d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public int f494327e = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f494329g = com.p314xaae8f345.mm.R.C30861xcebc809e.f562463fn;

    /* renamed from: h, reason: collision with root package name */
    public int f494330h = com.p314xaae8f345.mm.R.raw.f79143xf9d4e329;

    /* renamed from: i, reason: collision with root package name */
    public int f494331i = com.p314xaae8f345.mm.R.C30859x5a72f63.f561060a75;

    /* renamed from: m, reason: collision with root package name */
    public int f494332m = com.p314xaae8f345.mm.R.C30859x5a72f63.a7b;

    /* renamed from: n, reason: collision with root package name */
    public int f494333n = com.p314xaae8f345.mm.R.C30859x5a72f63.a77;

    public final void B(java.util.List audios) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(audios, "audios");
        java.util.ArrayList arrayList = this.f494326d;
        arrayList.clear();
        arrayList.addAll(audios);
        this.f494327e = -1;
        m8146xced61ae5();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f494326d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a x17 = x(i17);
        if (x17 != null) {
            return x17.f237251o;
        }
        return 1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        int i18;
        su3.f holder = (su3.f) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a x17 = x(holder.m8187x9323db3a());
        wt3.c1 c1Var = wt3.c1.f530920b;
        c1Var.f(x17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a x18 = x(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x18);
        if (!x18.f237249m && ((i18 = x18.f237251o) == 1 || i18 == 3)) {
            android.content.Context context = holder.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            c1Var.b(context, x18, new su3.l(x18));
        }
        holder.i(i17, x18);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 2) {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cwt, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new su3.i(this, inflate);
        }
        if (i17 == 3) {
            android.view.View inflate2 = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cwv, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
            return new su3.k(this, inflate2);
        }
        if (i17 == 4) {
            android.view.View inflate3 = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cws, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate3, "inflate(...)");
            return new su3.g(this, inflate3);
        }
        if (i17 == 5) {
            android.view.View inflate4 = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cwu, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate4, "inflate(...)");
            return new su3.j(this, inflate4);
        }
        android.view.View inflate5 = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cwr, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate5, "inflate(...)");
        return new su3.h(this, inflate5);
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a x(int i17) {
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a) kz5.n0.a0(this.f494326d, i17);
    }

    public final void y(java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.Integer num4, java.lang.Integer num5) {
        if (num != null && num.intValue() != 0) {
            this.f494329g = num.intValue();
        }
        if (num2 != null && num2.intValue() != 0) {
            this.f494330h = num2.intValue();
        }
        if (num3 != null && num3.intValue() != 0) {
            this.f494331i = num3.intValue();
        }
        if (num4 != null && num4.intValue() != 0) {
            this.f494332m = num4.intValue();
        }
        if (num5 == null || num5.intValue() == 0) {
            return;
        }
        this.f494333n = num5.intValue();
    }

    public final void z(java.lang.Integer num) {
        if (num == null) {
            m8147xed6e4d18(this.f494327e);
            this.f494327e = -1;
            m8147xed6e4d18(-1);
        } else {
            m8147xed6e4d18(this.f494327e);
            int intValue = num.intValue();
            this.f494327e = intValue;
            m8147xed6e4d18(intValue);
        }
    }
}
