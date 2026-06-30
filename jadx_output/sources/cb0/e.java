package cb0;

/* loaded from: classes10.dex */
public final class e extends cb0.d {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f40210i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, java.lang.String str, int i17, byte[] bArr, java.lang.String str2, boolean z17, ab0.f0 f0Var) {
        super(context, i17, bArr, str2, z17, f0Var);
        kotlin.jvm.internal.o.g(context, "context");
        this.f40210i = str;
    }

    @Override // cb0.d
    public l41.e0 b() {
        java.lang.String str = this.f40210i;
        if (!(str == null || r26.n0.N(str))) {
            return new l41.e0(str, this.f40203b, this.f40204c, this.f40205d);
        }
        c(false, "url is nullOrBlank:" + str, null);
        return null;
    }
}
