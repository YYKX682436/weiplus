package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class j7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102290d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.e3 f102291e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j7(android.content.Context context, com.tencent.mm.plugin.finder.view.e3 e3Var) {
        super(0);
        this.f102290d = context;
        this.f102291e = e3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (com.tencent.mm.sdk.platformtools.t8.U0(this.f102290d)) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_HAS_SHOW_SHARE_EDUCATION_BOTTOMSHEET_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
            this.f102291e.i();
        }
        return jz5.f0.f302826a;
    }
}
