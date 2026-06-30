package rj5;

/* loaded from: classes10.dex */
public final class j implements android.view.ViewTreeObserver.OnScrollChangedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rj5.k f477922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f477923b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f477924c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f477925d;

    public j(rj5.k kVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.Runnable runnable, long j17) {
        this.f477922a = kVar;
        this.f477923b = f0Var;
        this.f477924c = h0Var;
        this.f477925d = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        rj5.k kVar = this.f477922a;
        int scrollY = kVar.f477926d.getScrollY();
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f477923b;
        if (scrollY == f0Var.f391649d) {
            return;
        }
        f0Var.f391649d = scrollY;
        float mo162529x9746038c = kVar.mo162529x9746038c();
        java.util.Iterator it = kVar.f477911c.f291321d.iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2734x9d861347.AbstractC22476xceb0af4c) it.next()).b(mo162529x9746038c);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f477924c;
        java.lang.Object obj = h0Var.f391656d;
        rj5.a aVar = rj5.a.f477905e;
        if (obj != aVar) {
            h0Var.f391656d = aVar;
            kVar.c(aVar);
        }
        android.widget.ScrollView scrollView = kVar.f477926d;
        java.lang.Runnable runnable = this.f477925d;
        scrollView.removeCallbacks(runnable);
        scrollView.postDelayed(runnable, 80L);
    }
}
