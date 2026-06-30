package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50;

/* loaded from: classes5.dex */
public final class wa implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hb f243226d;

    public wa(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hb hbVar) {
        this.f243226d = hbVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.hb hbVar = this.f243226d;
        android.content.Intent intent = new android.content.Intent(hbVar.m80379x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11463xc681e6dc.class);
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.a9.f273996a;
        if (yp5.a.f545942a.a()) {
            intent.putExtra("kintent_hint", hbVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.j0c));
        } else {
            intent.putExtra("kintent_hint", hbVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.j0d));
        }
        intent.putExtra("from_unbind", true);
        android.app.Activity m80379x76847179 = hbVar.m80379x76847179();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(1);
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(m80379x76847179, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsEmailCgiUIC$onSceneEnd$1", "onClick", "(Landroid/content/DialogInterface;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }
}
