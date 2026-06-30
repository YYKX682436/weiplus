package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class e0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.i0 f102103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f102105f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f102106g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f102107h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f102108i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.finder.assist.i0 i0Var, android.content.Context context, android.content.Intent intent, int i17, int i18, java.lang.String str) {
        super(1);
        this.f102103d = i0Var;
        this.f102104e = context;
        this.f102105f = intent;
        this.f102106g = i17;
        this.f102107h = i18;
        this.f102108i = str;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar != null) {
            eo2.f.f255565a.g(this.f102108i, fVar);
        }
        if (fVar != null && fVar.f70615a == 0 && fVar.f70616b == 0) {
            com.tencent.mm.plugin.finder.assist.i0 i0Var = this.f102103d;
            android.content.Context context = this.f102104e;
            android.content.Intent intent = this.f102105f;
            int i17 = this.f102106g;
            int i18 = this.f102107h;
            java.lang.String str = this.f102108i;
            r45.xr0 xr0Var = (r45.xr0) fVar.f70618d;
            java.lang.Integer valueOf = xr0Var != null ? java.lang.Integer.valueOf(xr0Var.f390351d) : null;
            r45.xr0 xr0Var2 = (r45.xr0) fVar.f70618d;
            i0Var.Mk(context, intent, i17, i18, str, valueOf, xr0Var2 != null ? java.lang.Integer.valueOf(xr0Var2.f390352e) : null);
        } else {
            this.f102103d.Mk(this.f102104e, this.f102105f, this.f102106g, this.f102107h, this.f102108i, null, null);
        }
        return jz5.f0.f302826a;
    }
}
