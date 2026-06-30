package zj4;

/* loaded from: classes11.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zj4.e f554874d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(zj4.e eVar) {
        super(0);
        this.f554874d = eVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zj4.e eVar = this.f554874d;
        if (!eVar.m158359x1e885992().hasExtra("KEY_SET_STATUS_PARAM_FROM_EDIT")) {
            return null;
        }
        bi4.d1 d1Var = new bi4.d1();
        d1Var.mo11468x92b714fd(eVar.m158359x1e885992().getByteArrayExtra("KEY_SET_STATUS_PARAM_FROM_EDIT"));
        return d1Var;
    }
}
