package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class q3 extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 f224522d;

    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 activityC16143x7673980) {
        this.f224522d = activityC16143x7673980;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/IPCallRechargeUI$4", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16143x7673980 activityC16143x7673980 = this.f224522d;
        ((android.widget.TextView) view).setHighlightColor(activityC16143x7673980.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        android.content.Intent intent = new android.content.Intent();
        java.lang.String str = activityC16143x7673980.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4g) + "&usedcc=";
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.j.a();
        if (!a17.f224006c) {
            a17.b(false);
        }
        java.util.ArrayList arrayList2 = a17.f224004a;
        if (arrayList2.size() > 0) {
            int size = arrayList2.size();
            if (size > 5) {
                size = 5;
            }
            for (int i17 = 0; i17 < size; i17++) {
                java.lang.String g17 = t83.c.g(((java.lang.Integer) arrayList2.get(i17)).toString());
                if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                    str = str + g17 + "|";
                }
            }
            if (str.endsWith("|")) {
                str = str.substring(0, str.length() - 1);
            }
        } else {
            str = str + t83.c.g(t83.f.f());
        }
        intent.putExtra("rawUrl", str);
        intent.putExtra("showShare", false);
        j45.l.j(activityC16143x7673980, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/IPCallRechargeUI$4", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        textPaint.setColor(this.f224522d.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560841vo));
        textPaint.setUnderlineText(false);
    }
}
