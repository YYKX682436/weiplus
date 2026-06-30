package cw1;

/* loaded from: classes12.dex */
public final class a4 implements kn5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cw1.q4 f304262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cw1.b4 f304263b;

    public a4(cw1.q4 q4Var, cw1.b4 b4Var) {
        this.f304262a = q4Var;
        this.f304263b = b4Var;
    }

    @Override // kn5.g
    public void a(android.view.MotionEvent motionEvent, android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        cw1.q4 q4Var = this.f304262a;
        cw1.h4 h4Var = q4Var.f304808q;
        java.util.BitSet bitSet = q4Var.f304802h;
        cw1.b4 b4Var = this.f304263b;
        h4Var.f304497a = bitSet.get(b4Var.f304346d);
        q4Var.f304809r.f(true, b4Var.m8183xf806b362());
    }

    @Override // kn5.g
    public boolean b(android.view.MotionEvent motionEvent, android.view.MotionEvent motionEvent2, float f17, float f18, android.view.View v17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        if (f17 == 0.0f) {
            return false;
        }
        a(null, v17);
        return false;
    }
}
