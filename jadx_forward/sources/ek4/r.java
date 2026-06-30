package ek4;

/* loaded from: classes12.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f335216d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335217e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ek4.s sVar, java.lang.String str) {
        super(0);
        this.f335216d = sVar;
        this.f335217e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        ek4.s sVar = this.f335216d;
        java.util.HashMap hashMap = sVar.f335218a;
        java.lang.String str = this.f335217e;
        dn.o oVar = (dn.o) hashMap.get(str);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (oVar != null) {
            sVar.i(str, new dn.b());
            if (oVar.f323342y0 <= 1) {
                ek4.s.c(sVar);
            }
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            dn.o oVar2 = (dn.o) sVar.f335220c.remove(str);
            if (oVar2 != null && oVar2.f323342y0 == 1) {
                ek4.s.c(sVar);
            }
        }
        return f0Var2;
    }
}
