package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class g1 implements android.widget.AdapterView.OnItemSelectedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.ListPopupWindow f9587d;

    public g1(androidx.appcompat.widget.ListPopupWindow listPopupWindow) {
        this.f9587d = listPopupWindow;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        androidx.appcompat.widget.b1 b1Var;
        if (i17 == -1 || (b1Var = this.f9587d.f9419f) == null) {
            return;
        }
        b1Var.setListSelectionHidden(false);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(android.widget.AdapterView adapterView) {
    }
}
