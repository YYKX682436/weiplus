package com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26;

/* loaded from: classes8.dex */
public class d implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.c f223635d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.c cVar) {
        this.f223635d = cVar;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        android.view.View view2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.f fVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.f) ((in5.s0) k3Var).f374658i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.c cVar = this.f223635d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.e eVar = cVar.f223631f;
        java.lang.String str = fVar.f223636d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1764x70041d26.a) eVar;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = aVar.f223605a;
        if (y1Var == null || (view2 = y1Var.f293560f) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("GameLivePlayGameAnchorInviteWidget", "null");
        } else {
            int i18 = fVar.f223637e;
            aVar.f223617m = i18;
            aVar.f223616l.f223562d = i18;
            ((android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.krq)).setText(str);
        }
        cVar.h();
    }
}
