package c61;

/* loaded from: classes5.dex */
public final class i4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Exception f39036d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i4(java.lang.Exception exc) {
        super(0);
        this.f39036d = exc;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String message = this.f39036d.getMessage();
        return message == null ? "" : message;
    }
}
