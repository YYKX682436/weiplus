package bm2;

/* loaded from: classes3.dex */
public final class n1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f22124d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(int[] iArr) {
        super(1);
        this.f22124d = iArr;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        dk2.zf it = (dk2.zf) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(kz5.z.F(this.f22124d, it.getType()));
    }
}
