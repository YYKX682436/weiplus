package p012xc85e97e9.p103xe821e364.p104xd1075a44;

/* loaded from: classes15.dex */
public class e2 implements p012xc85e97e9.p103xe821e364.p104xd1075a44.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f93543a;

    public e2(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4) {
        this.f93543a = c1163xf1deaba4;
    }

    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.b bVar) {
        int i17 = bVar.f93492a;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93543a;
        if (i17 == 1) {
            c1163xf1deaba4.f93435s.mo7916x721d405f(c1163xf1deaba4, bVar.f93493b, bVar.f93495d);
            return;
        }
        if (i17 == 2) {
            c1163xf1deaba4.f93435s.mo7919xe5511bff(c1163xf1deaba4, bVar.f93493b, bVar.f93495d);
        } else if (i17 == 4) {
            c1163xf1deaba4.f93435s.mo7920x9643e45a(c1163xf1deaba4, bVar.f93493b, bVar.f93495d, bVar.f93494c);
        } else {
            if (i17 != 8) {
                return;
            }
            c1163xf1deaba4.f93435s.mo7918x72cb9e12(c1163xf1deaba4, bVar.f93493b, bVar.f93495d, 1);
        }
    }

    public void b(int i17, int i18, java.lang.Object obj) {
        int i19;
        int i27;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93543a;
        int h17 = c1163xf1deaba4.f93424h.h();
        int i28 = i18 + i17;
        for (int i29 = 0; i29 < h17; i29++) {
            android.view.View g17 = c1163xf1deaba4.f93424h.g(i29);
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(g17);
            if (x07 != null && !x07.m8209xa033ad65() && (i27 = x07.f3650x519040b6) >= i17 && i27 < i28) {
                x07.m8176xb4f2c266(2);
                x07.m8175x92fd649d(obj);
                ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams) g17.getLayoutParams()).f93450f = true;
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var = c1163xf1deaba4.f93421e;
        java.util.ArrayList arrayList = z2Var.f93844c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                c1163xf1deaba4.J1 = true;
                return;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) arrayList.get(size);
            if (k3Var != null && (i19 = k3Var.f3650x519040b6) >= i17 && i19 < i28) {
                k3Var.m8176xb4f2c266(2);
                z2Var.h(size);
            }
        }
    }

    public void c(int i17, int i18) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93543a;
        int h17 = c1163xf1deaba4.f93424h.h();
        for (int i19 = 0; i19 < h17; i19++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(c1163xf1deaba4.f93424h.g(i19));
            if (x07 != null && !x07.m8209xa033ad65() && x07.f3650x519040b6 >= i17) {
                x07.m8200xab4c1edc(i18, false);
                c1163xf1deaba4.F1.f93597f = true;
            }
        }
        java.util.ArrayList arrayList = c1163xf1deaba4.f93421e.f93844c;
        int size = arrayList.size();
        for (int i27 = 0; i27 < size; i27++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) arrayList.get(i27);
            if (k3Var != null && k3Var.f3650x519040b6 >= i17) {
                k3Var.m8200xab4c1edc(i18, true);
            }
        }
        c1163xf1deaba4.requestLayout();
        c1163xf1deaba4.I1 = true;
    }

    public void d(int i17, int i18) {
        int i19;
        int i27;
        int i28;
        int i29;
        int i37;
        int i38;
        int i39;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f93543a;
        int h17 = c1163xf1deaba4.f93424h.h();
        int i47 = -1;
        if (i17 < i18) {
            i27 = i17;
            i19 = i18;
            i28 = -1;
        } else {
            i19 = i17;
            i27 = i18;
            i28 = 1;
        }
        for (int i48 = 0; i48 < h17; i48++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 x07 = p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.x0(c1163xf1deaba4.f93424h.g(i48));
            if (x07 != null && (i39 = x07.f3650x519040b6) >= i27 && i39 <= i19) {
                if (i39 == i17) {
                    x07.m8200xab4c1edc(i18 - i17, false);
                } else {
                    x07.m8200xab4c1edc(i28, false);
                }
                c1163xf1deaba4.F1.f93597f = true;
            }
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var = c1163xf1deaba4.f93421e;
        z2Var.getClass();
        if (i17 < i18) {
            i37 = i17;
            i29 = i18;
        } else {
            i29 = i17;
            i37 = i18;
            i47 = 1;
        }
        java.util.ArrayList arrayList = z2Var.f93844c;
        int size = arrayList.size();
        for (int i49 = 0; i49 < size; i49++) {
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) arrayList.get(i49);
            if (k3Var != null && (i38 = k3Var.f3650x519040b6) >= i37 && i38 <= i29) {
                if (i38 == i17) {
                    k3Var.m8200xab4c1edc(i18 - i17, false);
                } else {
                    k3Var.m8200xab4c1edc(i47, false);
                }
            }
        }
        c1163xf1deaba4.requestLayout();
        c1163xf1deaba4.I1 = true;
    }
}
