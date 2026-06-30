package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class ax extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.pz f106328d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(com.tencent.mm.plugin.finder.feed.pz pzVar) {
        super(0);
        this.f106328d = pzVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.feed.model.s3 s3Var;
        com.tencent.mm.plugin.finder.feed.pz pzVar = this.f106328d;
        com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment = pzVar.f108756h;
        if (finderHomeTabFragment != null && (s3Var = ((te2.e4) ((zy2.g8) pf5.z.f353948a.b(finderHomeTabFragment).c(zy2.g8.class))).f417974d) != null) {
            return s3Var;
        }
        com.tencent.mm.ui.MMActivity activity = pzVar.f108755g;
        kotlin.jvm.internal.o.g(activity, "activity");
        return ((te2.e4) ((zy2.g8) pf5.z.f353948a.a(activity).c(zy2.g8.class))).f417974d;
    }
}
