package com.p314xaae8f345.map.p511x696c9db;

/* renamed from: com.tencent.map.tools.Condition */
/* loaded from: classes13.dex */
public abstract class AbstractC4310x441b8cfb<T> implements com.p314xaae8f345.map.p511x696c9db.InterfaceC4313x73735db5<java.lang.Boolean, T> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.map.p511x696c9db.InterfaceC4313x73735db5
    /* renamed from: callback */
    public /* bridge */ /* synthetic */ java.lang.Boolean mo35807xf5bc2045(java.lang.Object obj) {
        return mo35807xf5bc2045((com.p314xaae8f345.map.p511x696c9db.AbstractC4310x441b8cfb<T>) obj);
    }

    /* renamed from: condition */
    public abstract boolean mo35808xcca96d1b(T t17);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.p314xaae8f345.map.p511x696c9db.InterfaceC4313x73735db5
    /* renamed from: callback */
    public final java.lang.Boolean mo35807xf5bc2045(T t17) {
        return java.lang.Boolean.valueOf(mo35808xcca96d1b(t17));
    }
}
