package com.tencent.mm.normsgext;

/* loaded from: classes13.dex */
public final class QValue<TValue> {
    private TValue value;

    public java.lang.Object a() {
        return this.value;
    }

    public java.lang.Object b(java.lang.Object obj) {
        TValue tvalue = this.value;
        return tvalue != null ? tvalue : obj;
    }
}
