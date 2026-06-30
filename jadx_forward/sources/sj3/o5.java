package sj3;

/* loaded from: classes14.dex */
public final /* synthetic */ class o5 extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public o5(java.lang.Object obj) {
        super(1, obj, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16588x7b895f5a.class, "showOriDialog", "showOriDialog(I)V", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16588x7b895f5a c16588x7b895f5a = (com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16588x7b895f5a) this.f72685xcfcbe9ef;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16588x7b895f5a.f231888m;
        c16588x7b895f5a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ScreenCastBigView", "showOriDialog: " + intValue);
        if (c16588x7b895f5a.f231893h != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ScreenCastBigView", "showOriDialog: already have showing view");
        } else {
            if (1 <= intValue && intValue < 6) {
                boolean z17 = intValue == 1 || intValue == 3;
                if (z17 != c16588x7b895f5a.f231894i) {
                    c16588x7b895f5a.f231894i = z17;
                    pm0.v.X(new sj3.m5(c16588x7b895f5a));
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
