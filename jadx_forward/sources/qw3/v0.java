package qw3;

/* loaded from: classes9.dex */
public class v0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 f448748d;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 activityC17105xa1fb9be7) {
        this.f448748d = activityC17105xa1fb9be7;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        long j17;
        java.lang.String str = "0";
        if (editable.toString().startsWith(".")) {
            editable.insert(0, "0");
        }
        java.lang.String obj = editable.toString();
        int indexOf = obj.indexOf(".");
        int length = obj.length();
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7 activityC17105xa1fb9be7 = this.f448748d;
        if (indexOf >= 0 && length - indexOf > 2) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2.g(activityC17105xa1fb9be7.f238052m.m83169xe7297452(), obj, indexOf + 3, length);
        }
        java.lang.String obj2 = editable.toString();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(obj2) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(obj2, 0.0d) <= 0.0d) {
            activityC17105xa1fb9be7.f238053n.setVisibility(8);
        } else {
            activityC17105xa1fb9be7.f238053n.setVisibility(0);
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17105xa1fb9be7.R;
        activityC17105xa1fb9be7.getClass();
        double F = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(obj2, 0.0d);
        long round = java.lang.Math.round(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(obj2, 0.0d) * 100.0d);
        if (activityC17105xa1fb9be7.f238064y.f237990g >= 0 && round > 0) {
            double c17 = pw3.a.c(round + "", activityC17105xa1fb9be7.f238064y.f237990g + "");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
            sb6.append(c17);
            java.lang.String sb7 = sb6.toString();
            try {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.F(sb7.trim(), 0.0d) != 0.0d) {
                    str = sb7.trim();
                }
                j17 = new java.math.BigDecimal(str).divide(new java.math.BigDecimal("10000"), 0, 4).longValue();
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BankRemitUtil", e17, "", new java.lang.Object[0]);
                j17 = 0;
            }
            activityC17105xa1fb9be7.I = j17;
            com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.p2020x633fb29.C17098x7cd03d04 c17098x7cd03d04 = activityC17105xa1fb9be7.f238064y;
            int i18 = (int) c17098x7cd03d04.f237997q;
            activityC17105xa1fb9be7.M = i18;
            long j18 = i18;
            if (j17 < j18 && c17098x7cd03d04.f237990g > 0) {
                activityC17105xa1fb9be7.I = j18;
            }
            double a17 = pw3.a.a(activityC17105xa1fb9be7.I + "", "100", 2, 4);
            activityC17105xa1fb9be7.f238055p.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(a17));
            activityC17105xa1fb9be7.f238056q.setText(com.p314xaae8f345.mm.p2802xd031a825.ui.r1.m(F + a17));
        }
        activityC17105xa1fb9be7.c7();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
