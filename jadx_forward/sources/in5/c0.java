package in5;

/* loaded from: classes8.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.n0 f374550d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(in5.n0 n0Var) {
        super(0);
        this.f374550d = n0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        in5.n0 n0Var = this.f374550d;
        n0Var.getClass();
        boolean z17 = false;
        try {
            java.lang.reflect.Field declaredField = p012xc85e97e9.p103xe821e364.p104xd1075a44.f2.class.getDeclaredField("mObservable");
            declaredField.setAccessible(true);
            java.lang.reflect.Constructor<?> declaredConstructor = declaredField.get(n0Var).getClass().getDeclaredConstructor(new java.lang.Class[0]);
            declaredConstructor.setAccessible(true);
            java.lang.Object newInstance = declaredConstructor.newInstance(new java.lang.Object[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(newInstance, "null cannot be cast to non-null type android.database.Observable<androidx.recyclerview.widget.RecyclerView.AdapterDataObserver>");
            android.database.Observable observable = (android.database.Observable) newInstance;
            n0Var.f374632f = observable;
            declaredField.set(n0Var, observable);
            if (n0Var.f374632f != null) {
                z17 = true;
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("RecyclerViewAdapterEx", th6, "", new java.lang.Object[0]);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
