package ey4;

/* loaded from: classes8.dex */
public class r extends com.p314xaae8f345.mm.ui.p2740x696c9db.v4 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19494x6eecdedb f339162h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19494x6eecdedb c19494x6eecdedb, int i17, com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var) {
        super(i17, t4Var);
        this.f339162h = c19494x6eecdedb;
    }

    @Override // com.p314xaae8f345.mm.ui.p2740x696c9db.v4, android.text.InputFilter
    public java.lang.CharSequence filter(java.lang.CharSequence charSequence, int i17, int i18, android.text.Spanned spanned, int i19, int i27) {
        if (charSequence == null) {
            return "";
        }
        java.lang.String obj = spanned.toString();
        com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_3;
        int e17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(obj, t4Var);
        int e18 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e((!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(charSequence) || i19 >= i27) ? spanned.toString() + charSequence.toString() : spanned.toString().substring(0, i19) + spanned.toString().substring(i27), t4Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.p2436x5fb57ca.C19494x6eecdedb c19494x6eecdedb = this.f339162h;
        int i28 = c19494x6eecdedb.f268843y;
        int i29 = i28 - c19494x6eecdedb.f268844z;
        if (i29 > i28 || i29 <= 0) {
            i29 = i28;
        }
        if (e18 < i28) {
            if (e18 <= i29) {
                c19494x6eecdedb.f268837s.setVisibility(8);
                return charSequence;
            }
            c19494x6eecdedb.f268837s.setVisibility(0);
            c19494x6eecdedb.f268837s.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1(c19494x6eecdedb.f268840v.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l66), java.lang.Integer.valueOf(i28 - e18)));
            return charSequence;
        }
        java.lang.String z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z1(c19494x6eecdedb.f268840v.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l67), java.lang.Integer.valueOf(c19494x6eecdedb.f268843y));
        c19494x6eecdedb.f268837s.setVisibility(0);
        c19494x6eecdedb.f268837s.setText(z17);
        int max = java.lang.Math.max(i28 - e17, 0);
        if (max != 0) {
            if (max <= 0 || e18 <= max) {
                return charSequence;
            }
            java.lang.CharSequence a17 = pg5.d.a(c19494x6eecdedb.getContext(), charSequence.toString());
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(a17)) {
                java.lang.String charSequence2 = a17.toString();
                int i37 = 0;
                int i38 = 0;
                for (int i39 = 0; i39 < charSequence2.length(); i39++) {
                    i37 += charSequence2.charAt(i39) <= 127 ? 1 : 2;
                    if ((i37 % 2 != 0 ? (i37 + 1) / 2 : i37 / 2) > max) {
                        break;
                    }
                    i38 = i39;
                }
                if (i38 < charSequence2.length()) {
                    i38++;
                }
                try {
                    if (a17 instanceof android.text.SpannableString) {
                        com.p314xaae8f345.mm.p2614xca6eae71.r0[] r0VarArr = (com.p314xaae8f345.mm.p2614xca6eae71.r0[]) ((android.text.SpannableString) a17).getSpans(0, a17.length(), com.p314xaae8f345.mm.p2614xca6eae71.r0.class);
                        int length = r0VarArr.length;
                        int i47 = 0;
                        while (true) {
                            if (i47 >= length) {
                                break;
                            }
                            com.p314xaae8f345.mm.p2614xca6eae71.r0 r0Var = r0VarArr[i47];
                            int i48 = r0Var.f274887h;
                            if (i38 < i48 && i38 >= r0Var.f274886g) {
                                i38 = i48;
                                break;
                            }
                            i47++;
                        }
                    }
                } catch (java.lang.Exception unused) {
                }
                return a17.subSequence(0, i38);
            }
        }
        return "";
    }
}
