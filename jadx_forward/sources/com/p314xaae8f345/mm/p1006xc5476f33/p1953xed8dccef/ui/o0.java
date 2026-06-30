package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* loaded from: classes15.dex */
public class o0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16816x5ca1ddba f234855d;

    public o0(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.ActivityC16816x5ca1ddba activityC16816x5ca1ddba) {
        this.f234855d = activityC16816x5ca1ddba;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/product/ui/MallProductSelectSkuUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.w wVar = this.f234855d.f234760s;
        boolean z17 = wVar.f234898e;
        android.app.Activity activity = wVar.f234897d;
        if (z17) {
            db5.t7.m123882x26a183b(activity, com.p314xaae8f345.mm.R.C30867xcad56011.grp, 1).show();
        } else {
            wq3.j jVar = wVar.f234900g;
            if (!jVar.a()) {
                java.util.Map map = jVar.f530095o;
                if (map != null) {
                    java.util.HashMap hashMap = (java.util.HashMap) map;
                    int size = hashMap.size();
                    int i17 = jVar.f530093m;
                    if (size < i17 && i17 > 0) {
                        java.util.Iterator it = jVar.f530082b.f530132e.f537605t.iterator();
                        while (it.hasNext()) {
                            xq3.m mVar = (xq3.m) it.next();
                            if (!hashMap.containsKey(mVar.f537635d)) {
                                str = mVar.f537636e;
                                break;
                            }
                        }
                    }
                }
                str = null;
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                    db5.t7.m123883x26a183b(activity, activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.grx, str), 0).show();
                }
            } else if (jVar.f530089i != null) {
                gm0.j1.i();
                gm0.j1.n().f354821b.g(new wq3.q(jVar.i(), com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.w.f234896m));
            } else {
                j45.l.m(activity, "address", ".ui.WalletAddAddressUI", 2);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/product/ui/MallProductSelectSkuUI$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
