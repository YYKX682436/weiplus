package el2;

/* loaded from: classes3.dex */
public final class x extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ el2.i0 f335472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f335473e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(el2.i0 i0Var, android.content.Context context) {
        super(1);
        this.f335472d = i0Var;
        this.f335473e = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.content.Context context = this.f335473e;
        java.lang.String string = (intValue == 2 && el2.i0.e0(this.f335472d)) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573321e93) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573320e92);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        return string;
    }
}
