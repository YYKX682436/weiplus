package androidx.compose.ui.platform;

/* loaded from: classes13.dex */
public final class r2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f10727d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o4.b f10728e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f10729f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(boolean z17, o4.b bVar, java.lang.String str) {
        super(0);
        this.f10727d = z17;
        this.f10728e = bVar;
        this.f10729f = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f10727d) {
            o4.b bVar = this.f10728e;
            bVar.getClass();
            java.lang.String key = this.f10729f;
            kotlin.jvm.internal.o.g(key, "key");
            bVar.f342801a.g(key);
        }
        return jz5.f0.f302826a;
    }
}
