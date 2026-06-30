package ek4;

/* loaded from: classes12.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek4.s f335213d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f335214e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ek4.z f335215f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ek4.s sVar, java.lang.String str, ek4.z zVar) {
        super(0);
        this.f335213d = sVar;
        this.f335214e = str;
        this.f335215f = zVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.f0 f0Var;
        ek4.s sVar = this.f335213d;
        java.util.HashMap hashMap = sVar.f335218a;
        java.lang.String str = this.f335214e;
        dn.o oVar = (dn.o) hashMap.get(str);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        ek4.z zVar = this.f335215f;
        if (oVar != null) {
            dn.b bVar = new dn.b();
            int i17 = sVar.i(str, bVar);
            if (zVar != null) {
                zVar.a(i17, oVar, bVar);
            }
            if (oVar.f323342y0 <= 1) {
                ek4.s.c(sVar);
            }
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            dn.o oVar2 = (dn.o) sVar.f335220c.remove(str);
            dn.h hVar = (dn.h) sVar.f335221d.remove(str);
            if (zVar != null) {
                zVar.a(hVar != null ? hVar.f69553xb5f54fe9 : 0, oVar2, hVar);
            }
            if (oVar2 != null && oVar2.f323342y0 == 1) {
                ek4.s.c(sVar);
            }
        }
        return f0Var2;
    }
}
