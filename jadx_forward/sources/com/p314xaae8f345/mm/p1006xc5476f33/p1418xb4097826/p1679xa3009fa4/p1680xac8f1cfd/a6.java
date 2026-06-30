package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes5.dex */
public final class a6 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 f215269a;

    public a6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d647) {
        this.f215269a = c15442xfd56d647;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void a(java.lang.String str) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) ((jz5.n) this.f215269a.f215035o).mo141623x754a37bb();
        if (c22621x7603e017 != null) {
            c22621x7603e017.n(str);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void b() {
        android.view.inputmethod.InputConnection mo81352x6a67d012;
        android.view.inputmethod.InputConnection mo81352x6a67d0122;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15442xfd56d647 c15442xfd56d647 = this.f215269a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) ((jz5.n) c15442xfd56d647.f215035o).mo141623x754a37bb();
        if (c22621x7603e017 != null && (mo81352x6a67d0122 = c22621x7603e017.mo81352x6a67d012()) != null) {
            mo81352x6a67d0122.sendKeyEvent(new android.view.KeyEvent(0, 67));
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) ((jz5.n) c15442xfd56d647.f215035o).mo141623x754a37bb();
        if (c22621x7603e0172 == null || (mo81352x6a67d012 = c22621x7603e0172.mo81352x6a67d012()) == null) {
            return;
        }
        mo81352x6a67d012.sendKeyEvent(new android.view.KeyEvent(1, 67));
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.k0
    public void d() {
        yz5.a aVar = this.f215269a.f215028e;
        if (aVar != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s5) aVar).mo152xb9724478();
        }
    }
}
