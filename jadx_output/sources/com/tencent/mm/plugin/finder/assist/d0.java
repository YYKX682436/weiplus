package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class d0 implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.i0 f102070a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102071b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f102072c;

    public d0(com.tencent.mm.plugin.finder.assist.i0 i0Var, android.content.Context context, android.content.Intent intent) {
        this.f102070a = i0Var;
        this.f102071b = context;
        this.f102072c = intent;
    }

    @Override // wd0.p1
    public void a() {
        ((ia0.o) ((ia0.n) i95.n0.c(ia0.n.class))).Bi(this.f102071b, false);
    }

    @Override // wd0.p1
    public void onSuccess() {
        this.f102070a.xl(this.f102071b, this.f102072c);
    }
}
