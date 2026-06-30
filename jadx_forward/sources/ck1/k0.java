package ck1;

/* loaded from: classes4.dex */
public final class k0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1206xc84f0e86.C12720x8e4fa2d4 f123871d;

    /* renamed from: e, reason: collision with root package name */
    public ck1.p f123872e;

    /* renamed from: f, reason: collision with root package name */
    public final ck1.i0 f123873f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Boolean f123874g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f123875h;

    /* renamed from: i, reason: collision with root package name */
    public android.app.Dialog f123876i;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1206xc84f0e86.C12720x8e4fa2d4 host, ck1.q titleHeightMeasureListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(titleHeightMeasureListener, "titleHeightMeasureListener");
        this.f123871d = host;
        this.f123873f = new ck1.i0(titleHeightMeasureListener);
        host.l0().f123908f.mo7806x9d92d11c(host.m7475xf3489164(), new ck1.r(this));
        host.l0().f123910h.mo7806x9d92d11c(host.m7475xf3489164(), new ck1.s(this));
        host.l0().f123912m.mo7806x9d92d11c(host.m7475xf3489164(), new ck1.t(this));
    }

    public static final void x(ck1.k0 k0Var, android.view.MenuItem menuItem, yz5.a aVar) {
        k0Var.getClass();
        if ((menuItem != null && menuItem.getGroupId() == 0) && menuItem.getItemId() == 0) {
            aVar.mo152xb9724478();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onRevokeMenuClick, not revoke menu");
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        ck1.p pVar = this.f123872e;
        if (pVar != null) {
            return pVar.f123893a;
        }
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        try {
            ck1.p pVar = this.f123872e;
            if (pVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "getItemViewType, curUsageInfo is null");
                return super.mo863xcdaf1228(i17);
            }
            java.lang.Object obj = pVar.f123894b.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "getItemViewType, position: " + i17 + " fail since " + e17);
            return super.mo863xcdaf1228(i17);
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
    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        int i18 = i17;
        ck1.y0 holder = (ck1.y0) k3Var;
        ?? r37 = "MicroMsg.AppBrandUserInfoRevokePage";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        try {
            ck1.p pVar = this.f123872e;
            if (pVar == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onBindViewHolder, curUsageInfo is null");
                i18 = i18;
                r37 = r37;
            } else {
                java.lang.Object obj = pVar.f123894b.get(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                ck1.o oVar = (ck1.o) obj;
                if (!(holder instanceof ck1.u0)) {
                    boolean z17 = holder instanceof ck1.x0;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1204xed412388.p1206xc84f0e86.C12720x8e4fa2d4 c12720x8e4fa2d4 = this.f123871d;
                    if (!z17) {
                        int i19 = com.p314xaae8f345.mm.R.C30867xcad56011.a5b;
                        if (!(holder instanceof ck1.w0)) {
                            ?? r17 = holder instanceof ck1.v0;
                            i18 = r17;
                            r37 = r37;
                            if (r17 != 0) {
                                ?? r18 = (ck1.l0) c12720x8e4fa2d4.l0().f123910h.mo3195x754a37bb();
                                if (r18 == 0) {
                                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onBindViewHolder, pageMode is null");
                                    i18 = r18;
                                    r37 = r37;
                                } else {
                                    android.widget.Button button = ((ck1.v0) holder).f123924d;
                                    if (button != null) {
                                        int ordinal = r18.ordinal();
                                        if (ordinal != 0) {
                                            if (ordinal != 1) {
                                                throw new jz5.j();
                                            }
                                            i19 = com.p314xaae8f345.mm.R.C30867xcad56011.a5c;
                                        }
                                        button.setText(i19);
                                    }
                                    if (button != null) {
                                        button.setOnClickListener(new ck1.f0(this));
                                    }
                                    ?? r19 = this.f123874g;
                                    i18 = r19;
                                    i18 = r19;
                                    r37 = button;
                                    r37 = button;
                                    if (!this.f123875h && r19 != 0) {
                                        ?? booleanValue = r19.booleanValue();
                                        int i27 = booleanValue;
                                        android.widget.Button button2 = button;
                                        if (booleanValue != 0) {
                                            ?? r110 = holder.f3639x46306858;
                                            ?? g0Var = new ck1.g0(holder, this);
                                            r110.post(g0Var);
                                            i27 = r110;
                                            button2 = g0Var;
                                        } else if (button != null) {
                                            button.setVisibility(0);
                                            i27 = booleanValue;
                                            button2 = button;
                                        }
                                        this.f123875h = true;
                                        i18 = i27;
                                        r37 = button2;
                                    }
                                }
                            }
                        } else if (oVar instanceof ck1.m) {
                            ?? r111 = ((ck1.w0) holder).f123926d;
                            i18 = r111;
                            r37 = r37;
                            if (r111 != 0) {
                                r37 = 2131756627;
                                r111.setText(c12720x8e4fa2d4.m7468x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.a5d, ((ck1.m) oVar).f123881a));
                                i18 = r111;
                            }
                        } else {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onBindViewHolder, flattenedItem is not PluginTitle");
                            i18 = "onBindViewHolder, flattenedItem is not PluginTitle";
                            r37 = r37;
                        }
                    } else if (oVar instanceof ck1.n) {
                        ?? r112 = (ck1.l0) c12720x8e4fa2d4.l0().f123910h.mo3195x754a37bb();
                        if (r112 == 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onBindViewHolder, pageMode is null");
                            i18 = r112;
                            r37 = r37;
                        } else {
                            ck1.h0 h0Var = new ck1.h0(this, oVar);
                            ck1.x0 x0Var = (ck1.x0) holder;
                            android.widget.TextView textView = x0Var.f123929e;
                            if (textView != null) {
                                textView.setText(((ck1.n) oVar).f123886a.f123916c.f460513e);
                            }
                            ck1.t0 t0Var = ((ck1.n) oVar).f123886a;
                            java.lang.String str = t0Var.f123916c.f460517i;
                            boolean z18 = str == null || str.length() == 0;
                            r45.kv5 kv5Var = t0Var.f123916c;
                            android.widget.TextView textView2 = x0Var.f123930f;
                            if (!z18) {
                                if (textView2 != null) {
                                    textView2.setText(kv5Var.f460517i);
                                }
                                if (textView2 != null) {
                                    textView2.setVisibility(0);
                                }
                            } else if (textView2 != null) {
                                textView2.setVisibility(8);
                            }
                            android.widget.TextView textView3 = x0Var.f123931g;
                            if (textView3 != null) {
                                textView3.setVisibility(7 == kv5Var.f460514f ? 0 : 8);
                            }
                            android.widget.ImageView imageView = x0Var.f123928d;
                            if (imageView != null) {
                                imageView.setPadding(0, 0, 0, 0);
                                p3325xe03a0797.p3326xc267989b.l.d(p012xc85e97e9.p093xedfae76a.z.a(c12720x8e4fa2d4), null, null, new ck1.d0(oVar, holder, null), 3, null);
                                imageView.setImportantForAccessibility(2);
                            }
                            ck1.l0 l0Var = (ck1.l0) c12720x8e4fa2d4.l0().f123910h.mo3195x754a37bb();
                            if (l0Var == null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onBindViewHolder, pageMode is null");
                            } else {
                                android.widget.Button button3 = c12720x8e4fa2d4.f171467f;
                                if (button3 != null) {
                                    button3.setVisibility(0);
                                }
                                int ordinal2 = l0Var.ordinal();
                                if (ordinal2 == 0) {
                                    android.widget.Button button4 = c12720x8e4fa2d4.f171467f;
                                    if (button4 != null) {
                                        button4.setText(com.p314xaae8f345.mm.R.C30867xcad56011.a5b);
                                    }
                                    android.widget.Button button5 = c12720x8e4fa2d4.f171467f;
                                    if (button5 != null) {
                                        button5.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562601jy);
                                    }
                                    android.widget.Button button6 = c12720x8e4fa2d4.f171467f;
                                    if (button6 != null) {
                                        button6.setTextColor(b3.l.m9703x441695a2(ak1.f.d(c12720x8e4fa2d4), com.p314xaae8f345.mm.R.C30859x5a72f63.aax));
                                    }
                                } else if (ordinal2 == 1) {
                                    android.widget.Button button7 = c12720x8e4fa2d4.f171467f;
                                    if (button7 != null) {
                                        button7.setText(com.p314xaae8f345.mm.R.C30867xcad56011.a5c);
                                    }
                                    android.widget.Button button8 = c12720x8e4fa2d4.f171467f;
                                    if (button8 != null) {
                                        button8.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562590jk);
                                    }
                                    android.widget.Button button9 = c12720x8e4fa2d4.f171467f;
                                    if (button9 != null) {
                                        button9.setTextColor(b3.l.m9703x441695a2(ak1.f.d(c12720x8e4fa2d4), com.p314xaae8f345.mm.R.C30859x5a72f63.f560371io));
                                    }
                                }
                                android.widget.Button button10 = c12720x8e4fa2d4.f171467f;
                                if (button10 != null) {
                                    button10.setOnClickListener(new ck1.j0(this));
                                }
                            }
                            int ordinal3 = r112.ordinal();
                            java.lang.String str2 = "itemView";
                            android.widget.LinearLayout linearLayout = x0Var.f123932h;
                            i18 = ordinal3;
                            r37 = str2;
                            if (ordinal3 == 0) {
                                if (linearLayout != null) {
                                    linearLayout.setVisibility(8);
                                }
                                ?? itemView = holder.f3639x46306858;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
                                ?? wVar = new ck1.w(itemView, itemView.getContext());
                                wVar.j(itemView, new ck1.u(this), new ck1.v(this, h0Var));
                                itemView.setTag(wVar);
                                i18 = itemView;
                                r37 = wVar;
                            } else if (ordinal3 == 1) {
                                if (7 != kv5Var.f460514f) {
                                    if (linearLayout != null) {
                                        linearLayout.setVisibility(0);
                                    }
                                    android.widget.Button button11 = x0Var.f123933i;
                                    if (button11 != null) {
                                        button11.setOnClickListener(new ck1.e0(h0Var));
                                    }
                                } else if (linearLayout != null) {
                                    linearLayout.setVisibility(8);
                                }
                                ?? itemView2 = holder.f3639x46306858;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
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
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onBindViewHolder, flattenedItem is not UserInfo");
                        i18 = "onBindViewHolder, flattenedItem is not UserInfo";
                        r37 = r37;
                    }
                } else if (oVar instanceof ck1.l) {
                    ck1.u0 u0Var = (ck1.u0) holder;
                    android.widget.ImageView imageView2 = u0Var.f123919e;
                    if (imageView2 != null) {
                        l01.d0.f396294a.b(imageView2, ((ck1.l) oVar).f123877a.f469728f, l01.a.h(), l01.q0.f396320d);
                    }
                    android.widget.TextView textView4 = u0Var.f123920f;
                    if (textView4 != null) {
                        textView4.setText(((ck1.l) oVar).f123877a.f469727e);
                        textView4.post(new ck1.a0(holder));
                    }
                    ?? r113 = u0Var.f123921g;
                    i18 = r113;
                    r37 = textView4;
                    if (r113 != 0) {
                        ck1.c0 c0Var = new ck1.c0(this, holder);
                        r113.post(c0Var);
                        i18 = r113;
                        r37 = c0Var;
                    }
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onBindViewHolder, flattenedItem is not header");
                    i18 = "onBindViewHolder, flattenedItem is not header";
                    r37 = r37;
                }
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r37, "onBindViewHolder, position: " + i18 + ", flattenedItem is null");
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrandUserInfoRevokePage", "onCreateViewHolder, viewType: " + i17 + ", are you kidding me?");
        return new ck1.x0(parent);
    }
}
