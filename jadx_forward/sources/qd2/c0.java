package qd2;

/* loaded from: classes2.dex */
public final class c0 implements android.content.DialogInterface.OnCancelListener {
    public c0(android.content.Context context) {
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOpenRedPacketEditPageHelper", "[showLoading] onCancel");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15199x5a7ac820 c15199x5a7ac820 = qd2.d0.f443248b;
        if (c15199x5a7ac820 != null) {
            c15199x5a7ac820.mo48239x360802();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderOpenRedPacketEditPageHelper", "[onFailed]");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15199x5a7ac820 c15199x5a7ac8202 = qd2.d0.f443248b;
        if (c15199x5a7ac8202 != null) {
            c15199x5a7ac8202.mo48239x360802();
        }
        qd2.d0.f443248b = null;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = qd2.d0.f443249c;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        qd2.d0.f443249c = null;
    }
}
