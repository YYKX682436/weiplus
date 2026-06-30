package com.tencent.mm.chatroom.ui;

/* loaded from: classes11.dex */
public class jb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.chatroom.ui.lb f64258d;

    public jb(com.tencent.mm.chatroom.ui.lb lbVar) {
        this.f64258d = lbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.chatroom.ui.lb lbVar = this.f64258d;
        int dimension = (int) (lbVar.f64311f.getResources().getDimension(com.tencent.mm.R.dimen.f479567j) + lbVar.f64311f.getResources().getDimension(com.tencent.mm.R.dimen.f479890i3) + lbVar.f64311f.getResources().getDimension(com.tencent.mm.R.dimen.f479929j9));
        if (lbVar.f64311f.f63932g.getCount() / 4 > 0) {
            dimension *= (lbVar.f64311f.f63932g.getCount() / 4) + 1;
        }
        lbVar.f64311f.f63929d.setLayoutParams(new android.widget.LinearLayout.LayoutParams(lbVar.f64311f.f63929d.getWidth(), dimension));
    }
}
