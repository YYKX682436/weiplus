package uj4;

/* loaded from: classes11.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f509943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uj4.e f509944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d f509945f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 f509946g;

    public b(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, uj4.e eVar, p012xc85e97e9.p087x9da2e250.app.AbstractC1104xc1ad431d abstractC1104xc1ad431d, com.p314xaae8f345.mm.ui.vas.C22584xf7d97e83 c22584xf7d97e83) {
        this.f509943d = h0Var;
        this.f509944e = eVar;
        this.f509945f = abstractC1104xc1ad431d;
        this.f509946g = c22584xf7d97e83;
    }

    @Override // java.lang.Runnable
    public final void run() {
        uj4.e eVar = this.f509944e;
        android.view.View findViewById = eVar.m158354x19263085().findViewById(com.p314xaae8f345.mm.R.id.s1e);
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f509943d;
        h0Var.f391656d = findViewById;
        eVar.T6(this.f509945f, (android.view.ViewGroup) h0Var.f391656d, this.f509946g);
    }
}
