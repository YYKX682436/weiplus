package ap1;

/* loaded from: classes.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.HashSet f94237d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(java.util.HashSet hashSet) {
        super(1);
        this.f94237d = hashSet;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return java.lang.Boolean.valueOf(!this.f94237d.contains(((p13.y) obj).f432720e));
    }
}
