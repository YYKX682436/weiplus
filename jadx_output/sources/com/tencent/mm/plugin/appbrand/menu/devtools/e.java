package com.tencent.mm.plugin.appbrand.menu.devtools;

/* loaded from: classes7.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f85890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f85891e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.n7 f85892f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.appbrand.page.n7 n7Var) {
        super(0);
        this.f85890d = context;
        this.f85891e = str;
        this.f85892f = n7Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.Toast.makeText(this.f85890d, this.f85891e, 0).show();
        this.f85892f.getRuntime().l0();
        return jz5.f0.f302826a;
    }
}
