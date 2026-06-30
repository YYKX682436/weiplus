package ex0;

/* loaded from: classes5.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f338673d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ex0.a0 a0Var) {
        super(1);
        this.f338673d = a0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        ax0.e eVar;
        ex0.r segmentVM = (ex0.r) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentVM, "segmentVM");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("TimelineViewModelEditingState", "Skimming did select : " + segmentVM);
        ex0.a0 a0Var = this.f338673d;
        a0Var.l(segmentVM);
        segmentVM.f338704e = ax0.b.f96498e;
        int ordinal = segmentVM.f338702c.ordinal();
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
        return jz5.f0.f384359a;
    }
}
