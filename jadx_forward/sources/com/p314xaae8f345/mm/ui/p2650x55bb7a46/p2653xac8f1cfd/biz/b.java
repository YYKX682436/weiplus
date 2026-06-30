package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz;

/* loaded from: classes9.dex */
public class b implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f280301d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a f280302e;

    public b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar, boolean z17) {
        this.f280302e = aVar;
        this.f280301d = z17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.biz.a aVar = this.f280302e;
        qk.o oVar = aVar.f280279h;
        oVar.f66741xae4ef36 = 1;
        if (oVar != null) {
            oVar.f66733x6baace8e |= 4;
            r01.z.p(oVar);
        }
        if (!this.f280301d) {
            r01.q3.Zi().f(aVar.f280113d.x());
            return;
        }
        android.content.Intent intent = new android.content.Intent("android.settings.LOCATION_SOURCE_SETTINGS");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = aVar.f280113d.f542250l;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(abstractC21611x7536149b, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/biz/BizComponent$10", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        abstractC21611x7536149b.mo7585xa4df9991((android.content.Intent) arrayList.get(0));
        yj0.a.f(abstractC21611x7536149b, "com/tencent/mm/ui/chatting/component/biz/BizComponent$10", "onClick", "(Landroid/content/DialogInterface;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
