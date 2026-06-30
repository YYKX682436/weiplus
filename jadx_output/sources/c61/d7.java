package c61;

/* loaded from: classes10.dex */
public final class d7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zy2.a6 f38938a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f38939b;

    public d7(zy2.a6 a6Var, long j17) {
        this.f38938a = a6Var;
        this.f38939b = j17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        int i17 = fVar.f70615a;
        zy2.a6 a6Var = this.f38938a;
        if ((i17 == 0 && fVar.f70616b == 0) || hc2.p.b(i17, fVar.f70616b)) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            if (finderObject != null) {
                bu2.j.f24534a.n(com.tencent.mm.plugin.finder.storage.FinderItem.Companion.a(finderObject, 1), bu2.i.f24531l);
                if (a6Var != null) {
                    a6Var.a(finderObject, fVar.f70615a, fVar.f70616b);
                }
            }
        } else if (a6Var != null) {
            a6Var.a(null, fVar.f70615a, fVar.f70616b);
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "tryGetFinderObject " + this.f38939b + ", finish");
        return jz5.f0.f302826a;
    }
}
