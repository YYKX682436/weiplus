package ap1;

/* loaded from: classes.dex */
public final class m1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f12704d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(java.util.HashSet hashSet) {
        super(1);
        this.f12704d = hashSet;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(!this.f12704d.contains(((p13.y) obj).f351187e));
    }
}
