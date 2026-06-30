package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class o6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader f108224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f108225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f108226f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader finderProfileDraftLoader, long j17, boolean z17) {
        super(0);
        this.f108224d = finderProfileDraftLoader;
        this.f108225e = j17;
        this.f108226f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.storage.x80 D0;
        com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader finderProfileDraftLoader = this.f108224d;
        java.util.Iterator it = finderProfileDraftLoader.getDataList().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            so2.j5 j5Var = (so2.j5) next;
            if (j5Var instanceof so2.k0) {
                so2.k0 k0Var = (so2.k0) j5Var;
                com.tencent.mm.plugin.finder.storage.x80 x80Var = k0Var.f410452d;
                long j17 = x80Var.field_localId;
                long j18 = this.f108225e;
                if (j17 == j18) {
                    boolean isMemberFeed = x80Var.t0().isMemberFeed();
                    boolean z17 = finderProfileDraftLoader.f107581e;
                    com.tencent.mm.plugin.finder.storage.x80 x80Var2 = k0Var.f410452d;
                    if (((isMemberFeed && z17) || (!z17 && !x80Var2.t0().isMemberFeed())) && (D0 = ((c61.l7) i95.n0.c(c61.l7.class)).Oj().D0(j18)) != null) {
                        java.util.AbstractList dataList = finderProfileDraftLoader.getDataList();
                        int i19 = com.tencent.mm.plugin.finder.feed.model.FinderProfileDraftLoader.f107579o;
                        dataList.set(i17, new so2.k0(D0));
                        com.tencent.mars.xlog.Log.i(finderProfileDraftLoader.getB(), "updateDraft, index:" + i17 + ", " + x80Var2.v0());
                        if (this.f108226f) {
                            finderProfileDraftLoader.getDispatcher().b(i17, 1);
                        } else {
                            finderProfileDraftLoader.getDispatcher().c(i17, 1, new jz5.l(2, 1));
                        }
                    }
                }
            }
            i17 = i18;
        }
        return jz5.f0.f302826a;
    }
}
