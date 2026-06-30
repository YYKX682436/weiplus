package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui;

/* loaded from: classes14.dex */
public final class h extends jq4.z0 {

    /* renamed from: w, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.a f231818w;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a f231819x;

    /* renamed from: z, reason: collision with root package name */
    public int f231821z;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f231820y = "";
    public final java.util.Map A = new java.util.LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v11, types: [android.widget.ImageView] */
    /* JADX WARN: Type inference failed for: r7v9, types: [android.view.View] */
    public static final void x(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.h hVar) {
        java.util.List list;
        java.util.Map map;
        int i17;
        android.view.View view = hVar.f382769e;
        if (view != null) {
            android.widget.GridLayout gridLayout = (android.widget.GridLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567703kg2);
            com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a c11142xe8e5c41a = hVar.f231819x;
            if (c11142xe8e5c41a == null || (list = c11142xe8e5c41a.f153144i) == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str = ((com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54) it.next()).f153145d;
                if (str == null) {
                    str = "";
                }
                arrayList.add(str);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                if (true ^ p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) next, hVar.f231820y)) {
                    arrayList2.add(next);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it7 = arrayList2.iterator();
            while (true) {
                boolean hasNext = it7.hasNext();
                map = hVar.A;
                if (!hasNext) {
                    break;
                }
                java.lang.String str2 = (java.lang.String) it7.next();
                java.lang.Object obj = (android.view.View) ((java.util.LinkedHashMap) map).get(str2);
                if (obj == 0) {
                    obj = new android.widget.ImageView(view.getContext());
                    ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(obj, str2, null);
                }
                arrayList3.add(new jz5.l(str2, obj));
            }
            java.util.Map q17 = kz5.c1.q(arrayList3);
            ((java.util.LinkedHashMap) map).clear();
            map.putAll(q17);
            gridLayout.removeAllViews();
            if (arrayList2.size() > 13) {
                hVar.w();
                i17 = 2;
            } else {
                hVar.w();
                i17 = 1;
            }
            gridLayout.setRowCount(i17);
            int i18 = (int) ((gridLayout.getResources().getDisplayMetrics().density * 2) + 0.5f);
            int i19 = (hVar.f231821z - ((i18 * 2) * 13)) / 13;
            if (i19 <= 0) {
                return;
            }
            java.util.Iterator it8 = ((java.util.LinkedHashMap) map).entrySet().iterator();
            int i27 = 0;
            while (it8.hasNext()) {
                android.view.View view2 = (android.view.View) ((java.util.Map.Entry) it8.next()).getValue();
                android.widget.GridLayout.LayoutParams layoutParams = i27 < 13 ? new android.widget.GridLayout.LayoutParams(android.widget.GridLayout.spec(0, 1), android.widget.GridLayout.spec(i27, 1)) : new android.widget.GridLayout.LayoutParams(android.widget.GridLayout.spec(1, 1), android.widget.GridLayout.spec(i27 - 13, 1));
                layoutParams.setMargins(i18, i18, i18, i18);
                layoutParams.setGravity(8388659);
                layoutParams.width = i19;
                layoutParams.height = i19;
                gridLayout.addView(view2, layoutParams);
                i27++;
            }
        }
    }

    @Override // jq4.z0
    public java.lang.String a() {
        java.util.List list;
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
        stringBuffer.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f574122h23));
        com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a c11142xe8e5c41a = this.f231819x;
        if (c11142xe8e5c41a != null && (list = c11142xe8e5c41a.f153144i) != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String str = ((com.p314xaae8f345.mm.p960xd6a841b0.C11143x170c3f54) it.next()).f153145d;
                if (str == null) {
                    str = "";
                }
                arrayList.add(str);
            }
            java.util.ArrayList<java.lang.String> arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : arrayList) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) obj, this.f231820y)) {
                    arrayList2.add(obj);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            for (java.lang.String str2 : arrayList2) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                sb6.append(((tg3.v0) i95.n0.c(tg3.v0.class)) != null ? c01.a2.e(str2) : null);
                sb6.append(',');
                stringBuffer.append(sb6.toString());
                arrayList3.add(stringBuffer);
            }
        }
        return super.a() + ((java.lang.Object) stringBuffer);
    }

    @Override // jq4.z0
    public void b(boolean z17, boolean z18, boolean z19) {
        super.b(z17, z18, z19);
        ((java.util.LinkedHashMap) this.A).clear();
        this.f231819x = null;
        this.f231820y = "";
    }

    @Override // jq4.z0
    public int d() {
        return com.p314xaae8f345.mm.R.C30861xcebc809e.f562252b0;
    }

    @Override // jq4.z0
    public int f() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.h1x;
    }

    @Override // jq4.z0
    public void h() {
        super.h();
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.b(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(bVar, 200L, false);
    }

    @Override // jq4.z0
    public void i(android.content.Intent intent, java.lang.String toUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
        super.i(intent, toUser);
        this.f231820y = toUser;
        android.view.View view = this.f382769e;
        if (view != null) {
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f567702kg1);
            textView.setVisibility(0);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f574121h22);
            android.widget.GridLayout gridLayout = (android.widget.GridLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567703kg2);
            gridLayout.setVisibility(0);
            gridLayout.setColumnCount(13);
            view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.c(this, gridLayout));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().I();
    }

    @Override // jq4.z0
    public void k(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        jq4.z0.c(this, false, false, false, 4, null);
        android.view.View view = this.f382769e;
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.d dVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.d(this, view);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(dVar, 200L, false);
        rq4.s.f480631a.a(this.f382771g, 4, 3);
    }

    @Override // jq4.z0
    public void l() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.a aVar = this.f231818w;
        if (aVar == null || ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.j1) aVar).f231552a.f231693J == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, "close");
        ((mx3.u) ((mx3.j) i95.n0.c(mx3.j.class))).Bi(mx3.i.MULTITALK, bundle);
    }

    @Override // jq4.z0
    public void o() {
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.e eVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.e(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(eVar, 200L, false);
        rq4.s.f480631a.a(this.f382771g, 2, 3);
    }

    @Override // jq4.z0
    public void p(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a c11142xe8e5c41a = this.f231819x;
        jq4.z0.c(this, false, false, false, 6, null);
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.f fVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.f(c11142xe8e5c41a, this, intent);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(fVar, 200L, false);
        rq4.s.f480631a.a(this.f382771g, 1, 3);
    }

    @Override // jq4.z0
    public void q() {
    }

    @Override // jq4.z0
    public void r() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.a aVar = this.f231818w;
        if (aVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.j1) aVar).f231552a.f(true, false);
        }
        rq4.s.f480631a.a(this.f382771g, 3, 3);
    }
}
