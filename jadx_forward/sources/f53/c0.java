package f53;

/* loaded from: classes5.dex */
public final class c0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b f341170a;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b) {
        this.f341170a = activityC15905x15a0ec7b;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void a(java.lang.String str) {
        this.f341170a.Z6(java.lang.String.valueOf(str));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.ui.p1749xaeecbcd0.ActivityC15905x15a0ec7b activityC15905x15a0ec7b = this.f341170a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = activityC15905x15a0ec7b.f221545e;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
            throw null;
        }
        if (c22621x7603e017.mo81352x6a67d012() != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = activityC15905x15a0ec7b.f221545e;
            if (c22621x7603e0172 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
                throw null;
            }
            c22621x7603e0172.mo81352x6a67d012().sendKeyEvent(new android.view.KeyEvent(0, 67));
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0173 = activityC15905x15a0ec7b.f221545e;
            if (c22621x7603e0173 != null) {
                c22621x7603e0173.mo81352x6a67d012().sendKeyEvent(new android.view.KeyEvent(1, 67));
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gameCommentInputTxt");
                throw null;
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void d() {
    }
}
