package dp1;

/* loaded from: classes8.dex */
public class r implements al5.g3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dp1.u f323705d;

    public r(dp1.u uVar) {
        this.f323705d = uVar;
    }

    @Override // al5.g3
    public void R(int i17, int i18, int i19, int i27, float f17) {
        dp1.v vVar = this.f323705d.f323712f;
        if (vVar != null) {
            vVar.f(f17);
        }
    }

    @Override // al5.g3
    public boolean a(android.view.MotionEvent motionEvent) {
        dp1.u uVar = this.f323705d;
        dp1.v vVar = uVar.f323712f;
        if (vVar != null) {
            vVar.a(motionEvent);
        }
        uVar.getClass();
        return false;
    }

    @Override // al5.g3
    public int b(boolean z17) {
        dp1.u uVar = this.f323705d;
        if (uVar.w() && !uVar.x()) {
            uVar.y();
        } else if (uVar.mo50327x19263085() instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            ii5.c cVar = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) uVar.mo50327x19263085()).m78735x28280f95().f292965m;
            cVar.f373178p = cVar.f373179q;
            cVar.f373180r = false;
        }
        dp1.v vVar = uVar.f323712f;
        int h17 = vVar != null ? vVar.h(z17) : 0;
        uVar.f323714h = z17;
        if (h17 != 0) {
            return h17;
        }
        return 1;
    }

    @Override // al5.g3
    public void c(int i17, int i18) {
        dp1.v vVar = this.f323705d.f323712f;
        if (vVar != null) {
            vVar.c(i17, i18);
        }
    }

    @Override // al5.g3
    public boolean d(android.view.MotionEvent motionEvent) {
        dp1.v vVar = this.f323705d.f323712f;
        return vVar != null && vVar.d(motionEvent);
    }

    @Override // al5.g3
    public boolean d0() {
        dp1.v vVar = this.f323705d.f323712f;
        return vVar != null && vVar.g();
    }

    @Override // al5.g3
    public int e() {
        dp1.v vVar = this.f323705d.f323712f;
        if (vVar != null) {
            return vVar.e();
        }
        return 0;
    }

    @Override // al5.g3
    /* renamed from: enableSwipeBack */
    public boolean mo2163xd71108fe() {
        dp1.v vVar = this.f323705d.f323712f;
        return vVar != null && vVar.mo54081xd71108fe();
    }
}
