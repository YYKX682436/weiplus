package rw5;

/* loaded from: classes8.dex */
public final class a implements p000.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ow5.a f482181a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f482182b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f482183c;

    public a(ow5.a aVar, java.lang.String str, long j17) {
        this.f482181a = aVar;
        this.f482182b = str;
        this.f482183c = j17;
    }

    @Override // p000.l
    public void a() {
        java.lang.String format = "appId[" + this.f482183c + "], notifyDestroyBiz";
        java.lang.Object[] objArr = new java.lang.Object[0];
        java.lang.String tag = this.f482182b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(format, "format");
        java.lang.Object[] copyOf = java.util.Arrays.copyOf(objArr, objArr.length);
        if (!(copyOf.length == 0)) {
            format = java.lang.String.format(format, java.util.Arrays.copyOf(copyOf, copyOf.length));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(format);
        p000.m mVar = this.f482181a.f430968g;
        if (mVar != null) {
            mVar.a();
        }
    }
}
