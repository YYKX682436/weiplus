package bs3;

/* loaded from: classes.dex */
public final class l extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f24000d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f24001e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f24000d = jz5.h.b(new bs3.i(this));
        this.f24001e = jz5.h.b(new bs3.k(this));
    }

    public final com.tencent.mm.plugin.profile.ui.widget.SayHiItemView O6() {
        return (com.tencent.mm.plugin.profile.ui.widget.SayHiItemView) ((jz5.n) this.f24000d).getValue();
    }

    public final void P6() {
        int size;
        com.tencent.mm.plugin.profile.ui.widget.SayHiItemView O6 = O6();
        if (O6 == null) {
            return;
        }
        jz5.g gVar = this.f24001e;
        if (((java.lang.String) ((jz5.n) gVar).getValue()) == null) {
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.MMActivity mMActivity = activity instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) activity : null;
        if (mMActivity == null) {
            return;
        }
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n((java.lang.String) ((jz5.n) gVar).getValue(), true);
        com.tencent.mm.plugin.profile.n2 n2Var = com.tencent.mm.plugin.profile.n2.f153540a;
        int i17 = 0;
        if (n17 != null && (size = n2Var.e(n17.d1()).size()) > 0) {
            i17 = size;
        }
        if (i17 <= 0) {
            O6.setContent(null);
            return;
        }
        java.lang.String string = mMActivity.getString(com.tencent.mm.R.string.oce, java.lang.Integer.valueOf(i17));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        O6.setContent(string);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        if (i17 == 104) {
            P6();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        if (O6() == null) {
            return;
        }
        if (com.tencent.mm.storage.z3.m4((java.lang.String) ((jz5.n) this.f24001e).getValue())) {
            com.tencent.mm.plugin.profile.ui.widget.SayHiItemView O6 = O6();
            if (O6 == null) {
                return;
            }
            O6.setVisibility(8);
            return;
        }
        P6();
        com.tencent.mm.plugin.profile.ui.widget.SayHiItemView O62 = O6();
        if (O62 != null) {
            O62.setOnClickListener(new bs3.j(this));
        }
    }
}
