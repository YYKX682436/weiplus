package com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui;

/* loaded from: classes12.dex */
public class b2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13052x7242bfaf f176490d;

    public b2(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13052x7242bfaf activityC13052x7242bfaf) {
        this.f176490d = activityC13052x7242bfaf;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.ActivityC13052x7242bfaf activityC13052x7242bfaf = this.f176490d;
        if (!((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19749xff44b05) activityC13052x7242bfaf.f176380i).mo69311xc00617a4()) {
            return true;
        }
        int mo69307x9746038c = activityC13052x7242bfaf.f176380i.mo69307x9746038c() / 1000;
        android.widget.TextView textView = activityC13052x7242bfaf.f176383o;
        if (textView == null || (i17 = activityC13052x7242bfaf.B) <= 0) {
            return true;
        }
        int i18 = i17 - mo69307x9746038c;
        if (i18 < 0) {
            i18 = 0;
        }
        textView.setText(i18 + "\"");
        return true;
    }
}
