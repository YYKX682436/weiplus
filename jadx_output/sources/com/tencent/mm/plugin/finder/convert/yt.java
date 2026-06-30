package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class yt extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f105042d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt(in5.s0 s0Var) {
        super(0);
        this.f105042d = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String username;
        android.content.Context context = this.f105042d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.profile.uic.p2 p2Var = (com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.p2.class);
        return (p2Var == null || (username = p2Var.getUsername()) == null) ? "" : username;
    }
}
