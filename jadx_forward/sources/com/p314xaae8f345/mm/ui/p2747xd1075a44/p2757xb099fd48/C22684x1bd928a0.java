package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48;

/* renamed from: com.tencent.mm.ui.widget.dialog.MMFilterDialog */
/* loaded from: classes12.dex */
public class C22684x1bd928a0 extends android.widget.LinearLayout {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f293223t = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f293224d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f293225e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f293226f;

    /* renamed from: g, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f293227g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q2 f293228h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f293229i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.s2 f293230m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.x2 f293231n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y2 f293232o;

    /* renamed from: p, reason: collision with root package name */
    public int f293233p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f293234q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.animation.Animation f293235r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.animation.Animation f293236s;

    public C22684x1bd928a0(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f293231n = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.x2.DivideEqual;
        this.f293232o = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y2.Grey;
        this.f293233p = -1;
        this.f293234q = new java.util.ArrayList();
        b(context, attributeSet);
    }

    public final void a() {
        int i17 = this.f293233p;
        if (i17 >= 0) {
            this.f293230m.m8148xed6e4d18(i17, new android.util.Pair(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t2.IsExpand, java.lang.Boolean.FALSE));
        }
        this.f293233p = -1;
        if (this.f293225e.getVisibility() == 0) {
            android.view.View view = this.f293224d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/dialog/MMFilterDialog", "collapseDropdown", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/widget/dialog/MMFilterDialog", "collapseDropdown", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f293236s.setAnimationListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.m2(this));
            this.f293225e.startAnimation(this.f293236s);
        }
    }

    public final void b(android.content.Context context, android.util.AttributeSet attributeSet) {
        int dimensionPixelSize;
        android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bye, this);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.tas);
        this.f293229i = c1163xf1deaba4;
        c1163xf1deaba4.getClass();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.s2 s2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.s2(this.f293234q, this.f293232o);
        this.f293230m = s2Var;
        s2Var.f293501d = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v2() { // from class: com.tencent.mm.ui.widget.dialog.MMFilterDialog$$a
            @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v2
            public final void a(int i17, java.lang.Object obj) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22684x1bd928a0 c22684x1bd928a0 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22684x1bd928a0.this;
                int i18 = c22684x1bd928a0.f293233p;
                if (i18 == i17) {
                    c22684x1bd928a0.a();
                    return;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t2 t2Var = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.t2.IsExpand;
                if (i18 >= 0) {
                    c22684x1bd928a0.f293230m.m8148xed6e4d18(i18, new android.util.Pair(t2Var, java.lang.Boolean.FALSE));
                }
                c22684x1bd928a0.f293230m.m8148xed6e4d18(i17, new android.util.Pair(t2Var, java.lang.Boolean.TRUE));
                c22684x1bd928a0.f293233p = i17;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q2 q2Var = c22684x1bd928a0.f293228h;
                q2Var.f293486d = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p2) obj;
                q2Var.m8146xced61ae5();
                if (c22684x1bd928a0.f293225e.getVisibility() != 0) {
                    c22684x1bd928a0.f293225e.setVisibility(0);
                    c22684x1bd928a0.f293225e.startAnimation(c22684x1bd928a0.f293235r);
                    if (c22684x1bd928a0.f293224d.getVisibility() != 0) {
                        android.view.View view = c22684x1bd928a0.f293224d;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/dialog/MMFilterDialog", "toggleDropdown", "(ILjava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                        yj0.a.f(view, "com/tencent/mm/ui/widget/dialog/MMFilterDialog", "toggleDropdown", "(ILjava/lang/Object;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                        c22684x1bd928a0.f293224d.startAnimation(android.view.animation.AnimationUtils.loadAnimation(c22684x1bd928a0.getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559316bc));
                    }
                }
            }
        };
        this.f293229i.mo7960x6cab2c8d(s2Var);
        if (this.f293231n == com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.x2.AlignLeft) {
            this.f293229i.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context, 0, false));
        } else {
            this.f293229i.mo7967x900dcbe1(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o2(null));
        }
        this.f293229i.N(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.l2(this, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv)));
        this.f293224d = findViewById(com.p314xaae8f345.mm.R.id.aai);
        this.f293226f = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.af9);
        this.f293225e = (android.widget.LinearLayout) findViewById(com.p314xaae8f345.mm.R.id.czs);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.koq);
        this.f293227g = c1163xf1deaba42;
        c1163xf1deaba42.m7963x830bc99d(true);
        this.f293227g.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q2 q2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.q2(null);
        this.f293228h = q2Var;
        q2Var.f293487e = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v2() { // from class: com.tencent.mm.ui.widget.dialog.MMFilterDialog$$b
            @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.v2
            public final void a(int i17, java.lang.Object obj) {
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22684x1bd928a0.f293223t;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22684x1bd928a0 c22684x1bd928a0 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22684x1bd928a0.this;
                c22684x1bd928a0.getClass();
                if (((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p2) obj).d(i17)) {
                    c22684x1bd928a0.a();
                }
            }
        };
        this.f293227g.mo7960x6cab2c8d(q2Var);
        this.f293228h.m8146xced61ae5();
        this.f293235r = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559387dc);
        this.f293236s = android.view.animation.AnimationUtils.loadAnimation(getContext(), com.p314xaae8f345.mm.R.C30854x2dc211.f559391dg);
        this.f293224d.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.ui.widget.dialog.MMFilterDialog$$c
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22684x1bd928a0.f293223t;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22684x1bd928a0 c22684x1bd928a0 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22684x1bd928a0.this;
                c22684x1bd928a0.getClass();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(view);
                java.lang.Object[] array = arrayList.toArray();
                arrayList.clear();
                yj0.a.b("com/tencent/mm/ui/widget/dialog/MMFilterDialog", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", c22684x1bd928a0, array);
                c22684x1bd928a0.a();
                yj0.a.h(c22684x1bd928a0, "com/tencent/mm/ui/widget/dialog/MMFilterDialog", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        if (attributeSet == null || (dimensionPixelSize = context.obtainStyledAttributes(attributeSet, yl5.a.f544637k).getDimensionPixelSize(0, -1)) <= 0) {
            return;
        }
        this.f293229i.getLayoutParams().height = dimensionPixelSize;
        android.view.ViewGroup.LayoutParams layoutParams = this.f293227g.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = dimensionPixelSize;
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i17) {
        this.f293226f.setBackgroundColor(i17);
        ((android.graphics.drawable.GradientDrawable) this.f293225e.getBackground()).setColor(i17);
    }

    /* renamed from: setFilterItemList */
    public void m81949xf0b64aeb(java.util.List<com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p2> list) {
        java.util.List list2 = this.f293234q;
        java.util.Iterator it = list2.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p2) it.next()).f293478a = null;
        }
        list2.clear();
        list2.addAll(list);
        java.util.Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p2) it6.next()).f293478a = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.C22688xbbff1f44(this);
        }
        this.f293230m.m8146xced61ae5();
    }

    /* renamed from: setLayoutStyle */
    public void m81950xe77956e5(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.x2 x2Var) {
        if (this.f293231n == x2Var) {
            return;
        }
        this.f293231n = x2Var;
        if (x2Var == com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.x2.AlignLeft) {
            this.f293229i.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(getContext(), 0, false));
        } else {
            this.f293229i.mo7967x900dcbe1(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.o2(null));
        }
    }

    /* renamed from: setSheetType */
    public void m81951xbbb2caf7(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y2 y2Var) {
        if (this.f293232o == y2Var) {
            return;
        }
        this.f293232o = y2Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.s2 s2Var = this.f293230m;
        s2Var.f293504g = y2Var;
        s2Var.m8146xced61ae5();
    }

    public C22684x1bd928a0(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f293231n = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.x2.DivideEqual;
        this.f293232o = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y2.Grey;
        this.f293233p = -1;
        this.f293234q = new java.util.ArrayList();
        b(context, attributeSet);
    }
}
