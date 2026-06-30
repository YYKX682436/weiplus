package p1;

/* loaded from: classes14.dex */
public final class h0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r2.o f432363d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(r2.o oVar) {
        super(1);
        this.f432363d = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean dispatchTouchEvent;
        android.view.MotionEvent motionEvent = (android.view.MotionEvent) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(motionEvent, "motionEvent");
        int actionMasked = motionEvent.getActionMasked();
        r2.o oVar = this.f432363d;
        switch (actionMasked) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                dispatchTouchEvent = oVar.dispatchTouchEvent(motionEvent);
                break;
            default:
                dispatchTouchEvent = oVar.dispatchGenericMotionEvent(motionEvent);
                break;
        }
        return java.lang.Boolean.valueOf(dispatchTouchEvent);
    }
}
