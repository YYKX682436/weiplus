package com.p314xaae8f345.mm.p1006xc5476f33.p2032xb64b3ba2.uic;

/* loaded from: classes.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f239921d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f239922e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.util.ArrayList arrayList, android.view.View view) {
        super(2);
        this.f239921d = arrayList;
        this.f239922e = view;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean z17;
        int intValue = ((java.lang.Number) obj).intValue();
        ox3.g item = (ox3.g) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick position:");
        sb6.append(intValue);
        sb6.append(", checked:");
        sb6.append(item.f431286h);
        sb6.append(", total:");
        java.util.ArrayList arrayList = this.f239921d;
        sb6.append(arrayList.size());
        sb6.append(", total checked:");
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj3 : arrayList) {
            if (((ox3.g) obj3).f431286h) {
                arrayList2.add(obj3);
            }
        }
        sb6.append(arrayList2.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneAddTingUIC", sb6.toString());
        if (!arrayList.isEmpty()) {
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((ox3.g) it.next()).f431286h) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        android.view.View view = this.f239922e;
        if (z17) {
            view.setEnabled(false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneAddTingUIC", "set add tv disable");
        } else {
            view.setEnabled(true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RingtoneAddTingUIC", "set add tv enable");
        }
        return jz5.f0.f384359a;
    }
}
