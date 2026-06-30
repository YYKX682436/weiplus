package cw2;

/* loaded from: classes2.dex */
public final class s9 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.t9 f305542d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(cw2.t9 t9Var) {
        super(2);
        this.f305542d = t9Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("$");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("tabType:");
        cw2.t9 t9Var = this.f305542d;
        sb7.append(t9Var.f305563d.f305232g);
        sb7.append('.');
        sb7.append(t9Var.hashCode());
        sb6.append(sb7.toString());
        sb6.append(" onFeedSelect -> ");
        sb6.append(intValue);
        sb6.append(", ");
        sb6.append(booleanValue);
        sb6.append('.');
        ot5.g.c("FinderViewVideoCore", sb6.toString());
        return jz5.f0.f384359a;
    }
}
