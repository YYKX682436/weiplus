package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f103629e;

    public i(in5.s0 s0Var, java.lang.String str) {
        this.f103628d = s0Var;
        this.f103629e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.Context context = this.f103628d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.f4.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.plugin.finder.profile.uic.f4.a7((com.tencent.mm.plugin.finder.profile.uic.f4) a17, "draft", 0, this.f103629e, 0, null, 24, null);
    }
}
