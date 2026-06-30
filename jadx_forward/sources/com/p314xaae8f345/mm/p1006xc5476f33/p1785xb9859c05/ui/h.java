package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o f224374d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o oVar) {
        this.f224374d = oVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String substring;
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ipcall/ui/DialPadController$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o oVar = this.f224374d;
        java.lang.String obj = oVar.f224484c.getText().toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj)) {
            java.lang.String charSequence = oVar.f224483b.getText().toString();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(charSequence)) {
                java.lang.String substring2 = charSequence.substring(0, charSequence.length() - 1);
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(substring2) || substring2.equals("+")) {
                    oVar.f224483b.setText("+");
                    oVar.f224493l = "+";
                    oVar.f224499r = true;
                } else {
                    oVar.f224483b.setText(substring2);
                    oVar.f224493l = substring2;
                }
            }
        } else {
            int selectionStart = oVar.f224484c.getSelectionStart();
            if (!oVar.f224502u || selectionStart - 1 < 0) {
                substring = obj.substring(0, obj.length() - 1);
            } else {
                android.text.Editable text = oVar.f224484c.getText();
                text.delete(i17, selectionStart);
                substring = text.toString();
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(substring)) {
                oVar.f224494m = "";
                oVar.e("", -1);
            } else {
                java.lang.String replace = oVar.f224483b.getText().toString().replace("+", "");
                if (oVar.f224502u) {
                    oVar.f224494m = oVar.a(replace, substring);
                    oVar.e(oVar.f224494m, (selectionStart - 1) + (oVar.f224494m.length() - substring.length()));
                } else {
                    oVar.f224494m = oVar.a(replace, substring);
                    oVar.e(oVar.f224494m, -1);
                }
                oVar.b();
            }
            oVar.f224495n = "";
            oVar.f224486e.setText("");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ipcall/ui/DialPadController$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
