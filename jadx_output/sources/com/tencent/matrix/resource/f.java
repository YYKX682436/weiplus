package com.tencent.matrix.resource;

/* loaded from: classes13.dex */
public final class f implements com.tencent.matrix.resource.g {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Intent f52945a;

    /* renamed from: b, reason: collision with root package name */
    public final int f52946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.resource.MatrixJobIntentService f52947c;

    public f(com.tencent.matrix.resource.MatrixJobIntentService matrixJobIntentService, android.content.Intent intent, int i17) {
        this.f52947c = matrixJobIntentService;
        this.f52945a = intent;
        this.f52946b = i17;
    }

    @Override // com.tencent.matrix.resource.g
    public void complete() {
        this.f52947c.stopSelf(this.f52946b);
    }

    @Override // com.tencent.matrix.resource.g
    public android.content.Intent getIntent() {
        return this.f52945a;
    }
}
