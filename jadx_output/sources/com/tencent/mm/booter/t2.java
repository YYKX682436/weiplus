package com.tencent.mm.booter;

/* loaded from: classes12.dex */
public final class t2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f63572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f63573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f63574f;

    public t2(android.content.Context context, android.content.Intent intent, java.lang.String str) {
        this.f63572d = context;
        this.f63573e = intent;
        this.f63574f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.booter.u2.f63578a.c(this.f63572d, this.f63573e, this.f63574f);
    }
}
