package hk2;

/* loaded from: classes3.dex */
public final class n extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final gk2.e f363443e;

    public n(gk2.e buContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        this.f363443e = buContext;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dh8;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String obj;
        java.lang.Object obj2;
        hk2.m item = (hk2.m) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (!(list == null || list.isEmpty())) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                } else {
                    obj2 = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, 1)) {
                        break;
                    }
                }
            }
            if (obj2 != null) {
                holder.p(com.p314xaae8f345.mm.R.id.f566336q42).setBackgroundResource(item.f363442e ? com.p314xaae8f345.mm.R.C30861xcebc809e.cgf : com.p314xaae8f345.mm.R.C30861xcebc809e.c49);
                return;
            }
        }
        ek2.q0 q0Var = ek2.r0.f335052y;
        r45.o84 o84Var = item.f363441d;
        r45.t12 a17 = q0Var.a("", 1, o84Var.m75939xb282bd08(0));
        r45.xn1 xn1Var = new r45.xn1();
        gk2.e eVar = this.f363443e;
        xn1Var.set(11, ((mm2.c1) eVar.a(mm2.c1.class)).f410345h);
        zl2.r4 r4Var = zl2.r4.f555483a;
        xn1Var.set(7, java.lang.Integer.valueOf(r4Var.g0()));
        xn1Var.set(0, r4Var.m0(eVar));
        a17.set(8, xn1Var);
        int m75939xb282bd08 = o84Var.m75939xb282bd08(0);
        android.content.Context context = holder.f374654e;
        java.lang.String string = m75939xb282bd08 != 2 ? m75939xb282bd08 != 3 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hha) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.j5v) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.i6j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.i8m);
        java.lang.String str = (textView == null || (obj = android.text.TextUtils.ellipsize(string, textView.getPaint(), (float) i65.a.a(context, 51.5f), android.text.TextUtils.TruncateAt.END).toString()) == null) ? string : obj;
        hk2.r rVar = hk2.r.f363447a;
        gk2.e eVar2 = this.f363443e;
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        rVar.a(eVar2, itemView, new dk2.mf(a17), str, false);
        android.view.View p17 = holder.p(com.p314xaae8f345.mm.R.id.c7g);
        if (p17 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(p17, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/model/danmakuitem/LiveFloatMsgConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/model/danmakuitem/FinderLiveFloatMsg;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            p17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(p17, "com/tencent/mm/plugin/finder/live/model/danmakuitem/LiveFloatMsgConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/plugin/finder/live/model/danmakuitem/FinderLiveFloatMsg;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        holder.p(com.p314xaae8f345.mm.R.id.f566336q42).setBackgroundResource(item.f363442e ? com.p314xaae8f345.mm.R.C30861xcebc809e.cgf : com.p314xaae8f345.mm.R.C30861xcebc809e.c49);
        android.widget.TextView textView2 = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.pvx);
        int m75939xb282bd082 = o84Var.m75939xb282bd08(0);
        if (m75939xb282bd082 == 2 || m75939xb282bd082 == 3) {
            if (textView2 != null) {
                textView2.setVisibility(0);
            }
            int m75939xb282bd083 = o84Var.m75939xb282bd08(2);
            textView2.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.idn, java.lang.Integer.valueOf(m75939xb282bd083 >= 0 ? m75939xb282bd083 : 0)));
        } else if (textView2 != null) {
            textView2.setVisibility(8);
        }
        android.view.View p18 = holder.p(com.p314xaae8f345.mm.R.id.ev_);
        if (p18 != null) {
            p18.measure(android.view.View.MeasureSpec.makeMeasureSpec(holder.o().getLayoutParams().width, Integer.MIN_VALUE), android.view.View.MeasureSpec.makeMeasureSpec(holder.o().getLayoutParams().width, Integer.MIN_VALUE));
            if (p18.getMeasuredWidth() > holder.p(com.p314xaae8f345.mm.R.id.f566336q42).getLayoutParams().width - (context.getResources().getDimensionPixelOffset(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv) * 2)) {
                p18.getLayoutParams().width = p18.getMeasuredWidth();
                android.view.ViewGroup.LayoutParams layoutParams = p18.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 != null) {
                    layoutParams2.gravity = 3;
                }
                p18.setTranslationX(0.0f);
                return;
            }
            p18.getLayoutParams().width = -2;
            android.view.ViewGroup.LayoutParams layoutParams3 = p18.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams4 = layoutParams3 instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams3 : null;
            if (layoutParams4 != null) {
                layoutParams4.gravity = 1;
            }
            if (holder.p(com.p314xaae8f345.mm.R.id.lti) != null) {
                p18.setTranslationX((r1.getPaddingRight() - r1.getPaddingLeft()) / 2.0f);
            }
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.i(recyclerView, holder, i17);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.pvx);
        if (textView != null) {
            d92.f.f309003a.l(textView, 17.0f, false);
        }
    }
}
