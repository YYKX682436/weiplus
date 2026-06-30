package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.uic;

/* renamed from: com.tencent.mm.plugin.label.ui.uic.LabelCustomCombineProxyUIC */
/* loaded from: classes16.dex */
public final class C16177x9acbb3b extends wm3.a {
    public final java.util.ArrayList A6;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.uic.C16178x17f0d2d6 B6;

    /* renamed from: z6, reason: collision with root package name */
    public boolean f224933z6;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.label.ui.uic.LabelCustomCombineProxyUIC$labelListChangeByOutsideListener$1] */
    public C16177x9acbb3b(final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.A6 = new java.util.ArrayList();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.B6 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5985xa5bfc852>(a0Var) { // from class: com.tencent.mm.plugin.label.ui.uic.LabelCustomCombineProxyUIC$labelListChangeByOutsideListener$1
            {
                this.f39173x3fe91575 = -631294366;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5985xa5bfc852 c5985xa5bfc852) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5985xa5bfc852 event = c5985xa5bfc852;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.util.ArrayList arrayList = event.f136280m.f359304a;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("labelListChangeByInsideListener: ");
                sb6.append(arrayList != null ? java.lang.Integer.valueOf(arrayList.size()) : null);
                sb6.append(" currentSelectList: ");
                com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.uic.C16177x9acbb3b c16177x9acbb3b = com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.uic.C16177x9acbb3b.this;
                sb6.append(c16177x9acbb3b.A6.size());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LabelCustomCombineProxyUIC", sb6.toString());
                if (arrayList != null) {
                    java.util.Iterator it = c16177x9acbb3b.A6.iterator();
                    while (it.hasNext()) {
                        java.lang.String str = (java.lang.String) it.next();
                        if (!arrayList.contains(str)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LabelCustomCombineProxyUIC", "labelListChangeByInsideListener: updateToUnSelect: " + str);
                            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = activity;
                            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 viewOnCreateContextMenuListenerC16171x51fc9384 = activityC0065xcd7aa112 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ViewOnCreateContextMenuListenerC16171x51fc9384) activityC0065xcd7aa112 : null;
                            if (viewOnCreateContextMenuListenerC16171x51fc9384 != null) {
                                viewOnCreateContextMenuListenerC16171x51fc9384.c(str, true, false);
                            }
                        }
                    }
                }
                return true;
            }
        };
    }

    public final void a(java.util.List labelIdList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelIdList, "labelIdList");
        if (this.f224933z6) {
            java.util.ArrayList arrayList = this.A6;
            arrayList.clear();
            arrayList.addAll(labelIdList);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5986x18099e21 c5986x18099e21 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5986x18099e21();
            c5986x18099e21.f136281m.f359305a = new java.util.ArrayList(labelIdList);
            c5986x18099e21.e();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        boolean booleanExtra = m158359x1e885992().getBooleanExtra("from_combine_multi_tab", false);
        this.f224933z6 = booleanExtra;
        if (booleanExtra) {
            mo48813x58998cd();
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        if (this.f224933z6) {
            mo48814x2efc64();
        }
    }
}
