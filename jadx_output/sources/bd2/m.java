package bd2;

/* loaded from: classes2.dex */
public final class m implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f19268a;

    public m(long j17) {
        this.f19268a = j17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mars.xlog.Log.i("Finder.NoInterestedLogic", "[CgiFinderFeedBack] errType: %s, errCode: %s", java.lang.Integer.valueOf(fVar.f70615a), java.lang.Integer.valueOf(fVar.f70616b));
        if (fVar.f70616b == 0 && fVar.f70615a == 0) {
            cu2.u.f222441a.b(this.f19268a);
        }
        return jz5.f0.f302826a;
    }
}
