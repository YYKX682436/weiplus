package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class b2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f66615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66617f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(yz5.l lVar, java.lang.String str, android.content.Context context) {
        super(0);
        this.f66615d = lVar;
        this.f66616e = str;
        this.f66617f = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f66615d.invoke(java.lang.Boolean.FALSE);
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eib);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        java.lang.String str = this.f66616e;
        if (!(str == null || str.length() == 0)) {
            string = str;
        }
        db5.t7.f(this.f66617f, string, com.tencent.mm.feature.finder.live.a2.f66597a);
        return jz5.f0.f302826a;
    }
}
