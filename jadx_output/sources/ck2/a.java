package ck2;

/* loaded from: classes10.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ck2.o f42405d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(ck2.o oVar) {
        super(1);
        this.f42405d = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        mm2.o6 o6Var;
        kotlinx.coroutines.f1 f1Var;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        ck2.o oVar = this.f42405d;
        com.tencent.mars.xlog.Log.i(oVar.f42433m, "checkShowLotteryResult notify close: " + booleanValue);
        if (booleanValue && (o6Var = oVar.f42440t) != null && (f1Var = o6Var.f329340d) != null) {
            kotlinx.coroutines.p2.a(f1Var, null, 1, null);
        }
        return jz5.f0.f302826a;
    }
}
