package pk2;

/* loaded from: classes3.dex */
public final class r8 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.d9 f437751d;

    public r8(pk2.d9 d9Var) {
        this.f437751d = d9Var;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        g4Var.clear();
        pk2.d9 d9Var = this.f437751d;
        java.util.Iterator it = d9Var.f437204n.iterator();
        while (it.hasNext()) {
            ((qk2.h) it.next()).w(g4Var);
        }
        if (g4Var.z()) {
            pk2.c7 c7Var = d9Var.f437195e;
            android.widget.TextView textView = c7Var != null ? c7Var.f437162l : null;
            if (textView != null) {
                textView.setVisibility(8);
            }
            pk2.c7 c7Var2 = d9Var.f437195e;
            c1163xf1deaba4 = c7Var2 != null ? c7Var2.f437158h : null;
            if (c1163xf1deaba4 == null) {
                return;
            }
            c1163xf1deaba4.setVisibility(8);
            return;
        }
        pk2.c7 c7Var3 = d9Var.f437195e;
        android.widget.TextView textView2 = c7Var3 != null ? c7Var3.f437162l : null;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
        pk2.c7 c7Var4 = d9Var.f437195e;
        c1163xf1deaba4 = c7Var4 != null ? c7Var4.f437158h : null;
        if (c1163xf1deaba4 == null) {
            return;
        }
        c1163xf1deaba4.setVisibility(0);
    }
}
