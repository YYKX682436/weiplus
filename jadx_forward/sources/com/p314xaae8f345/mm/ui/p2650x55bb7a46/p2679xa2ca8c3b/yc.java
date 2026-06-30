package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class yc implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yb5.d f287605a;

    public yc(yb5.d dVar) {
        this.f287605a = dVar;
    }

    @Override // j45.g
    /* renamed from: onActivityResult */
    public void mo79431x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (i17 != 221 || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("result_msg");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            return;
        }
        db5.e1.F(this.f287605a.g(), stringExtra, "", false);
    }
}
