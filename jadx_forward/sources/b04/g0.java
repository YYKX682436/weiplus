package b04;

/* loaded from: classes5.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 f98432d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b04.j0 f98433e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185, b04.j0 j0Var) {
        super(2);
        this.f98432d = c22675xc8629185;
        this.f98433e = j0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.widget.FrameLayout expandContainer = (android.widget.FrameLayout) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(expandContainer, "expandContainer");
        expandContainer.toString();
        expandContainer.getChildCount();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185 = this.f98432d;
        android.content.Context context = c22675xc8629185.getContext();
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = context instanceof com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 ? (com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37) context : null;
        if (abstractActivityC22579xbed01a37 != null) {
            abstractActivityC22579xbed01a37.m81176xbd5f726b(!booleanValue);
        }
        b04.j0 j0Var = this.f98433e;
        j0Var.f98451g = booleanValue;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedPacketUIC", "QR code expand status changed: " + j0Var.f98451g);
        if (j0Var.f98448d == null) {
            android.view.View oj6 = ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).oj(c22675xc8629185.getContext(), false, false, null);
            j0Var.f98448d = oj6;
            com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 c3717xac6c2329 = oj6 instanceof com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329 ? (com.p314xaae8f345.p362xadfe2b3.ui.C3717xac6c2329) oj6 : null;
            if (c3717xac6c2329 != null) {
                c3717xac6c2329.f127591y = true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RedPacketUIC", "createLiteAppView: add lite app view:" + j0Var.f98448d);
            expandContainer.addView(j0Var.f98448d, new android.view.ViewGroup.MarginLayoutParams(-1, i65.a.b(c22675xc8629185.getContext(), 332)));
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", "wxalite041d1599beb6eb0d45167bc1e9ec7ebe@pay");
            bundle.putString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "");
            bundle.putString("query", "scan_entrance=" + com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.h2.f240459g + "&face2face_status=" + ((yz3.m) ((kd0.r2) i95.n0.c(kd0.r2.class))).wi());
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
            sVar.f225700d = new b04.e0(j0Var);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).pk(j0Var.f98448d, bundle, true, false, sVar, new b04.f0());
        }
        cl0.g gVar = new cl0.g();
        gVar.s("status", java.lang.Boolean.valueOf(booleanValue));
        q80.g0 g0Var = (q80.g0) i95.n0.c(q80.g0.class);
        if (g0Var != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) g0Var).rj("wxalite041d1599beb6eb0d45167bc1e9ec7ebe@pay", "qrcodeCell/notifyExpandStatus", gVar);
        }
        return jz5.f0.f384359a;
    }
}
