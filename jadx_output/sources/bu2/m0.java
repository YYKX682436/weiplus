package bu2;

/* loaded from: classes2.dex */
public final class m0 extends bu2.l0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(r45.p21 source) {
        super(source);
        kotlin.jvm.internal.o.g(source, "source");
    }

    @Override // bu2.l0
    public so2.j5 a() {
        r45.gk2 gk2Var;
        r45.p21 data = this.f24548a;
        kotlin.jvm.internal.o.g(data, "data");
        if (!(data.getInteger(5) == 1) || (gk2Var = (r45.gk2) data.getCustom(4)) == null) {
            return null;
        }
        return com.tencent.mm.plugin.finder.feed.im.f107046a.a(gk2Var);
    }

    public m0(int i17, long j17, int i18, r45.gk2 lbsSection) {
        kotlin.jvm.internal.o.g(lbsSection, "lbsSection");
        r45.p21 p21Var = this.f24548a;
        p21Var.set(1, java.lang.Long.valueOf(j17));
        p21Var.set(0, java.lang.Integer.valueOf(i17));
        p21Var.set(2, new com.tencent.mm.protocal.protobuf.FinderObject());
        p21Var.set(3, java.lang.Integer.valueOf(i18));
        p21Var.set(4, lbsSection);
        p21Var.set(5, 1);
    }
}
