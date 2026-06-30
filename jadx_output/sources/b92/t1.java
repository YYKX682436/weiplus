package b92;

/* loaded from: classes3.dex */
public final class t1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18512d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(java.lang.String str) {
        super(1);
        this.f18512d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String host = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(host, "host");
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(host, this.f18512d));
    }
}
