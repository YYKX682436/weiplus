package tj5;

/* loaded from: classes10.dex */
public class h implements android.view.ViewTreeObserver.OnWindowFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tj5.i f501376a;

    public h(tj5.i iVar) {
        this.f501376a = iVar;
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public void onWindowFocusChanged(boolean z17) {
        tj5.i iVar = this.f501376a;
        if (z17) {
            iVar.f501377d.s();
        }
        iVar.f501377d.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
    }
}
