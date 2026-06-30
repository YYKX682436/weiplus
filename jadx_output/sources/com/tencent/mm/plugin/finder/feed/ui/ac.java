package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes.dex */
public final class ac extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f109671d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ac(java.lang.String str) {
        super(1);
        this.f109671d = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.ky5 it = (r45.ky5) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(it.getString(0), this.f109671d));
    }
}
