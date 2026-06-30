package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.p1160x42bd8ae6;

/* loaded from: classes7.dex */
public class p implements nh1.b {
    @Override // nh1.b
    public void a(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        java.lang.String string;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = k91.d1.f387094a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(o4Var.getString("V8DebugFlags", ""))) {
            o4Var.putString("V8DebugFlags", "--prof_cpp");
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571626kp);
        } else {
            o4Var.remove("V8DebugFlags");
            string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571625ko);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r0.b((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) context, string);
    }

    @Override // nh1.b
    public java.lang.String b(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        return (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(k91.d1.f387094a.getString("V8DebugFlags", "")) ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571647lb) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571645l9)).toString();
    }

    @Override // nh1.b
    public /* bridge */ /* synthetic */ boolean c(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str) {
        return false;
    }
}
