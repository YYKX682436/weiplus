package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e;

/* loaded from: classes15.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl1.b f164262d;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.h0 h0Var, tl1.b bVar) {
        this.f164262d = bVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        tl1.b bVar = this.f164262d;
        if (bVar.m166746x2a2c2b84() == null || !(bVar.m166746x2a2c2b84() instanceof android.view.View)) {
            return;
        }
        ((android.view.View) bVar.m166746x2a2c2b84()).requestLayout();
    }
}
