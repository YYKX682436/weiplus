package al5;

/* loaded from: classes14.dex */
public class m1 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fl5.g f87486d;

    public m1(com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017, fl5.g gVar) {
        this.f87486d = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (textView instanceof fl5.i) {
            return this.f87486d.a((fl5.i) textView, i17, keyEvent);
        }
        return false;
    }
}
