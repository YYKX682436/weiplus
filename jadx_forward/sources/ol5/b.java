package ol5;

/* loaded from: classes15.dex */
public class b implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public int f427744d;

    /* renamed from: e, reason: collision with root package name */
    public int f427745e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ol5.e f427746f;

    public b(ol5.e eVar) {
        this.f427746f = eVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        int i17 = this.f427744d;
        ol5.e eVar = this.f427746f;
        if (i17 == eVar.f427753d.getMeasuredWidth() && this.f427745e == eVar.f427753d.getMeasuredHeight()) {
            return;
        }
        eVar.b();
        this.f427744d = eVar.f427753d.getMeasuredWidth();
        this.f427745e = eVar.f427753d.getMeasuredHeight();
    }
}
