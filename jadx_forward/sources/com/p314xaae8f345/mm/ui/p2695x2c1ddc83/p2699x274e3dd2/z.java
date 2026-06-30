package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2;

/* loaded from: classes11.dex */
public final class z implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.d0 f289705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289706e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yf5.n f289707f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f289708g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yf5.x f289709h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f289710i;

    public z(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.d0 d0Var, java.lang.String str, yf5.n nVar, in5.s0 s0Var, yf5.x xVar, int i17) {
        this.f289705d = d0Var;
        this.f289706e = str;
        this.f289707f = nVar;
        this.f289708g = s0Var;
        this.f289709h = xVar;
        this.f289710i = i17;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        kz5.p0 p0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/unreadmode/UnreadConversationItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.d0 d0Var = this.f289705d;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.b3 b3Var = d0Var.f289655m;
        yf5.n nVar = this.f289707f;
        android.view.View viewWrapper = nVar.f543463q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(viewWrapper, "viewWrapper");
        b3Var.a(this.f289706e, viewWrapper, nVar);
        android.view.View itemView = this.f289708g.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        int i17 = this.f289710i;
        d0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onItemClick position=");
        sb6.append(i17);
        sb6.append(", username=");
        yf5.x xVar = this.f289709h;
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var = xVar.f543528d;
        sb6.append(l4Var != null ? l4Var.h1() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnreadConversationItemConvert", sb6.toString());
        com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var2 = xVar.f543528d;
        if (l4Var2 != null) {
            xm3.t0 t0Var = d0Var.f289656n;
            if (t0Var == null || (c16718x7059cefe = t0Var.I) == null || (arrayList = c16718x7059cefe.f233598o) == null) {
                p0Var = kz5.p0.f395529d;
            } else {
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.l4 l4Var3 = ((yf5.x) it.next()).f543528d;
                    if (l4Var3 != null) {
                        arrayList3.add(l4Var3);
                    }
                }
                p0Var = arrayList3;
            }
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.g0 g0Var = d0Var.f289651f;
            if (g0Var != null) {
                java.lang.String h17 = l4Var2.h1();
                if (h17 != null) {
                    boolean contains = g0Var.f289673b.contains(h17);
                    bg5.k.f102290a.a(h17, p0Var, 0, i17, contains ? 1 : 0, g0Var.f289672a);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UnreadModeReporter", "reportClickChat, username=" + h17 + ", position=" + i17 + ", inUnreadGroup=" + (contains ? 1 : 0));
                }
            }
            com.p314xaae8f345.mm.ui.p2695x2c1ddc83.u2.b(d0Var.f289650e, itemView, l4Var2, i17, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2699x274e3dd2.a0(d0Var));
        }
        d0Var.f289655m.b(200);
        yj0.a.h(this, "com/tencent/mm/ui/conversation/unreadmode/UnreadConversationItemConvert$onBindViewHolder$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
