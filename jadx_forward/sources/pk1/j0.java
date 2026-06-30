package pk1;

/* loaded from: classes12.dex */
public final class j0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk1.l0 f436990d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(pk1.l0 l0Var) {
        super(1);
        this.f436990d = l0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1215x6b0147b.p1216xc53e9ae1.p1217x693b1d6.a aVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f436990d.f437003h, "startCallback, startRet: " + booleanValue);
        this.f436990d.f437007o = java.lang.Boolean.valueOf(booleanValue);
        if (booleanValue && (aVar = this.f436990d.f437002g) != null) {
            pk1.r rVar = (pk1.r) aVar;
            if (rVar.W == 0 && rVar.H > 0) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - rVar.H;
                rVar.W = currentTimeMillis;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f437019a, "markTimeForFirstByte costTime:%d", java.lang.Long.valueOf(currentTimeMillis));
            }
        }
        return jz5.f0.f384359a;
    }
}
