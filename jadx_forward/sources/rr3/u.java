package rr3;

/* loaded from: classes3.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rr3.z f480747d;

    public u(rr3.z zVar) {
        this.f480747d = zVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        rr3.z zVar = this.f480747d;
        android.view.ViewGroup.LayoutParams layoutParams = zVar.P6().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams;
        android.graphics.Rect rect = new android.graphics.Rect();
        zVar.P6().getGlobalVisibleRect(rect);
        layoutParams2.setMargins(((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin - (rect.bottom - (zVar.m80379x76847179().getResources().getDisplayMetrics().heightPixels - i65.a.b(zVar.m80379x76847179(), 108))), ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).rightMargin, ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        zVar.P6().setLayoutParams(layoutParams2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NewBizInfoAuthScopeUIC", "adjust btn pos, margin top = " + ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).topMargin);
    }
}
