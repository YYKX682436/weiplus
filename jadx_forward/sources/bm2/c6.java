package bm2;

/* loaded from: classes3.dex */
public final class c6 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final yz5.l f103350d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f103351e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f103352f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f103353g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f103354h;

    public c6(yz5.l onItemAddClick, yz5.p onItemLongClick, yz5.l isItemAdded) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemAddClick, "onItemAddClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemLongClick, "onItemLongClick");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(isItemAdded, "isItemAdded");
        this.f103350d = onItemAddClick;
        this.f103351e = onItemLongClick;
        this.f103352f = isItemAdded;
        this.f103353g = "FinderLivePromoteSubListAdapter";
        this.f103354h = new java.util.LinkedList();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f103354h.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        bm2.y5 holder = (bm2.y5) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object obj = this.f103354h.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        el2.v2 v2Var = (el2.v2) obj;
        boolean z17 = v2Var instanceof el2.a3;
        mn2.g1 g1Var = mn2.g1.f411508a;
        yo0.i h17 = z17 ? g1Var.h(mn2.f1.f411485J) : g1Var.h(mn2.f1.f411505z);
        java.lang.String d17 = v2Var.d();
        boolean z18 = true;
        boolean z19 = d17 == null || d17.length() == 0;
        android.widget.ImageView imageView = holder.f103987g;
        android.widget.ImageView imageView2 = holder.f103986f;
        if (z19) {
            imageView2.setVisibility(4);
            imageView.setVisibility(0);
            jz5.l f17 = v2Var.f();
            if (f17 != null) {
                imageView.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(holder.f3639x46306858.getContext(), ((java.lang.Number) f17.f384366d).intValue(), ((java.lang.Number) f17.f384367e).intValue()));
            }
        } else {
            imageView2.setVisibility(0);
            imageView.setVisibility(4);
            new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).c(new mn2.q3(v2Var.d(), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), imageView2, h17);
        }
        holder.f103984d.setText(v2Var.mo127814x7531c8a2());
        holder.f103985e.setText(v2Var.b());
        bm2.z5 z5Var = new bm2.z5(this, v2Var);
        android.view.View view = holder.f103988h;
        view.setOnClickListener(z5Var);
        java.lang.String c17 = v2Var.c();
        if (c17 != null && c17.length() != 0) {
            z18 = false;
        }
        android.widget.TextView textView = holder.f103989i;
        if (z18) {
            textView.setVisibility(8);
        } else {
            textView.setText(v2Var.c());
            textView.setVisibility(0);
        }
        if (v2Var.mo127815xfb85f7b0() == 7) {
            holder.f3639x46306858.setOnLongClickListener(new bm2.a6(this, v2Var));
            imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        } else {
            imageView2.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        holder.f3639x46306858.setOnClickListener(new bm2.b6(this, v2Var));
        boolean booleanValue = ((java.lang.Boolean) this.f103352f.mo146xb9724478(v2Var)).booleanValue();
        android.widget.TextView textView2 = holder.f103990m;
        if (!booleanValue) {
            textView2.setText(holder.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573317e85));
            textView2.setTextColor(holder.f3639x46306858.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
        } else {
            view.setOnClickListener(null);
            textView2.setText(holder.f3639x46306858.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.e88));
            textView2.setTextColor(holder.f3639x46306858.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77768x20e836));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.axu, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new bm2.y5(this, inflate);
    }
}
