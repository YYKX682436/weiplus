package ck1;

/* loaded from: classes4.dex */
public final class k0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage f42338d;

    /* renamed from: e, reason: collision with root package name */
    public ck1.p f42339e;

    /* renamed from: f, reason: collision with root package name */
    public final ck1.i0 f42340f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Boolean f42341g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f42342h;

    /* renamed from: i, reason: collision with root package name */
    public android.app.Dialog f42343i;

    public k0(com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage host, ck1.q titleHeightMeasureListener) {
        kotlin.jvm.internal.o.g(host, "host");
        kotlin.jvm.internal.o.g(titleHeightMeasureListener, "titleHeightMeasureListener");
        this.f42338d = host;
        this.f42340f = new ck1.i0(titleHeightMeasureListener);
        host.l0().f42375f.observe(host.getViewLifecycleOwner(), new ck1.r(this));
        host.l0().f42377h.observe(host.getViewLifecycleOwner(), new ck1.s(this));
        host.l0().f42379m.observe(host.getViewLifecycleOwner(), new ck1.t(this));
    }

    public static final void x(ck1.k0 k0Var, android.view.MenuItem menuItem, yz5.a aVar) {
        k0Var.getClass();
        if ((menuItem != null && menuItem.getGroupId() == 0) && menuItem.getItemId() == 0) {
            aVar.invoke();
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onRevokeMenuClick, not revoke menu");
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        ck1.p pVar = this.f42339e;
        if (pVar != null) {
            return pVar.f42360a;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        try {
            ck1.p pVar = this.f42339e;
            if (pVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "getItemViewType, curUsageInfo is null");
                return super.getItemViewType(i17);
            }
            java.lang.Object obj = pVar.f42361b.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            ck1.o oVar = (ck1.o) obj;
            if (oVar instanceof ck1.l) {
                return 0;
            }
            if (oVar instanceof ck1.n) {
                return 1;
            }
            if (oVar instanceof ck1.m) {
                return 2;
            }
            throw new jz5.j();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "getItemViewType, position: " + i17 + " fail since " + e17);
            return super.getItemViewType(i17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [ck1.l0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r1v13, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v15, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r1v20, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v26, types: [ck1.l0, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v28, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [android.view.View, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v38, types: [android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r1v39, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v18, types: [ck1.w, rl5.r, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v6, types: [ck1.g0, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        int i18 = i17;
        ck1.y0 holder = (ck1.y0) k3Var;
        ?? r37 = "MicroMsg.AppBrandUserInfoRevokePage";
        kotlin.jvm.internal.o.g(holder, "holder");
        try {
            ck1.p pVar = this.f42339e;
            if (pVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onBindViewHolder, curUsageInfo is null");
                i18 = i18;
                r37 = r37;
            } else {
                java.lang.Object obj = pVar.f42361b.get(i18);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                ck1.o oVar = (ck1.o) obj;
                if (!(holder instanceof ck1.u0)) {
                    boolean z17 = holder instanceof ck1.x0;
                    com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage appBrandUserInfoRevokePage = this.f42338d;
                    if (!z17) {
                        int i19 = com.tencent.mm.R.string.a5b;
                        if (!(holder instanceof ck1.w0)) {
                            ?? r17 = holder instanceof ck1.v0;
                            i18 = r17;
                            r37 = r37;
                            if (r17 != 0) {
                                ?? r18 = (ck1.l0) appBrandUserInfoRevokePage.l0().f42377h.getValue();
                                if (r18 == 0) {
                                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onBindViewHolder, pageMode is null");
                                    i18 = r18;
                                    r37 = r37;
                                } else {
                                    android.widget.Button button = ((ck1.v0) holder).f42391d;
                                    if (button != null) {
                                        int ordinal = r18.ordinal();
                                        if (ordinal != 0) {
                                            if (ordinal != 1) {
                                                throw new jz5.j();
                                            }
                                            i19 = com.tencent.mm.R.string.a5c;
                                        }
                                        button.setText(i19);
                                    }
                                    if (button != null) {
                                        button.setOnClickListener(new ck1.f0(this));
                                    }
                                    ?? r19 = this.f42341g;
                                    i18 = r19;
                                    i18 = r19;
                                    r37 = button;
                                    r37 = button;
                                    if (!this.f42342h && r19 != 0) {
                                        ?? booleanValue = r19.booleanValue();
                                        int i27 = booleanValue;
                                        android.widget.Button button2 = button;
                                        if (booleanValue != 0) {
                                            ?? r110 = holder.itemView;
                                            ?? g0Var = new ck1.g0(holder, this);
                                            r110.post(g0Var);
                                            i27 = r110;
                                            button2 = g0Var;
                                        } else if (button != null) {
                                            button.setVisibility(0);
                                            i27 = booleanValue;
                                            button2 = button;
                                        }
                                        this.f42342h = true;
                                        i18 = i27;
                                        r37 = button2;
                                    }
                                }
                            }
                        } else if (oVar instanceof ck1.m) {
                            ?? r111 = ((ck1.w0) holder).f42393d;
                            i18 = r111;
                            r37 = r37;
                            if (r111 != 0) {
                                r37 = 2131756627;
                                r111.setText(appBrandUserInfoRevokePage.getString(com.tencent.mm.R.string.a5d, ((ck1.m) oVar).f42348a));
                                i18 = r111;
                            }
                        } else {
                            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onBindViewHolder, flattenedItem is not PluginTitle");
                            i18 = "onBindViewHolder, flattenedItem is not PluginTitle";
                            r37 = r37;
                        }
                    } else if (oVar instanceof ck1.n) {
                        ?? r112 = (ck1.l0) appBrandUserInfoRevokePage.l0().f42377h.getValue();
                        if (r112 == 0) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onBindViewHolder, pageMode is null");
                            i18 = r112;
                            r37 = r37;
                        } else {
                            ck1.h0 h0Var = new ck1.h0(this, oVar);
                            ck1.x0 x0Var = (ck1.x0) holder;
                            android.widget.TextView textView = x0Var.f42396e;
                            if (textView != null) {
                                textView.setText(((ck1.n) oVar).f42353a.f42383c.f378980e);
                            }
                            ck1.t0 t0Var = ((ck1.n) oVar).f42353a;
                            java.lang.String str = t0Var.f42383c.f378984i;
                            boolean z18 = str == null || str.length() == 0;
                            r45.kv5 kv5Var = t0Var.f42383c;
                            android.widget.TextView textView2 = x0Var.f42397f;
                            if (!z18) {
                                if (textView2 != null) {
                                    textView2.setText(kv5Var.f378984i);
                                }
                                if (textView2 != null) {
                                    textView2.setVisibility(0);
                                }
                            } else if (textView2 != null) {
                                textView2.setVisibility(8);
                            }
                            android.widget.TextView textView3 = x0Var.f42398g;
                            if (textView3 != null) {
                                textView3.setVisibility(7 == kv5Var.f378981f ? 0 : 8);
                            }
                            android.widget.ImageView imageView = x0Var.f42395d;
                            if (imageView != null) {
                                imageView.setPadding(0, 0, 0, 0);
                                kotlinx.coroutines.l.d(androidx.lifecycle.z.a(appBrandUserInfoRevokePage), null, null, new ck1.d0(oVar, holder, null), 3, null);
                                imageView.setImportantForAccessibility(2);
                            }
                            ck1.l0 l0Var = (ck1.l0) appBrandUserInfoRevokePage.l0().f42377h.getValue();
                            if (l0Var == null) {
                                com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onBindViewHolder, pageMode is null");
                            } else {
                                android.widget.Button button3 = appBrandUserInfoRevokePage.f89934f;
                                if (button3 != null) {
                                    button3.setVisibility(0);
                                }
                                int ordinal2 = l0Var.ordinal();
                                if (ordinal2 == 0) {
                                    android.widget.Button button4 = appBrandUserInfoRevokePage.f89934f;
                                    if (button4 != null) {
                                        button4.setText(com.tencent.mm.R.string.a5b);
                                    }
                                    android.widget.Button button5 = appBrandUserInfoRevokePage.f89934f;
                                    if (button5 != null) {
                                        button5.setBackgroundResource(com.tencent.mm.R.drawable.f481068jy);
                                    }
                                    android.widget.Button button6 = appBrandUserInfoRevokePage.f89934f;
                                    if (button6 != null) {
                                        button6.setTextColor(b3.l.getColorStateList(ak1.f.d(appBrandUserInfoRevokePage), com.tencent.mm.R.color.aax));
                                    }
                                } else if (ordinal2 == 1) {
                                    android.widget.Button button7 = appBrandUserInfoRevokePage.f89934f;
                                    if (button7 != null) {
                                        button7.setText(com.tencent.mm.R.string.a5c);
                                    }
                                    android.widget.Button button8 = appBrandUserInfoRevokePage.f89934f;
                                    if (button8 != null) {
                                        button8.setBackgroundResource(com.tencent.mm.R.drawable.f481057jk);
                                    }
                                    android.widget.Button button9 = appBrandUserInfoRevokePage.f89934f;
                                    if (button9 != null) {
                                        button9.setTextColor(b3.l.getColorStateList(ak1.f.d(appBrandUserInfoRevokePage), com.tencent.mm.R.color.f478838io));
                                    }
                                }
                                android.widget.Button button10 = appBrandUserInfoRevokePage.f89934f;
                                if (button10 != null) {
                                    button10.setOnClickListener(new ck1.j0(this));
                                }
                            }
                            int ordinal3 = r112.ordinal();
                            java.lang.String str2 = "itemView";
                            android.widget.LinearLayout linearLayout = x0Var.f42399h;
                            i18 = ordinal3;
                            r37 = str2;
                            if (ordinal3 == 0) {
                                if (linearLayout != null) {
                                    linearLayout.setVisibility(8);
                                }
                                ?? itemView = holder.itemView;
                                kotlin.jvm.internal.o.f(itemView, "itemView");
                                ?? wVar = new ck1.w(itemView, itemView.getContext());
                                wVar.j(itemView, new ck1.u(this), new ck1.v(this, h0Var));
                                itemView.setTag(wVar);
                                i18 = itemView;
                                r37 = wVar;
                            } else if (ordinal3 == 1) {
                                if (7 != kv5Var.f378981f) {
                                    if (linearLayout != null) {
                                        linearLayout.setVisibility(0);
                                    }
                                    android.widget.Button button11 = x0Var.f42400i;
                                    if (button11 != null) {
                                        button11.setOnClickListener(new ck1.e0(h0Var));
                                    }
                                } else if (linearLayout != null) {
                                    linearLayout.setVisibility(8);
                                }
                                ?? itemView2 = holder.itemView;
                                kotlin.jvm.internal.o.f(itemView2, "itemView");
                                boolean z19 = itemView2.getTag() instanceof rl5.r;
                                i18 = itemView2;
                                r37 = str2;
                                if (z19) {
                                    itemView2.setOnTouchListener(null);
                                    itemView2.setOnLongClickListener(null);
                                    itemView2.setLongClickable(false);
                                    i18 = itemView2;
                                    r37 = str2;
                                }
                            }
                        }
                    } else {
                        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onBindViewHolder, flattenedItem is not UserInfo");
                        i18 = "onBindViewHolder, flattenedItem is not UserInfo";
                        r37 = r37;
                    }
                } else if (oVar instanceof ck1.l) {
                    ck1.u0 u0Var = (ck1.u0) holder;
                    android.widget.ImageView imageView2 = u0Var.f42386e;
                    if (imageView2 != null) {
                        l01.d0.f314761a.b(imageView2, ((ck1.l) oVar).f42344a.f388195f, l01.a.h(), l01.q0.f314787d);
                    }
                    android.widget.TextView textView4 = u0Var.f42387f;
                    if (textView4 != null) {
                        textView4.setText(((ck1.l) oVar).f42344a.f388194e);
                        textView4.post(new ck1.a0(holder));
                    }
                    ?? r113 = u0Var.f42388g;
                    i18 = r113;
                    r37 = textView4;
                    if (r113 != 0) {
                        ck1.c0 c0Var = new ck1.c0(this, holder);
                        r113.post(c0Var);
                        i18 = r113;
                        r37 = c0Var;
                    }
                } else {
                    com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onBindViewHolder, flattenedItem is not header");
                    i18 = "onBindViewHolder, flattenedItem is not header";
                    r37 = r37;
                }
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.w(r37, "onBindViewHolder, position: " + i18 + ", flattenedItem is null");
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 0) {
            return new ck1.u0(parent);
        }
        if (i17 == 1) {
            return new ck1.x0(parent);
        }
        if (i17 == 2) {
            return new ck1.w0(parent);
        }
        if (i17 == 3) {
            return new ck1.v0(parent);
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onCreateViewHolder, viewType: " + i17 + ", are you kidding me?");
        return new ck1.x0(parent);
    }
}
