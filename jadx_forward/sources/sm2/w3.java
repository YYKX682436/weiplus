package sm2;

/* loaded from: classes3.dex */
public final class w3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f491299d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.xn1 f491300e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(sm2.o4 o4Var, r45.xn1 xn1Var) {
        super(0);
        this.f491299d = o4Var;
        this.f491300e = xn1Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        km2.m m57663xfb7e5820;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e c14197x319b1b9e;
        qf2.v0 v0Var;
        sm2.o4 o4Var = this.f491299d;
        boolean isFinishing = o4Var.f101127b.isFinishing();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = o4Var.f101127b;
        if (isFinishing || activityC0065xcd7aa112.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o4Var.f491143f, "onRandomMicAccept: context is dead:" + activityC0065xcd7aa112);
        } else {
            fm2.a aVar = o4Var.f101128c;
            if (aVar != null && (m57663xfb7e5820 = aVar.m57663xfb7e5820()) != null && (c14197x319b1b9e = m57663xfb7e5820.f390664f) != null && (v0Var = (qf2.v0) c14197x319b1b9e.m56798x25fe639c(qf2.v0.class)) != null) {
                v0Var.b7(this.f491300e);
            }
        }
        return jz5.f0.f384359a;
    }
}
