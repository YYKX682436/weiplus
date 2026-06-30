package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class sg extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104553d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sg(in5.s0 s0Var) {
        super(2);
        this.f104553d = s0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        if (!((java.lang.Boolean) obj).booleanValue()) {
            android.content.Context context = this.f104553d.f293121e;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.viewmodel.component.up) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.up.class)).O6("VideoConvert");
        }
        return jz5.f0.f302826a;
    }
}
