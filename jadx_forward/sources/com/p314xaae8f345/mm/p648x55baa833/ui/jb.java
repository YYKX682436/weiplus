package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class jb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.lb f145791d;

    public jb(com.p314xaae8f345.mm.p648x55baa833.ui.lb lbVar) {
        this.f145791d = lbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p648x55baa833.ui.lb lbVar = this.f145791d;
        int dimension = (int) (lbVar.f145844f.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561100j) + lbVar.f145844f.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561423i3) + lbVar.f145844f.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561462j9));
        if (lbVar.f145844f.f145465g.getCount() / 4 > 0) {
            dimension *= (lbVar.f145844f.f145465g.getCount() / 4) + 1;
        }
        lbVar.f145844f.f145462d.setLayoutParams(new android.widget.LinearLayout.LayoutParams(lbVar.f145844f.f145462d.getWidth(), dimension));
    }
}
