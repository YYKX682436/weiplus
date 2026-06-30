package cd0;

/* loaded from: classes5.dex */
public final class t implements com.p314xaae8f345.mm.p944x882e457a.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p957x53236a1b.d1 f122125d;

    public t(com.p314xaae8f345.mm.p957x53236a1b.d1 d1Var) {
        this.f122125d = d1Var;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var;
        com.p314xaae8f345.mm.p957x53236a1b.d1 d1Var = this.f122125d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(m1Var, d1Var)) {
            com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
            d1Var.getClass();
            d17.q(594, this);
            java.lang.ref.WeakReference weakReference = cd0.b0.f122059b;
            if (weakReference == null || (u3Var = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3) weakReference.get()) == null) {
                return;
            }
            u3Var.dismiss();
        }
    }
}
