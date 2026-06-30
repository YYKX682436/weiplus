package w22;

/* loaded from: classes10.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w22.v f524101d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f524102e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(w22.v vVar, java.lang.String str) {
        super(1);
        this.f524101d = vVar;
        this.f524102e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorPresenter", "voice text block " + booleanValue);
        w22.v vVar = this.f524101d;
        vVar.f524120h = true;
        if (booleanValue) {
            db5.t7.m123882x26a183b(vVar.f524113a, com.p314xaae8f345.mm.R.C30867xcad56011.c0_, 0).show();
        } else {
            vVar.f524118f = this.f524102e;
        }
        pm0.v.X(new w22.q(vVar));
        return jz5.f0.f384359a;
    }
}
