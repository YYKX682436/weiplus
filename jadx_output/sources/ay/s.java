package ay;

/* loaded from: classes14.dex */
public final class s extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ay.v f15180d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ay.v vVar) {
        super(1);
        this.f15180d = vVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        ay.v vVar = this.f15180d;
        vVar.P6(ay.e.a((ay.e) vVar.N6(), null, null, false, false, false, floatValue + 90, false, 95, null));
        return jz5.f0.f302826a;
    }
}
