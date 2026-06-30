package ri5;

/* loaded from: classes.dex */
public final class p extends in5.r {
    public p() {
        jz5.h.b(ri5.o.f477664d);
        jz5.h.b(ri5.n.f477663d);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570865el3;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        jz5.f0 f0Var;
        ri5.j item = (ri5.j) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        android.view.View view = holder.f3639x46306858;
        em.m2 m2Var = new em.m2(view);
        boolean z18 = !r26.n0.N(item.E);
        java.lang.String str = item.f477644f;
        if (z18) {
            gk0.k kVar = new gk0.k(m2Var.a().getMeasuredWidth(), m2Var.a().getMeasuredHeight());
            kVar.f353966d = 0.1f;
            kVar.f353967e = com.p314xaae8f345.mm.R.C30861xcebc809e.bhm;
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            android.widget.ImageView a17 = m2Var.a();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getAvatarIv(...)");
            ((h83.g) n0Var).wi(a17, item.E, kVar);
        } else {
            java.lang.String str2 = r26.n0.N(str) ^ true ? str : null;
            if (str2 != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(m2Var.a(), str2, 0.1f);
                f0Var = jz5.f0.f384359a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                android.widget.ImageView a18 = m2Var.a();
                i95.m c17 = i95.n0.c(kv.b0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                a18.setImageBitmap(kv.b0.Mg((kv.b0) c17, 0.0f, 1, null));
            }
        }
        m2Var.a().setVisibility(item.D ? 8 : 0);
        if (item.f477651o) {
            m2Var.e().setVisibility(0);
            m2Var.d().setText(item.f477652p);
            if (item.f477654r) {
                com.p314xaae8f345.mm.ui.bk.s0(m2Var.d().getPaint());
            }
        } else {
            m2Var.e().setVisibility(8);
        }
        if (item.f477653q != 0) {
            m2Var.e().setBackgroundColor(item.f477653q);
            m2Var.d().setBackgroundColor(item.f477653q);
        }
        if (item.f477660x) {
            if (item.f477658v) {
                m2Var.h().setChecked(true);
                m2Var.h().setEnabled(false);
                m2Var.h().setBackgroundResource(com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.raw.f78844x4a24e2e : com.p314xaae8f345.mm.R.raw.f78843x2ecb5687);
            } else {
                m2Var.h().setChecked(item.f477659w);
                m2Var.h().setEnabled(true);
                m2Var.h().setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.aoe);
            }
            m2Var.h().setVisibility(0);
        } else {
            m2Var.h().setVisibility(8);
        }
        if (item.f477662z && m2Var.h().getVisibility() == 0) {
            m2Var.h().setVisibility(4);
        }
        if (m2Var.f336134c == null) {
            m2Var.f336134c = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.m38);
        }
        m2Var.f336134c.setVisibility(item.A ? 0 : 8);
        if (m2Var.f336144m == null) {
            m2Var.f336144m = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.r_u);
        }
        m2Var.f336144m.setVisibility(item.C ? 0 : 8);
        if (item.f477655s) {
            if (com.p314xaae8f345.mm.ui.bk.C()) {
                m2Var.c().setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560847vu);
            } else {
                m2Var.c().setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f560846vt);
            }
            android.view.View c18 = m2Var.c();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c18, arrayList.toArray(), "com/tencent/mm/ui/mvvm/item/SelectConversationItem2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/mvvm/item/SelectContactListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c18.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(c18, "com/tencent/mm/ui/mvvm/item/SelectConversationItem2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/mvvm/item/SelectContactListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            android.view.View c19 = m2Var.c();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(c19, arrayList2.toArray(), "com/tencent/mm/ui/mvvm/item/SelectConversationItem2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/mvvm/item/SelectContactListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            c19.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(c19, "com/tencent/mm/ui/mvvm/item/SelectConversationItem2Convert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/ui/mvvm/item/SelectContactListItem;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (item.f477656t) {
            if (m2Var.f336147p == null) {
                m2Var.f336147p = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.n0e);
            }
            m2Var.f336147p.setVisibility(0);
        } else {
            if (m2Var.f336147p == null) {
                m2Var.f336147p = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.n0e);
            }
            m2Var.f336147p.setVisibility(8);
        }
        if (item.f477657u) {
            if (m2Var.f336138g == null) {
                m2Var.f336138g = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.v2a);
            }
            m2Var.f336138g.setVisibility(0);
        } else {
            if (m2Var.f336138g == null) {
                m2Var.f336138g = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.v2a);
            }
            m2Var.f336138g.setVisibility(8);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(item.f477645g, m2Var.f());
        m2Var.f().setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
        if (item.B) {
            if (m2Var.f336142k == null) {
                m2Var.f336142k = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ulk);
            }
            m2Var.f336142k.setVisibility(0);
        } else {
            if (m2Var.f336142k == null) {
                m2Var.f336142k = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ulk);
            }
            m2Var.f336142k.setVisibility(8);
            m2Var.f().setCompoundDrawablesWithIntrinsicBounds((android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null, (android.graphics.drawable.Drawable) null);
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).wi(m2Var.f(), str, i65.a.h(holder.f374654e, com.p314xaae8f345.mm.R.C30860x5b28f31.f561224cq));
        }
        if (item.F > 0) {
            m2Var.g().setVisibility(0);
            m2Var.g().setText(m2Var.g().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n79, java.lang.Integer.valueOf(item.F)));
        } else if (item.G != -1) {
            m2Var.g().setVisibility(0);
            m2Var.g().setText(m2Var.g().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.n76, java.lang.Integer.valueOf(item.G)));
        } else {
            m2Var.g().setVisibility(8);
        }
        if (((vh0.i2) ((vh0.g1) i95.n0.c(vh0.g1.class))).Di(str)) {
            if (m2Var.f336136e == null) {
                m2Var.f336136e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.spk);
            }
            m2Var.f336136e.setVisibility(0);
        } else {
            if (m2Var.f336136e == null) {
                m2Var.f336136e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.spk);
            }
            m2Var.f336136e.setVisibility(8);
        }
        java.lang.CharSequence charSequence = item.f477649m;
        if (m2Var.f336135d == null) {
            m2Var.f336135d = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kjp);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(charSequence, m2Var.f336135d);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(item.f477650n, m2Var.b());
        int i19 = item.H;
        if (i19 == -1) {
            m2Var.b().setTextColor(m2Var.b().getTextColors().getDefaultColor());
        } else if (i19 == 0) {
            m2Var.b().setTextColor(android.graphics.Color.parseColor("#8E8E93"));
        } else {
            m2Var.b().setTextColor(android.graphics.Color.parseColor("#07C160"));
        }
    }
}
