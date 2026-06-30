package s23;

/* loaded from: classes4.dex */
public final class c implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final s23.c f483832d = new s23.c();

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        java.lang.String str = (java.lang.String) obj;
        p012xc85e97e9.p093xedfae76a.i0 i0Var = s23.n.f483853r;
        if (str.equals(i0Var.mo3195x754a37bb())) {
            return;
        }
        i0Var.mo523x53d8522f(str);
        java.util.Iterator it = s23.n.f483844f.iterator();
        while (it.hasNext()) {
            s23.x xVar = (s23.x) s23.n.f483843e.get((s23.o) it.next());
            if (!r26.i0.q((xVar == null || (j0Var = xVar.f483885p) == null) ? null : (java.lang.String) j0Var.mo3195x754a37bb(), str, false, 2, null)) {
                if (xVar != null) {
                    int i17 = str.length() == 0 ? 8 : 0;
                    android.widget.TextView textView = xVar.f483882m;
                    if (textView != null) {
                        textView.setText(str);
                    }
                    if (xVar.f483876d.a()) {
                        android.widget.LinearLayout linearLayout = xVar.f483881i;
                        if (linearLayout != null) {
                            linearLayout.setVisibility(i17);
                        }
                    } else {
                        android.widget.LinearLayout linearLayout2 = xVar.f483881i;
                        if (linearLayout2 != null) {
                            linearLayout2.setVisibility(8);
                        }
                    }
                }
                p012xc85e97e9.p093xedfae76a.j0 j0Var2 = xVar != null ? xVar.f483885p : null;
                if (j0Var2 != null) {
                    j0Var2.mo523x53d8522f(str);
                }
            }
        }
    }
}
