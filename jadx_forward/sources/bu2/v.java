package bu2;

/* loaded from: classes.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f106104d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f106105e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(yz5.l lVar, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var) {
        super(1);
        this.f106104d = lVar;
        this.f106105e = c0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.p21 item = (r45.p21) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean booleanValue = ((java.lang.Boolean) this.f106104d.mo146xb9724478(item)).booleanValue();
        if (booleanValue) {
            this.f106105e.f391645d = true;
        }
        return java.lang.Boolean.valueOf(booleanValue);
    }
}
