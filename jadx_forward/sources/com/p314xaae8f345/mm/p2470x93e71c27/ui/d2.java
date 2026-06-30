package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes8.dex */
public class d2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19641xd487040e f272313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 f272314e;

    public d2(com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9, com.p314xaae8f345.mm.p2470x93e71c27.ui.C19641xd487040e c19641xd487040e) {
        this.f272314e = c19645x574159e9;
        this.f272313d = c19641xd487040e;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.C19645x574159e9 c19645x574159e9 = this.f272314e;
        c19645x574159e9.f271337e = "";
        c19645x574159e9.f271342m.b();
        c19645x574159e9.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < c19645x574159e9.f271340h.getChildCount(); i18++) {
            android.view.View childAt = c19645x574159e9.f271340h.getChildAt(i18);
            if (childAt.findViewById(com.p314xaae8f345.mm.R.id.kuc) == this.f272313d) {
                arrayList.add(childAt);
            }
        }
        for (int i19 = 0; i19 < arrayList.size(); i19++) {
            c19645x574159e9.f271340h.removeView((android.view.View) arrayList.get(i19));
        }
        c19645x574159e9.f271340h.getChildAt(r6.getChildCount() - 1).requestFocus();
        if (c19645x574159e9.f271340h.getChildCount() <= 5) {
            c19645x574159e9.g();
        }
    }
}
