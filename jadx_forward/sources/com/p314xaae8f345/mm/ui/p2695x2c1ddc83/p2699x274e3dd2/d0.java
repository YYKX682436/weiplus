package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2;

/* loaded from: classes11.dex */
public final class d0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final android.app.Activity f289650e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.g0 f289651f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f289652g;

    /* renamed from: h, reason: collision with root package name */
    public int f289653h;

    /* renamed from: i, reason: collision with root package name */
    public yf5.g0 f289654i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b3 f289655m;

    /* renamed from: n, reason: collision with root package name */
    public xm3.t0 f289656n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f289657o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f289658p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f289659q;

    public d0(android.app.Activity activity, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.g0 g0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f289650e = activity;
        this.f289651f = g0Var;
        this.f289655m = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b3();
        this.f289657o = new java.util.LinkedHashMap();
        this.f289658p = jz5.h.b(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.c0(this));
        this.f289659q = jz5.h.b(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.b0(this));
    }

    @Override // in5.r
    public android.view.View c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        yf5.d dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        android.content.Context context = recyclerView.getContext();
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.e0.f289662a;
        android.view.View a17 = (weakReference == null || (dVar = (yf5.d) weakReference.get()) == null) ? null : dVar.a();
        if (a17 == null) {
            a17 = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570222e40, (android.view.ViewGroup) null, false);
        }
        android.view.View view = a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        va5.a aVar = new va5.a(context);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo);
        va5.c cVar = new va5.c(context);
        cVar.f515937a = com.p314xaae8f345.mm.R.id.vkf;
        cVar.f515940d = new android.graphics.drawable.ColorDrawable(context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77788x5ac80f24));
        cVar.f515943g = dimensionPixelOffset;
        cVar.f515938b = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pjc);
        cVar.f515942f = i65.a.f(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja);
        cVar.f515941e = -1;
        cVar.f515939c = (android.graphics.drawable.Drawable) ((jz5.n) this.f289659q).mo141623x754a37bb();
        ((java.util.ArrayList) aVar.f515936b).add(cVar);
        va5.v vVar = new va5.v(aVar);
        int i17 = this.f289653h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        va5.p pVar = new va5.p(view, vVar, java.lang.Integer.valueOf(i17), null, null);
        pVar.m171385xf232298a(true);
        pVar.addOnLayoutChangeListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.v(vVar, dimensionPixelOffset));
        pVar.m171387x64f96166(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.w(pVar, this));
        pVar.m171386x5d2a0075(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.y(this));
        return pVar;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570222e40;
    }

    @Override // in5.r
    public void g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
        android.content.Context context = recyclerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f289652g = context;
        this.f289653h = (int) (context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561429i9) + 0.5f);
        android.content.Context context2 = this.f289652g;
        if (context2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
            throw null;
        }
        this.f289654i = new yf5.g0(context2);
        this.f289656n = adapter instanceof xm3.t0 ? (xm3.t0) adapter : null;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var;
        java.lang.String h17;
        java.lang.String string;
        android.widget.ImageView imageView;
        int color;
        yf5.x item = (yf5.x) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        java.lang.Object tag = itemView.getTag();
        yf5.n nVar = tag instanceof yf5.n ? (yf5.n) tag : null;
        if (nVar == null || (l4Var = item.f543528d) == null || (h17 = l4Var.h1()) == null) {
            return;
        }
        yf5.g0 g0Var = this.f289654i;
        if (g0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("itemBuilder");
            throw null;
        }
        g0Var.a(i17, nVar, item, l4Var);
        boolean z18 = itemView instanceof va5.p;
        va5.p pVar = z18 ? (va5.p) itemView : null;
        if (pVar != null) {
            pVar.m171388xa32537ab(i17);
        }
        va5.p pVar2 = z18 ? (va5.p) itemView : null;
        if (pVar2 != null) {
            pVar2.m171390x7e80379b(true);
        }
        va5.p pVar3 = z18 ? (va5.p) itemView : null;
        if (pVar3 != null) {
            if (nVar.f543460n) {
                android.content.Context context = this.f289652g;
                if (context == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
                    throw null;
                }
                color = context.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560848vv);
            } else {
                android.content.Context context2 = this.f289652g;
                if (context2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
                    throw null;
                }
                color = context2.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c);
            }
            pVar3.setBackgroundColor(color);
        }
        va5.p pVar4 = z18 ? (va5.p) itemView : null;
        if (pVar4 != null) {
            boolean z19 = l4Var.d1() > 0;
            if (z19) {
                android.content.Context context3 = this.f289652g;
                if (context3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
                    throw null;
                }
                string = context3.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pjc);
            } else {
                android.content.Context context4 = this.f289652g;
                if (context4 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mContext");
                    throw null;
                }
                string = context4.getString(com.p314xaae8f345.mm.R.C30867xcad56011.pjd);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            android.graphics.drawable.Drawable drawable = z19 ? (android.graphics.drawable.Drawable) ((jz5.n) this.f289658p).mo141623x754a37bb() : (android.graphics.drawable.Drawable) ((jz5.n) this.f289659q).mo141623x754a37bb();
            va5.v vVar = pVar4.f515959h;
            vVar.a(string, com.p314xaae8f345.mm.R.id.vkf);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(drawable);
            android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) vVar.findViewById(com.p314xaae8f345.mm.R.id.vkf);
            if (linearLayout != null && (imageView = (android.widget.ImageView) linearLayout.findViewById(com.p314xaae8f345.mm.R.id.vb_)) != null) {
                imageView.setImageDrawable(drawable);
            }
        }
        nVar.f543464r.setOnClickListener(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.z(this, h17, nVar, holder, item, i17));
        this.f289655m.c(nVar);
        holder.f3639x46306858.setTag(com.p314xaae8f345.mm.R.id.cip, item);
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        android.view.View itemView;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.view.View view = holder.f3639x46306858;
        va5.p pVar = view instanceof va5.p ? (va5.p) view : null;
        if (pVar == null || (itemView = pVar.m171379xc2a54588()) == null) {
            itemView = holder.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        }
        yf5.n nVar = new yf5.n();
        yf5.g0 g0Var = this.f289654i;
        if (g0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("itemBuilder");
            throw null;
        }
        g0Var.b(nVar, itemView);
        holder.f3639x46306858.setTag(nVar);
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
