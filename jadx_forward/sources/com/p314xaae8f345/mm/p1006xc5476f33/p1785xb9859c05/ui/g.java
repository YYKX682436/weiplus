package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes8.dex */
public class g implements com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o f224363a;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o oVar) {
        this.f224363a = oVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.b
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o oVar = this.f224363a;
        oVar.f224494m = oVar.f224484c.getText().toString();
        if (oVar.f224499r) {
            oVar.f224493l += ((java.lang.Object) str);
            oVar.f224483b.setText(oVar.f224493l);
            if (t83.c.l(oVar.f224493l.replace("+", "")) || oVar.f224493l.replace("+", "").length() >= 4) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(12061, 0, 0, 0, 0, 1, 0);
                oVar.f224499r = false;
                oVar.f224492k = t83.c.f(oVar.f224493l.replace("+", ""));
                oVar.f224494m = oVar.a(oVar.f224493l.replace("+", ""), oVar.f224494m);
                oVar.e(oVar.f224494m, -1);
                return;
            }
            return;
        }
        java.lang.String replace = oVar.f224483b.getText().toString().replace("+", "");
        if (oVar.f224502u) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer(oVar.f224494m);
            stringBuffer.insert(oVar.f224484c.getSelectionStart(), str);
            oVar.f224494m = stringBuffer.toString();
        } else {
            oVar.f224494m += ((java.lang.Object) str);
        }
        if (oVar.f224494m.equals("00")) {
            oVar.f224483b.setText("+");
            oVar.f224499r = true;
            oVar.f224493l = "+";
            oVar.f224494m = "";
        }
        if (t83.c.l(oVar.f224493l.replace("+", "") + oVar.f224494m)) {
            oVar.f224483b.setText("+" + oVar.f224493l.replace("+", "") + oVar.f224494m);
            oVar.f224492k = t83.c.f(oVar.f224493l.replace("+", ""));
            oVar.f224499r = false;
            oVar.f224493l = oVar.f224493l.replace("+", "") + oVar.f224494m;
            oVar.f224494m = "";
        }
        java.lang.String str2 = oVar.f224494m;
        oVar.f224494m = oVar.a(replace, str2);
        if (!oVar.f224502u) {
            oVar.e(oVar.f224494m, -1);
        } else if (str2.length() < oVar.f224494m.length()) {
            oVar.e(oVar.f224494m, oVar.f224484c.getSelectionEnd() + 2);
        } else if (str2.length() == oVar.f224494m.length()) {
            oVar.e(oVar.f224494m, oVar.f224484c.getSelectionEnd() + 1);
        } else if (str2.length() > oVar.f224494m.length()) {
            oVar.e(oVar.f224494m, (oVar.f224484c.getSelectionEnd() + 1) - (str2.length() - oVar.f224494m.length()));
        }
        oVar.f224498q = java.lang.System.currentTimeMillis();
        if (oVar.f224494m.length() > 3) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(oVar.f224493l + oVar.f224494m)) {
                return;
            }
            oVar.b();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.b
    public void b(java.lang.String str) {
        if (str.equals("0")) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.o oVar = this.f224363a;
            oVar.f224483b.setText("+");
            oVar.f224499r = true;
            oVar.f224493l = "+";
        }
    }
}
