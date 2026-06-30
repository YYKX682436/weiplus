package df2;

/* loaded from: classes3.dex */
public final class tm implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.cn f312989d;

    public tm(df2.cn cnVar) {
        this.f312989d = cnVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        df2.cn cnVar = this.f312989d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(cnVar.f311425p, "[hasLikedLive] b = " + bool);
        android.view.View f76 = cnVar.f7(cnVar);
        if (f76 != null && f76.getVisibility() == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
            if (bool.booleanValue()) {
                android.widget.TextView c76 = cnVar.c7();
                if (c76 != null) {
                    c76.setText(cnVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m89));
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 b76 = cnVar.b7();
                if (b76 == null) {
                    return;
                }
                b76.setVisibility(8);
                return;
            }
            android.widget.TextView c77 = cnVar.c7();
            if (c77 != null) {
                c77.setText(cnVar.O6().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m8_));
            }
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 b77 = cnVar.b7();
            if (b77 == null) {
                return;
            }
            b77.setVisibility(0);
        }
    }
}
