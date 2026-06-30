package bg2;

/* loaded from: classes3.dex */
public final class g2 extends tc2.c implements tc2.h {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f101636e;

    /* renamed from: f, reason: collision with root package name */
    public bg2.j7 f101637f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(tc2.g store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
        this.f101636e = "Finder.LiveConvertPollingServiceController";
    }

    @Override // tc2.h
    public void H0(r45.r71 resp) {
        bg2.j7 j7Var;
        bg2.j7 j7Var2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        java.util.LinkedList m75941xfb821914 = resp.m75941xfb821914(24);
        if (m75941xfb821914 != null && (j7Var2 = this.f101637f) != null) {
            j7Var2.d().mo50293x3498a0(new bg2.z6(m75941xfb821914, j7Var2));
        }
        java.util.LinkedList m75941xfb8219142 = resp.m75941xfb821914(23);
        if (m75941xfb8219142 == null || (j7Var = this.f101637f) == null) {
            return;
        }
        j7Var.d().mo50293x3498a0(new bg2.w6(m75941xfb8219142, j7Var));
    }

    @Override // tc2.c
    public void U6() {
        a7();
    }

    @Override // tc2.c
    public void X6() {
        a7();
    }

    public final void Y6(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.f req, boolean z17, bg2.s6 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        bg2.j7 j7Var = this.f101637f;
        if (j7Var != null) {
            j7Var.d().mo50293x3498a0(new bg2.e7(j7Var, i17, req, callback, z17));
        }
    }

    public final void Z6(int i17) {
        bg2.j7 j7Var = this.f101637f;
        if (j7Var != null) {
            j7Var.d().mo50293x3498a0(new bg2.g7(i17, j7Var));
        }
    }

    public final void a7() {
        bg2.j7 j7Var = this.f101637f;
        if (j7Var != null) {
            j7Var.f101750g = true;
            j7Var.d().mo50293x3498a0(new bg2.c7(j7Var));
        }
        this.f101637f = null;
    }

    public final void b7(int i17, com.p314xaae8f345.mm.p2495xc50a8b8b.f req) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        bg2.j7 j7Var = this.f101637f;
        if (j7Var != null) {
            j7Var.d().mo50293x3498a0(new bg2.h7(i17, req, j7Var));
        }
    }

    @Override // tc2.h
    /* renamed from: onLiveEnd */
    public void mo10394x5aa1a970() {
        a7();
    }
}
