package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class u4 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266964b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266965c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f266966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266967e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266968f;

    public u4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, nw4.y2 y2Var) {
        this.f266968f = c1Var;
        this.f266963a = str;
        this.f266964b = str2;
        this.f266965c = str3;
        this.f266966d = i17;
        this.f266967e = y2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public void a(boolean z17, java.lang.String str) {
        nw4.y2 y2Var = this.f266967e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266968f;
        if (!z17) {
            c1Var.i5(y2Var, "doResendRemittanceMsg:fail", null);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra(ya.b.f77506xba41a63c, this.f266963a);
        intent.putExtra("transfer_id", this.f266964b);
        intent.putExtra("receiver_name", this.f266965c);
        intent.putExtra("resend_msg_from_flag", 4);
        intent.putExtra("is_open_im", this.f266966d);
        j45.l.j(c1Var.f266508d, "remittance", ".ui.RemittanceResendMsgUI", intent, null);
        c1Var.i5(y2Var, "doResendRemittanceMsg:ok", null);
    }
}
