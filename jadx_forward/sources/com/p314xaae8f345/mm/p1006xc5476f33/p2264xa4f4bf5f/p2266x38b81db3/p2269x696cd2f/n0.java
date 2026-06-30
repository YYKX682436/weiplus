package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes11.dex */
public final class n0 extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final float f254859e;

    /* renamed from: f, reason: collision with root package name */
    public final float f254860f;

    /* renamed from: g, reason: collision with root package name */
    public final float f254861g;

    /* renamed from: h, reason: collision with root package name */
    public mj4.h f254862h;

    public n0(int i17) {
        new java.util.HashMap();
        new java.util.HashMap();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        this.f254859e = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9);
        this.f254860f = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
        this.f254861g = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.epy;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String a17;
        java.lang.String string;
        nj4.d item = (nj4.d) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f254862h = ai4.m0.f86706a.E();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) holder.p(com.p314xaae8f345.mm.R.id.m97);
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMFragmentActivity");
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = (com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) context;
        java.lang.Math.min(activityC21401x6ce6f73f.getWindowManager().getDefaultDisplay().getWidth(), activityC21401x6ce6f73f.getWindowManager().getDefaultDisplay().getHeight());
        boolean K = bk4.i.a().K();
        float f17 = this.f254859e;
        float f18 = K ? f17 : this.f254861g;
        if (!bk4.i.a().K()) {
            f17 = this.f254860f;
        }
        if (bk4.i.a().K()) {
            android.view.ViewGroup.LayoutParams layoutParams = c1163xf1deaba4.getLayoutParams();
            android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
            if (layoutParams2 != null) {
                layoutParams2.setMarginStart((int) f18);
            }
            if (layoutParams2 != null) {
                layoutParams2.setMarginEnd((int) f17);
            }
            c1163xf1deaba4.setLayoutParams(layoutParams2);
        }
        context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561251db);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.d0v);
        if (item.f419467e) {
            imageView.setVisibility(8);
        } else {
            imageView.setVisibility(0);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.hnv);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.om7);
        com.p314xaae8f345.mm.ui.bk.s0(textView.getPaint());
        imageView2.setVisibility(0);
        boolean y17 = bk4.i.a().y();
        ai4.e eVar = item.f419469d;
        if (y17) {
            java.lang.String c17 = ((mj4.k) ((mj4.h) eVar.f86668b.get(0))).c();
            mj4.h hVar = this.f254862h;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, hVar != null ? ((mj4.k) hVar).c() : null)) {
                java.util.HashMap hashMap = new java.util.HashMap();
                java.util.Iterator it = eVar.f86668b.iterator();
                while (it.hasNext()) {
                    java.lang.String h17 = ((mj4.k) ((mj4.h) it.next())).h();
                    if (hashMap.containsKey(h17)) {
                        java.lang.Integer num = (java.lang.Integer) hashMap.get(h17);
                        hashMap.put(h17, java.lang.Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                    } else {
                        hashMap.put(h17, 1);
                    }
                }
                java.util.HashSet hashSet = new java.util.HashSet();
                int i19 = 0;
                for (java.util.Map.Entry entry : hashMap.entrySet()) {
                    if (((java.lang.Number) entry.getValue()).intValue() >= i19) {
                        i19 = ((java.lang.Number) entry.getValue()).intValue();
                        hashSet.add(entry.getKey());
                    }
                }
                if (hashSet.size() != 1) {
                    java.util.Iterator it6 = eVar.f86668b.iterator();
                    while (true) {
                        if (!it6.hasNext()) {
                            a17 = mj4.d.a((mj4.h) eVar.f86668b.get(0));
                            break;
                        }
                        mj4.k kVar = (mj4.k) ((mj4.h) it6.next());
                        if (hashSet.contains(kVar.h())) {
                            a17 = kVar.h();
                            break;
                        }
                    }
                } else {
                    java.util.Iterator it7 = hashSet.iterator();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it7, "iterator(...)");
                    a17 = it7.hasNext() ? (java.lang.String) it7.next() : mj4.d.a((mj4.h) eVar.f86668b.get(0));
                }
            } else {
                mj4.h hVar2 = this.f254862h;
                a17 = hVar2 != null ? ((mj4.k) hVar2).h() : null;
            }
            if (a17 == null) {
                a17 = mj4.d.a((mj4.h) eVar.f86668b.get(0));
            }
        } else {
            a17 = mj4.d.a((mj4.h) eVar.f86668b.get(0));
        }
        bk4.f.V(bk4.i.a(), imageView2, a17, bi4.d.OUTLINED, bi4.b.FG_0, (mj4.h) eVar.f86668b.get(0), false, true, 32, null);
        int size = eVar.f86668b.size();
        if (size > 0) {
            pj4.o0 a18 = xe0.j0.a((xe0.j0) eVar.f86668b.get(0), false, 1, null);
            mj4.h hVar3 = this.f254862h;
            java.lang.String c18 = hVar3 != null ? ((mj4.k) hVar3).c() : null;
            int i27 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mj4.d.b(a18), c18) ? size == 1 ? 4 : 3 : 2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.SameOtherTopicItemConvertV2", "initView: type=" + i27 + ", itemSize=" + size + ", topic ClusterId=" + mj4.d.b(a18) + ", selfClusterId=" + c18);
            if (bk4.i.a().K()) {
                long f19 = c01.id.f(((mj4.k) ((mj4.h) eVar.f86668b.get(0))).f408600b.f76512x81959a6e) / 3600;
                string = f19 < 1 ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jx8) : context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jx6, java.lang.Long.valueOf(f19));
            } else {
                string = bk4.i.a().G() ? context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jvq, java.lang.Integer.valueOf(eVar.f86668b.size())) : bk4.i.a().c(a18, size, bk4.i.a().m(a18), i27);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            if (string.length() == 0) {
                if (i27 == 1) {
                    string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jvt, java.lang.Integer.valueOf(eVar.f86668b.size()), bk4.i.a().m(xe0.j0.a((xe0.j0) eVar.f86668b.get(0), false, 1, null)));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                } else if (i27 == 3) {
                    string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jvu, java.lang.Integer.valueOf(eVar.f86668b.size() - 1), bk4.i.a().m(xe0.j0.a((xe0.j0) eVar.f86668b.get(0), false, 1, null)));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                } else if (i27 != 4) {
                    string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jvs, java.lang.Integer.valueOf(eVar.f86668b.size()), bk4.i.a().m(xe0.j0.a((xe0.j0) eVar.f86668b.get(0), false, 1, null)));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                } else {
                    string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jvr, bk4.i.a().m(xe0.j0.a((xe0.j0) eVar.f86668b.get(0), false, 1, null)));
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                }
            }
            textView.setText(string);
        }
        holder.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.m0(this, holder, item));
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
