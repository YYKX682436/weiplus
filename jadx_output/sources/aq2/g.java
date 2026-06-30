package aq2;

/* loaded from: classes2.dex */
public final class g extends bz2.a {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f13133g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f13134h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f13135i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yz5.a initTask, kotlinx.coroutines.r2 r2Var, androidx.lifecycle.y yVar, java.lang.String themeId) {
        super(initTask, r2Var, yVar);
        kotlin.jvm.internal.o.g(initTask, "initTask");
        kotlin.jvm.internal.o.g(themeId, "themeId");
        this.f13133g = themeId;
        this.f13134h = "LiveThemeStreamFutureTask";
        this.f13135i = jz5.h.b(new aq2.f(this));
    }

    @Override // ay1.l
    public by1.d a() {
        return new aq2.e(this.f13133g, (java.lang.String) ((jz5.n) this.f13135i).getValue());
    }

    @Override // ay1.l
    public java.lang.Object c() {
        return (java.lang.String) ((jz5.n) this.f13135i).getValue();
    }

    @Override // ay1.l
    public java.lang.String f() {
        return this.f13134h;
    }
}
