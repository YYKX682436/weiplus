package s23;

/* loaded from: classes4.dex */
public final class b implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public static final s23.b f483831d = new s23.b();

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        p012xc85e97e9.p093xedfae76a.j0 j0Var;
        java.lang.Integer num = (java.lang.Integer) obj;
        p012xc85e97e9.p093xedfae76a.i0 i0Var = s23.n.f483852q;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(num, i0Var.mo3195x754a37bb())) {
            return;
        }
        i0Var.mo523x53d8522f(num);
        java.util.Iterator it = s23.n.f483844f.iterator();
        while (it.hasNext()) {
            s23.x xVar = (s23.x) s23.n.f483843e.get((s23.o) it.next());
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b((xVar == null || (j0Var = xVar.f483884o) == null) ? null : (java.lang.Integer) j0Var.mo3195x754a37bb(), num)) {
                if (xVar != null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                    int intValue = num.intValue();
                    s23.a[] aVarArr = s23.a.f483830d;
                    if (intValue == 2) {
                        android.widget.ImageButton imageButton = xVar.f483879g;
                        if (imageButton != null) {
                            imageButton.setSelected(true);
                        }
                        android.widget.ImageButton imageButton2 = xVar.f483879g;
                        if (imageButton2 != null) {
                            imageButton2.setEnabled(false);
                        }
                        android.widget.TextView textView = xVar.f483880h;
                        if (textView != null) {
                            textView.setClickable(false);
                        }
                        xVar.f483883n = 2;
                    } else if (intValue == 1) {
                        android.widget.ImageButton imageButton3 = xVar.f483879g;
                        if (imageButton3 != null) {
                            imageButton3.setSelected(true);
                        }
                        android.widget.ImageButton imageButton4 = xVar.f483879g;
                        if (imageButton4 != null) {
                            imageButton4.setEnabled(true);
                        }
                        android.widget.TextView textView2 = xVar.f483880h;
                        if (textView2 != null) {
                            textView2.setClickable(true);
                        }
                        xVar.f483883n = 1;
                    } else {
                        android.widget.ImageButton imageButton5 = xVar.f483879g;
                        if (imageButton5 != null) {
                            imageButton5.setSelected(false);
                        }
                        android.widget.ImageButton imageButton6 = xVar.f483879g;
                        if (imageButton6 != null) {
                            imageButton6.setEnabled(true);
                        }
                        android.widget.TextView textView3 = xVar.f483880h;
                        if (textView3 != null) {
                            textView3.setClickable(true);
                        }
                    }
                }
                p012xc85e97e9.p093xedfae76a.j0 j0Var2 = xVar != null ? xVar.f483884o : null;
                if (j0Var2 != null) {
                    j0Var2.mo523x53d8522f(num);
                }
            }
        }
        ((s23.m) s23.n.f483860y).mo152xb9724478();
    }
}
