package c61;

/* loaded from: classes10.dex */
public final class e7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f38957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f38958b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f38959c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f38960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f38961e;

    public e7(kotlin.jvm.internal.c0 c0Var, java.lang.Object obj, long j17, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.c0 c0Var2) {
        this.f38957a = c0Var;
        this.f38958b = obj;
        this.f38959c = j17;
        this.f38960d = h0Var;
        this.f38961e = c0Var2;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        if ((i17 == 0 && fVar.f70616b == 0) || hc2.p.b(i17, fVar.f70616b)) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            if (finderObject != null) {
                kotlin.jvm.internal.h0 h0Var = this.f38960d;
                bu2.j.f24534a.n(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 1), bu2.i.f24531l);
                h0Var.f310123d = finderObject;
            }
        } else {
            int i18 = fVar.f70616b;
            if (i18 == -4011 || i18 == -4033 || i18 == -4036) {
                this.f38957a.f310112d = true;
            }
        }
        java.lang.Object obj2 = this.f38958b;
        kotlin.jvm.internal.c0 c0Var = this.f38961e;
        synchronized (obj2) {
            c0Var.f310112d = true;
            obj2.notify();
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "tryGetFinderObject " + this.f38959c + ", finish");
        return jz5.f0.f302826a;
    }
}
