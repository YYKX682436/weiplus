package hq0;

/* loaded from: classes7.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f364606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hq0.b0 f364607e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.view.View view, hq0.b0 b0Var) {
        super(0);
        this.f364606d = view;
        this.f364607e = b0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        hq0.b0 b0Var = this.f364607e;
        android.view.View view = this.f364606d;
        try {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
            if (viewGroup == null || viewGroup.indexOfChild(view) == -1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f364504y, "removeSelfFromParent view parent is null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f364504y, "removeSelfFromParent view parent is not null");
                viewGroup.removeView(view);
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(b0Var.f364504y, e17, "removeSelfFromParent exception", new java.lang.Object[0]);
            i95.m c17 = i95.n0.c(je3.i.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            je3.i.x2((je3.i) c17, "MagicRemoveFromSelfException", 1, null, 0.001f, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
