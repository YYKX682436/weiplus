package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes8.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.Button f283159a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.TextView f283160b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f283161c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 f283162d;

    public h0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 activityC21601xaeea84d6, android.widget.Button button, android.widget.TextView textView) {
        this.f283162d = activityC21601xaeea84d6;
        this.f283159a = button;
        this.f283160b = textView;
        if (textView != null) {
            if (((int) java.lang.Math.floor(((((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("MsgFileExpiredInterval", 432000) - c01.id.f(activityC21601xaeea84d6.f279650v.mo78012x3fdd41df() / 1000)) * 1.0d) / 86400.0d)) >= 1) {
                textView.setText("");
            } else {
                textView.setText("");
            }
        }
    }

    public void a(int i17) {
        android.widget.Button button = this.f283159a;
        if (button != null) {
            button.setVisibility(i17);
        }
        android.widget.TextView textView = this.f283160b;
        if (textView != null && !textView.getText().toString().isEmpty()) {
            textView.setVisibility(i17);
        }
        if (textView.getVisibility() != 8) {
            ((android.widget.LinearLayout.LayoutParams) button.getLayoutParams()).bottomMargin = 0;
        } else {
            ((android.widget.LinearLayout.LayoutParams) button.getLayoutParams()).bottomMargin = i65.a.h(textView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561190bu);
        }
    }

    public void b(boolean z17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21601xaeea84d6 activityC21601xaeea84d6 = this.f283162d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppAttachNewDownloadUI", "showErrorTip overtime %s", java.lang.Long.valueOf(activityC21601xaeea84d6.f279650v.m124847x74d37ac6()));
        android.widget.Button button = this.f283159a;
        if (button != null) {
            button.setVisibility(4);
        }
        android.widget.TextView textView = this.f283160b;
        if (textView != null) {
            textView.setVisibility(0);
            if (z17) {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cew);
                activityC21601xaeea84d6.y7(17, -1);
            } else {
                textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.cex);
                java.lang.String str = activityC21601xaeea84d6.C;
                if (str == null || str.getBytes(java.nio.charset.StandardCharsets.UTF_8).length <= 255) {
                    jx3.f.INSTANCE.d(31328, 3, 5000);
                } else {
                    textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f572769le2);
                }
            }
            textView.setTextColor(activityC21601xaeea84d6.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77883xa3c58d61));
            if (this.f283161c) {
                return;
            }
            this.f283161c = true;
            activityC21601xaeea84d6.y7(8, 6);
        }
    }
}
