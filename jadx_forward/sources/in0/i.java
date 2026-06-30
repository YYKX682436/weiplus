package in0;

/* loaded from: classes3.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in0.q f374284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f374285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f374286f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(in0.q qVar, int i17, java.lang.String str) {
        super(0);
        this.f374284d = qVar;
        this.f374285e = i17;
        this.f374286f = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        p05.l0 l0Var = (p05.l0) this.f374284d.W1;
        l0Var.getClass();
        java.lang.String message = this.f374286f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#setAnimationMessageToWeVision gestureId=");
        int i17 = this.f374285e;
        sb6.append(i17);
        sb6.append(" message=");
        sb6.append(message);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveGestureRenderEffect", sb6.toString());
        java.util.Iterator it = l0Var.f432112e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((java.lang.Number) ((jz5.o) obj).f384375e).intValue() == i17) {
                break;
            }
        }
        jz5.o oVar = (jz5.o) obj;
        if (oVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveGestureRenderEffect", "#setAnimationMessageToWeVision gestureId=" + i17 + " not match");
        } else {
            rh0.d0 d0Var = l0Var.f432109b;
            if (d0Var != null) {
                ((p05.l4) d0Var).G(((java.lang.Number) oVar.f384374d).longValue(), message, 0);
            }
        }
        return jz5.f0.f384359a;
    }
}
