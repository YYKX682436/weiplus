package pp3;

/* loaded from: classes5.dex */
public class l implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f439021d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16785xfbc81739 f439022e;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16785xfbc81739 c16785xfbc81739, android.view.View view) {
        this.f439022e = c16785xfbc81739;
        this.f439021d = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f439021d.postDelayed(new pp3.k(this), 175L);
    }
}
