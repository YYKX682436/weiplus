package vi1;

/* loaded from: classes7.dex */
public final class m1 implements vi1.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vi1.y1 f518941a;

    public m1(vi1.y1 y1Var) {
        this.f518941a = y1Var;
    }

    public void b(int i17, boolean z17) {
        vi1.y1 y1Var = this.f518941a;
        if (i17 != 1) {
            if (i17 == 2) {
                y1Var.C.mo152xb9724478();
                return;
            } else {
                if (i17 != 3) {
                    return;
                }
                y1Var.D.mo152xb9724478();
                return;
            }
        }
        y1Var.B.mo146xb9724478(java.lang.Boolean.valueOf(y1Var.f518835f.a()));
        vi1.l0 l0Var = y1Var.f519041z;
        java.util.ArrayList arrayList = l0Var != null ? l0Var.f518931e : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(arrayList);
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581 c12542x3a17e581 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581) it.next();
            if (c12542x3a17e581.f168940o) {
                y1Var.H.mo146xb9724478(c12542x3a17e581);
                return;
            }
        }
    }
}
