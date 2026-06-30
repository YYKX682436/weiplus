package b33;

/* loaded from: classes8.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b33.f f99194d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b33.f fVar) {
        super(1);
        this.f99194d = fVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View U6;
        com.p314xaae8f345.mm.ui.p2706xf44c7752.AbstractActivityC22408xd92d9051 abstractActivityC22408xd92d9051 = (com.p314xaae8f345.mm.ui.p2706xf44c7752.AbstractActivityC22408xd92d9051) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MPFooterUIC", "getTabActivity:" + abstractActivityC22408xd92d9051);
        b33.f controller = this.f99194d;
        if (abstractActivityC22408xd92d9051 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controller, "controller");
            abstractActivityC22408xd92d9051.f290218e = controller;
        }
        if (abstractActivityC22408xd92d9051 != null && (U6 = abstractActivityC22408xd92d9051.U6()) != null) {
            ((android.widget.FrameLayout) ((jz5.n) controller.f99198h).mo141623x754a37bb()).addView(U6);
        }
        return jz5.f0.f384359a;
    }
}
