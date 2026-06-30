package f0;

/* loaded from: classes14.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f0.o f339684d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f339685e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(f0.o oVar, java.util.List list) {
        super(1);
        this.f339684d = oVar;
        this.f339685e = list;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        boolean z17 = this.f339684d.f339696b;
        f0.q0 q0Var = (f0.q0) this.f339685e.get(intValue);
        return java.lang.Integer.valueOf(z17 ? q0Var.f339723e : q0Var.f339724f);
    }
}
