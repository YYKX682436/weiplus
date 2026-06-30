package kv4;

/* loaded from: classes5.dex */
public final class l0 implements jv4.n {

    /* renamed from: a, reason: collision with root package name */
    public final mv4.i f394243a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f394244b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f394245c;

    /* renamed from: d, reason: collision with root package name */
    public final jv4.m f394246d;

    public l0(mv4.i boxData, java.util.List data, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(boxData, "boxData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f394243a = boxData;
        this.f394244b = data;
        this.f394245c = z17;
        this.f394246d = jv4.m.f383778h;
    }

    @Override // jv4.n
    public void c(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        android.view.View view;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        kv4.g0 g0Var = holder instanceof kv4.g0 ? (kv4.g0) holder : null;
        if (g0Var == null) {
            return;
        }
        java.util.List list = this.f394244b;
        int size = list.size();
        boolean z17 = !this.f394245c;
        kv4.i0 i0Var = new kv4.i0(this);
        qv4.k0 k0Var = (qv4.k0) g0Var;
        if (z17) {
            k0Var.k().setMinimumWidth(com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x);
            k0Var.k().setWeightSum(1.0f);
        }
        java.util.Iterator it = kz5.n0.C0(k0Var.j(), e06.p.m(size, k0Var.j().size())).iterator();
        while (it.hasNext()) {
            pm0.v.B((android.view.View) it.next());
        }
        int i17 = 0;
        for (java.lang.Object obj2 : k0Var.j()) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            android.view.View view2 = (android.view.View) obj2;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
            java.lang.Object tag = view2.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type android.widget.TextView");
            android.view.View findViewById = view2.findViewById(com.p314xaae8f345.mm.R.id.tz6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
            i0Var.mo147xb9724478(valueOf, (android.widget.TextView) tag, findViewById);
            i17 = i18;
        }
        int size2 = k0Var.j().size();
        while (true) {
            view = k0Var.f448520d;
            if (size2 >= size) {
                break;
            }
            android.view.View inflate = android.view.LayoutInflater.from(view.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.egk, (android.view.ViewGroup) k0Var.k(), false);
            android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.tz7);
            android.widget.TextView textView = (android.widget.TextView) findViewById2;
            if (z17) {
                android.view.ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
                layoutParams.width = -1;
                textView.setLayoutParams(layoutParams);
            }
            inflate.setTag(findViewById2);
            if (z17) {
                android.view.ViewGroup.LayoutParams layoutParams2 = inflate.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams3 = layoutParams2 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams2 : null;
                if (layoutParams3 != null) {
                    layoutParams3.width = 0;
                    layoutParams3.weight = 0.25f;
                    inflate.setLayoutParams(layoutParams3);
                }
            }
            k0Var.k().addView(inflate);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(size2);
            java.lang.Object tag2 = inflate.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag2, "null cannot be cast to non-null type android.widget.TextView");
            android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.tz6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
            i0Var.mo147xb9724478(valueOf2, (android.widget.TextView) tag2, findViewById3);
            size2++;
        }
        k0Var.o(z17);
        qv4.e0 e0Var = new qv4.e0(k0Var, z17);
        if (view.getWidth() > 0) {
            e0Var.mo152xb9724478();
        } else {
            view.getViewTreeObserver().addOnGlobalLayoutListener(new qv4.g0(view, e0Var));
        }
        k0Var.f448526m = new kv4.j0(this);
        java.util.Iterator it6 = list.iterator();
        while (true) {
            if (!it6.hasNext()) {
                obj = null;
                break;
            }
            java.lang.Object next = it6.next();
            rv4.c0 c0Var = (rv4.c0) ((mv4.j) next);
            if (c0Var.b() && c0Var.f481986g) {
                obj = next;
                break;
            }
        }
        mv4.j jVar = (mv4.j) obj;
        if (jVar != null) {
            android.view.View view3 = (android.view.View) kz5.n0.a0(k0Var.j(), list.indexOf(jVar));
            if (view3 != null) {
                qv4.f0 f0Var = new qv4.f0(view3, k0Var);
                if (view3.getWidth() > 0) {
                    f0Var.mo152xb9724478();
                } else {
                    view3.getViewTreeObserver().addOnGlobalLayoutListener(new qv4.g0(view3, f0Var));
                }
            }
        }
    }

    @Override // jv4.n
    /* renamed from: getType */
    public jv4.m mo141457xfb85f7b0() {
        return this.f394246d;
    }

    @Override // nv4.g
    public java.lang.String v() {
        return kz5.n0.g0(this.f394244b, null, null, null, 0, null, kv4.k0.f394240d, 31, null) + '-' + ((rv4.b0) this.f394243a).f481976f;
    }

    @Override // nv4.g
    public void w() {
    }
}
