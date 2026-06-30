package uv2;

/* loaded from: classes10.dex */
public final class c implements uv2.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f512904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f512905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f512906c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f512907d;

    public c(yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.Object obj, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        this.f512904a = lVar;
        this.f512905b = h0Var;
        this.f512906c = obj;
        this.f512907d = c0Var;
    }

    @Override // uv2.m
    public void a(java.lang.String mediaId, uv2.n result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        this.f512905b.f391656d = result;
        java.lang.Object obj = this.f512906c;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f512907d;
        synchronized (obj) {
            c0Var.f391645d = true;
            obj.notifyAll();
        }
    }

    @Override // uv2.m
    public void b(java.lang.String mediaId, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        this.f512904a.mo146xb9724478(java.lang.Float.valueOf(f17));
    }
}
