package tj5;

/* loaded from: classes8.dex */
public class a implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 f501365d;

    public a(com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381) {
        this.f501365d = c22479x68a26381;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 c22479x68a26381 = this.f501365d;
        tj5.n nVar = c22479x68a26381.E;
        if (nVar != null) {
            nVar.U1(z17);
        }
        c22479x68a26381.l(z17);
    }
}
