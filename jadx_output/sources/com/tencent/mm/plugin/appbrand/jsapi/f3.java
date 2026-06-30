package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes9.dex */
public class f3 implements com.tencent.mm.ui.widget.snackbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.g3 f80872a;

    public f3(com.tencent.mm.plugin.appbrand.jsapi.g3 g3Var) {
        this.f80872a = g3Var;
    }

    @Override // com.tencent.mm.ui.widget.snackbar.g
    public void a() {
        com.tencent.mm.ui.MMActivity activityContext;
        com.tencent.mm.autogen.events.FavoriteOperationEvent favoriteOperationEvent = new com.tencent.mm.autogen.events.FavoriteOperationEvent();
        am.z9 z9Var = favoriteOperationEvent.f54243g;
        z9Var.f8528a = 35;
        activityContext = this.f80872a.getActivityContext();
        z9Var.f8535h = activityContext;
        favoriteOperationEvent.e();
    }
}
