package ay1;

/* loaded from: classes2.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.r2 f15222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.p0 f15223e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kotlinx.coroutines.r2 r2Var, kotlinx.coroutines.p0 p0Var) {
        super(0);
        this.f15222d = r2Var;
        this.f15223e = p0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return kotlinx.coroutines.z0.a(new kotlinx.coroutines.s3(this.f15222d).plus(this.f15223e));
    }
}
