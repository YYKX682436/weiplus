package com.tencent.map.tools;

/* loaded from: classes13.dex */
public abstract class Condition<T> implements com.tencent.map.tools.ReturnCallback<java.lang.Boolean, T> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.map.tools.ReturnCallback
    public /* bridge */ /* synthetic */ java.lang.Boolean callback(java.lang.Object obj) {
        return callback((com.tencent.map.tools.Condition<T>) obj);
    }

    public abstract boolean condition(T t17);

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.tencent.map.tools.ReturnCallback
    public final java.lang.Boolean callback(T t17) {
        return java.lang.Boolean.valueOf(condition(t17));
    }
}
