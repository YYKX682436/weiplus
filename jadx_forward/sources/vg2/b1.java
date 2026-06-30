package vg2;

/* loaded from: classes3.dex */
public final class b1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f518013d;

    /* renamed from: e, reason: collision with root package name */
    public int f518014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vg2.r1 f518015f;

    public b1(vg2.r1 r1Var, java.util.LinkedList data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f518015f = r1Var;
        this.f518013d = data;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f518013d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        vg2.y0 holder = (vg2.y0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f518013d.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        r45.yi6 yi6Var = (r45.yi6) obj;
        try {
            holder.f518153d.setBackground(new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor(yi6Var.m75945x2fec8307(6))));
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GiftSkinSelectPanelWidget", "color:" + yi6Var.m75945x2fec8307(6) + " is not valid");
        }
        holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.f3a, java.lang.Integer.valueOf(i17));
        int i18 = this.f518014e;
        android.view.View view = holder.f518154e;
        if (i18 == i17) {
            view.setScaleX(1.3f);
            view.setScaleY(1.3f);
        } else {
            view.setScaleX(1.0f);
            view.setScaleY(1.0f);
        }
        cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
        aVar.pk(holder.f3639x46306858, "live_gift_color_select");
        dy1.r ik6 = aVar.ik(holder.f3639x46306858, 8, 25652);
        android.view.View view2 = holder.f3639x46306858;
        vg2.r1 r1Var = this.f518015f;
        ((cy1.a) ik6).gk(view2, kz5.c1.k(new jz5.l("gift_id", r1Var.f518100h.f67814x2c488eb6), new jz5.l("thing_index", vg2.r1.b(r1Var)), new jz5.l("gift_color", yi6Var.m75945x2fec8307(6))));
        holder.f3639x46306858.setOnClickListener(new vg2.a1(this, holder, r1Var, yi6Var));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(this.f518015f.f518093a).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.as8, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new vg2.y0(this, inflate);
    }
}
