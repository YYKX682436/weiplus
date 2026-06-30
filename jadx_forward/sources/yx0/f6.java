package yx0;

/* loaded from: classes5.dex */
public final class f6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f548838d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(yx0.b8 b8Var) {
        super(1);
        this.f548838d = b8Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        if (th6 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ShootComposingCorePlugin", "switchBeauty >> Error: " + th6.getMessage());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShootComposingCorePlugin", "switchBeauty >> Success");
        }
        yx0.v vVar = yx0.v.f549228f;
        java.util.concurrent.locks.ReentrantLock reentrantLock = yx0.b8.f548704c2;
        this.f548838d.q0(vVar);
        return jz5.f0.f384359a;
    }
}
