package hz3;

/* loaded from: classes5.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f367868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f367869e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f367870f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2) {
        super(3);
        this.f367868d = h0Var;
        this.f367869e = c0Var;
        this.f367870f = c0Var2;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str = (java.lang.String) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) obj3).booleanValue();
        if (str == null) {
            str = "";
        }
        this.f367868d.f391656d = str;
        this.f367869e.f391645d = booleanValue;
        this.f367870f.f391645d = booleanValue2;
        return jz5.f0.f384359a;
    }
}
