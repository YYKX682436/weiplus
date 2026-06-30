package tf5;

/* loaded from: classes.dex */
public final class d0 implements db5.o9 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 f500496d;

    public d0(com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 c22342xca74f598) {
        this.f500496d = c22342xca74f598;
    }

    @Override // db5.o9
    public final void Q0(java.lang.String str) {
        java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 c22342xca74f598 = this.f500496d;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 35) {
                if (hashCode != 8593) {
                    if (hashCode == 9734 && str.equals("☆")) {
                        c22342xca74f598.A0(32);
                        return;
                    }
                } else if (str.equals("↑")) {
                    com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22847x422a813d c22847x422a813d = c22342xca74f598.K;
                    if (c22847x422a813d != null) {
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                        arrayList.add(0);
                        arrayList.add(0);
                        java.util.Collections.reverse(arrayList);
                        yj0.a.d(c22847x422a813d, arrayList.toArray(), "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment$onTabCreate$3", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        c22847x422a813d.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
                        yj0.a.f(c22847x422a813d, "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment$onTabCreate$3", "onScollBarTouch", "(Ljava/lang/String;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
                        return;
                    }
                    return;
                }
            } else if (str.equals("#")) {
                c22342xca74f598.A0(123);
                return;
            }
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        char[] charArray = str.toCharArray();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(charArray, "toCharArray(...)");
        java.lang.Character R = kz5.z.R(charArray, 0);
        if (R != null) {
            c22342xca74f598.A0(R.charValue());
        }
    }
}
