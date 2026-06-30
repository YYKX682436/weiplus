package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class eq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f109992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI f109993e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eq(java.lang.String str, com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI selectLocalFileRouterUI) {
        super(0);
        this.f109992d = str;
        this.f109993e = selectLocalFileRouterUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.autogen.events.MusicPostSelectEvent musicPostSelectEvent = new com.tencent.mm.autogen.events.MusicPostSelectEvent();
        am.kk kkVar = musicPostSelectEvent.f54513g;
        kkVar.f7160a = this.f109992d;
        kkVar.f7162c = false;
        com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI selectLocalFileRouterUI = this.f109993e;
        kkVar.f7164e = (int) (selectLocalFileRouterUI.f109633h / 1000);
        kkVar.f7165f = (int) selectLocalFileRouterUI.f109634i;
        musicPostSelectEvent.e();
        com.tencent.mm.ui.widget.dialog.u3 u3Var = selectLocalFileRouterUI.f109629d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        selectLocalFileRouterUI.f109629d = null;
        selectLocalFileRouterUI.finish();
        return jz5.f0.f302826a;
    }
}
