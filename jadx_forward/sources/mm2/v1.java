package mm2;

/* loaded from: classes3.dex */
public final class v1 {
    public v1(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final int a(int i17) {
        if (i17 != 2) {
            return i17 != 3 ? 0 : 1;
        }
        return 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r45.yl1 b(dk2.zf zfVar) {
        int p17;
        r45.yl1 yl1Var;
        java.util.LinkedList m75941xfb821914;
        java.util.LinkedList m75941xfb8219142;
        java.lang.Object obj;
        r45.xn1 r17;
        java.util.LinkedList m75941xfb8219143;
        r45.yl1 yl1Var2 = null;
        if (!(zfVar != null && zfVar.l()) || (p17 = zfVar.p()) == 1) {
            return null;
        }
        if (p17 != 2) {
            if (p17 != 3 || (r17 = zfVar.r()) == null || (m75941xfb8219143 = r17.m75941xfb821914(11)) == null) {
                return null;
            }
            java.util.Iterator it = m75941xfb8219143.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (((r45.yl1) next).m75939xb282bd08(0) == 2) {
                    yl1Var2 = next;
                    break;
                }
            }
            return yl1Var2;
        }
        r45.xn1 r18 = zfVar.r();
        if (r18 == null || (m75941xfb8219142 = r18.m75941xfb821914(11)) == null) {
            yl1Var = null;
        } else {
            java.util.Iterator it6 = m75941xfb8219142.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it6.next();
                if (((r45.yl1) obj).m75939xb282bd08(0) == 12) {
                    break;
                }
            }
            yl1Var = (r45.yl1) obj;
        }
        r45.xn1 r19 = zfVar.r();
        if (r19 != null && (m75941xfb821914 = r19.m75941xfb821914(11)) != null) {
            java.util.Iterator it7 = m75941xfb821914.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    break;
                }
                java.lang.Object next2 = it7.next();
                if (((r45.yl1) next2).m75939xb282bd08(0) == 4) {
                    yl1Var2 = next2;
                    break;
                }
            }
            yl1Var2 = yl1Var2;
        }
        return yl1Var == null ? yl1Var2 : yl1Var;
    }

    public final boolean c() {
        if (((java.lang.Number) ae2.in.F3.r()).intValue() == 0) {
            jz5.g gVar = mm2.j2.L;
            if (((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() >= 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMFinder.LiveDanmakuSlice", "isLowLevelDevice performanceLevel:" + ((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue());
                if (((java.lang.Number) ((jz5.n) gVar).mo141623x754a37bb()).intValue() <= 20) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean d(dk2.zf msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        if (!mm2.j2.H.contains(java.lang.Integer.valueOf(msg.mo124533xfb85f7b0()))) {
            return false;
        }
        return !((msg instanceof dk2.mf ? (dk2.mf) msg : null) != null ? r3.b() : false);
    }
}
