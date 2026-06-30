package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes8.dex */
public class j2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289303d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289304e;

    public j2(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.o2 o2Var, java.lang.String str, java.lang.String str2) {
        this.f289303d = str;
        this.f289304e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.LinkedList linkedList = ((com.p314xaae8f345.mm.p1006xc5476f33.biz.a) ((bq1.l) i95.n0.c(bq1.l.class))).Di(0L, this.f289303d).f430114i;
        if (linkedList.size() == 0) {
            return;
        }
        ot0.s0 s0Var = (ot0.s0) linkedList.getFirst();
        if (android.text.TextUtils.isEmpty(s0Var.f430295e)) {
            return;
        }
        ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).c(s0Var.f430295e, s0Var.f430303o, 92, this.f289304e, new java.lang.Object[0]);
    }
}
