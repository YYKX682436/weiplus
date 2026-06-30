package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class z1 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f9746d;

    public z1(androidx.appcompat.widget.SearchView searchView) {
        this.f9746d = searchView;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        this.f9746d.s();
        return true;
    }
}
