package c61;

/* loaded from: classes10.dex */
public final class x6 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f39399a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f39400b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f39401c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f39402d;

    public x6(java.lang.Object obj, long j17, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.c0 c0Var) {
        this.f39399a = obj;
        this.f39400b = j17;
        this.f39401c = h0Var;
        this.f39402d = c0Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        if (((i17 == 0 && fVar.f70616b == 0) || hc2.p.b(i17, fVar.f70616b)) && (finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2)) != null) {
            kotlin.jvm.internal.h0 h0Var = this.f39401c;
            com.tencent.mm.plugin.finder.storage.FinderItem a17 = com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 1);
            bu2.j.f24534a.n(a17, bu2.i.f24531l);
            h0Var.f310123d = a17;
        }
        java.lang.Object obj2 = this.f39399a;
        kotlin.jvm.internal.c0 c0Var = this.f39402d;
        synchronized (obj2) {
            c0Var.f310112d = true;
            obj2.notify();
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "requestFinderObject " + this.f39400b + ", finish");
        return jz5.f0.f302826a;
    }
}
