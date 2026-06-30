package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes11.dex */
public class m1 extends com.tencent.mm.wallet_core.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AASelectContactUI f72731d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(com.tencent.mm.plugin.aa.ui.AASelectContactUI aASelectContactUI) {
        super(false);
        this.f72731d = aASelectContactUI;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.List] */
    @Override // com.tencent.mm.wallet_core.ui.z1
    public void onRealClick(android.view.View view) {
        ?? y76;
        com.tencent.mm.plugin.aa.ui.AASelectContactUI aASelectContactUI = this.f72731d;
        if (aASelectContactUI.K.isChecked()) {
            java.util.HashSet hashSet = aASelectContactUI.I;
            if (hashSet != null) {
                hashSet.clear();
            } else {
                aASelectContactUI.I = new java.util.HashSet();
            }
            aASelectContactUI.K.setChecked(false);
            aASelectContactUI.b7().notifyDataSetChanged();
        } else {
            if (aASelectContactUI.C == 6) {
                y76 = new java.util.ArrayList();
                java.util.Iterator it = aASelectContactUI.G.iterator();
                while (it.hasNext()) {
                    y76.add((java.lang.String) it.next());
                }
            } else {
                y76 = !c01.e2.R(aASelectContactUI.D) ? aASelectContactUI.y7(aASelectContactUI.z7()) : aASelectContactUI.M;
            }
            if (y76.size() > aASelectContactUI.f72471J) {
                db5.e1.u(aASelectContactUI.getContext(), aASelectContactUI.getString(com.tencent.mm.R.string.f489766b3, java.lang.Long.valueOf(aASelectContactUI.f72471J)), "", new com.tencent.mm.plugin.aa.ui.k1(this, y76), new com.tencent.mm.plugin.aa.ui.l1(this));
            } else if (aASelectContactUI.A7() && y76.size() == 0) {
                db5.t7.g(aASelectContactUI.getContext(), aASelectContactUI.getContext().getString(com.tencent.mm.R.string.iep));
            } else {
                com.tencent.mm.plugin.aa.ui.AASelectContactUI.x7(aASelectContactUI, y76);
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 2, 6);
    }
}
