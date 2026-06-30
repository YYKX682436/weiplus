package yr3;

/* loaded from: classes11.dex */
public final class b extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.l5 f546253d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f546254e;

    /* renamed from: f, reason: collision with root package name */
    public final wr3.i f546255f;

    /* renamed from: g, reason: collision with root package name */
    public final int f546256g;

    /* renamed from: h, reason: collision with root package name */
    public final wr3.n0 f546257h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f546258i;

    /* renamed from: m, reason: collision with root package name */
    public final int f546259m;

    public b(r45.l5 baseInfo, java.util.ArrayList dataList, wr3.i outAdapter, int i17, wr3.n0 itemStatus, boolean z17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseInfo, "baseInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outAdapter, "outAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemStatus, "itemStatus");
        this.f546253d = baseInfo;
        this.f546254e = dataList;
        this.f546255f = outAdapter;
        this.f546256g = i17;
        this.f546257h = itemStatus;
        this.f546258i = z17;
        this.f546259m = i18;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f546254e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((yr3.c) this.f546254e.get(i17)).f546266a.f546424d;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        boolean z17 = holder instanceof yr3.a;
        java.util.ArrayList arrayList = this.f546254e;
        if (z17) {
            java.lang.Object obj = arrayList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            ((yr3.a) holder).i((yr3.c) obj, i17, this.f546257h, this.f546258i, this.f546259m);
        } else if ((holder instanceof yr3.e) && ((yr3.c) arrayList.get(i17)).f546268c != null) {
            yr3.e eVar = (yr3.e) holder;
            r45.s5 s5Var = ((yr3.c) arrayList.get(i17)).f546268c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(s5Var);
            wr3.n0 itemStatus = this.f546257h;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemStatus, "itemStatus");
            java.lang.String string = eVar.f546315e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.am6);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(s5Var.f467047i.f464287e.size() - 3)}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            ((android.widget.TextView) eVar.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.dy_)).setText(format);
            eVar.f3639x46306858.setOnClickListener(new yr3.d(s5Var, eVar));
        }
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.dyu);
        if (arrayList.size() == 1) {
            if (findViewById != null) {
                findViewById.setPadding(x(16), x(4), x(16), x(20));
            }
        } else if (i17 == 0) {
            if (findViewById != null) {
                findViewById.setPadding(x(16), x(4), x(16), x(16));
            }
        } else {
            if (i17 != arrayList.size() - 1 || findViewById == null) {
                return;
            }
            findViewById.setPadding(x(16), x(16), x(16), x(20));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        yr3.j1 j1Var = yr3.j1.f546412e;
        r45.l5 l5Var = this.f546253d;
        wr3.i iVar = this.f546255f;
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a0m, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new yr3.u0(inflate, iVar, l5Var);
        }
        yr3.j1 j1Var2 = yr3.j1.f546412e;
        if (i17 == 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a0l, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
            return new yr3.t0(inflate2, iVar, l5Var);
        }
        yr3.j1 j1Var3 = yr3.j1.f546412e;
        if (i17 == 7) {
            android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a0i, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate3);
            return new yr3.s0(inflate3, iVar, l5Var);
        }
        yr3.j1 j1Var4 = yr3.j1.f546412e;
        if (i17 == 3) {
            android.view.View inflate4 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a0n, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate4);
            return new yr3.k1(inflate4, iVar, l5Var);
        }
        yr3.j1 j1Var5 = yr3.j1.f546412e;
        if (i17 == 5) {
            android.view.View inflate5 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a0p, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate5);
            return new yr3.o1(inflate5, iVar, l5Var);
        }
        yr3.j1 j1Var6 = yr3.j1.f546412e;
        if (i17 == 4) {
            android.view.View inflate6 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a0q, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate6);
            return new yr3.p1(inflate6, iVar, l5Var);
        }
        yr3.j1 j1Var7 = yr3.j1.f546412e;
        if (i17 == 6) {
            android.view.View inflate7 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a0r, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate7);
            return new yr3.s1(inflate7, iVar, l5Var);
        }
        yr3.j1 j1Var8 = yr3.j1.f546412e;
        if (i17 == 8) {
            android.view.View inflate8 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a0o, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate8);
            return new yr3.n1(inflate8, iVar, l5Var);
        }
        yr3.j1 j1Var9 = yr3.j1.f546412e;
        if (i17 == 9) {
            android.view.View inflate9 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dnn, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate9);
            return new yr3.i1(inflate9, iVar, l5Var);
        }
        yr3.j1 j1Var10 = yr3.j1.f546412e;
        if (i17 == 99) {
            android.view.View inflate10 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a0h, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate10);
            return new yr3.e(inflate10, iVar, this.f546256g);
        }
        yr3.j1 j1Var11 = yr3.j1.f546412e;
        if (i17 == 10) {
            android.view.View inflate11 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dpt, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate11);
            return new yr3.t1(inflate11, iVar, l5Var);
        }
        android.view.View inflate12 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.a0n, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate12);
        return new yr3.k1(inflate12, iVar, l5Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewAttachedToWindow */
    public void mo8160xd8bfd53(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder) {
        r45.s5 s5Var;
        java.util.LinkedList linkedList;
        r45.o5 o5Var;
        java.util.LinkedList linkedList2;
        r45.o5 o5Var2;
        java.util.LinkedList linkedList3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8160xd8bfd53(holder);
        int m8183xf806b362 = holder.m8183xf806b362();
        if (m8183xf806b362 >= 0) {
            java.util.ArrayList arrayList = this.f546254e;
            if (m8183xf806b362 < arrayList.size() && (s5Var = ((yr3.c) arrayList.get(m8183xf806b362)).f546268c) != null) {
                r45.p5 p5Var = s5Var.f467047i;
                if (((p5Var == null || (linkedList3 = p5Var.f464287e) == null) ? 0 : linkedList3.size()) > 0) {
                    wr3.i iVar = this.f546255f;
                    wr3.j jVar = iVar.f530347d;
                    if (((java.util.HashSet) jVar.f530355a).contains(jVar.a(s5Var.f467047i.f464286d.f460671d, java.lang.Integer.valueOf(m8183xf806b362)))) {
                        return;
                    }
                    r45.p5 p5Var2 = s5Var.f467047i;
                    java.lang.Long l17 = null;
                    android.content.Intent intent = null;
                    l17 = null;
                    l17 = null;
                    java.lang.String str = (p5Var2 == null || (linkedList2 = p5Var2.f464287e) == null || (o5Var2 = (r45.o5) linkedList2.get(0)) == null) ? null : o5Var2.f463450h;
                    if (this.f546258i) {
                        gr3.b bVar = gr3.b.f356380a;
                        java.lang.Long valueOf = java.lang.Long.valueOf(s5Var.f467042d.f472323d);
                        r45.p5 p5Var3 = s5Var.f467047i;
                        if (p5Var3 != null && (linkedList = p5Var3.f464287e) != null && (o5Var = (r45.o5) linkedList.get(0)) != null) {
                            l17 = java.lang.Long.valueOf(o5Var.f463449g);
                        }
                        bVar.b(valueOf, l17, 101L, bVar.a(this.f546257h), (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : str, this.f546259m, (r29 & 128) != 0 ? 0 : !iVar.z().n2() ? 1 : 0, (r29 & 256) != 0 ? 0 : 0);
                    } else {
                        java.lang.String d17 = iVar.z().d1();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getUsername(...)");
                        long E = iVar.E();
                        if (iVar.B() instanceof android.app.Activity) {
                            android.content.Context B = iVar.B();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(B, "null cannot be cast to non-null type android.app.Activity");
                            intent = ((android.app.Activity) B).getIntent();
                        }
                        gr3.e.d(d17, 107, E, intent, !iVar.z().n2() ? 1 : 0, 0, 0, str, null, null, 0, 0, 3936, null);
                    }
                    int i17 = s5Var.f467047i.f464286d.f460671d;
                    java.lang.Integer valueOf2 = java.lang.Integer.valueOf(m8183xf806b362);
                    wr3.j jVar2 = iVar.f530347d;
                    ((java.util.HashSet) jVar2.f530355a).add(jVar2.a(i17, valueOf2));
                }
            }
        }
    }

    public final int x(int i17) {
        return i65.a.b(this.f546255f.B(), i17);
    }
}
