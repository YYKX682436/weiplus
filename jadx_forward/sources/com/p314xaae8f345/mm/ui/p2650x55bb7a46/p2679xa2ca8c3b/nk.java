package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes.dex */
public abstract class nk {

    /* renamed from: a, reason: collision with root package name */
    public static final android.widget.LinearLayout.LayoutParams f286465a = new android.widget.LinearLayout.LayoutParams(-1, -2);

    public static int a(java.lang.String str, int i17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return i17;
        }
        try {
            return android.graphics.Color.parseColor(str);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "parseFrom, ex = " + e17.getMessage());
            return i17;
        }
    }
}
