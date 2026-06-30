package ox3;

/* loaded from: classes10.dex */
public final class e extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public ox3.b f431271e;

    @Override // in5.r
    public in5.s0 d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, android.view.View convertView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convertView, "convertView");
        return new ox3.c(this, convertView);
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.clc;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        vx3.i d17;
        android.content.res.Resources resources;
        android.content.res.Resources resources2;
        ox3.a exclusive = (ox3.a) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(exclusive, "exclusive");
        if (holder instanceof ox3.c) {
            if (!(list == null || list.isEmpty())) {
                ox3.c cVar2 = (ox3.c) holder;
                java.lang.Object obj = list.get(0);
                java.lang.Boolean bool = obj instanceof java.lang.Boolean ? (java.lang.Boolean) obj : null;
                n(cVar2, bool != null ? bool.booleanValue() : false, exclusive);
                return;
            }
            ox3.c cVar3 = (ox3.c) holder;
            t45.i iVar = exclusive.f431254d;
            java.lang.String str = iVar.f497121d;
            if (str != null) {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Di(cVar3.f431263p, str);
                ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
                cVar3.f431262o.setText(c01.a2.e(str));
                android.content.Context context = cVar3.f3639x46306858.getContext();
                android.content.Context context2 = cVar3.f3639x46306858.getContext();
                int i19 = -16777216;
                android.graphics.drawable.Drawable e17 = com.p314xaae8f345.mm.ui.uk.e(context, com.p314xaae8f345.mm.R.raw.f79813xc8512e6d, (context2 == null || (resources2 = context2.getResources()) == null) ? -16777216 : resources2.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = cVar3.f431264q;
                c22699x3dcdb352.setImageDrawable(e17);
                android.content.Context context3 = cVar3.f3639x46306858.getContext();
                if (context3 != null && (resources = context3.getResources()) != null) {
                    i19 = resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
                }
                c22699x3dcdb352.m82040x7541828(i19);
                c22699x3dcdb352.setOnClickListener(new ox3.d(this, exclusive, cVar3));
            }
            java.lang.String str2 = iVar.f497121d;
            if (str2 != null && ((d17 = mx3.i0.d(str2)) != null || (d17 = qx3.b.a(str2.hashCode())) != null)) {
                android.widget.TextView textView = (android.widget.TextView) cVar3.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.diq);
                android.widget.ImageView imageView = (android.widget.ImageView) cVar3.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.m4s);
                cy3.u uVar = cVar3.f431261n;
                uVar.getClass();
                uVar.f306386d = d17;
                int i27 = d17.j() ? com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl : com.p314xaae8f345.mm.R.C30860x5b28f31.f561476jp;
                android.content.Context context4 = uVar.f306385c;
                int h17 = i65.a.h(context4, i27);
                com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = uVar.f306383a;
                c16077xb54fe366.setPadding(h17, h17, h17, h17);
                int i28 = d17.j() ? com.p314xaae8f345.mm.R.raw.f79905x9403a955 : com.p314xaae8f345.mm.R.raw.f79893x1d35d59a;
                uVar.f306384b = i28;
                c16077xb54fe366.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context4, i28, context4.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832)));
                if (d17.f522830n) {
                    if (textView != null) {
                        textView.setText(i65.a.r(cVar3.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.i3f));
                    }
                    if (textView != null) {
                        textView.setTextColor(i65.a.d(cVar3.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77768x20e836));
                    }
                    if (imageView != null) {
                        android.content.Context context5 = cVar3.f3639x46306858.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context5, "getContext(...)");
                        int d18 = i65.a.d(context5, com.p314xaae8f345.mm.R.C30859x5a72f63.a38);
                        android.graphics.drawable.Drawable mutate = i65.a.i(context5, com.p314xaae8f345.mm.R.raw.f79723x416541f0).mutate();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mutate, "mutate(...)");
                        mutate.setColorFilter(new android.graphics.PorterDuffColorFilter(android.graphics.Color.argb(android.graphics.Color.alpha(d18), android.graphics.Color.red(d18), android.graphics.Color.green(d18), android.graphics.Color.blue(d18)), android.graphics.PorterDuff.Mode.SRC_ATOP));
                        mutate.setAlpha(android.graphics.Color.alpha(d18));
                        imageView.setImageDrawable(mutate);
                    }
                    uVar.a(false);
                } else {
                    if (d17.j()) {
                        if (textView != null) {
                            textView.setText(d17.f522824h);
                        }
                    } else if (textView != null) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        java.lang.String str3 = d17.f522824h;
                        if (str3 == null) {
                            str3 = "";
                        }
                        sb6.append(str3);
                        sb6.append(" - ");
                        java.lang.String str4 = d17.f522826j;
                        sb6.append(str4 != null ? str4 : "");
                        textView.setText(sb6.toString());
                    }
                    if (textView != null) {
                        textView.setTextColor(i65.a.d(cVar3.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                    }
                    if (imageView != null) {
                        android.content.Context context6 = cVar3.f3639x46306858.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context6, "getContext(...)");
                        int d19 = i65.a.d(context6, com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832);
                        android.graphics.drawable.Drawable mutate2 = i65.a.i(context6, com.p314xaae8f345.mm.R.raw.f79893x1d35d59a).mutate();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mutate2, "mutate(...)");
                        mutate2.setColorFilter(new android.graphics.PorterDuffColorFilter(android.graphics.Color.argb(android.graphics.Color.alpha(d19), android.graphics.Color.red(d19), android.graphics.Color.green(d19), android.graphics.Color.blue(d19)), android.graphics.PorterDuff.Mode.SRC_ATOP));
                        mutate2.setAlpha(android.graphics.Color.alpha(d19));
                        imageView.setImageDrawable(mutate2);
                    }
                    uVar.a(true);
                }
            }
            n(cVar3, exclusive.f431255e, exclusive);
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }

    public final void n(ox3.c cVar, boolean z17, ox3.a aVar) {
        aVar.getClass();
        if (!z17) {
            cy3.u uVar = cVar.f431261n;
            int i17 = uVar.f306384b;
            android.content.Context context = uVar.f306385c;
            uVar.f306383a.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(context, i17, context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832)));
            return;
        }
        cy3.u uVar2 = cVar.f431261n;
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = uVar2.f306383a;
        if (c16077xb54fe366.r()) {
            return;
        }
        vx3.i iVar = uVar2.f306386d;
        if ((iVar == null || iVar.j()) ? false : true) {
            c16077xb54fe366.m64938x75cc54fa(mx3.f0.f(true));
            c16077xb54fe366.x();
        }
    }
}
