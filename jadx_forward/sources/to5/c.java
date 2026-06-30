package to5;

/* loaded from: classes14.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final cp5.b f502534a;

    /* renamed from: b, reason: collision with root package name */
    public final to5.b f502535b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0 f502536c;

    /* renamed from: d, reason: collision with root package name */
    public final android.util.SparseArray f502537d;

    public c(cp5.b bufferManager, to5.b bVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bufferManager, "bufferManager");
        this.f502534a = bufferManager;
        this.f502535b = bVar;
        this.f502536c = com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b;
        this.f502537d = new android.util.SparseArray();
    }

    public final void a(java.nio.ByteBuffer data, int i17, int i18, int i19, yz5.l ret) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        ret.mo146xb9724478(java.lang.Integer.valueOf(this.f502536c.B(data, data.remaining(), i17, i18, i19)));
    }

    public final int b(int i17, java.nio.ByteBuffer parameter, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameter, "parameter");
        return this.f502536c.D(i17, parameter, i18);
    }
}
