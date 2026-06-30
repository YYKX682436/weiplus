package aq1;

/* loaded from: classes11.dex */
public class s0 implements c01.o8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.a3 f94623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f94624b;

    public s0(aq1.t0 t0Var, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, java.lang.String str) {
        this.f94623a = a3Var;
        this.f94624b = str;
    }

    @Override // c01.o8
    public void a(java.lang.String str, boolean z17) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f94623a;
        if (a3Var == null || !a3Var.Q0()) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5732x9b42e3d5 c5732x9b42e3d5 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5732x9b42e3d5();
        java.lang.String str2 = this.f94624b;
        am.vk vkVar = c5732x9b42e3d5.f136057g;
        vkVar.f89732a = str2;
        vkVar.f89733b = a3Var.D0();
        c5732x9b42e3d5.e();
    }
}
