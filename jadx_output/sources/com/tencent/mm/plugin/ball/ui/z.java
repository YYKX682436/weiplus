package com.tencent.mm.plugin.ball.ui;

/* loaded from: classes14.dex */
public class z implements dp1.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mp1.b f93374a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f93375b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dp1.x f93376c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Point f93377d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f93378e;

    public z(mp1.b bVar, android.graphics.Point point, dp1.x xVar, android.graphics.Point point2, float f17) {
        this.f93374a = bVar;
        this.f93375b = point;
        this.f93376c = xVar;
        this.f93377d = point2;
        this.f93378e = f17;
    }

    public void a(boolean z17) {
        if (z17) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ball.ui.y(this));
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallSwipeTransformationHelper", "doTransform, convertToTranslucent not complete");
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.ball.ui.x(this));
        }
    }
}
