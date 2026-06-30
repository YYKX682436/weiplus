package bf3;

/* loaded from: classes7.dex */
public final class u extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bf3.z f19665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f19666e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(bf3.z zVar, java.lang.String str) {
        super(0);
        this.f19665d = zVar;
        this.f19666e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        bf3.z zVar = this.f19665d;
        boolean z17 = zVar.f19686k;
        java.lang.String str = this.f19666e;
        if (z17 && zVar.f19685j) {
            bf3.z.d(zVar, str);
        } else {
            zVar.f19683h.add(str);
        }
        return jz5.f0.f302826a;
    }
}
