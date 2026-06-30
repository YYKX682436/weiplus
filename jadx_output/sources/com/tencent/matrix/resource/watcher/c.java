package com.tencent.matrix.resource.watcher;

/* loaded from: classes12.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.resource.watcher.ActivityRefWatcher$2 f52975d;

    public c(com.tencent.matrix.resource.watcher.ActivityRefWatcher$2 activityRefWatcher$2) {
        this.f52975d = activityRefWatcher$2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f52975d.f52972d.d();
    }
}
