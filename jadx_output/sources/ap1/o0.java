package ap1;

/* loaded from: classes5.dex */
public final class o0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public em.c4 f12710d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f12711e;

    /* renamed from: f, reason: collision with root package name */
    public ap1.l0 f12712f;

    /* renamed from: g, reason: collision with root package name */
    public j75.f f12713g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        java.lang.String[] stringArrayExtra;
        super.onActivityResult(i17, i18, intent);
        if (intent == null || i17 != 126 || i18 != -1 || (stringArrayExtra = intent.getStringArrayExtra("Select_Contact")) == null) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet(kz5.b1.d(stringArrayExtra.length));
        kz5.z.u0(stringArrayExtra, hashSet);
        j75.f fVar = this.f12713g;
        if (fVar == null) {
            fVar = Q6();
            this.f12713g = fVar;
        }
        if (fVar == null) {
            return;
        }
        ap1.c2 c2Var = (ap1.c2) fVar.getState();
        if (hashSet.size() == c2Var.f12630n.size()) {
            return;
        }
        if (hashSet.isEmpty()) {
            fVar.B3(new ap1.g2(false, null, 2, null));
            return;
        }
        java.util.List<ap1.a0> list = c2Var.f12629m;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (ap1.a0 a0Var : list) {
            hashMap.put(a0Var.f12600a, a0Var);
        }
        java.util.Iterator it = kz5.q1.g(c2Var.f12630n, hashSet).iterator();
        while (it.hasNext()) {
            java.lang.Object obj = hashMap.get((java.lang.String) it.next());
            kotlin.jvm.internal.o.d(obj);
            fVar.B3(new ap1.h2(false, (ap1.a0) obj, null, 4, null));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f12710d = new em.c4(getRootView());
        j75.f fVar = this.f12713g;
        if (fVar == null) {
            fVar = Q6();
            this.f12713g = fVar;
        }
        if (fVar != null) {
            fVar.L2(getActivity(), new ap1.m0(this));
        }
        em.c4 c4Var = this.f12710d;
        if (c4Var == null) {
            kotlin.jvm.internal.o.o("uiBinding");
            throw null;
        }
        if (c4Var.f254184i == null) {
            c4Var.f254184i = (android.widget.ImageView) c4Var.f254176a.findViewById(com.tencent.mm.R.id.sga);
        }
        c4Var.f254184i.setOnClickListener(new ap1.n0(this));
    }
}
