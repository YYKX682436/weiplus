package ch5;

/* loaded from: classes3.dex */
public final class q0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 f123151d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 c22421x5301a0d7) {
        super(1);
        this.f123151d = c22421x5301a0d7;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.MotionEvent e17 = (android.view.MotionEvent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        float rawX = e17.getRawX();
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.p2711xaf968b71.C22421x5301a0d7 c22421x5301a0d7 = this.f123151d;
        float abs = java.lang.Math.abs(rawX - c22421x5301a0d7.T);
        float abs2 = java.lang.Math.abs(e17.getRawY() - c22421x5301a0d7.U);
        c22421x5301a0d7.T = e17.getRawX();
        c22421x5301a0d7.U = e17.getRawY();
        return (e17.getAction() != 2 || abs < abs2) ? java.lang.Boolean.TRUE : java.lang.Boolean.FALSE;
    }
}
