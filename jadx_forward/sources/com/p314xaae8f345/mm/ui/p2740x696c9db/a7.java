package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes9.dex */
public class a7 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22507xb3b58831 f291806d;

    public a7(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22507xb3b58831 activityC22507xb3b58831) {
        this.f291806d = activityC22507xb3b58831;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        java.lang.String obj = editable.toString();
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22507xb3b58831 activityC22507xb3b58831 = this.f291806d;
        if (!activityC22507xb3b58831.f291615i) {
            if (obj.trim().length() > 0) {
                activityC22507xb3b58831.m78501x43e00957(true);
            } else {
                activityC22507xb3b58831.m78501x43e00957(false);
            }
        }
        if (activityC22507xb3b58831.f291612f > 0) {
            activityC22507xb3b58831.f291614h = 0;
            for (int i17 = 0; i17 < obj.length(); i17++) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.z0(obj.charAt(i17))) {
                    activityC22507xb3b58831.f291614h += 2;
                } else {
                    activityC22507xb3b58831.f291614h++;
                }
            }
            int i18 = activityC22507xb3b58831.f291614h;
            if (i18 >= activityC22507xb3b58831.f291613g && i18 <= activityC22507xb3b58831.f291612f) {
                activityC22507xb3b58831.m78501x43e00957(true);
                activityC22507xb3b58831.f291611e.setVisibility(0);
                activityC22507xb3b58831.f291611e.setTextColor(activityC22507xb3b58831.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a8m));
                activityC22507xb3b58831.f291611e.setText(activityC22507xb3b58831.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jue, java.lang.Integer.valueOf((activityC22507xb3b58831.f291612f - activityC22507xb3b58831.f291614h) >> 1)));
                return;
            }
            if (i18 <= activityC22507xb3b58831.f291612f) {
                activityC22507xb3b58831.m78501x43e00957(activityC22507xb3b58831.f291615i || i18 > 0);
                activityC22507xb3b58831.f291611e.setVisibility(8);
            } else {
                activityC22507xb3b58831.m78501x43e00957(false);
                activityC22507xb3b58831.f291611e.setVisibility(0);
                activityC22507xb3b58831.f291611e.setTextColor(activityC22507xb3b58831.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a8n));
                activityC22507xb3b58831.f291611e.setText(activityC22507xb3b58831.getString(com.p314xaae8f345.mm.R.C30867xcad56011.juf, java.lang.Integer.valueOf(((activityC22507xb3b58831.f291614h - activityC22507xb3b58831.f291612f) >> 1) + 1)));
            }
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
