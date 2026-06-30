package ef0;

/* loaded from: classes2.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f333804d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.v70 f333805e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(android.app.Activity activity, bw5.v70 v70Var) {
        super(0);
        this.f333804d = activity;
        this.f333805e = v70Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.app.Activity activity = this.f333804d;
        try {
            if (!activity.isDestroyed() && !activity.isFinishing()) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2304x373aa5.DialogC18732x79d0ea5b dialogC18732x79d0ea5b = new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2304x373aa5.DialogC18732x79d0ea5b(activity, null);
                bw5.v70 listenItem = this.f333805e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenItem, "listenItem");
                dialogC18732x79d0ea5b.show();
            }
        } catch (java.lang.Throwable unused) {
        }
        return jz5.f0.f384359a;
    }
}
