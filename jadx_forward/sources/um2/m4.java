package um2;

/* loaded from: classes3.dex */
public final class m4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510413d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m4(um2.x5 x5Var) {
        super(1);
        this.f510413d = x5Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        um2.x5 x5Var = this.f510413d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x5Var.f510565f, "postCloseLinkMsgWithRetry: " + booleanValue);
        if (booleanValue && ((mm2.e1) x5Var.c(mm2.e1.class)).b7()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x5Var.f510565f, "checkClearSingSong clear song");
            fm2.c cVar = x5Var.f101139c;
            if (cVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.f(cVar, null, null, new um2.z(x5Var, null), 3, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
