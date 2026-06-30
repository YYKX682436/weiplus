package com.tencent.mm.plugin.downloader.model;

/* loaded from: classes8.dex */
public class j implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f97055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f97056e;

    public j(java.lang.ref.WeakReference weakReference, java.lang.String str) {
        this.f97055d = weakReference;
        this.f97056e = str;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.downloader.model.i(this, (com.tencent.mm.plugin.downloader.model.DownloadChecker$DownloadInterceptBean) obj));
    }
}
