package ex0;

/* loaded from: classes5.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f338655d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ex0.a0 a0Var) {
        super(1);
        this.f338655d = a0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ax0.e eVar;
        ex0.r segmentVM = (ex0.r) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentVM, "segmentVM");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimelineViewModelEditingState", "generalEditing did select : " + segmentVM);
        ex0.a0 a0Var = this.f338655d;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(segmentVM, a0Var.n());
        ug.m mVar = segmentVM.f338702c;
        if (!b17) {
            a0Var.l(segmentVM);
            segmentVM.f338704e = ax0.b.f96498e;
            int ordinal = mVar.ordinal();
            if (ordinal == 1) {
                eVar = ax0.e.f96509e;
            } else if (ordinal != 2 && ordinal != 3 && ordinal != 4) {
                switch (ordinal) {
                    case 10:
                        eVar = ax0.e.f96513i;
                        break;
                    case 11:
                    case 12:
                        eVar = ax0.e.f96512h;
                        break;
                    default:
                        eVar = ax0.e.f96513i;
                        break;
                }
            } else {
                eVar = ax0.e.f96510f;
            }
            a0Var.O(eVar);
        } else if (segmentVM.p()) {
            if (ex0.c0.f338653a[mVar.ordinal()] == 1) {
                ex0.r n17 = a0Var.n();
                if ((n17 != null ? n17.f338704e : null) == ax0.b.f96498e) {
                    a0Var.O(a0Var.z() ? ax0.e.f96510f : ax0.e.f96513i);
                    a0Var.v(segmentVM);
                }
            } else {
                a0Var.O(a0Var.z() ? ax0.e.f96510f : ax0.e.f96513i);
                a0Var.v(segmentVM);
            }
        }
        return jz5.f0.f384359a;
    }
}
