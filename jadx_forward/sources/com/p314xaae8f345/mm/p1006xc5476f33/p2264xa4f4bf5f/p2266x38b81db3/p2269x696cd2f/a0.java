package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f;

/* loaded from: classes11.dex */
public final class a0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.d3 {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f254787d;

    /* renamed from: e, reason: collision with root package name */
    public final n3.q f254788e;

    public a0(android.content.Context context, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        this.f254787d = recyclerView;
        this.f254788e = new n3.q(context, new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.p2266x38b81db3.p2269x696cd2f.z(this, i17));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.v2
    public boolean b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 rv6, android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rv6, "rv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        int i17 = rl.b.f478676a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SquareTitleItemTouchListener", "[onInterceptTouchEvent]", null);
        n3.q qVar = this.f254788e;
        if (qVar != null) {
            return qVar.a(e17);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mGestureDetector");
        throw null;
    }
}
