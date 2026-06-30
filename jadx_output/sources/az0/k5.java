package az0;

/* loaded from: classes5.dex */
public final class k5 implements pp0.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.material.MJMaterialManager f15627a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f15628b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f15629c;

    /* renamed from: d, reason: collision with root package name */
    public kotlinx.coroutines.r2 f15630d;

    public k5(com.tencent.maas.material.MJMaterialManager materialManager) {
        kotlin.jvm.internal.o.g(materialManager, "materialManager");
        this.f15627a = materialManager;
        this.f15628b = kotlinx.coroutines.z0.a(kotlinx.coroutines.q1.f310570c.plus(kotlinx.coroutines.t3.a(null, 1, null)));
    }

    public void a() {
        if (b()) {
            com.tencent.mars.xlog.Log.w("MaasMaterialManager", "cancelAll when call is release");
        } else {
            this.f15627a.b();
        }
    }

    public final boolean b() {
        kotlinx.coroutines.r2 r2Var = this.f15630d;
        if (!(r2Var != null && r2Var.a()) && !this.f15629c) {
            return false;
        }
        com.tencent.mars.xlog.Log.w("MaasMaterialManager", "loadMaterialPack when call is release");
        return true;
    }

    public void c() {
        this.f15630d = kotlinx.coroutines.l.d(this.f15628b, null, null, new az0.j5(this, null), 3, null);
    }
}
