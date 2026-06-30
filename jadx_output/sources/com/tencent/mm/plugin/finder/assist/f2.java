package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102156d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f102157e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(java.lang.String str, yz5.a aVar) {
        super(0);
        this.f102156d = str;
        this.f102157e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mars.xlog.Log.i("FinderDebounceMgr", "finder debounced task execute with taskID:" + this.f102156d);
        this.f102157e.invoke();
        return jz5.f0.f302826a;
    }
}
