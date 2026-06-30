package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class b3 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f93498a;

    public b3(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f93498a = c1163xf1deaba4;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void b() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93498a;
        c1163xf1deaba4.Q(null);
        c1163xf1deaba4.F1.f93597f = true;
        c1163xf1deaba4.P0(true);
        if (c1163xf1deaba4.f93423g.g()) {
            return;
        }
        c1163xf1deaba4.requestLayout();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void d(int i17, int i18, java.lang.Object obj) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93498a;
        c1163xf1deaba4.Q(null);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.c cVar = c1163xf1deaba4.f93423g;
        boolean z17 = false;
        if (i18 < 1) {
            cVar.getClass();
        } else {
            java.util.ArrayList arrayList = cVar.f93504b;
            arrayList.add(cVar.h(4, i17, i18, obj));
            cVar.f93508f |= 4;
            if (arrayList.size() == 1) {
                z17 = true;
            }
        }
        if (z17) {
            h();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void e(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93498a;
        c1163xf1deaba4.Q(null);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.c cVar = c1163xf1deaba4.f93423g;
        boolean z17 = false;
        if (i18 < 1) {
            cVar.getClass();
        } else {
            java.util.ArrayList arrayList = cVar.f93504b;
            arrayList.add(cVar.h(1, i17, i18, null));
            cVar.f93508f |= 1;
            if (arrayList.size() == 1) {
                z17 = true;
            }
        }
        if (z17) {
            h();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void f(int i17, int i18, int i19) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93498a;
        c1163xf1deaba4.Q(null);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.c cVar = c1163xf1deaba4.f93423g;
        cVar.getClass();
        boolean z17 = false;
        if (i17 != i18) {
            if (i19 != 1) {
                throw new java.lang.IllegalArgumentException("Moving more than 1 item is not supported yet");
            }
            java.util.ArrayList arrayList = cVar.f93504b;
            arrayList.add(cVar.h(8, i17, i18, null));
            cVar.f93508f |= 8;
            if (arrayList.size() == 1) {
                z17 = true;
            }
        }
        if (z17) {
            h();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.h2
    public void g(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93498a;
        c1163xf1deaba4.Q(null);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.c cVar = c1163xf1deaba4.f93423g;
        boolean z17 = false;
        if (i18 < 1) {
            cVar.getClass();
        } else {
            java.util.ArrayList arrayList = cVar.f93504b;
            arrayList.add(cVar.h(2, i17, i18, null));
            cVar.f93508f |= 2;
            if (arrayList.size() == 1) {
                z17 = true;
            }
        }
        if (z17) {
            h();
        }
    }

    public void h() {
        int[] iArr = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.X1;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93498a;
        if (!c1163xf1deaba4.f93443y || !c1163xf1deaba4.f93440x) {
            c1163xf1deaba4.F = true;
            c1163xf1deaba4.requestLayout();
        } else {
            java.lang.Runnable runnable = c1163xf1deaba4.f93428n;
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.u0.m(c1163xf1deaba4, runnable);
        }
    }
}
