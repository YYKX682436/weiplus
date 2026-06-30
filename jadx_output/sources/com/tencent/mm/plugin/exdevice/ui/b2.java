package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes15.dex */
public class b2 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f99407d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.c2 f99408e;

    public b2(com.tencent.mm.plugin.exdevice.ui.c2 c2Var, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f99408e = c2Var;
        this.f99407d = u3Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        this.f99408e.f99416d.runOnUiThread(new com.tencent.mm.plugin.exdevice.ui.a2(this));
        return true;
    }
}
