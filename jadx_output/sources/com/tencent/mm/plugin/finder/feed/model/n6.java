package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class n6 implements java.util.Comparator {
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        return mz5.a.b(java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.storage.x80) obj2).field_createTime), java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.storage.x80) obj).field_createTime));
    }
}
