package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public final class lc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.mc f167016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 f167017e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.mc mcVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var) {
        super(0);
        this.f167016d = mcVar;
        this.f167017e = n7Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.mc mcVar = this.f167016d;
        if (!mcVar.f167277g) {
            mcVar.f167277g = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 n7Var = this.f167017e;
            al1.n P3 = n7Var.P3();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(P3);
            int m2246xbe2bf9aa = P3.m2246xbe2bf9aa();
            int color = n7Var.getF229340d().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560065ac);
            al1.n P32 = n7Var.P3();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(P32);
            android.animation.ObjectAnimator ofInt = android.animation.ObjectAnimator.ofInt(P32.m2248xff253ca0(), "textColor", m2246xbe2bf9aa, color);
            ofInt.setDuration(100L);
            ofInt.setEvaluator(new android.animation.ArgbEvaluator());
            ofInt.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.kc(ofInt, this.f167017e, color, m2246xbe2bf9aa, this.f167016d));
            java.lang.Object systemService = n7Var.getF229340d().getSystemService("vibrator");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            ((android.os.Vibrator) systemService).vibrate(20L);
            ofInt.start();
        }
        return jz5.f0.f384359a;
    }
}
