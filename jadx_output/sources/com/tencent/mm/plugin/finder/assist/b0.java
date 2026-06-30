package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class b0 implements wd0.p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.i0 f102017a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102018b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f102019c;

    public b0(com.tencent.mm.plugin.finder.assist.i0 i0Var, android.content.Context context, android.content.Intent intent) {
        this.f102017a = i0Var;
        this.f102018b = context;
        this.f102019c = intent;
    }

    @Override // wd0.p1
    public void a() {
    }

    @Override // wd0.p1
    public void onSuccess() {
        this.f102017a.vl(this.f102018b, this.f102019c);
    }
}
