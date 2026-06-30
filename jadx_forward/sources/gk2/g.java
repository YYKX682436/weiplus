package gk2;

/* loaded from: classes2.dex */
public abstract class g implements pf5.f {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.f f354012d;

    /* renamed from: e, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.l1 f354013e;

    public g(java.lang.String nameTag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameTag, "nameTag");
        gk2.f fVar = new gk2.f(hashCode(), nameTag);
        this.f354012d = fVar;
        p012xc85e97e9.p093xedfae76a.l1 l1Var = new p012xc85e97e9.p093xedfae76a.l1();
        this.f354013e = l1Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveContext", "init " + hashCode() + " check map " + fVar);
        java.lang.reflect.Field declaredField = p012xc85e97e9.p093xedfae76a.l1.class.getDeclaredField("a");
        declaredField.setAccessible(true);
        java.lang.Object obj = declaredField.get(l1Var);
        declaredField.set(l1Var, fVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveContext", "init check map srcMap1:" + obj.hashCode() + " srcMap2:" + declaredField.get(l1Var).hashCode() + " storeMap:" + fVar.hashCode());
    }

    @Override // p012xc85e97e9.p093xedfae76a.m1
    /* renamed from: getViewModelStore */
    public p012xc85e97e9.p093xedfae76a.l1 mo2512x119738b3() {
        return this.f354013e;
    }
}
