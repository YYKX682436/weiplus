package com.tencent.mm.mj_publisher.finder.movie_composing.panel.base;

/* loaded from: classes5.dex */
public final class u implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.y f69256d;

    public u(com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.y yVar) {
        this.f69256d = yVar;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        ov0.e selectedTabPage;
        int keyboardHeight;
        int keyboardHeight2;
        com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.y yVar = this.f69256d;
        yVar.getKeyboardHeight();
        int i18 = yVar.B;
        if (yVar.F == i17) {
            return;
        }
        yVar.F = i17;
        boolean z18 = i17 > 0;
        if (i17 > 0) {
            keyboardHeight = yVar.getKeyboardHeight();
            if (keyboardHeight != i17 && i17 >= yVar.B) {
                keyboardHeight2 = yVar.getKeyboardHeight();
                com.tencent.mm.sdk.platformtools.d2.k(yVar.getContext(), i17);
                yVar.D(yVar.getKeyboardViewHeight(), i17 - keyboardHeight2);
            }
        }
        if (yVar.E != com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.s.f69252d) {
            yVar.getClass();
            com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.t tVar = yVar.D;
            if (tVar != null) {
                ov0.i0 i0Var = ((ov0.u) tVar).f349153a;
                ov0.t tVar2 = (ov0.t) i0Var.f69240i;
                if (tVar2 != null && (selectedTabPage = tVar2.getSelectedTabPage()) != null && selectedTabPage == ov0.e.f349125e && !z18) {
                    com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.k.U6(i0Var, false, 1, null);
                }
            }
        }
        yVar.E = z18 ? com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.s.f69253e : com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.s.f69254f;
    }
}
