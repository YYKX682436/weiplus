package bw5;

/* loaded from: classes6.dex */
public enum lr0 implements com.tencent.mm.protobuf.h {
    CLUSTER_DES_NONE(0),
    CLUSTER_DES_ONLY_ME_TYPE(1),
    CLUSTER_DES_WITH_ME_TYPE(2),
    CLUSTER_DES_OTHER_TYPE(3),
    CLUSTER_DES_FRIEND_SAME_TYPE(4);


    /* renamed from: d, reason: collision with root package name */
    public final int f29940d;

    lr0(int i17) {
        this.f29940d = i17;
    }

    @Override // com.tencent.mm.protobuf.h
    public final int getNumber() {
        return this.f29940d;
    }
}
