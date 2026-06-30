package pr3;

/* loaded from: classes8.dex */
public final class n extends in5.r {
    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e3l;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        jz5.f0 f0Var;
        int i19;
        pr3.c item = (pr3.c) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16865xbd41bc48 c16865xbd41bc48 = (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.C16865xbd41bc48) holder.p(com.p314xaae8f345.mm.R.id.f566911hh0);
        c16865xbd41bc48.setVisibility(8);
        c16865xbd41bc48.setVisibility(0);
        c16865xbd41bc48.f235310e = c16865xbd41bc48.getContext().getString(item.f439488f);
        android.view.ViewGroup.LayoutParams layoutParams = c16865xbd41bc48.f235314i.getLayoutParams();
        java.lang.Integer num = item.f439494o;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (num != null) {
            layoutParams.width = i65.a.h(c16865xbd41bc48.getContext(), num.intValue());
            c16865xbd41bc48.f235314i.setLayoutParams(layoutParams);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            layoutParams.width = -2;
            c16865xbd41bc48.f235314i.setLayoutParams(layoutParams);
        }
        android.widget.TextView mTitleTv = c16865xbd41bc48.f235314i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mTitleTv, "mTitleTv");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSingleLine", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
        mTitleTv.setSingleLine(false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSingleLine", "com.tencent.mm.plugin.sns.ad.dsl.DSLViewAttributeKt");
        c16865xbd41bc48.f235315m.setGravity(8388613);
        c16865xbd41bc48.f235311f = item.f439489g;
        java.lang.Integer num2 = item.f439493n;
        if (num2 != null) {
            c16865xbd41bc48.f235315m.setTextColor(num2.intValue());
        } else {
            c16865xbd41bc48.f235315m.setTextColor(i65.a.d(c16865xbd41bc48.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
        }
        boolean z18 = true;
        if (item.f439496q == pr3.f.f439504d) {
            c16865xbd41bc48.f235313h = true;
        } else {
            c16865xbd41bc48.f235313h = false;
        }
        boolean z19 = item.f439491i;
        android.view.View view = c16865xbd41bc48.f235316n;
        int i27 = z19 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i27));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/profile/ui/ProfileNormalItemView", "setRightArrow", "(Z)Lcom/tencent/mm/plugin/profile/ui/ProfileNormalItemView;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/profile/ui/ProfileNormalItemView", "setRightArrow", "(Z)Lcom/tencent/mm/plugin/profile/ui/ProfileNormalItemView;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.Integer num3 = item.f439492m;
        if (num3 != null) {
            com.p314xaae8f345.mm.ui.kk.d(c16865xbd41bc48, c16865xbd41bc48.getResources().getDimensionPixelSize(num3.intValue()));
        } else {
            f0Var2 = null;
        }
        if (f0Var2 == null) {
            com.p314xaae8f345.mm.ui.kk.d(c16865xbd41bc48, 0);
        }
        c16865xbd41bc48.f235312g = new pr3.j(item);
        if (item.f439490h == 1) {
            c16865xbd41bc48.f235315m.setSingleLine(true);
        } else {
            c16865xbd41bc48.f235315m.setSingleLine(false);
            c16865xbd41bc48.f235315m.setMaxLines(item.f439490h);
            c16865xbd41bc48.f235315m.setEllipsize(android.text.TextUtils.TruncateAt.END);
        }
        c16865xbd41bc48.setClickable(true);
        float g17 = i65.a.g(c16865xbd41bc48.getContext());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.InfoItemConvert", "reload, " + ((java.lang.Object) item.f439489g) + ", images: " + item.f439497r.size());
        java.util.List list2 = item.f439497r;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : list2) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a((java.lang.String) obj);
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
                arrayList2.add(obj);
            }
        }
        if (!arrayList2.isEmpty()) {
            java.lang.CharSequence charSequence = item.f439489g;
            if (charSequence == null || r26.n0.N(charSequence)) {
                android.widget.LinearLayout mExtraGroup = c16865xbd41bc48.f235317o;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mExtraGroup, "mExtraGroup");
                com.p314xaae8f345.mm.ui.kk.f(mExtraGroup, 0);
            } else {
                android.widget.LinearLayout mExtraGroup2 = c16865xbd41bc48.f235317o;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mExtraGroup2, "mExtraGroup");
                com.p314xaae8f345.mm.ui.kk.f(mExtraGroup2, c16865xbd41bc48.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.aih));
            }
            c16865xbd41bc48.f235317o.setVisibility(0);
            if (c16865xbd41bc48.f235317o.getChildCount() < 1) {
                android.content.Context context = c16865xbd41bc48.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                com.p314xaae8f345.mm.ui.p2642x2e06d1.C21496xac9ac3d0 c21496xac9ac3d0 = new com.p314xaae8f345.mm.ui.p2642x2e06d1.C21496xac9ac3d0(context, null, 0, 6, null);
                c21496xac9ac3d0.m78983xaff65e82(new pr3.k(c16865xbd41bc48));
                c21496xac9ac3d0.m78982xf97f9583(new pr3.m(g17, item, c21496xac9ac3d0));
                c16865xbd41bc48.f235317o.addView(c21496xac9ac3d0);
            }
            android.view.View childAt = c16865xbd41bc48.f235317o.getChildAt(0);
            com.p314xaae8f345.mm.ui.p2642x2e06d1.C21496xac9ac3d0 c21496xac9ac3d02 = childAt instanceof com.p314xaae8f345.mm.ui.p2642x2e06d1.C21496xac9ac3d0 ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21496xac9ac3d0) childAt : null;
            if (c21496xac9ac3d02 != null) {
                c21496xac9ac3d02.m78980x76491f2c(kz5.n0.V0(arrayList2));
                c21496xac9ac3d02.b();
            }
        } else {
            c16865xbd41bc48.f235317o.setVisibility(8);
        }
        android.widget.TextView textView = (android.widget.TextView) c16865xbd41bc48.findViewById(com.p314xaae8f345.mm.R.id.szb);
        java.lang.String str2 = item.f439495p;
        if (str2 != null && !r26.n0.N(str2)) {
            z18 = false;
        }
        if (z18) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str2);
        }
        c16865xbd41bc48.f235314i.setText(c16865xbd41bc48.f235310e);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(c16865xbd41bc48.f235311f) || c16865xbd41bc48.f235313h) {
            c16865xbd41bc48.setVisibility(0);
            c16865xbd41bc48.f235315m.setText(c16865xbd41bc48.f235311f);
            java.lang.CharSequence charSequence2 = c16865xbd41bc48.f235311f;
            if (charSequence2 == null || charSequence2.length() <= 0) {
                i19 = 8;
                c16865xbd41bc48.f235315m.setVisibility(8);
            } else {
                c16865xbd41bc48.f235315m.setVisibility(0);
                i19 = 8;
            }
            c16865xbd41bc48.setOnClickListener(c16865xbd41bc48.f235312g);
        } else {
            c16865xbd41bc48.setVisibility(8);
            i19 = 8;
        }
        if (item.j()) {
            c16865xbd41bc48.setVisibility(0);
        } else {
            c16865xbd41bc48.setVisibility(i19);
        }
    }
}
