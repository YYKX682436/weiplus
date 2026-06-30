package sj3;

/* loaded from: classes14.dex */
public final class l5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16588x7b895f5a f490158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f490159e;

    public l5(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16588x7b895f5a c16588x7b895f5a, android.view.View view) {
        this.f490158d = c16588x7b895f5a;
        this.f490159e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.ScreenCastBigView", "dismiss ori dialog");
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16588x7b895f5a c16588x7b895f5a = this.f490158d;
        android.view.View view = c16588x7b895f5a.f231893h;
        android.view.View view2 = this.f490159e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view, view2)) {
            c16588x7b895f5a.removeView(view2);
            c16588x7b895f5a.f231893h = null;
            c16588x7b895f5a.f231890e = 0;
        }
    }
}
