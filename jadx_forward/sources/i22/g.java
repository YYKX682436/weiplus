package i22;

/* loaded from: classes15.dex */
public final class g extends i22.m {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f369494f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c.C13370x510fae49 f369495g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f369496h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f369497i;

    /* renamed from: m, reason: collision with root package name */
    public final i22.b f369498m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, android.view.View itemView, i22.p0 p0Var) {
        super(itemView, p0Var);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f369494f = context;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.de9);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f369495g = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c.C13370x510fae49) findViewById;
        this.f369496h = jz5.h.b(new i22.f(this));
        this.f369497i = true;
        this.f369498m = new i22.b();
    }

    @Override // i22.m
    public void i(i22.n0 item, java.util.List payloads) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de;
        int y17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        this.f369536e = item;
        boolean isEmpty = payloads.isEmpty();
        int i17 = -1;
        i22.b bVar2 = this.f369498m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c.C13370x510fae49 c13370x510fae49 = this.f369495g;
        if (isEmpty) {
            i22.a aVar = item instanceof i22.a ? (i22.a) item : null;
            if (aVar == null) {
                return;
            }
            java.util.List list = aVar.f369455a;
            java.util.List list2 = aVar.f369456b;
            android.content.Context context = this.f369494f;
            int dimension = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561915wd);
            h22.f fVar = new h22.f(false, false, false, 0L, 0, 0, 0, 127, null);
            fVar.f359831c = true;
            fVar.f359830b = true;
            fVar.f359834f = dimension;
            fVar.f359829a = true;
            fVar.f359835g = dimension;
            fVar.f359832d = 5000L;
            int dimension2 = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561917wf);
            int dimension3 = (int) context.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561914wc);
            this.f3639x46306858.setBackgroundResource(com.p314xaae8f345.mm.R.C30859x5a72f63.f77698x3cb0744);
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, dimension3);
            layoutParams.setMargins(0, dimension2, 0, 0);
            c13370x510fae49.setLayoutParams(layoutParams);
            if (this.f369497i) {
                c13370x510fae49.b(fVar, j());
                c13370x510fae49.m54866xf757fca9(bVar2);
            }
            j().B(j().y(list, list2));
            this.f369497i = false;
            j().f359822o = true;
            j().f359821n = aVar.f369457c + 10000;
            c13370x510fae49.a(bVar2.f369593b);
            return;
        }
        java.lang.Object obj = payloads.get(payloads.size() - 1);
        if (obj instanceof i22.i) {
            c13370x510fae49.c();
            return;
        }
        if (obj instanceof i22.j) {
            h22.h hVar = c13370x510fae49.f180025h;
            if (hVar != null) {
                hVar.removeCallbacksAndMessages(null);
                return;
            }
            return;
        }
        if (obj instanceof i22.h) {
            h22.c j17 = j();
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager m54861xc38fab14 = c13370x510fae49.m54861xc38fab14();
            int i18 = bVar2.f369593b + 1;
            if (m54861xc38fab14 == null || !j17.f359822o) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(j17.f359816f, "reportExpose18662 failed, recyclerview layoutManager null");
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            if (m54861xc38fab14 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c.C13369xdedd0dff) {
                i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1373xacc57f2c.C13369xdedd0dff) m54861xc38fab14).m();
                for (int i19 = 0; i19 < i18; i19++) {
                    arrayList.add(java.lang.Integer.valueOf((i17 + i19) % j17.mo1894x7e414b06()));
                }
            } else if ((m54861xc38fab14 instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) && (i17 = (c1162x665295de = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) m54861xc38fab14).w()) <= (y17 = c1162x665295de.y())) {
                int i27 = i17;
                while (true) {
                    arrayList.add(java.lang.Integer.valueOf(i27));
                    if (i27 == y17) {
                        break;
                    } else {
                        i27++;
                    }
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder();
            if (!arrayList.isEmpty()) {
                int size = arrayList.size();
                for (int i28 = 0; i28 < size; i28++) {
                    int intValue = ((java.lang.Number) arrayList.get(i28)).intValue();
                    if (intValue < j17.mo1894x7e414b06() && intValue >= 0 && (bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.b) j17.f359815e.get(intValue)) != null) {
                        if (intValue != i17) {
                            sb6.append("#");
                            sb7.append("#");
                            sb8.append("#");
                        }
                        sb6.append(intValue);
                        sb7.append(j22.a.a(bVar));
                        r45.kj0 kj0Var = bVar.f179070a;
                        sb8.append(kj0Var != null ? kj0Var.f460260e : null);
                    }
                }
                int i29 = j17.f359821n;
                java.lang.String sb9 = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb9, "toString(...)");
                java.lang.String sb10 = sb7.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb10, "toString(...)");
                java.lang.String sb11 = sb8.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb11, "toString(...)");
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6419xd51df726 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.b();
                b17.f137609j = i29;
                b17.f137605f = 1;
                b17.f137604e = 1;
                b17.f137603d = j22.a.f378782a;
                b17.p(sb9);
                b17.u(sb10);
                b17.q(sb11);
                b17.k();
            }
        }
    }

    public final h22.c j() {
        return (h22.c) ((jz5.n) this.f369496h).mo141623x754a37bb();
    }
}
