package com.tencent.mm.plugin.appbrand.floatball;

/* loaded from: classes7.dex */
public class a0 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.z f78064d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.floatball.u f78065e;

    public a0(com.tencent.mm.plugin.appbrand.floatball.u uVar, com.tencent.mm.plugin.appbrand.page.z zVar) {
        this.f78065e = uVar;
        this.f78064d = zVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f78065e.c(this.f78064d);
    }
}
