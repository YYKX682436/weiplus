package f0;

/* loaded from: classes14.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f339544d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f339545e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(boolean z17, java.util.List list) {
        super(1);
        this.f339544d = z17;
        this.f339545e = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        f0.q0 q0Var = (f0.q0) ((f0.k) this.f339545e.get(((java.lang.Number) obj).intValue()));
        return java.lang.Integer.valueOf(this.f339544d ? q0Var.f339723e : q0Var.f339724f);
    }
}
