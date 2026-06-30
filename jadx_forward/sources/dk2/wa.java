package dk2;

/* loaded from: classes3.dex */
public final class wa {

    /* renamed from: b, reason: collision with root package name */
    public static final dk2.va f315816b = new dk2.va(null);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f315817c = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    public final r45.f82 f315818a;

    public wa(r45.f82 quotaInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(quotaInfo, "quotaInfo");
        this.f315818a = quotaInfo;
    }

    /* renamed from: toString */
    public java.lang.String m124680x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("quotaInfo: ");
        r45.f82 f82Var = this.f315818a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f82Var, "<this>");
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("can_show:");
        sb7.append(f82Var.m75939xb282bd08(0));
        sb7.append(" notice_amount: ");
        r45.ql1 ql1Var = (r45.ql1) f82Var.m75936x14adae67(2);
        sb7.append(ql1Var != null ? java.lang.Long.valueOf(ql1Var.m75942xfb822ef2(1)) : null);
        sb6.append(sb7.toString());
        return sb6.toString();
    }
}
