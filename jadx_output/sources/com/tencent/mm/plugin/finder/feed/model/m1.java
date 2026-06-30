package com.tencent.mm.plugin.finder.feed.model;

/* loaded from: classes2.dex */
public final class m1 extends com.tencent.mm.plugin.finder.feed.model.internal.IResponse {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f108172a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.List f108173b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f108174c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(java.lang.String title, int i17, int i18, java.lang.String str) {
        super(i17, i18, str);
        kotlin.jvm.internal.o.g(title, "title");
        this.f108172a = title;
        this.f108174c = new java.util.LinkedList();
    }
}
