package xt2;

/* loaded from: classes3.dex */
public final class d3 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f538216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f538217b;

    public d3(xt2.e3 e3Var, java.lang.Object obj) {
        this.f538216a = e3Var;
        this.f538217b = obj;
    }

    @Override // ym5.n0
    /* renamed from: onViewExposed */
    public void mo976xcdf5f75c(android.view.View view, long j17, long j18, boolean z17) {
        r45.ce0 ce0Var;
        bw5.x7 x7Var;
        bw5.x7 x7Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        java.lang.Object obj = this.f538217b;
        xt2.e3 e3Var = this.f538216a;
        if (z17) {
            android.graphics.Rect r17 = pm0.v.r(e3Var.f538240i);
            boolean z18 = r17.width() > 0 && r17.height() > 0;
            if (e3Var.f538236e.mo11219xd0598cf8() == 0 && z18) {
                e3Var.h((cm2.m0) obj);
            }
        }
        df2.x9 x9Var = (df2.x9) e3Var.m175930x2a5e9229().U0(df2.x9.class);
        if (x9Var != null && x9Var.f313300n) {
            r45.ce0 ce0Var2 = (r45.ce0) ((cm2.m0) obj).f124901v.m75936x14adae67(9);
            if (ce0Var2 != null && (x7Var2 = (bw5.x7) ce0Var2.m75936x14adae67(10)) != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e3Var.f538239h, "try preload ecs full page");
                android.content.Context context = e3Var.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                pq.a aVar = new pq.a(context);
                i95.m c17 = i95.n0.c(pq.q.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                pq.q.h6((pq.q) c17, aVar, x7Var2, null, null, 12, null);
            }
            r45.bd5 bd5Var = (r45.bd5) ((cm2.m0) obj).f124901v.m75936x14adae67(70);
            if (bd5Var == null || (ce0Var = (r45.ce0) bd5Var.m75936x14adae67(2)) == null || (x7Var = (bw5.x7) ce0Var.m75936x14adae67(10)) == null) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(e3Var.f538239h, "try preload ecs button page");
            android.content.Context context2 = e3Var.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            pq.a aVar2 = new pq.a(context2);
            i95.m c18 = i95.n0.c(pq.q.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            pq.q.h6((pq.q) c18, aVar2, x7Var, null, null, 12, null);
        }
    }
}
