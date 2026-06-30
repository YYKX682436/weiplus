package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui;

/* loaded from: classes15.dex */
public class l implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.n f241115d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.n nVar) {
        this.f241115d = nVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.n nVar = this.f241115d;
        nVar.N.getHeight();
        nVar.N.getLineHeight();
        if (nVar.N.getText() != null && nVar.N.getHeight() > 0 && nVar.N.getLineHeight() > 0 && nVar.S == null) {
            if (nVar.N.getHeight() / nVar.N.getLineHeight() > 5 && !nVar.R && !nVar.Q) {
                nVar.P.setVisibility(0);
                nVar.N.setMaxLines(5);
                nVar.R = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.m mVar = nVar.W;
                if (mVar != null) {
                    java.lang.String str = nVar.f279313q;
                    if (((str == null || str.length() <= 0) ? null : (java.lang.Boolean) ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.v0) mVar).f241190a.A.get(str)) == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.m mVar2 = nVar.W;
                        java.lang.String str2 = nVar.f279313q;
                        java.lang.Boolean bool = java.lang.Boolean.FALSE;
                        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.v0 v0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.v0) mVar2;
                        v0Var.getClass();
                        if (str2 != null && str2.length() > 0) {
                            v0Var.f241190a.A.put(str2, bool);
                        }
                        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r rVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.v0) nVar.W).f241190a.f240842d;
                        if (rVar != null) {
                            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) rVar).notifyDataSetChanged();
                        }
                    }
                }
            }
            int height = nVar.N.getHeight() / nVar.N.getLineHeight();
        }
        nVar.N.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }
}
