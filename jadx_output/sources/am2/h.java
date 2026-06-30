package am2;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f8676a;

    /* renamed from: b, reason: collision with root package name */
    public final gk2.e f8677b;

    public h(com.tencent.mm.ui.MMActivity activity, gk2.e liveData) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f8676a = activity;
        this.f8677b = liveData;
    }

    public static final com.tencent.mm.protocal.protobuf.FinderJumpInfo a(am2.h hVar) {
        hVar.getClass();
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = new com.tencent.mm.protocal.protobuf.FinderJumpInfo();
        finderJumpInfo.setWording("test_稀有礼物被抽到，快去围观");
        ce2.i iVar = (ce2.i) dk2.u7.f234185e.get("MMFinderLiveGift100001");
        r45.kv1 c17 = iVar != null ? iVar.c1() : null;
        r45.cj1 cj1Var = new r45.cj1();
        cj1Var.set(3, c17);
        finderJumpInfo.setExt_buff(new com.tencent.mm.protobuf.g(cj1Var.toByteArray()));
        return finderJumpInfo;
    }
}
