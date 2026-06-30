package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

@db5.a(m123858x6ac9171 = 32)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/tencent/mm/plugin/finder/feed/ui/FinderLiveWhiteListUI;", "Lcom/tencent/mm/plugin/finder/ui/MMLiveFinderUI;", "Landroid/view/View$OnClickListener;", "Landroid/view/View;", org.p3343x72743996.p3344x2e06d1.C29284xa13724f3.V, "Ljz5/f0;", "onClick", "<init>", "()V", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.feed.ui.FinderLiveWhiteListUI */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC14047x4c222b89 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806 implements android.view.View.OnClickListener {
    public static final /* synthetic */ int F = 0;
    public final java.util.LinkedList A = new java.util.LinkedList();
    public final java.util.LinkedList B = new java.util.LinkedList();
    public final java.util.LinkedList C = new java.util.LinkedList();
    public final java.util.LinkedList D = new java.util.LinkedList();
    public final java.util.LinkedList E = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public android.view.View f190985v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.TextView f190986w;

    /* renamed from: x, reason: collision with root package name */
    public android.widget.TextView f190987x;

    /* renamed from: y, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f190988y;

    /* renamed from: z, reason: collision with root package name */
    public bm2.v8 f190989z;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: X6 */
    public java.lang.String getF190953v() {
        return "Finder.FinderLiveWhiteListUI";
    }

    public final void d7(java.lang.String str, java.util.LinkedList linkedList) {
        java.io.Serializable serializableExtra = getIntent().getSerializableExtra(str);
        java.util.List list = serializableExtra instanceof java.util.List ? (java.util.List) serializableExtra : null;
        if (list != null) {
            zl2.r4.f555483a.G2(list, linkedList);
        }
    }

    public final void e7() {
        java.util.LinkedList linkedList = this.B;
        if (linkedList.size() == 0) {
            android.widget.TextView textView = this.f190987x;
            if (textView != null) {
                textView.setText(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nwk));
                return;
            }
            return;
        }
        android.widget.TextView textView2 = this.f190987x;
        if (textView2 != null) {
            textView2.setText(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.nwj, java.lang.Integer.valueOf(linkedList.size())));
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570555b22;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/FinderLiveWhiteListUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.g6h) {
            android.content.Intent intent = new android.content.Intent();
            java.util.LinkedList linkedList = this.B;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((r45.il1) it.next()).mo14344x5f01b1f6());
            }
            intent.putExtra("KEY_PARAMS_CHOOSE_WHITE_LIST", arrayList2);
            setResult(-1, intent);
            finish();
        } else if (valueOf != null && valueOf.intValue() == com.p314xaae8f345.mm.R.id.b5w) {
            setResult(0);
            finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/FinderLiveWhiteListUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15088xfbe96806, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.Object obj;
        java.lang.Object obj2;
        boolean z17;
        java.lang.Object obj3;
        android.view.View view;
        mo2550x7c2abd06(1);
        super.onCreate(bundle);
        mo55332x76847179().getWindow().addFlags(2097280);
        mo55332x76847179().getWindow().addFlags(67108864);
        mo55332x76847179().getWindow().clearFlags(67108864);
        mo55332x76847179().getWindow().getDecorView().setSystemUiVisibility(1792);
        mo55332x76847179().getWindow().addFlags(Integer.MIN_VALUE);
        mo55332x76847179().getWindow().setStatusBarColor(0);
        mo55332x76847179().getWindow().setNavigationBarColor(0);
        mo55332x76847179().getWindow().setFormat(-3);
        mo55332x76847179().getWindow().setSoftInputMode(51);
        mo78514x143f1b92().O0(com.p314xaae8f345.mm.ui.bk.C());
        this.f190985v = findViewById(com.p314xaae8f345.mm.R.id.oca);
        if (!lk5.s.b(this) && (view = this.f190985v) != null) {
            view.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ff(this));
        }
        this.f190986w = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.b5w);
        this.f190987x = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.g6h);
        this.f190988y = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById(com.p314xaae8f345.mm.R.id.plz);
        android.widget.TextView textView = this.f190987x;
        if (textView != null) {
            textView.setOnClickListener(this);
        }
        android.widget.TextView textView2 = this.f190986w;
        if (textView2 != null) {
            textView2.setOnClickListener(this);
        }
        bm2.v8 v8Var = new bm2.v8();
        v8Var.f103924d = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.gf(this);
        this.f190989z = v8Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f190988y;
        if (c1163xf1deaba4 != null) {
            c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(c1163xf1deaba4.getContext(), 1, false));
            c1163xf1deaba4.mo7960x6cab2c8d(this.f190989z);
            android.view.ViewGroup.LayoutParams layoutParams = c1163xf1deaba4.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = com.p314xaae8f345.mm.ui.bl.c(c1163xf1deaba4.getContext());
            }
        }
        java.util.LinkedList<r45.il1> linkedList = this.A;
        d7("KEY_PARAMS_WHITE_LIST", linkedList);
        java.util.LinkedList linkedList2 = this.B;
        d7("KEY_PARAMS_CHOOSE_WHITE_LIST", linkedList2);
        java.util.LinkedList linkedList3 = this.C;
        d7("KEY_PARAMS_FORBID_SELECT_WHITE_LIST", linkedList3);
        java.util.LinkedList linkedList4 = this.D;
        d7("KEY_PARAMS_FORBID_UNSELECT_WHITE_LIST", linkedList4);
        java.util.LinkedList linkedList5 = this.E;
        linkedList5.clear();
        for (r45.il1 il1Var : linkedList) {
            java.util.Iterator it = linkedList2.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.il1) obj).m75945x2fec8307(0), il1Var.m75945x2fec8307(0))) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            boolean z18 = obj != null;
            java.util.Iterator it6 = linkedList3.iterator();
            while (true) {
                if (it6.hasNext()) {
                    obj2 = it6.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.il1) obj2).m75945x2fec8307(0), il1Var.m75945x2fec8307(0))) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            if (obj2 == null) {
                java.util.Iterator it7 = linkedList4.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        obj3 = it7.next();
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.il1) obj3).m75945x2fec8307(0), il1Var.m75945x2fec8307(0))) {
                            break;
                        }
                    } else {
                        obj3 = null;
                        break;
                    }
                }
                if (obj3 == null) {
                    z17 = true;
                    linkedList5.add(new bm2.r8(z18, il1Var, 0, z17, 4, null));
                }
            }
            z17 = false;
            linkedList5.add(new bm2.r8(z18, il1Var, 0, z17, 4, null));
        }
        bm2.v8 v8Var2 = this.f190989z;
        if (v8Var2 != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateWhiteList,ori size:");
            java.util.LinkedList linkedList6 = v8Var2.f103925e;
            sb6.append(linkedList6.size());
            sb6.append(",new size:");
            sb6.append(java.lang.Integer.valueOf(linkedList5.size()));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveWhiteListAdapter", sb6.toString());
            linkedList6.clear();
            linkedList6.addAll(linkedList5);
        }
        bm2.v8 v8Var3 = this.f190989z;
        if (v8Var3 != null) {
            v8Var3.m8146xced61ae5();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveWhiteListUI", "initLogic visitorWhiteList size:" + linkedList.size() + ",chooseWhiteList size:" + linkedList2.size() + ",forbidSelectWhiteList size:" + linkedList3.size() + ",forbidUnSelectWhiteList size:" + linkedList4.size());
        e7();
    }
}
