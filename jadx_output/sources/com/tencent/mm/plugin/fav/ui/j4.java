package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class j4 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavPostVoiceUI f101198a;

    public j4(com.tencent.mm.plugin.fav.ui.FavPostVoiceUI favPostVoiceUI) {
        this.f101198a = favPostVoiceUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.plugin.fav.ui.FavPostVoiceUI favPostVoiceUI = this.f101198a;
        favPostVoiceUI.R6();
        favPostVoiceUI.f100373e.setBackgroundResource(com.tencent.mm.R.drawable.awn);
        favPostVoiceUI.f100373e.setEnabled(true);
    }
}
