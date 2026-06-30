package com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui;

/* loaded from: classes8.dex */
public class e1 implements com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.a4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514 f261777a;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514 activityC19106xf6056514) {
        this.f261777a = activityC19106xf6056514;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.a4
    /* renamed from: onClick */
    public void mo73850xaf6b9ae9(android.view.View view) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Micromsg.WalletInputCardIDUI", "hy: clickable span on click");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514.f261391r;
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.ActivityC19106xf6056514 activityC19106xf6056514 = this.f261777a;
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) activityC19106xf6056514.mo55332x76847179().getSystemService("layout_inflater");
        android.widget.TextView textView = (android.widget.TextView) layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570710bk3, (android.view.ViewGroup) null);
        textView.setText(activityC19106xf6056514.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kje));
        int dimensionPixelSize = layoutInflater.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561399hf);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        db5.e1.w(activityC19106xf6056514.mo55332x76847179(), activityC19106xf6056514.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kjd), activityC19106xf6056514.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kmf), textView, new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.k1(activityC19106xf6056514));
    }
}
