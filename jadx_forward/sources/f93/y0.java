package f93;

/* loaded from: classes11.dex */
public final class y0 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16167x7777ff84 f342049d;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16167x7777ff84 activityC16167x7777ff84) {
        this.f342049d = activityC16167x7777ff84;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        android.text.Editable text;
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16167x7777ff84 activityC16167x7777ff84 = this.f342049d;
        if (activityC16167x7777ff84.f224751m) {
            return;
        }
        if (editable != null) {
            java.lang.String obj = editable.toString();
            int f17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(obj);
            int i17 = activityC16167x7777ff84.f224752n;
            if (f17 > i17) {
                int c17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.c(i17, obj);
                int i18 = activityC16167x7777ff84.f224752n;
                if ((1 <= c17 && c17 < i18) && c17 < obj.length()) {
                    activityC16167x7777ff84.f224751m = true;
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = activityC16167x7777ff84.f224746e;
                    if (c21486x59d05a04 != null) {
                        java.lang.String substring = obj.substring(0, c17 + 1);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                        c21486x59d05a04.setText(substring);
                    }
                    com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a042 = activityC16167x7777ff84.f224746e;
                    if (c21486x59d05a042 != null) {
                        if (c21486x59d05a042 != null && (text = c21486x59d05a042.getText()) != null) {
                            c17 = text.length();
                        }
                        c21486x59d05a042.setSelection(c17);
                    }
                    activityC16167x7777ff84.f224751m = false;
                }
                android.widget.TextView textView = activityC16167x7777ff84.f224747f;
                if (textView != null) {
                    textView.setVisibility(0);
                }
                android.widget.TextView textView2 = activityC16167x7777ff84.f224747f;
                if (textView2 != null) {
                    textView2.setText(activityC16167x7777ff84.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g9t, java.lang.Integer.valueOf(i18 / 2)));
                }
                com.p314xaae8f345.mm.ui.jk.f290544a.a();
            } else {
                android.widget.TextView textView3 = activityC16167x7777ff84.f224747f;
                if (textView3 != null) {
                    textView3.setVisibility(4);
                }
            }
        }
        activityC16167x7777ff84.W6();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
