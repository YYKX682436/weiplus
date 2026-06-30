package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class e4 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavPostVoiceUI f100829d;

    public e4(com.tencent.mm.plugin.fav.ui.FavPostVoiceUI favPostVoiceUI) {
        this.f100829d = favPostVoiceUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        int i17;
        com.tencent.mm.plugin.fav.ui.FavPostVoiceUI favPostVoiceUI = this.f100829d;
        tl.y0 y0Var = (tl.y0) favPostVoiceUI.f100388w;
        int i18 = 0;
        if (y0Var.f420192e == 1) {
            int a17 = y0Var.f420189b.a();
            if (a17 > tl.y0.f420187f) {
                tl.y0.f420187f = a17;
            }
            i17 = (a17 * 100) / tl.y0.f420187f;
        } else {
            i17 = 0;
        }
        while (true) {
            int[] iArr = com.tencent.mm.plugin.fav.ui.FavPostVoiceUI.D;
            if (i18 >= 7) {
                break;
            }
            int[] iArr2 = com.tencent.mm.plugin.fav.ui.FavPostVoiceUI.C;
            if (i17 >= iArr2[i18] && i17 < iArr2[i18 + 1]) {
                favPostVoiceUI.f100382q.setBackgroundResource(iArr[i18]);
                break;
            }
            i18++;
        }
        return true;
    }
}
