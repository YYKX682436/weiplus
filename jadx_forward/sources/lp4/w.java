package lp4;

/* loaded from: classes10.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lp4.f0 f401969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(lp4.f0 f0Var) {
        super(1);
        this.f401969d = f0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        bv3.d dVar;
        bv3.d dVar2;
        bv3.d dVar3;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        lp4.f0 f0Var = this.f401969d;
        if (booleanValue) {
            zu3.a aVar = f0Var.f401887t;
            if (aVar != null && (dVar = aVar.f557293c) != null) {
                dVar.d(0L, 2147483647L);
            }
        } else {
            zu3.a aVar2 = f0Var.f401887t;
            if (aVar2 != null) {
                aVar2.f557292b = null;
            }
            if (aVar2 != null && (dVar3 = aVar2.f557293c) != null) {
                dVar3.d(f0Var.f401885r, f0Var.f401886s);
            }
            zu3.a aVar3 = f0Var.f401887t;
            long c17 = (aVar3 == null || (dVar2 = aVar3.f557293c) == null) ? f0Var.f401883p : dVar2.c();
            f0Var.f401887t = null;
            ju3.c0 c0Var = ju3.c0.f383419l2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putLong("PARAM_1_LONG", c17);
            f0Var.f546865d.w(c0Var, bundle);
        }
        return jz5.f0.f384359a;
    }
}
