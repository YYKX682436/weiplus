package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public final class b3 implements n13.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.c3 f100510a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o72.r2 f100511b;

    public b3(com.tencent.mm.plugin.fav.ui.c3 c3Var, o72.r2 r2Var) {
        this.f100510a = c3Var;
        this.f100511b = r2Var;
    }

    @Override // n13.x
    public final void a(boolean z17, java.lang.String str, android.os.Bundle extInfo) {
        kotlin.jvm.internal.o.g(extInfo, "extInfo");
        if (z17) {
            com.tencent.mm.plugin.fav.ui.c3 c3Var = this.f100510a;
            com.tencent.mm.ui.MMActivity mMActivity = c3Var.f100538e;
            com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(mMActivity, "", i65.a.r(mMActivity, com.tencent.mm.R.string.cax), true, false, null);
            com.tencent.mm.plugin.fav.ui.x5.i(c3Var.f100538e, c3Var.f100540g, str, extInfo.getBoolean("is_group_to_do"), this.f100511b, new com.tencent.mm.plugin.fav.ui.a3(Q, c3Var));
        }
    }
}
