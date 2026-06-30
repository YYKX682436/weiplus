package cr0;

/* loaded from: classes3.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f303229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(java.lang.Object[] objArr) {
        super(0);
        this.f303229d = objArr;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String arrays = java.util.Arrays.toString(this.f303229d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
        return "#onTransactEnded: ".concat(arrays);
    }
}
