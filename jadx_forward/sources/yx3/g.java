package yx3;

/* loaded from: classes15.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f549437d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yx3.j f549438e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(boolean z17, yx3.j jVar) {
        super(0);
        this.f549437d = z17;
        this.f549438e = jVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17 = this.f549437d;
        yx3.j jVar = this.f549438e;
        if (z17) {
            m8.i0 i0Var = jVar.f549444f;
            jVar.f549443e = i0Var != null ? i0Var.f406104l : 1.0f;
            if (i0Var != null) {
                i0Var.m(0.0f);
            }
        } else {
            m8.i0 i0Var2 = jVar.f549444f;
            if (i0Var2 != null) {
                i0Var2.m(jVar.f549443e);
            }
        }
        return jz5.f0.f384359a;
    }
}
