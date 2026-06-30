package com.tencent.mm.plugin.fav.ui.detail;

/* loaded from: classes12.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f100705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.detail.p f100706e;

    public d(com.tencent.mm.plugin.fav.ui.detail.p pVar, android.content.Intent intent) {
        this.f100706e = pVar;
        this.f100705d = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.fav.ui.detail.p pVar = this.f100706e;
        j45.l.j(pVar.f100775e, "webview", ".ui.tools.WebViewUI", this.f100705d, null);
        pVar.f100775e.finish();
    }
}
