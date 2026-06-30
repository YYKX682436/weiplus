package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes9.dex */
public final class wa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f288771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288772e;

    public wa(com.p314xaae8f345.mm.p944x882e457a.f fVar, java.lang.String str) {
        this.f288771d = fVar;
        this.f288772e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String m75945x2fec8307;
        java.util.HashMap hashMap;
        com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a37 = com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288165d;
        com.p314xaae8f345.mm.ui.p2690x38b72420.bb bbVar = com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288162a;
        if (abstractActivityC22579xbed01a37 != null) {
            int i17 = 0;
            if (!(abstractActivityC22579xbed01a37.isFinishing())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SelectPocketMoneyHelper", "[dismissLoading] dismiss ");
                android.app.Dialog dialog = com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288166e;
                if (dialog != null) {
                    dialog.dismiss();
                }
                com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f288771d;
                if (fVar.f152148a != 0 || fVar.f152149b != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SelectPocketMoneyHelper", "Locate NetWorkError: errType: " + fVar.f152148a + ", errCode: " + fVar.f152149b + ", errmsg: " + fVar.f152150c);
                    com.p314xaae8f345.mm.ui.p2690x38b72420.bb.a(bbVar, fVar.f152149b, fVar.f152150c, (r45.m04) fVar.f152151d);
                    return;
                }
                r45.m04 m04Var = (r45.m04) fVar.f152151d;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("InviteCoManagerForAccountResponse retCode: ");
                sb6.append(m04Var != null ? java.lang.Integer.valueOf(m04Var.m75939xb282bd08(1)) : null);
                sb6.append(", retmsg: ");
                sb6.append(m04Var != null ? m04Var.m75945x2fec8307(2) : null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SelectPocketMoneyHelper", sb6.toString());
                int m75939xb282bd08 = m04Var != null ? m04Var.m75939xb282bd08(1) : -1;
                if (m75939xb282bd08 != 0) {
                    m75945x2fec8307 = m04Var != null ? m04Var.m75945x2fec8307(2) : null;
                    com.p314xaae8f345.mm.ui.p2690x38b72420.bb.a(bbVar, m75939xb282bd08, m75945x2fec8307 != null ? m75945x2fec8307 : "", m04Var);
                    return;
                }
                java.lang.String str = this.f288772e;
                if (str != null && str.length() > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SelectPocketMoneyHelper", "forwardDialogClick has text content: " + str);
                    java.lang.String str2 = com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288164c;
                    if (str == null) {
                        str = "";
                    }
                    if (str.length() == 0) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SelectPocketMoneyHelper", "[processTextTransfer] msgContent is empty");
                    }
                    int i18 = 4;
                    if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str2)) {
                        hashMap = com.p314xaae8f345.mm.ui.i1.a(str);
                        if (hashMap != null) {
                            i18 = 5;
                            i17 = 1;
                        }
                    } else {
                        hashMap = null;
                    }
                    if (w11.t1.a(str2)) {
                        w11.r1 b17 = w11.s1.b(str2, null, 2, null);
                        b17.g(str2);
                        b17.e(str);
                        b17.f523663e = c01.e2.C(str2);
                        b17.f523664f = i17;
                        b17.f523666h = hashMap;
                        w11.r1.d(b17, null, 1, null);
                    } else {
                        w11.r1 b18 = w11.s1.b(str2, null, 2, null);
                        b18.g(str2);
                        b18.e(str);
                        b18.f523663e = c01.e2.C(str2);
                        b18.f523664f = i17;
                        b18.f523666h = hashMap;
                        b18.f523667i = i18;
                        b18.a().a();
                    }
                }
                m75945x2fec8307 = m04Var != null ? m04Var.m75945x2fec8307(2) : null;
                java.lang.String str3 = m75945x2fec8307 != null ? m75945x2fec8307 : "";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SelectPocketMoneyHelper", "CGI request success");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("pocket_money_result_status", -102);
                intent.putExtra("Select_Conv_User", com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288164c);
                intent.putExtra("pocket_money_result_errcode", m75939xb282bd08);
                intent.putExtra("pocket_money_result_message", str3);
                if (m04Var != null) {
                    java.lang.String jSONObject = pm0.b0.g(m04Var).toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject, "toString(...)");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SelectPocketMoneyHelper", "handleCgiFailure response: ".concat(jSONObject));
                    intent.putExtra("pocket_money_result_response", jSONObject);
                }
                com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a372 = com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288165d;
                if (abstractActivityC22579xbed01a372 != null) {
                    abstractActivityC22579xbed01a372.setResult(-1, intent);
                }
                com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 abstractActivityC22579xbed01a373 = com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288165d;
                if (abstractActivityC22579xbed01a373 != null) {
                    abstractActivityC22579xbed01a373.finish();
                    return;
                }
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SelectPocketMoneyHelper", "Activity is finishing, ignore response");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SelectPocketMoneyHelper", "[dismissLoading] dismiss ");
        android.app.Dialog dialog2 = com.p314xaae8f345.mm.ui.p2690x38b72420.bb.f288166e;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
    }
}
