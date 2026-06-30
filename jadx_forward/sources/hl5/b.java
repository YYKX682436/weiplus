package hl5;

/* loaded from: classes15.dex */
public class b implements gl5.d0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hl5.g f363652d;

    public b(hl5.g gVar) {
        this.f363652d = gVar;
    }

    @Override // gl5.d0
    public void a(int i17, int i18, boolean z17, boolean z18) {
        hl5.g gVar = this.f363652d;
        gVar.f363659a.dismiss();
        java.lang.Runnable runnable = gVar.f363674p;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023 = gVar.f363667i;
        viewTreeObserverOnPreDrawListenerC22668xe0605023.removeCallbacks(runnable);
        viewTreeObserverOnPreDrawListenerC22668xe0605023.postDelayed(runnable, 100L);
    }
}
