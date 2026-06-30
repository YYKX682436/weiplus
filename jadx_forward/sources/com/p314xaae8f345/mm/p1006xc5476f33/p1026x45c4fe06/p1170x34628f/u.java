package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public abstract class u {
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6 a(android.content.Context context) {
        return context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6 ? com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6.b(((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6) context).getBaseContext()) : com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6.b(context);
    }

    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ia b(android.content.Context context, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ia iaVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "<this>");
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ia) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ia) context;
        }
        if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) {
            iaVar = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ActivityC12666xc288131a) context).x7(z17);
        } else if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6 z6Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.z6) context;
            if (z6Var.f171900c == null) {
                z6Var.f171900c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ia(z6Var);
            }
            iaVar = z6Var.f171900c;
        } else {
            iaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ia(context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ja.a(false));
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(iaVar);
        return iaVar;
    }
}
