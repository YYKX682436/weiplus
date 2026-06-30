package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes4.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e f272411d;

    public j(com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e abstractC19633xb84f839e) {
        this.f272411d = abstractC19633xb84f839e;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e abstractC19633xb84f839e = this.f272411d;
        abstractC19633xb84f839e.M = true;
        android.widget.ProgressBar progressBar = abstractC19633xb84f839e.f271277m;
        if (progressBar != null && progressBar.getVisibility() != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC19633xb84f839e.f271272e, "%s show loading", abstractC19633xb84f839e.N());
            abstractC19633xb84f839e.f271277m.setVisibility(0);
        }
        com.p314xaae8f345.mm.p2470x93e71c27.ui.b1 b1Var = abstractC19633xb84f839e.f271284t;
        if (b1Var != null) {
            b1Var.N5(abstractC19633xb84f839e.mo66135x23a7af9b(), abstractC19633xb84f839e.mo48228x75e04be9(), java.lang.Boolean.FALSE);
        }
    }
}
