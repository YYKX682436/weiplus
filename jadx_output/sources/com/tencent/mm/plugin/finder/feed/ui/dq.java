package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes10.dex */
public final class dq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f109957d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f109958e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI f109959f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq(int i17, int i18, com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI selectLocalFileRouterUI) {
        super(0);
        this.f109957d = i17;
        this.f109958e = i18;
        this.f109959f = selectLocalFileRouterUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = this.f109957d;
        if (i17 == 0 || i17 == -21005) {
            i17 = this.f109958e;
        }
        com.tencent.mm.plugin.finder.feed.ui.SelectLocalFileRouterUI selectLocalFileRouterUI = this.f109959f;
        com.tencent.mm.ui.widget.dialog.u3 u3Var = selectLocalFileRouterUI.f109629d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        selectLocalFileRouterUI.f109629d = null;
        selectLocalFileRouterUI.Y6(i17);
        return jz5.f0.f302826a;
    }
}
