package ns4;

/* loaded from: classes.dex */
public final class n1 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ns4.p1 f421130a;

    public n1(ns4.p1 p1Var) {
        this.f421130a = p1Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = this.f421130a.f421149a;
        if (z2Var != null) {
            z2Var.B();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheet");
            throw null;
        }
    }
}
