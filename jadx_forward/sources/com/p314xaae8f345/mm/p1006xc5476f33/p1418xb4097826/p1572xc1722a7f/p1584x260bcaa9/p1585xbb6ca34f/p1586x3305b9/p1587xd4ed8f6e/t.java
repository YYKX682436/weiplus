package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e;

/* loaded from: classes2.dex */
public class t extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f203472e;

    /* renamed from: f, reason: collision with root package name */
    public final float f203473f;

    /* renamed from: g, reason: collision with root package name */
    public final sp2.k f203474g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f203475h;

    public t(int i17, float f17, sp2.k outsideOperator) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outsideOperator, "outsideOperator");
        this.f203472e = i17;
        this.f203473f = f17;
        this.f203474g = outsideOperator;
        this.f203475h = "AggregationCardConvert_" + hashCode();
    }

    public static final void n(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t tVar, in5.s0 s0Var, vp2.c cVar, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        r45.uz2 uz2Var;
        java.lang.String str;
        tVar.getClass();
        r45.le1 le1Var = cVar.f520443d;
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str2 = le1Var.f460888o;
        java.lang.String str3 = str2 == null ? "" : str2;
        r45.fa2 fa2Var = cVar.f520444e;
        java.lang.String str4 = (fa2Var == null || (uz2Var = fa2Var.f455668q) == null || (str = uz2Var.f469281e) == null) ? "" : str;
        java.lang.String str5 = le1Var.f460880d;
        java.lang.String str6 = str5 == null ? "" : str5;
        r45.vz2 vz2Var = le1Var.f460891r;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = le1Var.f460894u;
        boolean i17 = tVar.f203474g.i();
        r45.le1 le1Var2 = cVar.f520443d;
        int i18 = le1Var2.f460898y;
        dk2.of.f315392j.b(intent, new dk2.of(str3, str4, str6, vz2Var, gVar2, gVar, i17, i18, le1Var2.B, i18 == 1));
        if (le1Var.f460881e == 6) {
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            android.content.Intent intent2 = !(context instanceof android.app.Activity) ? intent : null;
            if (intent2 != null) {
                intent2.addFlags(268435456);
            }
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.ActivityC14560xfd2c4162.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterLivePlayTogetherThemeUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/finder/nearby/FinderNearByActivityRouter", "enterLivePlayTogetherThemeUI", "(Landroid/content/Context;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            uc.n nVar = (uc.n) i95.n0.c(uc.n.class);
            android.content.Context context2 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            ((v40.s) nVar).getClass();
            wo2.i.f529610a.a(context2, intent);
        }
        android.content.Context context3 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context3 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context3).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        android.content.Context context4 = s0Var.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
        if (!(context4 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        rq2.w wVar = (rq2.w) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context4).a(rq2.w.class);
        if (wVar != null) {
            if (le1Var2.B != 2) {
                java.lang.String m75945x2fec8307 = V6.m75945x2fec8307(1);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.putOpt("topic_id", le1Var.f460888o);
                java.lang.String jSONObject2 = jSONObject.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                wVar.Q6(m75945x2fec8307, "main_page_topic_card", r26.i0.t(jSONObject2, ",", ";", false));
                return;
            }
            java.lang.String m75945x2fec83072 = V6.m75945x2fec8307(1);
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put("topic_id", le1Var.f460888o);
            jSONObject3.put("card_index", s0Var.m8183xf806b362() - wVar.f480437f);
            java.lang.String jSONObject4 = jSONObject3.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject4, "toString(...)");
            wVar.Q6(m75945x2fec83072, "main_page_chatroom_card", r26.i0.t(jSONObject4, ",", ";", false));
        }
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.c6g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x05ec, code lost:
    
        r0.f555662j = new vq2.e(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x05f3, code lost:
    
        if (r0 == null) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x05f5, code lost:
    
        d75.b.g(new zm0.g(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0632, code lost:
    
        throw new java.lang.RuntimeException("Need to set var, lineHeight=" + r14.f555644d + ", width=" + r14.f555642b + ", height=" + r14.f555643c + ", bulletSpeed=" + r14.f555649i);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x050a, code lost:
    
        r5 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x046f, code lost:
    
        r11 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x045f, code lost:
    
        if (java.lang.Math.abs(r12 - r7) < 0.1f) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0429, code lost:
    
        if (java.lang.Math.abs(r12 - r7) < 0.1f) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0462, code lost:
    
        r10 = (r10 * r12) / r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0464, code lost:
    
        com.p314xaae8f345.mm.ui.kk.f(r1, (int) r10);
        r7 = r1.f203643d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x046a, code lost:
    
        if (r7 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x046c, code lost:
    
        r11 = r7.f460880d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0470, code lost:
    
        r7 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r11, r2.f460880d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PlayTogetherBulletView", "onBindCard: isCardChange=" + r7 + ", cardWidth=" + r0 + ", cardHeight=" + r9 + ", card_id=" + r2.f460880d);
        r1.f203643d = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x04a7, code lost:
    
        if (r7 == false) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x04ab, code lost:
    
        if (r1.f203644e == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x04ad, code lost:
    
        r1.a("cardChange");
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x04b2, code lost:
    
        r7 = r1.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, "getContext(...)");
        r7 = r3.d(r7, r1.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), true);
        r10 = r1.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r10, "getContext(...)");
        r10 = r3.d(r10, r1.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), true);
        r11 = r1.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r11, "getContext(...)");
        r11 = r3.d(r11, i65.a.a(r1.getContext(), 41.0f), true);
        r12 = r1.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r12, "getContext(...)");
        r14 = new zm0.f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0506, code lost:
    
        if (r10 != 1.7777778f) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0508, code lost:
    
        r5 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x050b, code lost:
    
        if (r5 == false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x050e, code lost:
    
        r4 = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x050f, code lost:
    
        r14.f555641a = r4;
        r14.f555642b = r0;
        r14.f555643c = r9;
        r14.f555644d = (int) ((2 * r7) + r11);
        r14.f555645e = (int) r11;
        r14.f555647g = (int) r7;
        r14.f555646f = (int) r10;
        r14.f555648h = true;
        r0 = kz5.c0.d(java.lang.Integer.valueOf(-((int) r3.d(r12, ym5.x.a(r12, 15.0f), true))), java.lang.Integer.valueOf(-((int) r3.d(r12, ym5.x.a(r12, 65.0f), true))), java.lang.Integer.valueOf(-((int) r3.d(r12, ym5.x.a(r12, 40.0f), true))));
        r4 = r14.f555650j;
        r4.clear();
        r4.addAll(r0);
        r0 = r3.d(r12, ym5.x.a(r12, 250.0f), true) / 15000;
        r14.f555649i = r0;
        r15 = new vq2.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0588, code lost:
    
        if (r14.f555644d <= 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x058c, code lost:
    
        if (r14.f555642b <= 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0590, code lost:
    
        if (r14.f555643c <= 0) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0595, code lost:
    
        if (r0 <= 0.0f) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0597, code lost:
    
        r1.f203644e = new zm0.i(r12, r1, r14, r15, null);
        r0 = r2.f460897x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x05a4, code lost:
    
        if (r0 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x05a6, code lost:
    
        r0 = r0.f464513d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x05a8, code lost:
    
        if (r0 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x05b0, code lost:
    
        if ((!r0.isEmpty()) == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x05b2, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x05b5, code lost:
    
        if (r2 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x05b7, code lost:
    
        r0 = r1.f203644e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x05b9, code lost:
    
        if (r0 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x05bb, code lost:
    
        r3 = new java.util.ArrayList(kz5.d0.q(r2, 10));
        r2 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x05ce, code lost:
    
        if (r2.hasNext() == false) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x05d0, code lost:
    
        r4 = (r45.oe1) r2.next();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r4);
        r3.add(new vq2.a(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x05e2, code lost:
    
        r0.a("onBind", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x05b4, code lost:
    
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x05e7, code lost:
    
        r0 = r1.f203644e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x05e9, code lost:
    
        if (r0 != null) goto L111;
     */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    @Override // in5.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h(in5.s0 r34, in5.c r35, int r36, int r37, boolean r38, java.util.List r39) {
        /*
            Method dump skipped, instructions count: 2039
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.t.h(in5.s0, in5.c, int, int, boolean, java.util.List):void");
    }

    @Override // in5.r
    public void l(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1593xadde6502.C14563x2cd56f15 c14563x2cd56f15 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.ui.p1593xadde6502.C14563x2cd56f15) holder.p(com.p314xaae8f345.mm.R.id.s0l);
        if (c14563x2cd56f15 != null) {
            c14563x2cd56f15.a("onViewRecycled");
        }
    }

    public final void o(in5.s0 s0Var, r45.le1 le1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3 a3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3.f196976a;
        android.view.View findViewById = s0Var.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.hkh);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        a3Var.d(findViewById, le1Var.f460886m);
    }

    public final void p(in5.s0 s0Var, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25, vp2.c cVar, up2.e eVar, boolean z17) {
        c22849x81a93d25.setOnTouchListener(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.l.f203295d);
        c22849x81a93d25.suppressLayout(false);
        android.content.Context context = c22849x81a93d25.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        c22849x81a93d25.mo7967x900dcbe1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.C14536x9a32afac(context, 0, false));
        c22849x81a93d25.mo7960x6cab2c8d(eVar);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.o oVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.o(c22849x81a93d25, this, cVar, null);
        c22849x81a93d25.setTag(cVar.f520443d.f460880d);
        ym5.a1.h(c22849x81a93d25, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.p1587xd4ed8f6e.n(this, c22849x81a93d25, cVar, z17, h0Var, s0Var, oVar));
    }

    public final void q(android.widget.TextView textView, r45.le1 le1Var) {
        java.lang.String str = le1Var.f460892s;
        if (str == null || str.length() == 0) {
            textView.setVisibility(8);
            return;
        }
        textView.setVisibility(0);
        textView.setText(le1Var.f460892s);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3 a3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3.f196976a;
        java.util.LinkedList theme_sub_text_color = le1Var.f460893t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(theme_sub_text_color, "theme_sub_text_color");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3.e(a3Var, textView, theme_sub_text_color, null, null, 6, null);
    }

    public final void r(android.widget.TextView textView, r45.le1 le1Var) {
        textView.setText(le1Var.f460885i);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3 a3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3.f196976a;
        java.util.LinkedList theme_text_color = le1Var.f460887n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(theme_text_color, "theme_text_color");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.a3.e(a3Var, textView, theme_text_color, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.u2.f197248d, null, 4, null);
    }

    public final void s(android.widget.ImageView imageView, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa) {
        mn2.g1 g1Var = mn2.g1.f411508a;
        vo0.d a17 = g1Var.a();
        java.lang.String m76175x6d346f39 = c19782x23db1cfa.m76175x6d346f39();
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (m76175x6d346f39 == null) {
            m76175x6d346f39 = "";
        }
        a17.c(new mn2.n(m76175x6d346f39, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.X), imageView, g1Var.h(mn2.f1.f411490h));
    }

    public final void t(in5.s0 s0Var, android.view.View view, r45.le1 le1Var) {
        o(s0Var, le1Var);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.obc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        r((android.widget.TextView) findViewById, le1Var);
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.qlp);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        q((android.widget.TextView) findViewById2, le1Var);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.obc);
        textView.getPaint().setShader(new android.graphics.LinearGradient(0.0f, 0.0f, textView.getPaint().measureText(textView.getText().toString()), textView.getTextSize(), new int[]{android.graphics.Color.parseColor("#F5D4C2"), android.graphics.Color.parseColor("#C9A693")}, (float[]) null, android.graphics.Shader.TileMode.CLAMP));
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.qnr);
        android.view.View findViewById4 = view.findViewById(com.p314xaae8f345.mm.R.id.qns);
        android.view.View findViewById5 = view.findViewById(com.p314xaae8f345.mm.R.id.qnt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById3);
        u(findViewById3, le1Var, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById4);
        u(findViewById4, le1Var, 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(findViewById5);
        u(findViewById5, le1Var, 2);
    }

    public final void u(android.view.View view, r45.le1 le1Var, int i17) {
        java.util.LinkedList linkedList;
        java.util.LinkedList product_group = le1Var.f460896w;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(product_group, "product_group");
        r45.ue1 ue1Var = (r45.ue1) kz5.n0.Z(product_group);
        r45.te1 te1Var = (ue1Var == null || (linkedList = ue1Var.f468826f) == null) ? null : (r45.te1) kz5.n0.a0(linkedList, i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("bind product ");
        sb6.append(te1Var != null ? te1Var.f467878e : null);
        sb6.append(" at index ");
        sb6.append(i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f203475h, sb6.toString());
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f567974l74);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.l7a);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f568438mu5);
        if (te1Var == null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardConvert", "bindProductItem", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveAggregationCard;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardConvert", "bindProductItem", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveAggregationCard;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardConvert", "bindProductItem", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveAggregationCard;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/nearby/newlivesquare/adapter/main/viewconvert/AggregationCardConvert", "bindProductItem", "(Landroid/view/View;Lcom/tencent/mm/protocal/protobuf/FinderLiveAggregationCard;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String str = te1Var.f467878e;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb());
        vd2.i5 i5Var = (vd2.i5) i95.n0.c(vd2.i5.class);
        java.lang.String str2 = te1Var.f467877d;
        wo0.c a17 = d1Var.a(((c61.i8) i5Var).Ai(str2 != null ? str2 : "", com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        a17.c(imageView);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = te1Var.f467879f;
        if (c19782x23db1cfa != null) {
            textView2.setText(c19782x23db1cfa.m76184x8010e5e4());
        }
    }
}
