package cm2;

/* loaded from: classes3.dex */
public final class b0 extends cm2.t {

    /* renamed from: v, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderJumpInfo f43331v;

    /* renamed from: w, reason: collision with root package name */
    public final int f43332w;

    public b0(com.tencent.mm.protocal.protobuf.FinderJumpInfo data, int i17) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f43331v = data;
        this.f43332w = i17;
    }

    @Override // c61.bc
    public com.tencent.mm.protobuf.g a() {
        return this.f43386e;
    }

    @Override // c61.bc
    public com.tencent.mm.protobuf.f b() {
        return this.f43331v;
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

    public final java.lang.Integer g() {
        return this.f43332w == 15 ? 11 : null;
    }

    @Override // in5.c
    public long getItemId() {
        return this.f43331v.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
