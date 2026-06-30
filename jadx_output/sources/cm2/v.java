package cm2;

/* loaded from: classes3.dex */
public final class v extends cm2.t {
    public final java.lang.String A;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.protocal.protobuf.FinderJumpInfo f43401v;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f43402w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f43403x;

    /* renamed from: y, reason: collision with root package name */
    public final java.lang.String f43404y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.String f43405z;

    public v(com.tencent.mm.protocal.protobuf.FinderJumpInfo data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f43401v = data;
        this.f43402w = data.getRecommend_reason();
        this.f43403x = data.getWording();
        this.f43404y = data.getIcon_url();
        this.f43405z = data.getIcon_name();
        data.getSupport_share();
        java.lang.String jump_id = data.getJump_id();
        this.A = jump_id == null ? "" : jump_id;
    }

    @Override // c61.bc
    public com.tencent.mm.protobuf.g a() {
        return this.f43386e;
    }

    @Override // c61.bc
    public com.tencent.mm.protobuf.f b() {
        return this.f43401v;
    }

    @Override // c61.bc
    public long c() {
        return this.f43385d;
    }

    @Override // com.tencent.mm.plugin.finder.feed.model.internal.r0
    public int d(com.tencent.mm.plugin.finder.feed.model.internal.r0 obj) {
        kotlin.jvm.internal.o.g(obj, "obj");
        return 0;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f43401v.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
