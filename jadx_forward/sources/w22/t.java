package w22;

/* loaded from: classes10.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f524106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w22.v f524107e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f524108f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f524109g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f524110h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, w22.v vVar, java.lang.String str, int i17, boolean z17) {
        super(1);
        this.f524106d = u3Var;
        this.f524107e = vVar;
        this.f524108f = str;
        this.f524109g = i17;
        this.f524110h = z17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f524106d.dismiss();
        w22.v vVar = this.f524107e;
        if (booleanValue) {
            db5.t7.m123882x26a183b(vVar.f524113a, com.p314xaae8f345.mm.R.C30867xcad56011.c0_, 0).show();
        } else {
            w22.v.a(vVar, this.f524108f, this.f524109g, this.f524110h);
        }
        return jz5.f0.f384359a;
    }
}
