package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes8.dex */
public final class c0 implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.i0 f102043a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102044b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f102045c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f102046d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f102047e;

    public c0(com.tencent.mm.plugin.finder.assist.i0 i0Var, android.content.Context context, android.content.Intent intent, boolean z17, boolean z18) {
        this.f102043a = i0Var;
        this.f102044b = context;
        this.f102045c = intent;
        this.f102046d = z17;
        this.f102047e = z18;
    }

    @Override // wd0.p1
    public void a() {
        ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Bi(this.f102044b, false);
    }

    @Override // wd0.p1
    public void onSuccess() {
        this.f102043a.wl(this.f102044b, this.f102045c, this.f102046d, this.f102047e);
    }
}
