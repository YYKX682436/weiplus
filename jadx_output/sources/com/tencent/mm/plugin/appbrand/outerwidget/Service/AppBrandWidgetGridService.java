package com.tencent.mm.plugin.appbrand.outerwidget.Service;

/* loaded from: classes7.dex */
public class AppBrandWidgetGridService extends android.widget.RemoteViewsService {
    @Override // android.widget.RemoteViewsService, android.app.Service
    public android.os.IBinder onBind(android.content.Intent intent) {
        return super.onBind(intent);
    }

    @Override // android.widget.RemoteViewsService
    public android.widget.RemoteViewsService.RemoteViewsFactory onGetViewFactory(android.content.Intent intent) {
        return new ii1.e(getApplicationContext());
    }
}
