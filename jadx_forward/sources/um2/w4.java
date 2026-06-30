package um2;

/* loaded from: classes3.dex */
public final class w4 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f510541d;

    public w4(um2.x5 x5Var) {
        this.f510541d = x5Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        um2.x5 x5Var = this.f510541d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(x5Var.f510565f, "value " + booleanValue + ", hasShown " + ((mm2.c1) x5Var.c(mm2.c1.class)).V);
        if (booleanValue && !((mm2.c1) x5Var.c(mm2.c1.class)).V) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = x5Var.f101138b;
            db5.t7.e(activityC0065xcd7aa112, activityC0065xcd7aa112.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d2w), com.p314xaae8f345.mm.R.raw.f80261x69edcbfe);
            ((mm2.c1) x5Var.c(mm2.c1.class)).V = true;
        }
        return jz5.f0.f384359a;
    }
}
