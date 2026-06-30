package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes9.dex */
public final class bb {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2690x38b72420.bb f288162a = new com.p314xaae8f345.mm.ui.p2690x38b72420.bb();

    /* renamed from: b, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.C21431x397c46b6 f288163b = null;

    /* renamed from: c, reason: collision with root package name */
    public static java.lang.String f288164c = "";

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 f288165d;

    /* renamed from: e, reason: collision with root package name */
    public static android.app.Dialog f288166e;

    public static final void a(com.p314xaae8f345.mm.ui.p2690x38b72420.bb bbVar, int i17, java.lang.String str, r45.m04 m04Var) {
        bbVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SelectPocketMoneyHelper", "CGI request failed: " + str);
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("pocket_money_result_status", -101);
        if (str == null) {
            str = com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ProcessResult.f61557x7b29883d;
        }
        intent.putExtra("pocket_money_result_message", str);
        intent.putExtra("pocket_money_result_errcode", i17);
        intent.putExtra("Select_Conv_User", f288164c);
        if (m04Var != null) {
            java.lang.String jSONObject = pm0.b0.g(m04Var).toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SelectPocketMoneyHelper", "handleCgiFailure response: ".concat(jSONObject));
            intent.putExtra("pocket_money_result_response", jSONObject);
        }
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = f288165d;
        if (abstractActivityC22579xbed01a37 != null) {
            abstractActivityC22579xbed01a37.setResult(-1, intent);
        }
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a372 = f288165d;
        if (abstractActivityC22579xbed01a372 != null) {
            abstractActivityC22579xbed01a372.finish();
        }
    }
}
