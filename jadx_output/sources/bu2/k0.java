package bu2;

/* loaded from: classes2.dex */
public final class k0 extends bu2.l0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(r45.p21 source) {
        super(source);
        kotlin.jvm.internal.o.g(source, "source");
    }

    @Override // bu2.l0
    public so2.j5 a() {
        com.tencent.mm.plugin.finder.storage.FinderItem a17;
        r45.p21 p21Var = this.f24548a;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = null;
        if (p21Var.getInteger(5) == 0 && (a17 = bu2.y.f24577a.a(p21Var)) != null) {
            baseFinderFeed = cu2.u.f222441a.p(a17);
            if (p21Var.getBoolean(8)) {
                baseFinderFeed.c2(true);
            }
        }
        return baseFinderFeed;
    }

    public k0(int i17, long j17, com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i18, boolean z17) {
        kotlin.jvm.internal.o.g(finderObject, "finderObject");
        ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).uk(finderObject);
        r45.p21 p21Var = this.f24548a;
        p21Var.set(1, java.lang.Long.valueOf(j17));
        p21Var.set(0, java.lang.Integer.valueOf(i17));
        p21Var.set(2, finderObject);
        p21Var.set(3, java.lang.Integer.valueOf(i18));
        p21Var.set(5, 0);
        p21Var.set(8, java.lang.Boolean.valueOf(z17));
    }

    public /* synthetic */ k0(int i17, long j17, com.tencent.mm.protocal.protobuf.FinderObject finderObject, int i18, boolean z17, int i19, kotlin.jvm.internal.i iVar) {
        this(i17, j17, finderObject, i18, (i19 & 16) != 0 ? false : z17);
    }
}
