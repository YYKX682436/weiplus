package mh2;

/* loaded from: classes10.dex */
public final class t extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f407991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39 f407992e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r45.yx1 yx1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39 c14229xb3dcfb39) {
        super(1);
        this.f407991d = yx1Var;
        this.f407992e = c14229xb3dcfb39;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            r45.yx1 yx1Var = this.f407991d;
            yx1Var.f472998n = !yx1Var.f472998n;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39.f193195p;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.ktv.p1504x373aa5.C14229xb3dcfb39 c14229xb3dcfb39 = this.f407992e;
            c14229xb3dcfb39.b(yx1Var);
            android.content.Context context = c14229xb3dcfb39.getContext();
            int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.f293309c = c14229xb3dcfb39.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mng);
            e4Var.c();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("KTVInteractiveWidget", "Pause sing failed");
        }
        return jz5.f0.f384359a;
    }
}
