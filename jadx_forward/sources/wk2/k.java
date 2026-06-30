package wk2;

/* loaded from: classes3.dex */
public final class k extends mn0.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.p1523x6580a04.p1524xed08e3c8.C14263xfb9026d4 f528488d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.p1523x6580a04.p1524xed08e3c8.C14263xfb9026d4 c14263xfb9026d4) {
        this.f528488d = c14263xfb9026d4;
    }

    @Override // com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onNetStatus */
    public void mo15382x3bee38d0(android.os.Bundle bundle) {
    }

    @Override // mn0.a, com.p314xaae8f345.p2926x359365.InterfaceC25479x1853e9c1
    /* renamed from: onPlayEvent */
    public void mo15376x8cd414a7(int i17, android.os.Bundle bundle) {
        java.util.LinkedList m56892x5cd4a51a;
        java.util.LinkedList m56892x5cd4a51a2;
        java.util.LinkedList m56892x5cd4a51a3;
        r45.nw1 nw1Var;
        super.mo15376x8cd414a7(i17, bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.p1523x6580a04.p1524xed08e3c8.C14263xfb9026d4 c14263xfb9026d4 = this.f528488d;
        mn0.b0 b0Var = c14263xfb9026d4.f193289d;
        if (b0Var != null && ((mn0.y) b0Var).b(false)) {
            if (i17 == -2301) {
                java.lang.System.out.print((java.lang.Object) ("onPlayEvent PLAY_ERR_NET_DISCONNECT, non_network:" + (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(c14263xfb9026d4.getContext()) == -1)));
                mn0.b0 b0Var2 = c14263xfb9026d4.f193289d;
                if (b0Var2 != null) {
                    mn0.b0.C(b0Var2, false, false, false, 6, null);
                    return;
                }
                return;
            }
            if (i17 == 2001) {
                java.lang.System.out.print((java.lang.Object) "onPlayEvent ".concat(i17 == 2004 ? "PLAY_EVT_PLAY_BEGIN" : "PLAY_EVT_CONNECT_SUCC"));
                return;
            }
            if (i17 != 2003) {
                if (i17 != 2103) {
                    return;
                }
                java.lang.System.out.print((java.lang.Object) ("onPlayEvent PLAY_WARNING_RECONNECT, non_network:" + (com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40067xab9ed241(c14263xfb9026d4.getContext()) == -1)));
                return;
            }
            uk2.a aVar = c14263xfb9026d4.f193292g;
            if (aVar != null) {
                r45.ka4 ka4Var = aVar.f510053f;
                if (ka4Var != null && ka4Var.V >= ka4Var.W) {
                    android.widget.ImageView imageView = c14263xfb9026d4.f193291f;
                    if (imageView == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgView");
                        throw null;
                    }
                    imageView.setVisibility(0);
                } else {
                    android.widget.ImageView imageView2 = c14263xfb9026d4.f193291f;
                    if (imageView2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("bgView");
                        throw null;
                    }
                    imageView2.setVisibility(8);
                }
            }
            m56892x5cd4a51a = c14263xfb9026d4.m56892x5cd4a51a();
            r45.qa4 qa4Var = (r45.qa4) kz5.n0.Z(m56892x5cd4a51a);
            long j17 = 0;
            long m75942xfb822ef2 = qa4Var != null ? qa4Var.m75942xfb822ef2(1) : 0L;
            long elapsedRealtime = m75942xfb822ef2 > 0 ? android.os.SystemClock.elapsedRealtime() - m75942xfb822ef2 : 0L;
            mn0.b0 b0Var3 = c14263xfb9026d4.f193289d;
            if (b0Var3 != null) {
                ((m30.m) ((n30.q) i95.n0.c(n30.q.class))).getClass();
                java.lang.String str = a52.a.f83117l;
                mm2.e1 e1Var = (mm2.e1) dk2.ef.f314905a.i(mm2.e1.class);
                if (e1Var != null && (nw1Var = e1Var.f410521r) != null) {
                    j17 = nw1Var.m75942xfb822ef2(0);
                }
                long j18 = j17;
                java.lang.String valueOf = java.lang.String.valueOf(((ml2.r0) i95.n0.c(ml2.r0.class)).Ri(j18));
                mn0.b0 b0Var4 = c14263xfb9026d4.f193289d;
                if (b0Var4 != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                    ((mn0.y) b0Var4).h(str, valueOf, elapsedRealtime);
                }
                zl2.q4 q4Var = zl2.q4.f555466a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                m56892x5cd4a51a3 = c14263xfb9026d4.m56892x5cd4a51a();
                q4Var.L(str, j18, valueOf, elapsedRealtime, m56892x5cd4a51a3, ((mn0.y) b0Var3).l(), "MultiStream");
            }
            m56892x5cd4a51a2 = c14263xfb9026d4.m56892x5cd4a51a();
            m56892x5cd4a51a2.clear();
        }
    }
}
