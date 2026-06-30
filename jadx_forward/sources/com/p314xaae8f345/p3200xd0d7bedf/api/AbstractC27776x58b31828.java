package com.p314xaae8f345.p3200xd0d7bedf.api;

/* renamed from: com.tencent.wework.api.AbsWwAPIImpl */
/* loaded from: classes13.dex */
abstract class AbstractC27776x58b31828 implements com.p314xaae8f345.p3200xd0d7bedf.api.InterfaceC27777x81844c71 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f301662a;

    public AbstractC27776x58b31828(android.content.Context context) {
        this.f301662a = context;
    }

    public boolean f(android.content.Intent intent) {
        return this.f301662a.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
    }
}
