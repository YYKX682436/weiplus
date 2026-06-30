package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class u5 implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yb5.d f284268a;

    public u5(yb5.d dVar) {
        this.f284268a = dVar;
    }

    @Override // j45.g
    /* renamed from: onActivityResult */
    public void mo79431x9d4787cb(int i17, int i18, android.content.Intent intent) {
        if (i17 == 3001) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingItemHelper", "gotoEditUI() REQUEST_CODE_VIEW_GROUP_SOLITATIRE resultCode:%s", java.lang.Integer.valueOf(i18));
            if (-1 != i18 || intent == null) {
                return;
            }
            ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.sk) ((sb5.f2) this.f284268a.f542241c.a(sb5.f2.class))).m0(intent.getStringExtra("key_group_solitatire_content"));
        }
    }
}
