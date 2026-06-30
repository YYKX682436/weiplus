package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036;

/* loaded from: classes7.dex */
public final class y3 implements z26.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ak3.a f264247a;

    public y3(ak3.a aVar) {
        this.f264247a = aVar;
    }

    @Override // z26.e
    public void a(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        ak3.a aVar = this.f264247a;
        if (aVar != null) {
            aVar.a(ev6);
        }
    }

    @Override // z26.e
    public int b(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageWebViewMultiTaskPageAdapter", "onViewReleased, " + z17);
        ak3.a aVar = this.f264247a;
        if (aVar != null) {
            return aVar.h(z17);
        }
        return 1;
    }

    @Override // z26.e
    public void c(android.view.View view, int i17, int i18) {
    }

    @Override // z26.e
    public void d(int i17, float f17) {
        ak3.a aVar = this.f264247a;
        if (aVar != null) {
            aVar.f(f17);
        }
    }

    @Override // z26.e
    public void e(int i17) {
        ak3.a aVar = this.f264247a;
        if (aVar != null) {
            aVar.c(1, 0);
        }
    }

    @Override // z26.e
    public void f() {
    }

    @Override // z26.e
    public boolean g() {
        return false;
    }
}
