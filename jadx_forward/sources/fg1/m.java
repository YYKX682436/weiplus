package fg1;

/* loaded from: classes7.dex */
public final class m extends b06.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fg1.u f343407b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.Object obj, fg1.u uVar) {
        super(obj);
        this.f343407b = uVar;
    }

    @Override // b06.b
    public void c(f06.v property, java.lang.Object obj, java.lang.Object obj2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoCast.AppBrandVideoCastHandler", "isForeground = " + booleanValue + ' ');
        fg1.u uVar = this.f343407b;
        if (booleanValue && !booleanValue2) {
            uVar.b().f();
        }
        if (booleanValue || booleanValue2) {
            return;
        }
        gg1.c1 b17 = uVar.b();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = b17.f353083p;
        if (b4Var.e()) {
            b17.f353082o = false;
            b4Var.c(5000L, 5000L);
        }
    }
}
