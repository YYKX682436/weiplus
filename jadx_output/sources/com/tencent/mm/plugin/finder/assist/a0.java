package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class a0 implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.i0 f101994a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f101995b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f101996c;

    public a0(com.tencent.mm.plugin.finder.assist.i0 i0Var, android.content.Context context, android.content.Intent intent) {
        this.f101994a = i0Var;
        this.f101995b = context;
        this.f101996c = intent;
    }

    @Override // wd0.p1
    public void a() {
    }

    @Override // wd0.p1
    public void onSuccess() {
        this.f101994a.ul(this.f101995b, this.f101996c);
    }
}
