package com.tencent.mm.plugin.base.stub;

/* loaded from: classes.dex */
public class c implements java.lang.Iterable {
    public c(com.tencent.mm.plugin.base.stub.a aVar) {
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return new com.tencent.mm.plugin.base.stub.b(this, null);
    }
}
