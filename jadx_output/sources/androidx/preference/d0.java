package androidx.preference;

/* loaded from: classes13.dex */
public class d0 extends n3.c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.preference.e0 f11807e;

    public d0(androidx.preference.e0 e0Var) {
        this.f11807e = e0Var;
    }

    @Override // n3.c
    public void onInitializeAccessibilityNodeInfo(android.view.View view, o3.l lVar) {
        androidx.preference.Preference y17;
        androidx.preference.e0 e0Var = this.f11807e;
        e0Var.f11809h.onInitializeAccessibilityNodeInfo(view, lVar);
        int u07 = e0Var.f11808g.u0(view);
        androidx.recyclerview.widget.f2 adapter = e0Var.f11808g.getAdapter();
        if ((adapter instanceof androidx.preference.x) && (y17 = ((androidx.preference.x) adapter).y(u07)) != null) {
            y17.y(lVar);
        }
    }

    @Override // n3.c
    public boolean performAccessibilityAction(android.view.View view, int i17, android.os.Bundle bundle) {
        return this.f11807e.f11809h.performAccessibilityAction(view, i17, bundle);
    }
}
