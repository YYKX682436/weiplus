package bs3;

/* loaded from: classes.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bs3.l f23999d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(bs3.l lVar) {
        super(0);
        this.f23999d = lVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return this.f23999d.getIntent().getStringExtra("Contact_User");
    }
}
