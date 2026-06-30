package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u0001:\u0007\r\u000e\u000f\u0010\u0011\u0012\u0002B%\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u001d\b\u0016\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\fJ\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/fav/ui/widget/FavTopTagPanel;", "Lcom/tencent/mm/ui/base/MMTagPanel;", "Lw82/t0;", "getSearchInfo", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "w82/n0", "w82/o0", "w82/p0", "w82/q0", "w82/r0", "w82/s0", "ui-fav_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel */
/* loaded from: classes11.dex */
public final class C13624x28778504 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a {

    /* renamed from: x1, reason: collision with root package name */
    public static final java.lang.String f183092x1;
    public final java.util.ArrayList M;
    public final java.util.HashMap N;
    public int P;
    public w82.q0 Q;
    public w82.r0 R;
    public w82.o0 S;
    public w82.p0 T;
    public w82.n0 U;
    public final java.util.ArrayList V;
    public final java.util.ArrayList W;

    /* renamed from: l1, reason: collision with root package name */
    public int f183093l1;

    /* renamed from: p0, reason: collision with root package name */
    public final java.util.ArrayList f183094p0;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f183095p1;

    /* renamed from: x0, reason: collision with root package name */
    public java.lang.String f183096x0;

    /* renamed from: y0, reason: collision with root package name */
    public java.lang.String f183097y0;

    static {
        java.lang.String r17 = i65.a.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.c_1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        f183092x1 = r17;
    }

    public C13624x28778504(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.M = new java.util.ArrayList();
        this.N = new java.util.HashMap();
        this.P = 1;
        this.V = new java.util.ArrayList();
        this.W = new java.util.ArrayList();
        this.f183094p0 = new java.util.ArrayList();
        this.f183096x0 = "";
        this.f183097y0 = "";
        this.f183093l1 = 1;
        l();
    }

    private final void l() {
        m79133xb7cc93f7(i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561463ja));
        m79125xd60a4a33(f183092x1);
        m79126x666e2e0a(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560252fa));
        m79139xb10bdb09(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
        m79141x9bf884bd(com.p314xaae8f345.mm.R.C30859x5a72f63.aaq);
        m79136x213c66d4(0);
        k(true);
        this.f279116o = false;
        this.f279117p = true;
        m79145xc5bfc73a(true);
        this.F.setSingleLine();
        m79124x6c4032e7(new w82.y0(this));
        m79119xbc895012().setOnFocusChangeListener(new w82.z0(m79119xbc895012().getOnFocusChangeListener(), this));
        m79119xbc895012().setOnClickListener(new w82.a1(this));
        this.L = new w82.b1(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopTagPanel", "[clearEditFocus] cursor visible close");
        super.f();
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m79118xdb574fcd())) {
            java.lang.String m79118xdb574fcd = m79118xdb574fcd();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m79118xdb574fcd, "getEditText(...)");
            v(new w82.s0(m79118xdb574fcd, 3, true));
            m79119xbc895012().setText("");
        }
        m79119xbc895012().setCursorVisible(false);
    }

    /* renamed from: getSearchInfo */
    public final w82.t0 m55403xc3e2e26c() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList.addAll(this.V);
        arrayList2.addAll(this.W);
        java.util.ArrayList arrayList4 = this.f183094p0;
        arrayList3.addAll(arrayList4);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m79118xdb574fcd()) && !arrayList4.contains(m79118xdb574fcd())) {
            arrayList3.add(m79118xdb574fcd());
        }
        return new w82.t0(arrayList, arrayList2, arrayList3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        if (isLayoutRequested() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
    
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        if (r4 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        r1 = r0.Q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r1 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.r7) r1).a(getHeight(), r3.f391645d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        post(new w82.c1(r0, r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003c, code lost:
    
        if (r1 == false) goto L25;
     */
    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21475x81dbaa18, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r1, int r2, int r3, int r4, int r5) {
        /*
            r0 = this;
            super.onLayout(r1, r2, r3, r4, r5)
            int r1 = r0.P
            int r2 = r0.f278790g
            if (r1 == r2) goto L5a
            r3 = 3
            if (r2 > r3) goto L5a
            kotlin.jvm.internal.c0 r3 = new kotlin.jvm.internal.c0
            r3.<init>()
            r4 = 1
            r3.f391645d = r4
            r5 = 0
            if (r2 >= r1) goto L1b
            if (r2 == r4) goto L1b
            r3.f391645d = r5
        L1b:
            boolean r1 = r0.isInLayout()
            if (r1 == 0) goto L28
            boolean r1 = r0.isLayoutRequested()
            if (r1 != 0) goto L3f
            goto L40
        L28:
            android.view.ViewParent r1 = r0.getParent()
        L2c:
            if (r1 == 0) goto L3b
            boolean r2 = r1.isLayoutRequested()
            if (r2 == 0) goto L36
            r1 = r4
            goto L3c
        L36:
            android.view.ViewParent r1 = r1.getParent()
            goto L2c
        L3b:
            r1 = r5
        L3c:
            if (r1 != 0) goto L3f
            goto L40
        L3f:
            r4 = r5
        L40:
            if (r4 == 0) goto L52
            w82.q0 r1 = r0.Q
            if (r1 == 0) goto L5a
            int r2 = r0.getHeight()
            boolean r3 = r3.f391645d
            com.tencent.mm.plugin.fav.ui.r7 r1 = (com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.r7) r1
            r1.a(r2, r3)
            goto L5a
        L52:
            w82.c1 r1 = new w82.c1
            r1.<init>(r0, r3)
            r0.post(r1)
        L5a:
            int r1 = r0.f278790g
            r0.P = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13624x28778504.onLayout(boolean, int, int, int, int):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.C21516xe823d84a
    public void q() {
        if (m79119xbc895012() != null) {
            m79119xbc895012().setVisibility(0);
        }
        super.q();
    }

    public final void v(w82.s0 panelInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panelInfo, "panelInfo");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[addPanel] panel content = ");
        java.lang.String str = panelInfo.f525458a;
        sb6.append(str);
        sb6.append(", panel type = ");
        int i17 = panelInfo.f525459b;
        sb6.append(i17);
        sb6.append(", panel canCancel = ");
        boolean z17 = panelInfo.f525460c;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopTagPanel", sb6.toString());
        java.util.ArrayList arrayList = this.M;
        boolean z18 = false;
        if (arrayList.contains(panelInfo)) {
            int childCount = getChildCount();
            for (int i18 = 0; i18 < childCount; i18++) {
                android.view.View childAt = getChildAt(i18);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(childAt.getTag(), panelInfo) && i17 != 3) {
                    w(childAt);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopTagPanel", "[addPanel] panelList flashFrame call, index = " + i18);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopTagPanel", "[addPanel] panelList already contains panelInfo, return");
            return;
        }
        android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
        linearLayout.setOrientation(0);
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(-2, -2);
        int f17 = i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561181bn);
        linearLayout.setPadding(i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), f17, f17, f17);
        linearLayout.setBackground(i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f563010tz));
        linearLayout.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(getContext());
        int a17 = ym5.x.a(getContext(), 18);
        android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(a17, a17);
        layoutParams2.gravity = 17;
        c22699x3dcdb352.setLayoutParams(layoutParams2);
        if (i17 == 1) {
            c22699x3dcdb352.setVisibility(0);
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79103x37d8c7d2);
        } else if (i17 != 2) {
            c22699x3dcdb352.setVisibility(8);
        } else {
            c22699x3dcdb352.setVisibility(0);
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79107x6ae9151d);
        }
        c22699x3dcdb352.m82040x7541828(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560252fa));
        android.widget.TextView textView = new android.widget.TextView(getContext());
        textView.setId(com.p314xaae8f345.mm.R.id.dvf);
        textView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
        textView.setTextSize(14);
        textView.setSingleLine(true);
        textView.setPadding(i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561179bl), 0, 0, 0);
        textView.setTextColor(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560252fa));
        textView.setText(str);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-2, -2));
        linearLayout.addView(c22699x3dcdb352);
        linearLayout.addView(textView);
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb3522 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(getContext());
            int a18 = ym5.x.a(getContext(), 16);
            android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(a18, a18);
            layoutParams3.gravity = 17;
            c22699x3dcdb3522.setLayoutParams(layoutParams3);
            c22699x3dcdb3522.setImageResource(com.p314xaae8f345.mm.R.raw.f81204xe616867f);
            c22699x3dcdb3522.m82040x7541828(i65.a.d(getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.f560252fa));
            c22699x3dcdb3522.setOnClickListener(new w82.u0(this, panelInfo));
            linearLayout.addView(c22699x3dcdb3522);
            c22699x3dcdb3522.post(new w82.v0(this, c22699x3dcdb3522));
        }
        linearLayout.setTag(panelInfo);
        if (i17 == 1) {
            this.V.add(str);
            int size = arrayList.size();
            int i19 = -1;
            for (int i27 = 0; i27 < size; i27++) {
                java.lang.Object obj = arrayList.get(i27);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                if (((w82.s0) obj).f525459b == 1) {
                    i19 = i27;
                }
            }
            if (i19 != -1) {
                java.lang.Object obj2 = arrayList.get(i19);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
                y((w82.s0) obj2, false, 18);
            }
            addView(linearLayout, 0);
            arrayList.add(0, panelInfo);
            if (i19 != -1) {
                w(linearLayout);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopTagPanel", "[addPanel] add panel in list head, panel = " + panelInfo);
        }
        if (i17 == 2) {
            this.W.add(str);
            java.util.Iterator it = arrayList.iterator();
            int i28 = 0;
            while (it.hasNext() && ((w82.s0) it.next()).f525459b != 3) {
                i28++;
            }
            addView(linearLayout, i28);
            arrayList.add(i28, panelInfo);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopTagPanel", "[addPanel] add panel in list center, panel = " + panelInfo + ", addPosition = " + i28);
        }
        if (i17 == 3) {
            java.util.ArrayList arrayList2 = this.f183094p0;
            if (!arrayList2.contains(str)) {
                arrayList2.add(str);
                addView(linearLayout, getChildCount() - 1);
                arrayList.add(panelInfo);
                f();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopTagPanel", "[addPanel] add panel in list tail, panel = " + panelInfo);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopTagPanel", "[addPanel] panelList = " + arrayList);
                this.N.put(panelInfo, linearLayout);
                x(z18, 17);
                this.f183095p1 = true;
                f();
            }
        }
        z18 = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopTagPanel", "[addPanel] panelList = " + arrayList);
        this.N.put(panelInfo, linearLayout);
        x(z18, 17);
        this.f183095p1 = true;
        f();
    }

    public final void w(android.view.View view) {
        view.setBackground(i65.a.i(getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.f563011u0));
        view.invalidate();
        postDelayed(new w82.x0(view, this), 300L);
    }

    public final void x(boolean z17, int i17) {
        w82.r0 r0Var;
        if (this.M.size() > 0) {
            m79119xbc895012().setHint("");
        } else {
            m79119xbc895012().setHint(f183092x1);
        }
        if (!z17 || (r0Var = this.R) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopFilter", "[onPanelChange] onPanelChange type = " + i17);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7 z7Var = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.t7) r0Var).f182983a;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7.a(z7Var);
        if (i17 != 19) {
            z7Var.d();
        }
        z7Var.f183197j.post(new com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.s7(z7Var));
    }

    public final void y(w82.s0 panelInfo, boolean z17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panelInfo, "panelInfo");
        android.view.View view = (android.view.View) this.N.get(panelInfo);
        java.util.ArrayList arrayList = this.M;
        if (view != null) {
            removeView(view);
            arrayList.remove(panelInfo);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopTagPanel", "[removePanel] remove panel from list, panel = " + panelInfo);
            java.lang.String str = panelInfo.f525458a;
            int i18 = panelInfo.f525459b;
            if (i18 == 2) {
                this.W.remove(str);
            }
            if (i18 == 1) {
                this.V.remove(str);
            }
            if (i18 == 3) {
                this.f183094p0.remove(str);
            }
            x(z17, i17);
        }
        if (arrayList.size() == 0) {
            m79119xbc895012().requestFocus();
        }
    }

    public C13624x28778504(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.M = new java.util.ArrayList();
        this.N = new java.util.HashMap();
        this.P = 1;
        this.V = new java.util.ArrayList();
        this.W = new java.util.ArrayList();
        this.f183094p0 = new java.util.ArrayList();
        this.f183096x0 = "";
        this.f183097y0 = "";
        this.f183093l1 = 1;
        l();
    }
}
