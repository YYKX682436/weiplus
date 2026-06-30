package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f85869d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85870e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(android.content.Context context, java.lang.String str) {
        super(0);
        this.f85869d = context;
        this.f85870e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.Toast.makeText(this.f85869d, this.f85870e, 0).show();
        return jz5.f0.f302826a;
    }
}
