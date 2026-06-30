package el2;

/* loaded from: classes3.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f335300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f335301e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context, el2.i0 i0Var) {
        super(1);
        this.f335300d = context;
        this.f335301e = i0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            android.content.Context context = this.f335300d;
            db5.t7.h(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e8e));
            wt2.a aVar = this.f335301e.I;
            if (aVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
                throw null;
            }
            aVar.V3();
        }
        return jz5.f0.f384359a;
    }
}
