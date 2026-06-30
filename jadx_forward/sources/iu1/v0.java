package iu1;

/* loaded from: classes9.dex */
public final class v0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.ArrayList f376496d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.ArrayList f376497e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.ArrayList f376498f;

    /* renamed from: g, reason: collision with root package name */
    public iu1.w0 f376499g;

    /* renamed from: h, reason: collision with root package name */
    public iu1.w0 f376500h;

    /* renamed from: i, reason: collision with root package name */
    public iu1.w0 f376501i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f376502m;

    public v0(boolean z17) {
        this.f376502m = z17;
    }

    public final void B(java.lang.String title) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(title)) {
            this.f376500h = null;
            return;
        }
        if (this.f376500h == null) {
            iu1.w0 w0Var = new iu1.w0();
            this.f376500h = w0Var;
            w0Var.f376504a = 0;
        }
        iu1.w0 w0Var2 = this.f376500h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w0Var2);
        w0Var2.f376505b = title;
    }

    public final void E(java.lang.String title) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(title)) {
            this.f376499g = null;
            return;
        }
        if (this.f376499g == null) {
            iu1.w0 w0Var = new iu1.w0();
            this.f376499g = w0Var;
            w0Var.f376504a = 0;
        }
        iu1.w0 w0Var2 = this.f376499g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(w0Var2);
        w0Var2.f376505b = title;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        int i17 = this.f376499g != null ? 1 : 0;
        java.util.ArrayList arrayList = this.f376498f;
        if (arrayList != null) {
            i17 += arrayList.size();
        }
        java.util.ArrayList arrayList2 = this.f376496d;
        if (arrayList2 != null) {
            i17 += arrayList2.size();
        }
        if (this.f376500h != null) {
            i17++;
        }
        java.util.ArrayList arrayList3 = this.f376497e;
        if (arrayList3 != null) {
            i17 += arrayList3.size();
        }
        return this.f376501i != null ? i17 + 1 : i17;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemId */
    public long mo7906x1ed62e84(int i17) {
        iu1.w0 x17 = x(i17);
        if (x17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardTicketAdapter", "[getItemId] position=" + i17 + " itemCount=" + mo1894x7e414b06() + " }");
            return 0L;
        }
        java.lang.String str = x17.f376505b;
        if (str == null) {
            str = "";
        }
        r45.g45 g45Var = x17.f376507d;
        java.lang.String str2 = g45Var != null ? g45Var.f456404d : null;
        if (str2 == null) {
            str2 = "";
        }
        r45.h45 h45Var = x17.f376506c;
        java.lang.String str3 = h45Var != null ? h45Var.f457358d : null;
        if (str3 == null) {
            str3 = "";
        }
        r45.nj4 nj4Var = x17.f376508e;
        java.lang.String str4 = nj4Var != null ? nj4Var.f462976d : null;
        java.lang.String str5 = str + str2 + str3 + (str4 != null ? str4 : "");
        if (str5 == null || str5.length() == 0) {
            return x17.hashCode();
        }
        return (str5 + i17 + x17.f376504a).hashCode();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        iu1.w0 x17 = x(i17);
        if (x17 != null) {
            return x17.f376504a;
        }
        return -1;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        r45.nj4 nj4Var;
        iu1.r1 holder = (iu1.r1) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        iu1.w0 x17 = x(i17);
        if (x17 != null) {
            int i18 = x17.f376504a;
            if (i18 != 0) {
                boolean z17 = true;
                if (i18 == 1) {
                    r45.h45 h45Var = x17.f376506c;
                    if (h45Var != null) {
                        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(h45Var.f457359e)) {
                            holder.k().setImageResource(com.p314xaae8f345.mm.R.raw.f78750xb43c3b23);
                        } else {
                            holder.k().b(h45Var.f457359e, 0, 0, com.p314xaae8f345.mm.R.raw.f78750xb43c3b23);
                        }
                        holder.l().setText(h45Var.f457358d);
                        holder.j().setText(h45Var.f457360f);
                    }
                } else if (i18 == 2) {
                    r45.g45 g45Var = x17.f376507d;
                    if (g45Var != null) {
                        java.lang.Object tag = holder.i().getTag();
                        java.lang.String str = g45Var.f456404d;
                        if (!(tag instanceof java.lang.String) || android.text.TextUtils.isEmpty((java.lang.CharSequence) tag) || !tag.equals(str)) {
                            holder.i().setTag(str);
                            holder.k().m75394x3288e7c1(true);
                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g45Var.f456407g)) {
                                holder.k().setImageResource(com.p314xaae8f345.mm.R.raw.f78750xb43c3b23);
                            } else {
                                holder.k().b(g45Var.f456407g, 0, 0, com.p314xaae8f345.mm.R.raw.f78750xb43c3b23);
                            }
                            holder.l().setText(g45Var.f456405e);
                            holder.j().setText(g45Var.f456406f);
                            int i19 = g45Var.f456408h;
                            if (i19 == 1 || i19 == 3 || i19 == 4) {
                                holder.i().setVisibility(4);
                                android.widget.ImageView imageView = holder.f376484n;
                                if (imageView == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("shadowIv");
                                    throw null;
                                }
                                imageView.setVisibility(4);
                                android.view.View view = holder.f3639x46306858;
                                view.setBackground(view.getContext().getResources().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562643l0));
                                holder.l().setTextColor(android.graphics.Color.parseColor("#555555"));
                                holder.l().setShadowLayer(0.0f, 0.0f, 0.0f, i65.a.d(holder.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
                                holder.j().setTextColor(android.graphics.Color.parseColor("#555555"));
                                holder.j().setShadowLayer(0.0f, 0.0f, 0.0f, i65.a.d(holder.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
                            } else {
                                holder.l().setTextColor(-1);
                                holder.j().setTextColor(i65.a.d(holder.i().getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230));
                                java.util.LinkedList<r45.st> ticket_label = g45Var.f456409i;
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(ticket_label, "ticket_label");
                                android.widget.LinearLayout linearLayout = holder.f376483m;
                                if (linearLayout == null) {
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rightLabelLayout");
                                    throw null;
                                }
                                linearLayout.removeAllViews();
                                if (ticket_label.isEmpty()) {
                                    linearLayout.setVisibility(4);
                                } else {
                                    linearLayout.setVisibility(0);
                                    for (r45.st stVar : ticket_label) {
                                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stVar.f467500d)) {
                                            android.widget.LinearLayout linearLayout2 = holder.f376483m;
                                            if (linearLayout2 == null) {
                                                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rightLabelLayout");
                                                throw null;
                                            }
                                            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc c13079x2ba3d9dc = new com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.p1315xd1075a44.C13079x2ba3d9dc(linearLayout2.getContext());
                                            android.content.Context context = linearLayout.getContext();
                                            c13079x2ba3d9dc.setMinHeight(i65.a.b(context, 18));
                                            int b17 = i65.a.b(context, 8);
                                            int b18 = i65.a.b(context, 4);
                                            c13079x2ba3d9dc.setPadding(b17, b18, b17, b18);
                                            c13079x2ba3d9dc.setText(stVar.f467500d);
                                            c13079x2ba3d9dc.setTextSize(1, 10.0f);
                                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stVar.f467501e)) {
                                                c13079x2ba3d9dc.setTextColor(-1);
                                            } else {
                                                c13079x2ba3d9dc.setTextColor(android.graphics.Color.parseColor(stVar.f467501e));
                                            }
                                            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stVar.f467502f)) {
                                                c13079x2ba3d9dc.m54468x17b1755e(lu1.a0.a(-16777216, 26));
                                            } else {
                                                c13079x2ba3d9dc.m54468x17b1755e(lu1.a0.b(stVar.f467502f, stVar.f467505i));
                                            }
                                            linearLayout.addView(c13079x2ba3d9dc);
                                        }
                                    }
                                }
                                iu1.q1 q1Var = new iu1.q1(holder, g45Var);
                                if (holder.f376477d <= 0 || holder.f376478e <= 0) {
                                    holder.f376477d = holder.f3639x46306858.getHeight();
                                    int width = holder.f3639x46306858.getWidth();
                                    holder.f376478e = width;
                                    if (holder.f376477d <= 0 || width <= 0) {
                                        holder.f3639x46306858.post(new iu1.p1(holder, q1Var));
                                    }
                                }
                                q1Var.mo152xb9724478();
                            }
                        }
                    }
                } else if (i18 == 3 && (nj4Var = x17.f376508e) != null) {
                    holder.l().setText(nj4Var.f462976d);
                    java.lang.String str2 = nj4Var.f462978f;
                    if (str2 != null && str2.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        holder.j().setVisibility(8);
                    } else {
                        holder.j().setText(nj4Var.f462978f);
                        holder.j().setVisibility(0);
                    }
                }
            } else {
                holder.l().setText(x17.f376505b);
            }
            if (this.f376502m) {
                android.view.View view2 = holder.f3639x46306858;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(0.6f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v2/CardTicketAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/card/ui/v2/CardTicketVH;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/card/ui/v2/CardTicketAdapter", "onBindViewHolder", "(Lcom/tencent/mm/plugin/card/ui/v2/CardTicketVH;I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? 0 : com.p314xaae8f345.mm.R.C30864xbddafb2a.f569864qd : com.p314xaae8f345.mm.R.C30864xbddafb2a.f569903rh : com.p314xaae8f345.mm.R.C30864xbddafb2a.f569865qe : com.p314xaae8f345.mm.R.C30864xbddafb2a.f569904ri, parent, false);
        if (this.f376502m) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(0.6f));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/card/ui/v2/CardTicketAdapter", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/tencent/mm/plugin/card/ui/v2/CardTicketVH;", "android/view/View_EXEC_", "setAlpha", "(F)V");
            inflate.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(inflate, "com/tencent/mm/plugin/card/ui/v2/CardTicketAdapter", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/tencent/mm/plugin/card/ui/v2/CardTicketVH;", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new iu1.r1(inflate, i17);
    }

    public final iu1.w0 x(int i17) {
        int i18;
        java.util.ArrayList arrayList = this.f376498f;
        if (arrayList != null) {
            arrayList.size();
        }
        java.util.ArrayList arrayList2 = this.f376496d;
        if (arrayList2 != null) {
            arrayList2.size();
        }
        java.util.ArrayList arrayList3 = this.f376497e;
        if (arrayList3 != null) {
            arrayList3.size();
        }
        iu1.w0 w0Var = this.f376499g;
        if (w0Var == null) {
            i18 = -1;
        } else {
            if (i17 == 0) {
                return w0Var;
            }
            i18 = 0;
        }
        java.util.ArrayList arrayList4 = this.f376498f;
        if (arrayList4 != null) {
            if (i17 > i18 && i17 <= arrayList4.size() + i18) {
                return (iu1.w0) arrayList4.get((i17 - i18) - 1);
            }
            i18 += arrayList4.size();
        }
        java.util.ArrayList arrayList5 = this.f376496d;
        if (arrayList5 != null) {
            if (i17 > i18 && i17 <= arrayList5.size() + i18) {
                return (iu1.w0) arrayList5.get((i17 - i18) - 1);
            }
            i18 += arrayList5.size();
        }
        iu1.w0 w0Var2 = this.f376500h;
        if (w0Var2 != null && i17 == (i18 = i18 + 1)) {
            return w0Var2;
        }
        java.util.ArrayList arrayList6 = this.f376497e;
        if (arrayList6 != null) {
            if (i17 > i18 && i17 <= arrayList6.size() + i18) {
                return (iu1.w0) arrayList6.get((i17 - i18) - 1);
            }
            i18 += arrayList6.size();
        }
        iu1.w0 w0Var3 = this.f376501i;
        if (w0Var3 == null || i17 != i18 + 1) {
            return null;
        }
        return w0Var3;
    }

    public final int y(java.lang.String cardId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardId, "cardId");
        if (i17 != 1) {
            java.util.ArrayList arrayList = this.f376497e;
            if (arrayList == null) {
                return 0;
            }
            java.util.Iterator it = arrayList.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                int i19 = i18 + 1;
                r45.g45 g45Var = ((iu1.w0) it.next()).f376507d;
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g45Var != null ? g45Var.f456404d : null, cardId)) {
                    return i18;
                }
                i18 = i19;
            }
            return 0;
        }
        java.util.ArrayList arrayList2 = this.f376498f;
        int size = arrayList2 != null ? arrayList2.size() + 0 : 0;
        java.util.ArrayList arrayList3 = this.f376496d;
        if (arrayList3 == null) {
            return 0;
        }
        java.util.Iterator it6 = arrayList3.iterator();
        int i27 = 0;
        while (it6.hasNext()) {
            int i28 = i27 + 1;
            r45.g45 g45Var2 = ((iu1.w0) it6.next()).f376507d;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(g45Var2 != null ? g45Var2.f456404d : null, cardId)) {
                return i27 + size;
            }
            i27 = i28;
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0045, code lost:
    
        if (r8.isEmpty() != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(java.lang.String r8) {
        /*
            r7 = this;
            java.lang.String r0 = "cardId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            java.util.ArrayList r0 = r7.f376498f
            if (r0 == 0) goto Lc
            r0.size()
        Lc:
            java.util.ArrayList r0 = r7.f376496d
            r1 = 2
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L50
            java.util.Iterator r4 = r0.iterator()
        L17:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4d
            java.lang.Object r5 = r4.next()
            iu1.w0 r5 = (iu1.w0) r5
            r45.g45 r6 = r5.f376507d
            if (r6 == 0) goto L2a
            java.lang.String r6 = r6.f456404d
            goto L2b
        L2a:
            r6 = r3
        L2b:
            boolean r6 = r26.i0.q(r6, r8, r2, r1, r3)
            if (r6 == 0) goto L17
            r0.remove(r5)
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L49
            java.util.ArrayList r8 = r7.f376498f
            if (r8 == 0) goto L47
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r8)
            boolean r8 = r8.isEmpty()
            if (r8 == 0) goto L49
        L47:
            r7.f376499g = r3
        L49:
            r7.m8146xced61ae5()
            return
        L4d:
            r0.size()
        L50:
            java.util.ArrayList r0 = r7.f376497e
            if (r0 == 0) goto L84
            java.util.Iterator r4 = r0.iterator()
        L58:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L84
            java.lang.Object r5 = r4.next()
            iu1.w0 r5 = (iu1.w0) r5
            r45.g45 r6 = r5.f376507d
            if (r6 == 0) goto L6b
            java.lang.String r6 = r6.f456404d
            goto L6c
        L6b:
            r6 = r3
        L6c:
            boolean r6 = r26.i0.q(r6, r8, r2, r1, r3)
            if (r6 == 0) goto L58
            r0.remove(r5)
            boolean r8 = r0.isEmpty()
            if (r8 == 0) goto L81
            iu1.w0 r8 = r7.f376501i
            if (r8 != 0) goto L81
            r7.f376500h = r3
        L81:
            r7.m8146xced61ae5()
        L84:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: iu1.v0.z(java.lang.String):void");
    }
}
