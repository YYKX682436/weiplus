package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes5.dex */
public final class i5 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15027x39e0411 f210882a;

    public i5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15027x39e0411 activityC15027x39e0411) {
        this.f210882a = activityC15027x39e0411;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15505x942e3d02 c15505x942e3d02 = this.f210882a.f210096t;
        if (c15505x942e3d02 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editView");
            throw null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c15505x942e3d02.f218481e;
        if (c22621x7603e017 != null) {
            c22621x7603e017.n(str);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1684xd1075a44.p1685x2f6e0a.C15505x942e3d02 c15505x942e3d02 = this.f210882a.f210096t;
        if (c15505x942e3d02 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editView");
            throw null;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = c15505x942e3d02.f218481e;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
            throw null;
        }
        android.view.inputmethod.InputConnection mo81352x6a67d012 = c22621x7603e017.mo81352x6a67d012();
        if (mo81352x6a67d012 != null) {
            mo81352x6a67d012.sendKeyEvent(new android.view.KeyEvent(0, 67));
            mo81352x6a67d012.sendKeyEvent(new android.view.KeyEvent(1, 67));
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void d() {
    }
}
