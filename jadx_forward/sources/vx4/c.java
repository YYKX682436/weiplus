package vx4;

/* loaded from: classes8.dex */
public final class c extends jk3.v {

    /* renamed from: x, reason: collision with root package name */
    public boolean f522848x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f522849y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ak3.c pageAdapter, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d webViewUI) {
        super(pageAdapter);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageAdapter, "pageAdapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(webViewUI, "webViewUI");
        this.f522849y = jz5.h.b(new vx4.b(pageAdapter));
        jz5.h.b(new vx4.a(this));
    }

    @Override // jk3.b
    public boolean G() {
        return false;
    }

    @Override // jk3.b, jk3.e
    public void g(android.graphics.Bitmap bitmap) {
        if (this.f522848x) {
            super.g(bitmap);
        }
    }

    @Override // jk3.b, jk3.e
    public void j() {
    }

    @Override // jk3.b
    public void m(android.graphics.Bitmap bitmap) {
        if (this.f522848x) {
            super.m(bitmap);
        }
    }

    @Override // jk3.b
    public boolean t() {
        return true;
    }

    @Override // jk3.b
    public boolean w() {
        return true;
    }
}
