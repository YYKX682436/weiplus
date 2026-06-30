package ze5;

/* loaded from: classes9.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public static final ze5.m f553606d = new ze5.m();

    public m() {
        super(4);
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        android.view.View view = (android.view.View) obj;
        yb5.d chattingContext = (yb5.d) obj2;
        rd5.d msgData = (rd5.d) obj3;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 chattingHolder = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0) obj4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingContext, "chattingContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgData, "msgData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chattingHolder, "chattingHolder");
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = msgData.f475787d.f526833b;
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 != null) {
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.bjv);
            android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.bjw);
            if (te5.t.g(f9Var, v17, chattingContext)) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j1.r(findViewById, 0);
                boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(f9Var.X1());
                findViewById.setTag(f9Var);
                findViewById.setOnClickListener(new ze5.l(chattingContext, findViewById, textView));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
                te5.t.k(K0, findViewById, textView, chattingContext);
            } else {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.j1.r(findViewById, 8);
            }
        }
        return jz5.f0.f384359a;
    }
}
