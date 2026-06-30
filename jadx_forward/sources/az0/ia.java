package az0;

/* loaded from: classes5.dex */
public final class ia extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Integer f97121d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ az0.xb f97122e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia(java.lang.Integer num, az0.xb xbVar) {
        super(1);
        this.f97121d = num;
        this.f97122e = xbVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4027x83c03a19 c4027x83c03a19;
        jz5.f0 f0Var = jz5.f0.f384359a;
        az0.xb xbVar = this.f97122e;
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.lang.Integer num = this.f97121d;
            if (num != null && (c4027x83c03a19 = xbVar.f97593i) != null) {
                c4027x83c03a19.k(num.intValue());
            }
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        return f0Var;
    }
}
