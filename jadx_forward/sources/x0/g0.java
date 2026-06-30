package x0;

/* loaded from: classes5.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f532424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Collection f532425e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(int i17, java.util.Collection collection) {
        super(1);
        this.f532424d = i17;
        this.f532425e = collection;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List it = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        return java.lang.Boolean.valueOf(it.addAll(this.f532424d, this.f532425e));
    }
}
