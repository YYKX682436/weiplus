package gp2;

/* loaded from: classes10.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gp2.q0 f355806d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(gp2.q0 q0Var) {
        super(0);
        this.f355806d = q0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        int i18;
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        gp2.q0 q0Var = this.f355806d;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1 c1164x587b7ff1 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) ((jz5.n) q0Var.f355839q).mo141623x754a37bb();
        c1164x587b7ff1.u(iArr);
        c1164x587b7ff1.v(iArr2);
        if (q0Var.f355830e && q0Var.f355838p != null && (i17 = iArr[0]) <= (i18 = iArr2[1])) {
            while (true) {
                android.view.View mo7935xa188593e = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1164x587b7ff1) ((jz5.n) q0Var.f355839q).mo141623x754a37bb()).mo7935xa188593e(i17);
                if (mo7935xa188593e != null) {
                    android.graphics.Rect rect = new android.graphics.Rect();
                    mo7935xa188593e.getGlobalVisibleRect(rect);
                    android.view.MotionEvent motionEvent = q0Var.f355838p;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(motionEvent);
                    int rawX = (int) motionEvent.getRawX();
                    android.view.MotionEvent motionEvent2 = q0Var.f355838p;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(motionEvent2);
                    if (rect.contains(rawX, (int) motionEvent2.getRawY())) {
                        break;
                    }
                }
                if (i17 == i18) {
                    break;
                }
                i17++;
            }
        }
        i17 = -1;
        return java.lang.Integer.valueOf(i17);
    }
}
