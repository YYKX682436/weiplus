package gl5;

/* loaded from: classes5.dex */
public final class a1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.d1 f354435d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(gl5.d1 d1Var) {
        super(0);
        this.f354435d = d1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        return java.lang.Integer.valueOf(android.view.ViewConfiguration.get(this.f354435d.f354457a).getScaledTouchSlop());
    }
}
