package qd2;

/* loaded from: classes10.dex */
public final class y0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qd2.g1 f443388a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f443389b;

    public y0(qd2.g1 g1Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var) {
        this.f443388a = g1Var;
        this.f443389b = z2Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.p3
    public final void a() {
        qd2.g1 g1Var = this.f443388a;
        g1Var.f443294o = true;
        g1Var.f443295p = true;
        android.widget.CheckBox checkBox = g1Var.f443286g;
        if (checkBox != null) {
            checkBox.setChecked(true);
        }
        this.f443389b.B();
        y9.i iVar = g1Var.f443287h;
        if (iVar != null) {
            iVar.dismiss();
        }
        yz5.a aVar = g1Var.f443297r;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
