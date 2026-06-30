package gt4;

/* loaded from: classes14.dex */
public final class a1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f356919d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f356920e;

    /* renamed from: f, reason: collision with root package name */
    public int f356921f;

    /* renamed from: g, reason: collision with root package name */
    public int f356922g;

    /* renamed from: h, reason: collision with root package name */
    public int f356923h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f356924i;

    /* renamed from: m, reason: collision with root package name */
    public int f356925m;

    /* renamed from: n, reason: collision with root package name */
    public final float f356926n;

    /* renamed from: o, reason: collision with root package name */
    public final int f356927o;

    /* renamed from: p, reason: collision with root package name */
    public gt4.w0 f356928p;

    public a1(android.content.Context context, java.util.List data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f356919d = context;
        this.f356920e = data;
        this.f356924i = new java.util.LinkedHashMap();
        this.f356926n = 48.0f;
        this.f356927o = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.t(java.lang.System.currentTimeMillis());
        int c17 = i65.a.c(context, com.p314xaae8f345.mm.ui.bk.g());
        float f17 = (c17 - (2 * 22.0f)) / 7;
        this.f356926n = f17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletLedgerPersonAdapter", "screenWidth " + c17 + " space 22.0 itemWidth " + f17);
        if (f17 > 48.0f) {
            this.f356926n = 48.0f;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f356920e.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        return ((gt4.j1) this.f356920e.get(i17)).f356989a;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        java.util.Iterator it;
        int i18;
        float f17;
        java.lang.String string;
        java.util.LinkedHashMap linkedHashMap;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        boolean z17 = holder instanceof gt4.v0;
        float f18 = this.f356926n;
        android.content.Context context = this.f356919d;
        if (!z17) {
            if (holder instanceof gt4.x0) {
                ((gt4.x0) holder).f357107e.getLayoutParams().width = i65.a.a(context, f18) * 7;
                return;
            }
            if (holder instanceof gt4.t0) {
                gt4.j1 j1Var = (gt4.j1) this.f356920e.get(i17);
                gt4.t0 t0Var = (gt4.t0) holder;
                android.widget.TextView textView = t0Var.f357091f;
                textView.setTextSize(1, 22.0f);
                java.util.Calendar calendar = java.util.Calendar.getInstance();
                int i19 = j1Var.f356992d;
                calendar.set(i19 / 100, (i19 % 100) - 1, 1);
                java.lang.String format = new java.text.SimpleDateFormat(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lgo)).format(new java.util.Date(calendar.getTimeInMillis()));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
                textView.setText(r26.i0.t(format, " ", "  ", false));
                t0Var.f357090e.setOnClickListener(new gt4.y0(this));
                return;
            }
            return;
        }
        gt4.j1 j1Var2 = (gt4.j1) this.f356920e.get(i17);
        gt4.v0 v0Var = (gt4.v0) holder;
        int size = this.f356920e.size() - 1;
        android.view.View view = v0Var.f357101d;
        if (i17 == size) {
            view.setPadding(0, 0, 0, i65.a.b(context, this.f356925m));
        } else {
            view.setPadding(0, 0, 0, 0);
        }
        java.util.Iterator it6 = j1Var2.f356993e.iterator();
        int i27 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i28 = i27 + 1;
            if (i27 < 0) {
                kz5.c0.p();
                throw null;
            }
            gt4.k1 k1Var = (gt4.k1) next;
            java.util.List list = v0Var.f357102e;
            gt4.u0 u0Var = (gt4.u0) ((java.util.ArrayList) list).get(i27);
            u0Var.f357094e.getLayoutParams().width = i65.a.a(context, f18);
            android.widget.RelativeLayout relativeLayout = u0Var.f357094e;
            relativeLayout.getLayoutParams().height = i65.a.a(context, f18);
            android.widget.TextView textView2 = u0Var.f357095f;
            gt4.v0 v0Var2 = v0Var;
            textView2.setTextSize(1, 17.0f);
            int i29 = k1Var.f356997a;
            if (i29 <= 0) {
                android.view.View view2 = u0Var.f357093d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(4);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter", "updateItem", "(Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter$ItemViewHolder;ILcom/tencent/mm/plugin/wallet_core/ui/view/WalletPickerDate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter", "updateItem", "(Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter$ItemViewHolder;ILcom/tencent/mm/plugin/wallet_core/ui/view/WalletPickerDate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f17 = f18;
                it = it6;
                i18 = i28;
            } else {
                int i37 = this.f356923h;
                it = it6;
                java.util.Map map = this.f356924i;
                i18 = i28;
                if (i29 < i37) {
                    java.util.Calendar calendar2 = java.util.Calendar.getInstance();
                    int i38 = k1Var.f356997a;
                    f17 = f18;
                    calendar2.set(i38 / 10000, ((i38 % 10000) / 100) - 1, 1);
                    calendar2.add(2, -2);
                    int t17 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.t(calendar2.getTimeInMillis());
                    gt4.w0 w0Var = this.f356928p;
                    if (w0Var != null) {
                        int i39 = this.f356923h;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletComplexDatePicker", "getDotMap start:" + t17 + " end:" + i39);
                        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                        gt4.y yVar = ((gt4.p0) w0Var).f357028a.L;
                        java.util.Map a17 = yVar != null ? yVar.a(t17, i39) : null;
                        if (a17 != null && (!a17.isEmpty())) {
                            linkedHashMap2.putAll(a17);
                        }
                        linkedHashMap = linkedHashMap2;
                    } else {
                        linkedHashMap = null;
                    }
                    this.f356923h = t17;
                    if (linkedHashMap != null) {
                        map.putAll(linkedHashMap);
                    }
                } else {
                    f17 = f18;
                }
                android.view.View view3 = ((gt4.u0) ((java.util.ArrayList) list).get(i27)).f357093d;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter", "updateItem", "(Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter$ItemViewHolder;ILcom/tencent/mm/plugin/wallet_core/ui/view/WalletPickerDate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter", "updateItem", "(Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter$ItemViewHolder;ILcom/tencent/mm/plugin/wallet_core/ui/view/WalletPickerDate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view4 = u0Var.f357096g;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(4);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter", "updateItem", "(Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter$ItemViewHolder;ILcom/tencent/mm/plugin/wallet_core/ui/view/WalletPickerDate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(view4, "com/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter", "updateItem", "(Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter$ItemViewHolder;ILcom/tencent/mm/plugin/wallet_core/ui/view/WalletPickerDate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.widget.TextView textView3 = u0Var.f357097h;
                textView3.setVisibility(4);
                textView3.setTextSize(1, 10.0f);
                int i47 = k1Var.f356997a;
                int i48 = this.f356927o;
                if (i47 == i48) {
                    textView3.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fd_));
                    textView3.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833));
                    textView3.setVisibility(0);
                }
                com.p314xaae8f345.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
                textView2.setText(java.lang.String.valueOf(k1Var.f356997a % 100));
                if (k1Var.f356997a > i48) {
                    relativeLayout.setImportantForAccessibility(2);
                    textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
                } else {
                    relativeLayout.setImportantForAccessibility(1);
                    textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                    if (map.containsKey(java.lang.Integer.valueOf(k1Var.f356997a))) {
                        android.view.View view5 = u0Var.f357096g;
                        java.util.ArrayList arrayList4 = new java.util.ArrayList();
                        arrayList4.add(0);
                        java.util.Collections.reverse(arrayList4);
                        yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter", "updateItem", "(Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter$ItemViewHolder;ILcom/tencent/mm/plugin/wallet_core/ui/view/WalletPickerDate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                        yj0.a.f(view5, "com/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter", "updateItem", "(Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter$ItemViewHolder;ILcom/tencent/mm/plugin/wallet_core/ui/view/WalletPickerDate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    } else {
                        android.view.View view6 = u0Var.f357096g;
                        java.util.ArrayList arrayList5 = new java.util.ArrayList();
                        arrayList5.add(8);
                        java.util.Collections.reverse(arrayList5);
                        yj0.a.d(view6, arrayList5.toArray(), "com/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter", "updateItem", "(Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter$ItemViewHolder;ILcom/tencent/mm/plugin/wallet_core/ui/view/WalletPickerDate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view6.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
                        yj0.a.f(view6, "com/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter", "updateItem", "(Lcom/tencent/mm/plugin/wallet_core/ui/view/WalletDatePickerAdapter$ItemViewHolder;ILcom/tencent/mm/plugin/wallet_core/ui/view/WalletPickerDate;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    }
                }
                relativeLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563723b84);
                int i49 = this.f356921f;
                if (i49 > 0) {
                    int i57 = this.f356922g;
                    if (i57 > 0) {
                        int i58 = k1Var.f356997a;
                        if (i49 == i58) {
                            if (i49 == i57) {
                                x(u0Var, 4, i27, j1Var2);
                            } else {
                                x(u0Var, 2, i27, j1Var2);
                            }
                        } else if (i57 == i58) {
                            x(u0Var, 3, i27, j1Var2);
                        } else {
                            if (i49 + 1 <= i58 && i58 < i57) {
                                x(u0Var, 5, i27, j1Var2);
                            }
                        }
                    } else if (i49 == k1Var.f356997a) {
                        x(u0Var, 1, i27, j1Var2);
                    }
                }
                if (map.containsKey(java.lang.Integer.valueOf(k1Var.f356997a))) {
                    string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m2c, textView2.getText());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                } else {
                    string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m2d, textView2.getText());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                }
                relativeLayout.setContentDescription(string + ", " + ((java.lang.Object) textView3.getText()));
                relativeLayout.setOnClickListener(new gt4.z0(k1Var, this, i17, u0Var));
            }
            v0Var = v0Var2;
            it6 = it;
            i27 = i18;
            f18 = f17;
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dgq, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new gt4.t0(inflate);
        }
        if (i17 == 2) {
            android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dgr, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate2, "inflate(...)");
            return new gt4.x0(inflate2);
        }
        if (i17 != 3) {
            android.view.View inflate3 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ddt, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate3, "inflate(...)");
            return new gt4.v0(inflate3);
        }
        android.view.View inflate4 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ddt, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate4, "inflate(...)");
        return new gt4.v0(inflate4);
    }

    public final void x(gt4.u0 u0Var, int i17, int i18, gt4.j1 j1Var) {
        boolean z17 = false;
        android.content.Context context = this.f356919d;
        if (i17 == 1) {
            u0Var.f357094e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ckp);
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lgp);
            android.widget.TextView textView = u0Var.f357097h;
            textView.setText(string);
            textView.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            textView.setVisibility(0);
            return;
        }
        if (i17 == 2) {
            if (i18 >= 6 || ((gt4.k1) j1Var.f356993e.get(i18 + 1)).f356997a == 0) {
                u0Var.f357094e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ckp);
            } else {
                u0Var.f357094e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cko);
            }
            u0Var.f357097h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lgp));
            int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m);
            android.widget.TextView textView2 = u0Var.f357097h;
            textView2.setTextColor(color);
            textView2.setVisibility(0);
            return;
        }
        if (i17 == 3) {
            if (i18 <= 0 || ((gt4.k1) j1Var.f356993e.get(i18 - 1)).f356997a == 0) {
                u0Var.f357094e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ckp);
            } else {
                u0Var.f357094e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ckj);
            }
            u0Var.f357097h.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lgm));
            int color2 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m);
            android.widget.TextView textView3 = u0Var.f357097h;
            textView3.setTextColor(color2);
            textView3.setVisibility(0);
            return;
        }
        if (i17 == 4) {
            u0Var.f357094e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ckp);
            java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lgq);
            android.widget.TextView textView4 = u0Var.f357097h;
            textView4.setText(string2);
            textView4.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            textView4.setVisibility(0);
            return;
        }
        if (i17 != 5) {
            return;
        }
        if (i18 == 0) {
            if (((gt4.k1) j1Var.f356993e.get(i18 + 1)).f356997a == 0) {
                u0Var.f357094e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ckp);
                return;
            } else {
                u0Var.f357094e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cko);
                return;
            }
        }
        if (1 <= i18 && i18 < 6) {
            z17 = true;
        }
        if (!z17) {
            if (i18 == 6) {
                if (((gt4.k1) j1Var.f356993e.get(i18 - 1)).f356997a == 0) {
                    u0Var.f357094e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ckp);
                    return;
                } else {
                    u0Var.f357094e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ckj);
                    return;
                }
            }
            return;
        }
        if (((gt4.k1) j1Var.f356993e.get(i18 - 1)).f356997a == 0) {
            u0Var.f357094e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cko);
        } else if (((gt4.k1) j1Var.f356993e.get(i18 + 1)).f356997a == 0) {
            u0Var.f357094e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ckj);
        } else {
            u0Var.f357094e.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ckl);
        }
    }
}
