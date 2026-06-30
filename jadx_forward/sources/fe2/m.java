package fe2;

/* loaded from: classes3.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe2.q f343054d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(fe2.q qVar) {
        super(1);
        this.f343054d = qVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et etVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et) this.f343054d.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.et.class);
        if (etVar != null) {
            etVar.f193988u.dispatchTouchEvent(motionEvent);
        }
        return jz5.f0.f384359a;
    }
}
