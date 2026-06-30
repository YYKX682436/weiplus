package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes5.dex */
public class n3 implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72745a;

    public n3(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI) {
        this.f72745a = launchAAUI;
    }

    @Override // k70.f0
    public void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = str;
        objArr[1] = java.lang.Boolean.valueOf(bitmap == null);
        objArr[2] = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "onLoadImageEnd() url:%s bitmap==null:%s path:%s", objArr);
        this.f72745a.f72522x1 = str2;
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.aa.ui.m3(this, bitmap));
    }
}
