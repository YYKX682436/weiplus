package ri5;

/* loaded from: classes.dex */
public final class g extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f477635e = jz5.h.b(ri5.e.f477632d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f477636f = jz5.h.b(ri5.d.f477631d);

    @Override // in5.r
    public int e() {
        return i65.a.D(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? com.p314xaae8f345.mm.R.C30864xbddafb2a.c5q : com.p314xaae8f345.mm.R.C30864xbddafb2a.c5p;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        jz5.f0 f0Var;
        android.content.Intent intent;
        ri5.j item = (ri5.j) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View view = holder.f3639x46306858;
        em.o2 o2Var = new em.o2(view);
        boolean z18 = !r26.n0.N(item.E);
        java.lang.String str = item.f477644f;
        if (z18) {
            gk0.k kVar = new gk0.k(o2Var.a().getMeasuredWidth(), o2Var.a().getMeasuredHeight());
            kVar.f353966d = 0.1f;
            kVar.f353967e = com.p314xaae8f345.mm.R.C30861xcebc809e.bhm;
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            android.widget.ImageView a17 = o2Var.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getAvatarIv(...)");
            ((h83.g) n0Var).wi(a17, item.E, kVar);
        } else {
            java.lang.String str2 = r26.n0.N(str) ^ true ? str : null;
            if (str2 != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(o2Var.a(), str2, 0.1f);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                android.widget.ImageView a18 = o2Var.a();
                i95.m c17 = i95.n0.c(kv.b0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                a18.setImageBitmap(kv.b0.Mg((kv.b0) c17, 0.0f, 1, null));
            }
        }
        o2Var.a().setVisibility(item.D ? 8 : 0);
        if (item.f477651o) {
            o2Var.d().setVisibility(0);
            o2Var.c().setText(item.f477652p);
            if (item.f477654r) {
                com.p314xaae8f345.mm.ui.bk.s0(o2Var.c().getPaint());
            }
        } else {
            o2Var.d().setVisibility(8);
        }
        if (item.f477653q != 0) {
            o2Var.d().setBackgroundColor(item.f477653q);
            o2Var.c().setBackgroundColor(item.f477653q);
        }
        if (item.f477660x) {
            if (item.f477658v) {
                o2Var.j().setChecked(true);
                o2Var.j().setEnabled(false);
                o2Var.j().setAlpha(1.0f);
                o2Var.a().setAlpha(1.0f);
                o2Var.g().setAlpha(1.0f);
                o2Var.j().setBackgroundResource(com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f78844x4a24e2e : com.p314xaae8f345.mm.R.raw.f78843x2ecb5687);
            } else {
                boolean z19 = item.f477648l1;
                int i19 = com.p314xaae8f345.mm.R.C30861xcebc809e.aoe;
                if (z19) {
                    o2Var.j().setChecked(false);
                    o2Var.j().setEnabled(false);
                    o2Var.j().setAlpha(0.3f);
                    o2Var.j().setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aoe);
                    o2Var.a().setAlpha(0.3f);
                    o2Var.g().setAlpha(0.3f);
                } else {
                    o2Var.j().setChecked(item.f477659w);
                    o2Var.j().setEnabled(true);
                    o2Var.j().setAlpha(1.0f);
                    o2Var.a().setAlpha(1.0f);
                    o2Var.g().setAlpha(1.0f);
                    android.content.Context context = holder.f3639x46306858.getContext();
                    android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
                    if (((activity == null || (intent = activity.getIntent()) == null) ? 0 : intent.getIntExtra("key_check_box_color", 0)) == 1) {
                        i19 = com.p314xaae8f345.mm.R.C30861xcebc809e.d6w;
                    }
                    o2Var.j().setBackgroundResource(i19);
                }
            }
            o2Var.j().setVisibility(0);
        } else {
            o2Var.j().setVisibility(8);
        }
        if (item.f477662z && o2Var.j().getVisibility() == 0) {
            o2Var.j().setVisibility(4);
        }
        if (o2Var.f336210e == null) {
            o2Var.f336210e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.m38);
        }
        o2Var.f336210e.setVisibility(item.A ? 0 : 8);
        o2Var.e().setVisibility(item.C ? 0 : 8);
        if (item.f477655s) {
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                o2Var.b().setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560847vu);
            } else {
                o2Var.b().setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560846vt);
            }
            android.view.View b17 = o2Var.b();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(b17, arrayList.toArray(), "com/tencent/mm/ui/mvvm/item/SelectContactItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/mvvm/item/SelectContactListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(b17, "com/tencent/mm/ui/mvvm/item/SelectContactItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/mvvm/item/SelectContactListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View b18 = o2Var.b();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(b18, arrayList2.toArray(), "com/tencent/mm/ui/mvvm/item/SelectContactItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/mvvm/item/SelectContactListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            b18.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(b18, "com/tencent/mm/ui/mvvm/item/SelectContactItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/mvvm/item/SelectContactListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (item.f477656t) {
            if (o2Var.f336223r == null) {
                o2Var.f336223r = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.n0e);
            }
            o2Var.f336223r.setVisibility(0);
        } else {
            if (o2Var.f336223r == null) {
                o2Var.f336223r = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.n0e);
            }
            o2Var.f336223r.setVisibility(8);
        }
        if (item.f477657u) {
            if (o2Var.f336214i == null) {
                o2Var.f336214i = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.v2a);
            }
            o2Var.f336214i.setVisibility(0);
        } else {
            if (o2Var.f336214i == null) {
                o2Var.f336214i = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.v2a);
            }
            o2Var.f336214i.setVisibility(8);
        }
        item.f477646h.c(o2Var, holder, item, i17, i18, z17, list);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(item.f477645g, o2Var.g());
        o2Var.g().setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        if (item.B) {
            if (o2Var.f336218m == null) {
                o2Var.f336218m = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ulk);
            }
            o2Var.f336218m.setVisibility(0);
        } else {
            if (o2Var.f336218m == null) {
                o2Var.f336218m = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ulk);
            }
            o2Var.f336218m.setVisibility(8);
            o2Var.g().setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).wi(o2Var.g(), str, i65.a.h(holder.f374654e, com.p314xaae8f345.mm.R.C30860x5b28f31.f561224cq));
        }
        if (item.F > 0) {
            o2Var.i().setVisibility(0);
            o2Var.i().setText(o2Var.i().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n79, java.lang.Integer.valueOf(item.F)));
        } else if (item.G != -1) {
            o2Var.i().setVisibility(0);
            o2Var.i().setText(o2Var.i().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n76, java.lang.Integer.valueOf(item.G)));
        } else {
            o2Var.i().setVisibility(8);
        }
        if (((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Di(str)) {
            if (o2Var.f336208c == null) {
                o2Var.f336208c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.spk);
            }
            o2Var.f336208c.setVisibility(0);
        } else {
            if (o2Var.f336208c == null) {
                o2Var.f336208c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.spk);
            }
            o2Var.f336208c.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(item.f477649m, o2Var.h());
        java.lang.CharSequence charSequence = item.f477650n;
        if (o2Var.f336209d == null) {
            o2Var.f336209d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cut);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(charSequence, o2Var.f336209d);
        if (o2Var.h().getVisibility() == 0) {
            o2Var.f().getViewTreeObserver().addOnGlobalLayoutListener(new ri5.f(o2Var, this));
        }
    }
}
