package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes12.dex */
public class l3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f283858d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m3 f283859e;

    public l3(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m3 m3Var, java.util.List list) {
        this.f283859e = m3Var;
        this.f283858d = list;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.util.List list = this.f283858d;
        int size = list.size();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m3 m3Var = this.f283859e;
        if (size == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryGalleryPresenter", "handleSave size = 0");
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316 viewOnClickListenerC21789x2eb4d316 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316) m3Var.f283877e.f283889d;
            viewOnClickListenerC21789x2eb4d316.X6();
            viewOnClickListenerC21789x2eb4d316.f282286q = false;
            viewOnClickListenerC21789x2eb4d316.W6(false, "");
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.n3 n3Var = m3Var.f283877e;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316 viewOnClickListenerC21789x2eb4d3162 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2655xf44c7752.ViewOnClickListenerC21789x2eb4d316) n3Var.f283889d;
        viewOnClickListenerC21789x2eb4d3162.f282286q = true;
        viewOnClickListenerC21789x2eb4d3162.W6(true, viewOnClickListenerC21789x2eb4d3162.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573838g01));
        s75.d.b(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.r2(n3Var, list), "handleSave");
    }
}
