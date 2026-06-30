package wj1;

/* loaded from: classes14.dex */
public class b implements android.widget.CompoundButton.OnCheckedChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.C12701xfb956a00 f528106a;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2.C12701xfb956a00 c12701xfb956a00) {
        this.f528106a = c12701xfb956a00;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(android.widget.CompoundButton compoundButton, boolean z17) {
        android.widget.Button button = this.f528106a.f171057o;
        if (button != null) {
            button.setEnabled(z17);
        }
    }
}
