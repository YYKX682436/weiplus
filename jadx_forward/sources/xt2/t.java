package xt2;

/* loaded from: classes15.dex */
public final class t extends ul5.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14972x8aaba4cc f538547b;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1631xeb77f168.p1633x373aa5.C14972x8aaba4cc c14972x8aaba4cc) {
        this.f538547b = c14972x8aaba4cc;
    }

    @Override // ul5.h
    public boolean a(ul5.m overScroll, android.view.View child, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(overScroll, "overScroll");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        int supportedDirection = this.f538547b.getSupportedDirection();
        if (supportedDirection != 0) {
            if (supportedDirection == 1 && i17 != 8) {
                return false;
            }
        } else if (i17 != 4) {
            return false;
        }
        return true;
    }
}
