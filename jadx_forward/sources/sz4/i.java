package sz4;

/* loaded from: classes12.dex */
public class i extends sz4.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f495731f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f495732g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.LinearLayout f495733h;

    public i(android.view.View view, mz4.j0 j0Var, mz4.d dVar) {
        super(view, j0Var, dVar);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.kek);
        this.f495733h = linearLayout;
        linearLayout.setVisibility(0);
        this.f495731f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.kem);
        this.f495732g = view.findViewById(com.p314xaae8f345.mm.R.id.kel);
    }

    @Override // sz4.a
    public int i() {
        return -3;
    }

    @Override // sz4.a
    public void j(iz4.c cVar, int i17, int i18) {
        if (cVar.d() != -3) {
            return;
        }
        int i19 = this.f495715d.f414842q;
        android.widget.LinearLayout linearLayout = this.f495733h;
        if (i19 == 3) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        iz4.e eVar = (iz4.e) cVar;
        if (eVar.f377649t <= 0) {
            return;
        }
        android.widget.TextView textView = this.f495731f;
        android.content.Context context = textView.getContext();
        long j17 = eVar.f377649t;
        java.lang.Object format = j17 < 3600000 ? "" : android.text.format.DateFormat.format(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.cbf), j17);
        textView.setText(textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.h_q) + " " + format);
    }
}
