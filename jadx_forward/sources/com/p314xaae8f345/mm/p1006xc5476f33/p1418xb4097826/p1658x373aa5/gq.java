package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes3.dex */
public final class gq extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2 {

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.sp f213718e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f213719f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f213720g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f213721h;

    /* renamed from: i, reason: collision with root package name */
    public final int f213722i;

    public gq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.sp callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f213718e = callback;
        this.f213719f = "LiveChargeInputCoinValueBottomPage";
        this.f213722i = 4;
    }

    public static final boolean i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.gq gqVar, java.lang.String str) {
        gqVar.getClass();
        if (str == null || str.length() == 0) {
            return false;
        }
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(str, 0) > 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2
    public android.view.View a(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.LayoutInflater from = android.view.LayoutInflater.from(context);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f293331d;
        android.view.View inflate = from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ap7, y1Var != null ? y1Var.C : null, false);
        android.widget.EditText editText = (android.widget.EditText) inflate.findViewById(com.p314xaae8f345.mm.R.id.f565317c14);
        if (editText != null) {
            editText.setInputType(2);
            editText.setKeyListener(android.text.method.DigitsKeyListener.getInstance("0123456789"));
            editText.setImeOptions(6);
            zl2.r4 r4Var = zl2.r4.f555483a;
            int i17 = this.f213722i;
            r4Var.Z2(editText, null, i17, i17, (r17 & 16) != 0, (r17 & 32) != 0 ? com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2 : null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.aq(this, editText, inflate));
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.b2z);
            textView.setEnabled(false);
            r4Var.Y2(textView, false, false);
            textView.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.bq(textView, this, editText));
        }
        inflate.findViewById(com.p314xaae8f345.mm.R.id.enx).setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.dq(inflate, this));
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5((android.app.Activity) context);
        f5Var.f291933e = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.eq(this);
        this.f213721h = f5Var;
        this.f213720g = (android.view.ViewGroup) inflate;
        return inflate;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2
    public void f() {
        android.view.Window b17;
        android.view.View decorView;
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f213721h;
        if (f5Var != null) {
            f5Var.d();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f293331d;
        if (y1Var == null || (b17 = y1Var.b()) == null || (decorView = b17.getDecorView()) == null) {
            return;
        }
        decorView.setPadding(0, 0, 0, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g2
    public void g() {
        android.widget.EditText editText;
        android.view.Window b17;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = this.f293331d;
        if (y1Var != null && (b17 = y1Var.b()) != null) {
            b17.setSoftInputMode(48);
        }
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = this.f213721h;
        if (f5Var != null) {
            f5Var.f();
        }
        android.view.ViewGroup viewGroup = this.f213720g;
        if (viewGroup == null || (editText = (android.widget.EditText) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f565317c14)) == null) {
            return;
        }
        editText.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.fq(editText, this), 300L);
    }
}
