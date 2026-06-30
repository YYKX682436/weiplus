package fd2;

/* loaded from: classes2.dex */
public final class a {
    public a(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final java.lang.Long a() {
        java.lang.Long l17 = fd2.j.f342805m;
        if (l17 != null) {
            return l17;
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = ((cq.k) c17).f302759g.f323818b;
        java.lang.Long valueOf = java.lang.Long.valueOf(o4Var != null ? o4Var.q("KEY_FINDER_ENABLE_AUTO_SCROLL_COUNT", 0L) : 0L);
        fd2.j.f342805m = valueOf;
        return valueOf;
    }

    public final boolean b(in5.s0 holder) {
        java.util.List m82898xfb7e5820;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = holder.f374655f;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf c22848x6ddd90cf = f2Var instanceof com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf ? (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf) f2Var : null;
        if ((c22848x6ddd90cf == null || (m82898xfb7e5820 = c22848x6ddd90cf.m82898xfb7e5820()) == null || m82898xfb7e5820.size() != 1) ? false : true) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 o17 = holder.o();
            android.view.ViewParent parent = o17 != null ? o17.getParent() : null;
            com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00 = parent instanceof com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 ? (com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00) parent : null;
            if ((c22801x87cbdc00 == null || c22801x87cbdc00.isHasBottomMore) ? false : true) {
                return true;
            }
        }
        return false;
    }
}
