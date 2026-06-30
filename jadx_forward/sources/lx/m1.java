package lx;

/* loaded from: classes8.dex */
public final class m1 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lx.r1 f403396a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f403397b;

    public m1(lx.r1 r1Var, yz5.l lVar) {
        this.f403396a = r1Var;
        this.f403397b = lVar;
    }

    @Override // d85.k0
    /* renamed from: onOp */
    public final void mo14305x341c20(java.lang.Boolean bool) {
        this.f403396a.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizLocationPlugin", "requestBusinessLocationPermission result: ".concat(bool.booleanValue() ? "granted" : "denied"));
        this.f403397b.mo146xb9724478(bool);
    }
}
