package rf2;

/* loaded from: classes10.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f476246d;

    /* renamed from: e, reason: collision with root package name */
    public final df2.ln f476247e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f476248f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f476249g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f476250h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f476251i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f476252m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f476253n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 f476254o;

    /* renamed from: p, reason: collision with root package name */
    public android.view.View f476255p;

    /* renamed from: q, reason: collision with root package name */
    public android.widget.TextView f476256q;

    /* renamed from: r, reason: collision with root package name */
    public android.widget.TextView f476257r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f476258s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.TextView f476259t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.TextView f476260u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.TextView f476261v;

    /* renamed from: w, reason: collision with root package name */
    public final jz5.g f476262w;

    public f(android.view.View root, df2.ln controller) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
        this.f476246d = root;
        this.f476247e = controller;
        this.f476248f = controller.f312209m;
        this.f476262w = jz5.h.b(rf2.b.f476191d);
    }

    public final java.util.ArrayList a() {
        return (java.util.ArrayList) ((jz5.n) this.f476262w).mo141623x754a37bb();
    }

    public final void b() {
        android.view.View view = this.f476250h;
        android.widget.TextView textView = null;
        if (view == null) {
            view = (android.view.ViewGroup) this.f476246d.findViewById(com.p314xaae8f345.mm.R.id.iso);
            if (view != null) {
                view.setOnClickListener(this);
            } else {
                view = null;
            }
        }
        this.f476250h = view;
        android.view.View view2 = this.f476251i;
        if (view2 == null) {
            if (view == null || (view2 = view.findViewById(com.p314xaae8f345.mm.R.id.p8z)) == null) {
                view2 = null;
            } else {
                view2.setOnClickListener(this);
            }
        }
        this.f476251i = view2;
        android.widget.TextView textView2 = this.f476252m;
        if (textView2 == null) {
            android.view.View view3 = this.f476250h;
            if (view3 == null || (textView2 = (android.widget.TextView) view3.findViewById(com.p314xaae8f345.mm.R.id.f569165p92)) == null) {
                textView2 = null;
            } else {
                d92.f fVar = d92.f.f309003a;
                android.content.Context context = textView2.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                d92.f.a(fVar, context, textView2, 17.0f, 0.0f, 8, null);
            }
        }
        this.f476252m = textView2;
        android.widget.TextView textView3 = this.f476253n;
        if (textView3 == null) {
            android.view.View view4 = this.f476250h;
            textView3 = view4 != null ? (android.widget.TextView) view4.findViewById(com.p314xaae8f345.mm.R.id.p_1) : null;
        }
        this.f476253n = textView3;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = this.f476254o;
        if (c22849x81a93d25 == null) {
            android.view.View view5 = this.f476250h;
            if (view5 == null || (c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) view5.findViewById(com.p314xaae8f345.mm.R.id.f565248bu2)) == null) {
                c22849x81a93d25 = null;
            } else if (c22849x81a93d25.m7950x883dc776() <= 0) {
                c22849x81a93d25.N(new rf2.c(this));
            }
        }
        this.f476254o = c22849x81a93d25;
        android.view.View view6 = this.f476255p;
        if (view6 == null) {
            android.view.View view7 = this.f476250h;
            view6 = view7 != null ? view7.findViewById(com.p314xaae8f345.mm.R.id.p_5) : null;
        }
        this.f476255p = view6;
        android.widget.TextView textView4 = this.f476256q;
        if (textView4 == null) {
            android.view.View view8 = this.f476250h;
            textView4 = view8 != null ? (android.widget.TextView) view8.findViewById(com.p314xaae8f345.mm.R.id.p_4) : null;
        }
        this.f476256q = textView4;
        android.widget.TextView textView5 = this.f476257r;
        if (textView5 == null) {
            android.view.View view9 = this.f476250h;
            textView5 = view9 != null ? (android.widget.TextView) view9.findViewById(com.p314xaae8f345.mm.R.id.f564603vr) : null;
        }
        this.f476257r = textView5;
        android.view.View view10 = this.f476258s;
        if (view10 == null) {
            android.view.View view11 = this.f476250h;
            view10 = view11 != null ? view11.findViewById(com.p314xaae8f345.mm.R.id.buc) : null;
        }
        this.f476258s = view10;
        android.widget.TextView textView6 = this.f476259t;
        if (textView6 == null) {
            android.view.View view12 = this.f476250h;
            textView6 = view12 != null ? (android.widget.TextView) view12.findViewById(com.p314xaae8f345.mm.R.id.ouh) : null;
        }
        this.f476259t = textView6;
        android.widget.TextView textView7 = this.f476261v;
        if (textView7 == null) {
            android.view.View view13 = this.f476250h;
            textView7 = view13 != null ? (android.widget.TextView) view13.findViewById(com.p314xaae8f345.mm.R.id.f569163p90) : null;
        }
        this.f476261v = textView7;
        android.widget.TextView textView8 = this.f476260u;
        if (textView8 == null) {
            android.view.View view14 = this.f476250h;
            if (view14 != null) {
                textView = (android.widget.TextView) view14.findViewById(com.p314xaae8f345.mm.R.id.f569164p91);
            }
        } else {
            textView = textView8;
        }
        this.f476260u = textView;
    }

    public final void c(int i17) {
        boolean E = zl2.q4.f555466a.E();
        java.lang.String str = this.f476248f;
        if (E) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVisible:");
            sb6.append(i17);
            sb6.append(",voteDescContainer visibility:");
            android.view.View view = this.f476250h;
            sb6.append(view != null ? java.lang.Integer.valueOf(view.getVisibility()) : null);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(str, sb6.toString(), new java.lang.Object[0]);
        } else {
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("setVisible:");
            sb7.append(i17);
            sb7.append(",voteDescContainer visibility:");
            android.view.View view2 = this.f476250h;
            sb7.append(view2 != null ? java.lang.Integer.valueOf(view2.getVisibility()) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7.toString());
        }
        if (this.f476250h == null) {
            b();
        }
        android.view.View view3 = this.f476250h;
        if (view3 == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view3, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.p8z) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this.f476247e, null, null, new rf2.e(this, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/milestonelottery/LiveMileStoneLotteryResultVoteDescPage", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
