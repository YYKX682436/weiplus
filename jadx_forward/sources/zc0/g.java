package zc0;

/* loaded from: classes.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f552918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f552919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f552920f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, byte[] bArr, boolean z17) {
        super(0);
        this.f552918d = str;
        this.f552919e = bArr;
        this.f552920f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = this.f552918d;
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.mm.vfs.w6.h(str);
        }
        int R = com.p314xaae8f345.mm.vfs.w6.R(str, this.f552919e);
        if (R == 0) {
            if (this.f552920f) {
                ex3.c cVar = ex3.c.f338739a;
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                cVar.a(context, str);
            }
            pm0.v.X(zc0.e.f552916d);
        } else {
            pm0.v.X(new zc0.f(R));
        }
        return jz5.f0.f384359a;
    }
}
