package cm2;

/* loaded from: classes3.dex */
public final class h0 extends cm2.t {
    public java.lang.String A;
    public java.lang.String B;
    public java.lang.String C;
    public int D;
    public long E;

    /* renamed from: v, reason: collision with root package name */
    public r45.k92 f43348v;

    /* renamed from: w, reason: collision with root package name */
    public long f43349w;

    /* renamed from: x, reason: collision with root package name */
    public r45.n3 f43350x;

    /* renamed from: y, reason: collision with root package name */
    public java.lang.String f43351y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f43352z;

    public h0(r45.k92 data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f43348v = data;
        this.f43349w = data.getLong(0);
        this.f43350x = (r45.n3) this.f43348v.getCustom(1);
        this.f43351y = this.f43348v.getString(2);
        this.f43352z = this.f43348v.getString(3);
        this.A = this.f43348v.getString(4);
        this.f43348v.getString(5);
        this.B = this.f43348v.getString(6);
        this.f43348v.getInteger(7);
        java.lang.String string = this.f43348v.getString(8);
        this.C = string == null ? "" : string;
        this.D = this.f43348v.getInteger(10);
        this.E = this.f43348v.getLong(11);
    }

    @Override // c61.bc
    public com.tencent.mm.protobuf.g a() {
        return this.f43386e;
    }

    @Override // c61.bc
    public com.tencent.mm.protobuf.f b() {
        return this.f43348v;
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
        return this.f43348v.getLong(0);
    }

    @Override // in5.c
    public int h() {
        return 1;
    }
}
