package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class n4 implements bf.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.n24 f79651d;

    public n4(r45.n24 n24Var) {
        this.f79651d = n24Var;
    }

    @Override // bf.i
    public void Oa(bf.h callback) {
        java.util.LinkedList linkedList;
        r45.tv6 tv6Var;
        kotlin.jvm.internal.o.g(callback, "callback");
        r45.sv6 sv6Var = this.f79651d.f381025q;
        java.lang.String str = (sv6Var == null || (linkedList = sv6Var.f385984d) == null || (tv6Var = (r45.tv6) linkedList.peekFirst()) == null) ? null : tv6Var.f386824f;
        if (str == null || str.length() == 0) {
            callback.a(null);
        } else {
            l01.d0.f314761a.m(new com.tencent.mm.plugin.appbrand.jsapi.auth.m4(callback), str, null);
        }
    }

    @Override // bf.i
    public android.graphics.drawable.Drawable S7() {
        return null;
    }

    @Override // bf.i
    public java.lang.String fi() {
        java.util.LinkedList linkedList;
        r45.tv6 tv6Var;
        r45.sv6 sv6Var = this.f79651d.f381025q;
        if (sv6Var == null || (linkedList = sv6Var.f385984d) == null || (tv6Var = (r45.tv6) linkedList.peekFirst()) == null) {
            return null;
        }
        return tv6Var.f386823e;
    }
}
