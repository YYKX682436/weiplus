package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class n4 implements bf.i {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.n24 f161184d;

    public n4(r45.n24 n24Var) {
        this.f161184d = n24Var;
    }

    @Override // bf.i
    public void Oa(bf.h callback) {
        java.util.LinkedList linkedList;
        r45.tv6 tv6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        r45.sv6 sv6Var = this.f161184d.f462558q;
        java.lang.String str = (sv6Var == null || (linkedList = sv6Var.f467517d) == null || (tv6Var = (r45.tv6) linkedList.peekFirst()) == null) ? null : tv6Var.f468357f;
        if (str == null || str.length() == 0) {
            callback.a(null);
        } else {
            l01.d0.f396294a.m(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.m4(callback), str, null);
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
        r45.sv6 sv6Var = this.f161184d.f462558q;
        if (sv6Var == null || (linkedList = sv6Var.f467517d) == null || (tv6Var = (r45.tv6) linkedList.peekFirst()) == null) {
            return null;
        }
        return tv6Var.f468356e;
    }
}
