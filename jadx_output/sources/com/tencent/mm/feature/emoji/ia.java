package com.tencent.mm.feature.emoji;

/* loaded from: classes6.dex */
public class ia implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f66337d = 0;

    public ia(com.tencent.mm.feature.emoji.ja jaVar, com.tencent.mm.feature.emoji.ha haVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f66337d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f66337d;
        this.f66337d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.emoji.db.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
