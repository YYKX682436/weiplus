package com.tencent.mm.plugin.finder.activity.uic;

/* loaded from: classes2.dex */
public final class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.activity.uic.u1 f101950d;

    public t1(com.tencent.mm.plugin.finder.activity.uic.u1 u1Var) {
        this.f101950d = u1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        com.tencent.mm.plugin.finder.activity.uic.u1 u1Var = this.f101950d;
        com.tencent.mm.plugin.finder.feed.h2 h2Var = u1Var.f101955r;
        if (h2Var == null) {
            kotlin.jvm.internal.o.o("viewCallback");
            throw null;
        }
        r45.e21 e21Var = u1Var.f101746i;
        if (e21Var == null || (str = e21Var.getString(5)) == null) {
            str = "";
        }
        h2Var.o(str);
    }
}
