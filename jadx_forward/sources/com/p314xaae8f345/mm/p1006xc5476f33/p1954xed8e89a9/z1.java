package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f236280d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f236281e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f236282f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        super(1);
        this.f236280d = h0Var;
        this.f236281e = abstractActivityC21394xb3d2c0cf;
        this.f236282f = z3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.ArrayList galleryImagePathList = (java.util.ArrayList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(galleryImagePathList, "galleryImagePathList");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f4Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4) this.f236280d.f391656d;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("view_only", true);
        kr3.s1.f393008a.a(intent, this.f236281e, this.f236282f.d1(), com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.mod.p1957xe5548316.j0.class, 104, true);
        return jz5.f0.f384359a;
    }
}
