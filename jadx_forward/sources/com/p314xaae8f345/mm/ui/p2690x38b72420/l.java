package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class l implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment f288535d;

    public l(com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment addressUIFragment) {
        this.f288535d = addressUIFragment;
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        java.lang.String str2;
        com.p314xaae8f345.mm.ui.p2690x38b72420.ActivityC22286xab929968.AddressUIFragment addressUIFragment = this.f288535d;
        int i17 = 0;
        if (addressUIFragment.m7467x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.ibx).equals(str)) {
            addressUIFragment.f287840o.setSelection(0);
            return;
        }
        java.lang.String[] strArr = addressUIFragment.f287842q.B;
        if (strArr == null) {
            return;
        }
        if ("↑".equals(str)) {
            addressUIFragment.f287840o.setSelection(0);
            return;
        }
        if ("☆".equals(str)) {
            android.widget.ListView listView = addressUIFragment.f287840o;
            listView.setSelection(listView.getHeaderViewsCount());
            return;
        }
        while (i17 < strArr.length && (str2 = strArr[i17]) != null) {
            if (str2.equals(str)) {
                com.p314xaae8f345.mm.ui.p2690x38b72420.e eVar = addressUIFragment.f287842q;
                int[] iArr = eVar.A;
                if (iArr != null && i17 >= 0 && i17 < iArr.length) {
                    i17 = iArr[i17];
                }
                int i18 = i17 + eVar.H;
                android.widget.ListView listView2 = addressUIFragment.f287840o;
                listView2.setSelection(i18 + listView2.getHeaderViewsCount());
                return;
            }
            i17++;
        }
    }
}
