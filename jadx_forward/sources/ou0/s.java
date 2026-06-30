package ou0;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public zu0.j f430441a;

    public final void a(boolean z17, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4187xe514cceb c4187xe514cceb) {
        zu0.j jVar;
        android.view.View view;
        android.view.ViewGroup viewGroup;
        java.lang.String P0;
        android.view.View view2;
        if (z17) {
            zu0.j jVar2 = this.f430441a;
            if (jVar2 == null || (view2 = jVar2.f557213a) == null) {
                return;
            }
            android.view.ViewParent parent = view2.getParent();
            viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view2);
                return;
            }
            return;
        }
        boolean z18 = false;
        if (c4187xe514cceb != null && (P0 = c4187xe514cceb.P0()) != null) {
            if (P0.length() > 0) {
                z18 = true;
            }
        }
        if (!z18 || (jVar = this.f430441a) == null || (view = jVar.f557213a) == null) {
            return;
        }
        android.view.ViewParent parent2 = view.getParent();
        viewGroup = parent2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent2 : null;
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }
}
