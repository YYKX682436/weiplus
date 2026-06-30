package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ma implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103982a;

    public ma(in5.s0 s0Var) {
        this.f103982a = s0Var;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        android.content.Context context = this.f103982a.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        return com.tencent.mm.plugin.finder.report.d2.f124994a.b(((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6(), null);
    }
}
