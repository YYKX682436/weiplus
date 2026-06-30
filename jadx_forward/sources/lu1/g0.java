package lu1;

/* loaded from: classes15.dex */
public abstract class g0 {
    public static java.lang.String a(int i17, java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardViewUtil", "toApply is null");
            return "";
        }
        if (i17 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardViewUtil", "unitSpace is 0");
            return str;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i18 = 0;
        while (i18 < str.length()) {
            sb6.append(str.charAt(i18));
            i18++;
            if (i18 % i17 == 0) {
                if (z17) {
                    sb6.append(" ");
                } else if (i18 != str.length()) {
                    sb6.append("-");
                }
            }
        }
        return sb6.toString();
    }

    public static void b(android.widget.ImageView imageView, java.lang.String str, int i17, int i18, boolean z17) {
        if (imageView == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            imageView.setImageResource(i18);
            return;
        }
        o11.f fVar = new o11.f();
        fVar.f423616g = lp0.b.D();
        fVar.f423615f = xt1.q.m(str);
        fVar.f423611b = true;
        fVar.f423629t = z17;
        fVar.f423610a = true;
        fVar.f423620k = i17;
        fVar.f423619j = i17;
        fVar.f423624o = i18;
        n11.a.b().h(str, imageView, fVar.a());
    }

    public static void c(android.content.Context context, android.widget.ImageView imageView, java.lang.String str, int i17, int i18, boolean z17, int i19) {
        if (imageView == null || android.text.TextUtils.isEmpty(str)) {
            return;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            d(context, imageView, i18, i19);
            return;
        }
        o11.f fVar = new o11.f();
        fVar.f423616g = lp0.b.D();
        fVar.f423615f = xt1.q.m(str);
        fVar.f423611b = true;
        fVar.f423629t = z17;
        fVar.f423610a = true;
        fVar.f423620k = i17;
        fVar.f423619j = i17;
        fVar.f423624o = i18;
        n11.a.b().i(str, imageView, fVar.a(), new lu1.d0(imageView, i19, context, i18));
    }

    public static void d(android.content.Context context, android.widget.ImageView imageView, int i17, int i18) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new lu1.e0(imageView, i17, i18));
    }

    public static void e(android.widget.TextView textView, int i17) {
        switch (i17) {
            case 0:
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.avs);
                return;
            case 1:
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.avn);
                return;
            case 2:
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.avq);
                return;
            case 3:
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.avp);
                return;
            case 4:
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.avt);
                return;
            case 5:
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.avu);
                return;
            case 6:
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.avo);
                return;
            case 7:
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.avr);
                return;
            default:
                return;
        }
    }
}
