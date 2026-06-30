package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class cg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.dg f279629d;

    public cg(com.p314xaae8f345.mm.ui.dg dgVar) {
        this.f279629d = dgVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.dg dgVar = this.f279629d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = dgVar.f289873h.f278560n;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b2 = dgVar.f289873h.f278560n;
        if (abstractC21611x7536149b2 != null) {
            abstractC21611x7536149b2.mo7496x9d4787cb(dgVar.f289870e & 65535, dgVar.f289871f, dgVar.f289872g);
        }
    }

    /* renamed from: toString */
    public java.lang.String m79388x9616526c() {
        return super.toString() + "|PostSelectImageJob_onActivityResult";
    }
}
