package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class t1 implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22498xb11fdc57 f292283d;

    public t1(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22498xb11fdc57 activityC22498xb11fdc57) {
        this.f292283d = activityC22498xb11fdc57;
    }

    @Override // db5.o9
    public void Q0(java.lang.String str) {
        char charAt = str.charAt(0);
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22498xb11fdc57 activityC22498xb11fdc57 = this.f292283d;
        if (activityC22498xb11fdc57.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ibx).equals(str)) {
            activityC22498xb11fdc57.f291518d.setSelection(0);
            return;
        }
        int[] iArr = activityC22498xb11fdc57.f291519e.f292166h;
        if (iArr == null) {
            return;
        }
        for (int i17 = 0; i17 < iArr.length; i17++) {
            if (iArr[i17] == charAt) {
                android.widget.ListView listView = activityC22498xb11fdc57.f291518d;
                listView.setSelection(i17 + listView.getHeaderViewsCount());
                return;
            }
        }
    }
}
