package aw2;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.n f14743d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(aw2.n nVar) {
        super(7);
        this.f14743d = nVar;
    }

    @Override // yz5.u
    public java.lang.Object K(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, java.lang.Object obj5, java.lang.Object obj6, java.lang.Object obj7) {
        java.lang.String rLink = (java.lang.String) obj3;
        java.lang.String title = (java.lang.String) obj4;
        kotlin.jvm.internal.o.g(rLink, "rLink");
        kotlin.jvm.internal.o.g(title, "title");
        aw2.n nVar = this.f14743d;
        pm0.v.X(new aw2.d(nVar, ((java.lang.Number) obj).intValue(), rLink, title, ((java.lang.Number) obj5).intValue(), ((java.lang.Number) obj6).intValue(), (com.tencent.mm.protocal.protobuf.FinderJumpInfo) obj7, (java.lang.String) obj2));
        return jz5.f0.f302826a;
    }
}
