package ch2;

/* loaded from: classes10.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f123031d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ch2.o2 o2Var) {
        super(1);
        this.f123031d = o2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            ch2.o2 o2Var = this.f123031d;
            android.content.Context O6 = o2Var.O6();
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(O6);
            e4Var.f293309c = o2Var.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mnc);
            e4Var.c();
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveKTVSingController", "stop play song failed");
        }
        return jz5.f0.f384359a;
    }
}
