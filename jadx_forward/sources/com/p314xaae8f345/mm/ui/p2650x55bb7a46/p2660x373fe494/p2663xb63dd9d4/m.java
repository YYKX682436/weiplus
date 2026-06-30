package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4;

/* loaded from: classes10.dex */
public final class m implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.m f283307d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.m();

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        uc5.k0 k0Var;
        uc5.h0 h0Var;
        uc5.l0 l0Var = (uc5.l0) obj;
        uc5.l0 l0Var2 = (uc5.l0) obj2;
        boolean z17 = l0Var instanceof uc5.i0;
        if (!z17 || !(l0Var2 instanceof uc5.i0)) {
            if (z17) {
                return -1;
            }
            if (!(l0Var2 instanceof uc5.i0)) {
                if (!(l0Var instanceof uc5.j0) && !(l0Var2 instanceof uc5.j0)) {
                    boolean z18 = l0Var instanceof uc5.k0;
                    long j17 = 0;
                    long T1 = z18 ? ((uc5.k0) l0Var).f508053g : l0Var instanceof uc5.h0 ? ((uc5.h0) l0Var).f508027d.p().T1() : 0L;
                    boolean z19 = l0Var2 instanceof uc5.k0;
                    long T12 = z19 ? ((uc5.k0) l0Var2).f508053g : l0Var2 instanceof uc5.h0 ? ((uc5.h0) l0Var2).f508027d.p().T1() : 0L;
                    if (z18 != z19) {
                        if (z18) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l0Var, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryRow.Timeline");
                            k0Var = (uc5.k0) l0Var;
                        } else {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l0Var2, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryRow.Timeline");
                            k0Var = (uc5.k0) l0Var2;
                        }
                        if (z18) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l0Var2, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryRow.Content");
                            h0Var = (uc5.h0) l0Var2;
                        } else {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(l0Var, "null cannot be cast to non-null type com.tencent.mm.ui.chatting.history.base.MsgHistoryGalleryRow.Content");
                            h0Var = (uc5.h0) l0Var;
                        }
                        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(uc5.q0.a(uc5.q0.f508076a, h0Var.f508027d.p().T1(), 0L, 2, null).f508073a, k0Var.f508051e)) {
                            if (z18) {
                                return -1;
                            }
                        }
                    }
                    int j18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.j(T1, T12);
                    if (j18 != 0) {
                        return j18;
                    }
                    if (z18 && !z19) {
                        return -1;
                    }
                    if (z18 || !z19) {
                        long m124847x74d37ac6 = z18 ? ((uc5.k0) l0Var).f508054h : l0Var instanceof uc5.h0 ? ((uc5.h0) l0Var).f508027d.p().m124847x74d37ac6() : 0L;
                        if (z19) {
                            j17 = ((uc5.k0) l0Var2).f508054h;
                        } else if (l0Var2 instanceof uc5.h0) {
                            j17 = ((uc5.h0) l0Var2).f508027d.p().m124847x74d37ac6();
                        }
                        return p3321xbce91901.jvm.p3324x21ffc6bd.o.j(m124847x74d37ac6, j17);
                    }
                }
            }
            return 1;
        }
        return 0;
    }
}
