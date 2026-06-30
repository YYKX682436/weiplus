package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public abstract class b6 implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.ThreadLocal f280024f = new java.lang.ThreadLocal();

    /* renamed from: d, reason: collision with root package name */
    public final yb5.d f280025d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er f280026e;

    public b6(yb5.d dVar) {
        this.f280026e = null;
        this.f280025d = dVar;
    }

    public abstract void a(android.view.View view, yb5.d dVar, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var);

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 c17;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/ChattingListEventListener$ChattingListClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yb5.d dVar = this.f280025d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar2 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag();
        if (erVar2 == null) {
            c17 = null;
        } else {
            try {
                c17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er.b(erVar2.f285441d, dVar);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ItemDataTag", th6, "getCurrentMsg err", new java.lang.Object[0]);
                c17 = erVar2.c();
            }
        }
        if (c17 == null && (erVar = this.f280026e) != null) {
            c17 = erVar.c();
        }
        if (c17 == null) {
            yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingListEventListener$ChattingListClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        java.lang.ThreadLocal threadLocal = f280024f;
        threadLocal.set(c17);
        a(view, this.f280025d, c17);
        threadLocal.set(null);
        if (this.f280025d.f542241c.a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fg.class) != null) {
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f1) ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fg) this.f280025d.f542241c.a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.fg.class))).getClass();
            sc5.f fVar = sc5.f.f488100a;
            ((ku5.t0) ku5.t0.f394148d).h(new sc5.b(c17), "ChatMsgReadReportManager");
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/ChattingListEventListener$ChattingListClickListener", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public b6(yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er erVar) {
        this.f280026e = null;
        this.f280025d = dVar;
        this.f280026e = erVar;
    }
}
