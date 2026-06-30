package cm2;

/* loaded from: classes3.dex */
public final class d0 extends cm2.t {

    /* renamed from: v, reason: collision with root package name */
    public final r45.v42 f43335v;

    public d0(r45.v42 data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f43335v = data;
    }

    @Override // c61.bc
    public com.tencent.mm.protobuf.g a() {
        return this.f43386e;
    }

    @Override // c61.bc
    public com.tencent.mm.protobuf.f b() {
        return this.f43335v;
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
        return this.f43335v.hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }
}
