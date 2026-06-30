package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class h7 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 implements android.view.View.OnClickListener {
    public final gk2.e H;
    public final te2.j0 I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f200083J;
    public android.widget.TextView K;
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 L;
    public android.view.View M;
    public android.widget.CheckBox N;
    public android.widget.TextView P;
    public android.widget.ProgressBar Q;
    public final bm2.t R;
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.g1 S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7(android.content.Context context, gk2.e liveData, te2.j0 j0Var) {
        super(context, false, null, 0.75f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        this.H = liveData;
        this.I = j0Var;
        this.R = new bm2.t();
        this.S = new p012xc85e97e9.p103xe821e364.p104xd1075a44.g1(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.f7(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.amh;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.jyu);
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        this.f200083J = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.jyn);
        this.K = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.jyr);
        this.L = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) rootView.findViewById(com.p314xaae8f345.mm.R.id.jyt);
        this.M = rootView.findViewById(com.p314xaae8f345.mm.R.id.elu);
        this.N = (android.widget.CheckBox) rootView.findViewById(com.p314xaae8f345.mm.R.id.jyo);
        this.P = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.jyq);
        this.Q = (android.widget.ProgressBar) rootView.findViewById(com.p314xaae8f345.mm.R.id.jys);
        android.widget.TextView textView2 = this.f200083J;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        android.widget.TextView textView3 = this.K;
        if (textView3 != null) {
            textView3.setOnClickListener(this);
        }
        android.widget.CheckBox checkBox = this.N;
        if (checkBox != null) {
            checkBox.setOnClickListener(this);
        }
        android.widget.TextView textView4 = this.P;
        if (textView4 != null) {
            textView4.setOnClickListener(this);
        }
        bm2.t tVar = this.R;
        tVar.f103836r = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e7(this, tVar);
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.L;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7960x6cab2c8d(tVar);
            c22849x81a93d25.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c22849x81a93d25.getContext()));
            this.S.d(c22849x81a93d25);
        }
    }

    public final void e0(boolean z17) {
        if (z17) {
            android.widget.TextView textView = this.P;
            if (textView != null) {
                textView.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77758x20e832));
                return;
            }
            return;
        }
        android.widget.TextView textView2 = this.P;
        if (textView2 != null) {
            textView2.setTextColor(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77764x20e834));
        }
    }

    public final void f0(boolean z17) {
        if (z17) {
            android.widget.ProgressBar progressBar = this.Q;
            if (progressBar != null) {
                progressBar.setVisibility(0);
            }
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.L;
            if (c22849x81a93d25 != null) {
                c22849x81a93d25.setVisibility(4);
            }
            android.view.View view = this.M;
            if (view == null) {
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEditWidget", "setLoadingState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEditWidget", "setLoadingState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.widget.ProgressBar progressBar2 = this.Q;
        if (progressBar2 != null) {
            progressBar2.setVisibility(8);
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.L;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.setVisibility(0);
        }
        android.view.View view2 = this.M;
        if (view2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEditWidget", "setLoadingState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/widget/FinderLiveAnchorMusicEditWidget", "setLoadingState", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void g0(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 e0Var) {
        if (!z17) {
            java.util.Iterator it = this.R.f103831m.iterator();
            while (it.hasNext()) {
                ((dk2.vg) it.next()).f315791e = false;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
            return;
        }
        dk2.p Z6 = ((mm2.c1) this.H.a(mm2.c1.class)).Z6();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isMusicInfoComplete musicSize:");
        java.util.ArrayList arrayList = Z6.f315410f;
        sb6.append(arrayList.size());
        sb6.append(", songIdSize:");
        sb6.append(Z6.f315409e.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicData", sb6.toString());
        if (arrayList.size() == Z6.f315409e.size()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(this, e0Var, false, 0, 6, null);
            h0();
            return;
        }
        f0(true);
        te2.j0 j0Var = this.I;
        if (j0Var != null) {
            te2.l0.A0(j0Var, true, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g7(this, e0Var), 2, null);
        }
    }

    public final void h0() {
        android.widget.CheckBox checkBox = this.N;
        if (checkBox != null) {
            checkBox.setChecked(false);
        }
        e0(false);
        f0(false);
        gk2.e eVar = this.H;
        java.util.Iterator it = ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f315410f.iterator();
        while (it.hasNext()) {
            ((dk2.vg) it.next()).f315791e = false;
        }
        java.util.List songIdList = ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f315409e;
        java.util.ArrayList dataList = ((mm2.c1) eVar.a(mm2.c1.class)).Z6().f315410f;
        dk2.vg d17 = ((mm2.c1) eVar.a(mm2.c1.class)).Z6().d();
        bm2.t tVar = this.R;
        tVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(songIdList, "songIdList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        java.util.ArrayList arrayList = tVar.f103832n;
        arrayList.clear();
        arrayList.add(tVar.f103833o);
        java.util.List list = tVar.f103830i;
        list.clear();
        list.addAll(songIdList);
        java.util.ArrayList arrayList2 = tVar.f103831m;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        arrayList2.addAll(dataList);
        tVar.f103834p = d17;
        tVar.f103835q = d17;
        tVar.m8146xced61ae5();
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0293, code lost:
    
        ((te2.p1) r20).y();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x025e, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0253, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x025d, code lost:
    
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0216, code lost:
    
        r2 = new java.lang.StringBuilder("music_edit_finish_tv nextPlayItem:");
        r2.append(r0);
        r2.append(",find playItem:");
        r0 = r1.f384366d;
        r2.append(r0);
        r2.append(", pos:");
        r1 = (java.lang.Number) r1.f384367e;
        r2.append(r1.intValue());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAnchorMusicEditWidget", r2.toString());
        r2 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0245, code lost:
    
        if (r23 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0247, code lost:
    
        r3 = r2.f315787a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0249, code lost:
    
        if (r3 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x024b, code lost:
    
        r4 = (dk2.vg) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x024e, code lost:
    
        if (r4 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0250, code lost:
    
        r4 = r4.f315787a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0254, code lost:
    
        r3 = dk2.q.d(r3, r4);
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0259, code lost:
    
        if (r3 != true) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x025b, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x025f, code lost:
    
        if (r3 == false) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0263, code lost:
    
        if (r2.f315788b == r4) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x029a, code lost:
    
        if (r20 == null) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x029c, code lost:
    
        ((te2.p1) r20).s(((te2.p1) r20).f499830r);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02a9, code lost:
    
        r1 = null;
        r2 = r31;
        r2.g0(false, null);
        r22 = ((mm2.e1) r15.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0);
        r3 = ((mm2.e1) r15.a(mm2.e1.class)).f410518o;
        r25 = xy2.c.e(r2.f199716e);
        r12 = ((mm2.e1) r15.a(mm2.e1.class)).f410516m;
        r28 = ((mm2.c1) r15.a(mm2.c1.class)).Z6().f();
        new ek2.p1(r22, r3, r25, r12, r28, 3, new xl2.a(r22, r3, r25, r12, r28)).l();
        r0 = ((mm2.c1) r15.a(mm2.c1.class)).a8();
        r3 = ml2.u2.f409642d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x030f, code lost:
    
        if (r20 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0311, code lost:
    
        r1 = ((te2.p1) r20).f499830r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0317, code lost:
    
        r19.a(r0, 7, "0", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0265, code lost:
    
        r9 = (dk2.vg) r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0268, code lost:
    
        if (r9 == null) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x026a, code lost:
    
        if (r20 == null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x026c, code lost:
    
        te2.j0.M3(r20, r9, r1.intValue(), false, 4, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0278, code lost:
    
        r9 = ((mm2.c1) r15.a(mm2.c1.class)).a8();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0);
        r19.c(r9, 2, (dk2.vg) r0, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0291, code lost:
    
        if (r20 == null) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x020a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e7  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onClick(android.view.View r32) {
        /*
            Method dump skipped, instructions count: 1195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.h7.onClick(android.view.View):void");
    }
}
