package cm2;

/* loaded from: classes3.dex */
public abstract class t implements so2.j5, c61.bc {

    /* renamed from: d, reason: collision with root package name */
    public long f43385d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f43386e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f43388g;

    /* renamed from: h, reason: collision with root package name */
    public int f43389h;

    /* renamed from: i, reason: collision with root package name */
    public int f43390i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f43391m;

    /* renamed from: n, reason: collision with root package name */
    public int f43392n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f43393o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f43394p;

    /* renamed from: q, reason: collision with root package name */
    public int f43395q;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f43397s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f43398t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f43399u;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f43387f = "";

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f43396r = "";

    public final cm2.t e(r45.f52 info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f43386e = info.getByteString(6);
        java.lang.String string = info.getString(5);
        if (string == null) {
            string = "";
        }
        this.f43387f = string;
        this.f43388g = info.getBoolean(1);
        this.f43389h = info.getInteger(7);
        this.f43385d = info.getLong(4);
        this.f43390i = info.getInteger(10);
        this.f43391m = info.getByteString(2);
        this.f43392n = info.getInteger(0);
        this.f43393o = info.getBoolean(11);
        this.f43394p = info.getBoolean(12);
        java.lang.String string2 = info.getString(13);
        this.f43396r = string2 != null ? string2 : "";
        this.f43395q = info.getInteger(9);
        this.f43397s = info.getByteString(14);
        this.f43398t = info.getByteString(15);
        this.f43399u = info.getInteger(16) == 1;
        return this;
    }

    public final r45.f52 f(r45.f52 info) {
        kotlin.jvm.internal.o.g(info, "info");
        info.set(6, this.f43386e);
        info.set(5, this.f43387f);
        info.set(1, java.lang.Boolean.valueOf(this.f43388g));
        info.set(7, java.lang.Integer.valueOf(this.f43389h));
        info.set(4, java.lang.Long.valueOf(this.f43385d));
        info.set(10, java.lang.Integer.valueOf(this.f43390i));
        info.set(2, new com.tencent.mm.protobuf.g(b().toByteArray()));
        info.set(11, java.lang.Boolean.valueOf(this.f43393o));
        info.set(12, java.lang.Boolean.valueOf(this.f43394p));
        info.set(13, this.f43396r);
        info.set(9, java.lang.Integer.valueOf(this.f43395q));
        info.set(14, this.f43397s);
        info.set(15, this.f43398t);
        info.set(16, java.lang.Integer.valueOf(this.f43399u ? 1 : 0));
        return info;
    }
}
