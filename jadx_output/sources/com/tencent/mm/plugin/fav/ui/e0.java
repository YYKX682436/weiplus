package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class e0 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.FavBaseUI f100823a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.fav.ui.FavBaseUI favBaseUI, android.os.Looper looper) {
        super(looper);
        this.f100823a = favBaseUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what == 52428) {
            com.tencent.mm.plugin.fav.ui.FavBaseUI.U6(this.f100823a);
        }
    }
}
