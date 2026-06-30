package ak3;

/* loaded from: classes8.dex */
public final class h implements al5.g3 {

    /* renamed from: d, reason: collision with root package name */
    public float f5580d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ak3.i f5581e;

    public h(ak3.i iVar) {
        this.f5581e = iVar;
    }

    @Override // al5.g3
    public void R(int i17, int i18, int i19, int i27, float f17) {
        ak3.a aVar = this.f5581e.f5586h;
        if (aVar == null || aVar == null) {
            return;
        }
        aVar.f(f17);
    }

    @Override // al5.g3
    public boolean a(android.view.MotionEvent ev6) {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        kotlin.jvm.internal.o.g(ev6, "ev");
        ak3.i iVar = this.f5581e;
        ak3.a aVar = iVar.f5586h;
        if (aVar != null) {
            aVar.a(ev6);
        }
        if (iVar instanceof com.tencent.mm.plugin.finder.megavideo.multitask.i) {
            if (ev6.getAction() == 0) {
                this.f5580d = ev6.getX();
                android.app.Activity activity = iVar.getActivity();
                com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
                if (mMActivity != null && (swipeBackLayout = mMActivity.getSwipeBackLayout()) != null) {
                    ii5.c cVar = swipeBackLayout.f211432m;
                    cVar.f291645p = cVar.f291646q;
                    cVar.f291647r = false;
                }
            } else {
                int x17 = (int) (this.f5580d - ev6.getX(0));
                if (iVar.a() != null) {
                    android.view.ViewGroup a17 = iVar.a();
                    kotlin.jvm.internal.o.d(a17);
                    if (iVar.n(x17, a17, ev6.getX(), ev6.getY())) {
                        return false;
                    }
                }
                iVar.l();
            }
        }
        return false;
    }

    @Override // al5.g3
    public int b(boolean z17) {
        com.tencent.mm.ui.widget.SwipeBackLayout swipeBackLayout;
        ak3.i iVar = this.f5581e;
        if (!iVar.p() || iVar.q()) {
            android.app.Activity activity = iVar.getActivity();
            com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
            if (mMActivity != null && (swipeBackLayout = mMActivity.getSwipeBackLayout()) != null) {
                ii5.c cVar = swipeBackLayout.f211432m;
                cVar.f291645p = cVar.f291646q;
                cVar.f291647r = false;
            }
        } else {
            iVar.l();
        }
        ak3.a aVar = iVar.f5586h;
        if (aVar != null) {
            return aVar.h(z17);
        }
        return 1;
    }

    @Override // al5.g3
    public void c(int i17, int i18) {
        ak3.a aVar = this.f5581e.f5586h;
        if (aVar != null) {
            aVar.c(i17, i18);
        }
    }

    @Override // al5.g3
    public boolean d(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        ak3.a aVar = this.f5581e.f5586h;
        if (aVar == null || aVar == null) {
            return false;
        }
        return aVar.d(ev6);
    }

    @Override // al5.g3
    public boolean d0() {
        ak3.a aVar = this.f5581e.f5586h;
        if (aVar == null || aVar == null) {
            return false;
        }
        return aVar.g();
    }

    @Override // al5.g3
    public int e() {
        ak3.a aVar = this.f5581e.f5586h;
        if (aVar != null) {
            return aVar.e();
        }
        return 0;
    }

    @Override // al5.g3
    public boolean enableSwipeBack() {
        ak3.a aVar = this.f5581e.f5586h;
        if (aVar != null) {
            return aVar.enableSwipeBack();
        }
        return false;
    }
}
