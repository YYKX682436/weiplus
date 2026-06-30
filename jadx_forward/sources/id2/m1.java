package id2;

/* loaded from: classes3.dex */
public final class m1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f372197d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(id2.v1 v1Var) {
        super(0);
        this.f372197d = v1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1501x175505a3.p1503x54874a96.C14227x4262fb44 c14227x4262fb44;
        id2.v1 v1Var = this.f372197d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(v1Var.f372367d, "buy success, finish");
        gk2.e eVar = dk2.ef.I;
        if (eVar != null && (c14227x4262fb44 = ((mm2.s2) eVar.a(mm2.s2.class)).f410942n) != null) {
            c14227x4262fb44.mo7808x76db6cb1(java.lang.Boolean.FALSE);
        }
        v1Var.m158354x19263085().finish();
        return jz5.f0.f384359a;
    }
}
