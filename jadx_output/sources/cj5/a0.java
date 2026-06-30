package cj5;

/* loaded from: classes.dex */
public final class a0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f42061d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.storage.a3 f42062e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f42063f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f42061d = "";
        this.f42063f = jz5.h.b(new cj5.z(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public boolean onClickDialogSpaceOnHalfScreenMode() {
        return false;
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        j75.f stateCenter;
        j75.f stateCenter2;
        getIntent().getStringExtra("msgQuoteName");
        java.lang.String stringExtra = getIntent().getStringExtra("chatroomName");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f42061d = stringExtra;
        this.f42062e = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f42061d);
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0();
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P6 = P6();
        if (P6 != null && (stateCenter2 = P6.getStateCenter()) != null) {
            stateCenter2.L2(getActivity(), new cj5.x(this, h0Var));
        }
        com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity P62 = P6();
        if (P62 == null || (stateCenter = P62.getStateCenter()) == null) {
            return;
        }
        stateCenter.z3(getActivity(), new cj5.y(this));
    }
}
