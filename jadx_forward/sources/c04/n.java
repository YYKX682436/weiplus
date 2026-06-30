package c04;

/* loaded from: classes13.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a f119217d;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a c17324xa321818a) {
        this.f119217d = c17324xa321818a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.ui.p2043x93a356f9.p2044xd1075a44.C17324xa321818a c17324xa321818a = this.f119217d;
        if (c17324xa321818a.E) {
            android.widget.LinearLayout linearLayout = c17324xa321818a.I;
            if (linearLayout == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("customTipsImageContainer");
                throw null;
            }
            if (linearLayout.getVisibility() == 0) {
                android.widget.LinearLayout linearLayout2 = c17324xa321818a.I;
                if (linearLayout2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("customTipsImageContainer");
                    throw null;
                }
                u3.u uVar = new u3.u(linearLayout2, u3.s.f505750l);
                uVar.f505758a = 4000.0f;
                u3.v vVar = new u3.v(0.0f);
                vVar.b(3000.0f);
                vVar.a(0.05f);
                uVar.f505769t = vVar;
                uVar.f505759b = -10.0f;
                uVar.f505760c = true;
                uVar.e();
                c17324xa321818a.f241179z1 = uVar;
            }
        }
    }
}
