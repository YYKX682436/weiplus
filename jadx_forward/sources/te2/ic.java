package te2;

/* loaded from: classes10.dex */
public final class ic extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.jc f499656d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ic(te2.jc jcVar) {
        super(1);
        this.f499656d = jcVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        te2.jc jcVar = this.f499656d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(jcVar.c(), "showMusicView - loadMoreData callback, size: " + intValue);
        if (intValue <= 0) {
            te2.lc lcVar = jcVar.f499686h;
            if (lcVar != null) {
                lcVar.d(true);
            }
            bm2.x8 x8Var = jcVar.f499687i;
            if (x8Var != null) {
                x8Var.m();
            }
        } else {
            te2.lc lcVar2 = jcVar.f499686h;
            if (lcVar2 != null) {
                lcVar2.e();
            }
            bm2.x8 x8Var2 = jcVar.f499687i;
            if (x8Var2 != null) {
                x8Var2.b(true);
            }
        }
        return jz5.f0.f384359a;
    }
}
