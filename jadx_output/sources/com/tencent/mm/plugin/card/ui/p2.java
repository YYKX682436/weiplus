package com.tencent.mm.plugin.card.ui;

/* loaded from: classes8.dex */
public class p2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.mu f95113d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.card.ui.CardIndexUI f95114e;

    public p2(com.tencent.mm.plugin.card.ui.CardIndexUI cardIndexUI, r45.mu muVar) {
        this.f95114e = cardIndexUI;
        this.f95113d = muVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/card/ui/CardIndexUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.mu muVar = this.f95113d;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardIndexUI", "click header view: %s", java.lang.Integer.valueOf(muVar.f380828g));
        int i17 = muVar.f380828g;
        if (i17 == 1) {
            lu1.d.j(this.f95114e, muVar.f380829h, 0);
        } else if (i17 == 2) {
            com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent startAppBrandUIFromOuterEvent = new com.tencent.mm.autogen.events.StartAppBrandUIFromOuterEvent();
            r45.iu iuVar = muVar.f380830i;
            java.lang.String str = iuVar.f377328d;
            am.nx nxVar = startAppBrandUIFromOuterEvent.f54857g;
            nxVar.f7466a = str;
            java.lang.String str2 = iuVar.f377329e;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            if (str2 == null) {
                str2 = "";
            }
            nxVar.f7467b = str2;
            nxVar.f7469d = 1028;
            startAppBrandUIFromOuterEvent.e();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/card/ui/CardIndexUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
