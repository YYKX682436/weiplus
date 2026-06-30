package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class r3 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightSettingsUI f230947d;

    public r3(com.tencent.mm.plugin.mmsight.ui.SightSettingsUI sightSettingsUI) {
        this.f230947d = sightSettingsUI;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f230947d.h.size();
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f230947d.h.get(i17);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        java.lang.String str;
        android.widget.TextView textView = new android.widget.TextView(this.f230947d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3 t3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.t3) getItem(i17);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(t3Var.f230957a);
        sb6.append("->:");
        int intValue = ((java.lang.Integer) t3Var.f230961e.f.get(t3Var.f230960d, 0)).intValue();
        int i18 = 0;
        while (true) {
            int[] iArr = t3Var.f230959c;
            int length = iArr.length;
            java.lang.String[] strArr = t3Var.f230958b;
            if (i18 >= length) {
                str = strArr[0];
                break;
            }
            if (intValue == iArr[i18] && i18 < strArr.length) {
                str = strArr[i18];
                break;
            }
            i18++;
        }
        sb6.append(str);
        textView.setText(sb6.toString());
        textView.setGravity(17);
        textView.setTextSize(1, 20.0f);
        textView.setHeight(i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 50));
        if (i17 % 2 == 1) {
            textView.setBackgroundColor(android.graphics.Color.parseColor("#e2efda"));
        }
        textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.q3(this, t3Var));
        return textView;
    }
}
