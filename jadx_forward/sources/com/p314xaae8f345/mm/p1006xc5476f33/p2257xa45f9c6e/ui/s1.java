package com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui;

/* loaded from: classes8.dex */
public class s1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 f254238d;

    public s1(com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3) {
        this.f254238d = c18557xc00aa3f3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "doReloadData");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3.f254052c3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2257xa45f9c6e.ui.C18557xc00aa3f3 c18557xc00aa3f3 = this.f254238d;
        c18557xc00aa3f3.w1();
        if (c18557xc00aa3f3.C) {
            c18557xc00aa3f3.f254072s2 = true;
        }
        if (c18557xc00aa3f3.m71609x4905e9fa().E0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarView", "isComputingLayout not update");
            c18557xc00aa3f3.f254077x2 = true;
        } else {
            c18557xc00aa3f3.f254056c2.m();
            c18557xc00aa3f3.f254069p2.m8146xced61ae5();
            c18557xc00aa3f3.f254077x2 = false;
        }
    }
}
