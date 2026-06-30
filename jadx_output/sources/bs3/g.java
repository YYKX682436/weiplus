package bs3;

/* loaded from: classes4.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bs3.h f23995d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(bs3.h hVar) {
        super(0);
        this.f23995d = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f23995d.getIntent().getStringExtra("sns_permission_userName");
    }
}
