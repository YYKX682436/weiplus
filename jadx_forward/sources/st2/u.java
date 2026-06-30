package st2;

/* loaded from: classes3.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f493993d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(st2.h1 h1Var) {
        super(1);
        this.f493993d = h1Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long longValue = ((java.lang.Number) obj).longValue();
        st2.h1 h1Var = this.f493993d;
        if (!h1Var.w()) {
            dk2.q4 q4Var = dk2.q4.f315471a;
            android.content.Context context = h1Var.f493866d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            q4Var.b(context, h1Var.f493868f, longValue);
        }
        return jz5.f0.f384359a;
    }
}
