package com.tencent.mm.modelsimple;

@j95.b
/* loaded from: classes8.dex */
public class c extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.matrix.lifecycle.g f71292d = new com.tencent.mm.modelsimple.a(this);

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(this.f71292d);
        }
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        super.onCreate(context);
    }
}
