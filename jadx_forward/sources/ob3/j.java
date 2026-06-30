package ob3;

/* loaded from: classes5.dex */
public class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ob3.k f425596d;

    public j(ob3.k kVar) {
        this.f425596d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ob3.k kVar = this.f425596d;
        kVar.f425600g.m66045xd46dd964();
        ((android.view.inputmethod.InputMethodManager) kVar.f425600g.mo55332x76847179().getSystemService("input_method")).showSoftInput(kVar.f425599f, 0);
    }
}
