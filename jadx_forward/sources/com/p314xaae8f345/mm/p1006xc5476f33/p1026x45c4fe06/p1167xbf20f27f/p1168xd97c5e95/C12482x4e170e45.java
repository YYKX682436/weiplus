package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1167xbf20f27f.p1168xd97c5e95;

/* renamed from: com.tencent.mm.plugin.appbrand.outerwidget.Service.AppBrandWidgetGridService */
/* loaded from: classes7.dex */
public class C12482x4e170e45 extends android.widget.RemoteViewsService {
    @Override // android.widget.RemoteViewsService, android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return super.onBind(intent);
    }

    @Override // android.widget.RemoteViewsService
    public android.widget.RemoteViewsService.RemoteViewsFactory onGetViewFactory(android.content.Intent intent) {
        return new ii1.e(getApplicationContext());
    }
}
