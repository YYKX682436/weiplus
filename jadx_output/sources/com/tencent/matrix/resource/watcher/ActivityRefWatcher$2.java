package com.tencent.matrix.resource.watcher;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public class ActivityRefWatcher$2 implements androidx.lifecycle.f {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.resource.watcher.f f52972d;

    public ActivityRefWatcher$2(com.tencent.matrix.resource.watcher.f fVar) {
        this.f52972d = fVar;
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onDestroy(androidx.lifecycle.y yVar) {
        int i17 = com.tencent.matrix.resource.watcher.f.f52979r;
        com.tencent.matrix.resource.watcher.f fVar = this.f52972d;
        fVar.c(yVar);
        fVar.f52985j.postDelayed(new com.tencent.matrix.resource.watcher.c(this), 2000L);
    }
}
