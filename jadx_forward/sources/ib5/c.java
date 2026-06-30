package ib5;

/* loaded from: classes13.dex */
public class c implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib5.d f371780d;

    public c(ib5.d dVar) {
        this.f371780d = dVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ib5.d dVar = this.f371780d;
        dVar.f371787g.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        dVar.l(dVar.f371787g.getMeasuredWidth(), dVar.f371787g.getMeasuredHeight());
    }
}
