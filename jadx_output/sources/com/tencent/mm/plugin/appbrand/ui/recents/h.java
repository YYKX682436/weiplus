package com.tencent.mm.plugin.appbrand.ui.recents;

/* loaded from: classes7.dex */
public class h implements com.tencent.mm.plugin.appbrand.ui.recents.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.fl0 f90084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appusage.t6 f90085b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.recents.m f90086c;

    public h(com.tencent.mm.plugin.appbrand.ui.recents.m mVar, r45.fl0 fl0Var, com.tencent.mm.plugin.appbrand.appusage.t6 t6Var) {
        this.f90086c = mVar;
        this.f90084a = fl0Var;
        this.f90085b = t6Var;
    }

    public void a(android.graphics.Bitmap bitmap, byte[] bArr) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[LoadShowcaseImageTask#onLoadDone]  bitmap == null ");
        sb6.append(bitmap == null);
        sb6.append(" rightImageBytes length=");
        sb6.append(bArr != null ? bArr.length : 0);
        com.tencent.mars.xlog.Log.i("AppBrandLauncherListHeaderFolderEntrance", sb6.toString());
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.ui.recents.g(this, bitmap, bArr));
    }
}
