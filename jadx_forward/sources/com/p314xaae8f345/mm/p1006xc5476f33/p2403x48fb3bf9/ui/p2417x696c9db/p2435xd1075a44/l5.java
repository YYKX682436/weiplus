package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes9.dex */
public final class l5 extends android.widget.BaseAdapter {

    /* renamed from: h, reason: collision with root package name */
    public static final o11.g f268914h;

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f268915d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f268916e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 f268917f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f268918g;

    static {
        o11.f fVar = new o11.f();
        fVar.f423626q = com.p314xaae8f345.mm.R.C30859x5a72f63.f560349i1;
        fVar.f423611b = true;
        fVar.f423619j = 120;
        fVar.f423620k = 120;
        fVar.A = new r35.n0(0);
        fVar.B = new r35.w(0);
        fVar.f423629t = true;
        fVar.f423630u = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 3);
        f268914h = fVar.a();
    }

    public l5(android.content.Context context, java.util.LinkedList list, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 controller, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f268915d = context;
        this.f268916e = list;
        this.f268917f = controller;
        this.f268918g = new java.util.ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.c5 r12, r45.ck r13, r45.q60 r14, boolean r15) {
        /*
            r11 = this;
            java.lang.String r0 = "itemView"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            java.lang.String r0 = "info"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r13, r0)
            r0 = 0
            if (r15 == 0) goto L14
            if (r14 == 0) goto L12
            int r1 = r14.f465241n
            goto L16
        L12:
            r1 = r0
            goto L1a
        L14:
            int r1 = r13.f453140n
        L16:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
        L1a:
            if (r15 == 0) goto L23
            if (r14 == 0) goto L21
            int r2 = r14.f465239i
            goto L25
        L21:
            r2 = r0
            goto L29
        L23:
            int r2 = r13.f453141o
        L25:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L29:
            if (r15 == 0) goto L32
            if (r14 == 0) goto L30
            int r3 = r14.f465240m
            goto L34
        L30:
            r3 = r0
            goto L38
        L32:
            int r3 = r13.f453142p
        L34:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
        L38:
            android.widget.ImageView r4 = r12.f268664f
            r4.setOnClickListener(r0)
            r0 = 0
            r5 = 8
            android.widget.TextView r6 = r12.f268666h
            android.widget.TextView r7 = r12.f268660b
            if (r1 != 0) goto L47
            goto L57
        L47:
            int r1 = r1.intValue()
            if (r1 != 0) goto L57
            r6.setVisibility(r0)
            r4.setVisibility(r5)
            r7.setVisibility(r5)
            goto L98
        L57:
            r6.setVisibility(r5)
            r4.setVisibility(r0)
            r7.setVisibility(r5)
            if (r2 == 0) goto L74
            int r1 = r2.intValue()
            if (r1 <= 0) goto L69
            goto L6a
        L69:
            r0 = r5
        L6a:
            r7.setVisibility(r0)
            java.lang.String r0 = r2.toString()
            r7.setText(r0)
        L74:
            if (r3 != 0) goto L77
            goto L84
        L77:
            int r0 = r3.intValue()
            if (r0 != 0) goto L84
            r0 = 2131689665(0x7f0f00c1, float:1.9008352E38)
            r4.setImageResource(r0)
            goto L8a
        L84:
            r0 = 2131689666(0x7f0f00c2, float:1.9008354E38)
            r4.setImageResource(r0)
        L8a:
            com.tencent.mm.plugin.webview.ui.tools.widget.f5 r0 = new com.tencent.mm.plugin.webview.ui.tools.widget.f5
            r5 = r0
            r6 = r11
            r7 = r15
            r8 = r14
            r9 = r13
            r10 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            r4.setOnClickListener(r0)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.l5.a(com.tencent.mm.plugin.webview.ui.tools.widget.c5, r45.ck, r45.q60, boolean):void");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f268916e.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return (r45.ck) kz5.n0.a0(this.f268916e, i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.e5 e5Var;
        android.view.View view2;
        java.util.ArrayList arrayList;
        android.widget.LinearLayout linearLayout;
        java.util.LinkedList linkedList;
        android.view.View inflate;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "viewGroup");
        int i18 = 0;
        if (view == null) {
            view2 = android.view.LayoutInflater.from(this.f268915d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.c2j, (android.view.ViewGroup) null, false);
            e5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.e5(this, view2);
            view2.setTag(e5Var);
        } else {
            java.lang.Object tag = view.getTag();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.widget.MPWriteCommentLayout.MPMyCommentItemAdapter.BizCommentViewHolder");
            e5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.e5) tag;
            view2 = view;
        }
        r45.ck ckVar = (r45.ck) kz5.n0.a0(this.f268916e, i17);
        if (ckVar != null) {
            n11.a.b().h(ckVar.f453137h, e5Var.f268726a, f268914h);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.l5 l5Var = e5Var.f268732g;
            l5Var.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.c5 itemView = e5Var.f268729d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = ckVar.f453136g;
            android.widget.TextView textView = itemView.f268659a;
            float textSize = textView.getTextSize();
            ((ke0.e) xVar).getClass();
            android.content.Context context = l5Var.f268915d;
            textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
            le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str2 = ckVar.f453138i;
            com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc = itemView.f268661c;
            float m84164x40077844 = c23001x9d3a0bdc.m84164x40077844();
            ((ke0.e) xVar2).getClass();
            c23001x9d3a0bdc.b(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str2, m84164x40077844));
            int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = itemView.f268662d;
            c22699x3dcdb352.m82040x7541828(color);
            c22699x3dcdb352.setVisibility(0);
            itemView.f268663e.setVisibility(0);
            c22699x3dcdb352.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.h5(l5Var, ckVar));
            l5Var.a(itemView, ckVar, null, false);
            itemView.f268667i.setVisibility(8);
            itemView.f268668j.setVisibility(4);
            android.widget.TextView textView2 = e5Var.f268730e;
            textView2.setVisibility(8);
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5.f269156x1;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.z5 z5Var = l5Var.f268917f;
            if (!z5Var.f269158l1) {
                z5Var.f269160p1 = true;
                z5Var.f269158l1 = true;
            }
            if (z5Var.f269160p1) {
                textView2.setVisibility(0);
                textView2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d5(l5Var, ckVar));
                java.util.ArrayList arrayList2 = e5Var.f268731f;
                java.util.Iterator it = arrayList2.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    arrayList = l5Var.f268918g;
                    linearLayout = e5Var.f268727b;
                    if (!hasNext) {
                        break;
                    }
                    android.view.View view3 = (android.view.View) it.next();
                    if (view3 != null) {
                        linearLayout.removeView(view3);
                        arrayList.add(view3);
                    }
                }
                arrayList2.clear();
                r45.r60 r60Var = ckVar.f453143q;
                if (r60Var != null && (linkedList = r60Var.f466102d) != null && linkedList.size() > 0) {
                    java.util.LinkedList linkedList2 = ckVar.f453143q.f466102d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(linkedList2);
                    java.util.Iterator it6 = linkedList2.iterator();
                    int i27 = 0;
                    while (it6.hasNext()) {
                        java.lang.Object next = it6.next();
                        int i28 = i27 + 1;
                        if (i27 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        r45.q60 q60Var = (r45.q60) next;
                        if (arrayList.size() > 0) {
                            java.lang.Object remove = arrayList.remove(i18);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(remove, "removeAt(...)");
                            inflate = (android.view.View) remove;
                        } else {
                            inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.c2i, null);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
                        }
                        arrayList2.add(inflate);
                        linearLayout.addView(inflate);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q60Var);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.c5 c5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.c5(l5Var, inflate);
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.k5 k5Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.k5(c5Var, l5Var, ckVar);
                        android.widget.LinearLayout linearLayout2 = linearLayout;
                        java.util.ArrayList arrayList3 = arrayList2;
                        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(ckVar.f453135f, q60Var.f465235e);
                        android.widget.ImageView imageView = c5Var.f268663e;
                        java.util.ArrayList arrayList4 = arrayList;
                        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = c5Var.f268662d;
                        java.util.Iterator it7 = it6;
                        com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc2 = c5Var.f268661c;
                        android.view.View view4 = view2;
                        android.widget.TextView textView3 = c5Var.f268659a;
                        if (b17) {
                            if (!((java.lang.Boolean) k5Var.mo146xb9724478(java.lang.Integer.valueOf(q60Var.f465242o))).booleanValue()) {
                                le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
                                java.lang.String str3 = ckVar.f453136g;
                                float textSize2 = textView3.getTextSize();
                                ((ke0.e) xVar3).getClass();
                                textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str3, textSize2));
                                le0.x xVar4 = (le0.x) i95.n0.c(le0.x.class);
                                java.lang.String str4 = q60Var.f465234d;
                                float m84164x400778442 = c23001x9d3a0bdc2.m84164x40077844();
                                ((ke0.e) xVar4).getClass();
                                c23001x9d3a0bdc2.b(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str4, m84164x400778442));
                                c22699x3dcdb3522.m82040x7541828(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560057a5));
                                c22699x3dcdb3522.setVisibility(0);
                                imageView.setVisibility(0);
                                l5Var.a(c5Var, ckVar, q60Var, true);
                                c22699x3dcdb3522.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.j5(l5Var, ckVar, q60Var));
                            }
                        } else if (!((java.lang.Boolean) k5Var.mo146xb9724478(java.lang.Integer.valueOf(q60Var.f465242o))).booleanValue()) {
                            le0.x xVar5 = (le0.x) i95.n0.c(le0.x.class);
                            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574096gz3);
                            float textSize3 = textView3.getTextSize();
                            ((ke0.e) xVar5).getClass();
                            textView3.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, string, textSize3));
                            le0.x xVar6 = (le0.x) i95.n0.c(le0.x.class);
                            java.lang.String str5 = q60Var.f465234d;
                            float m84164x400778443 = c23001x9d3a0bdc2.m84164x40077844();
                            ((ke0.e) xVar6).getClass();
                            c23001x9d3a0bdc2.b(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str5, m84164x400778443));
                            c22699x3dcdb3522.setVisibility(8);
                            imageView.setVisibility(8);
                            l5Var.a(c5Var, ckVar, q60Var, true);
                        }
                        c5Var.f268667i.setVisibility(0);
                        android.widget.ImageView imageView2 = c5Var.f268668j;
                        imageView2.setVisibility(4);
                        if (i28 < ckVar.f453143q.f466102d.size()) {
                            imageView2.setVisibility(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(q60Var.f465235e, ((r45.q60) ckVar.f453143q.f466102d.get(i28)).f465235e) ? 0 : 4);
                        }
                        i27 = i28;
                        linearLayout = linearLayout2;
                        arrayList2 = arrayList3;
                        arrayList = arrayList4;
                        it6 = it7;
                        view2 = view4;
                        i18 = 0;
                    }
                }
            }
        }
        android.view.View view5 = view2;
        int count = getCount() - 1;
        android.widget.LinearLayout linearLayout3 = e5Var.f268728c;
        if (i17 == count) {
            linearLayout3.setVisibility(0);
            this.f268917f.m74873xf133c127();
        } else {
            linearLayout3.setVisibility(8);
        }
        return view5;
    }
}
