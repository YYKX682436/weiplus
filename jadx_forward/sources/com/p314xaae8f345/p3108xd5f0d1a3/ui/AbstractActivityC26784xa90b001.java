package com.p314xaae8f345.p3108xd5f0d1a3.ui;

/* renamed from: com.tencent.toybrick.ui.BaseToyUI */
/* loaded from: classes7.dex */
public abstract class AbstractActivityC26784xa90b001<T> extends com.p314xaae8f345.mm.ui.AbstractActivityC21348x43985120 {

    /* renamed from: z, reason: collision with root package name */
    public final java.util.HashMap f297230z = new java.util.HashMap();

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f297230z.clear();
    }
}
