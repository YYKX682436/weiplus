package ap1;

/* loaded from: classes5.dex */
public final class o0 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public em.c4 f94243d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f94244e;

    /* renamed from: f, reason: collision with root package name */
    public ap1.l0 f94245f;

    /* renamed from: g, reason: collision with root package name */
    public j75.f f94246g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onActivityResult */
    public void mo2273x9d4787cb(int i17, int i18, android.content.Intent intent) {
        java.lang.String[] stringArrayExtra;
        super.mo2273x9d4787cb(i17, i18, intent);
        if (intent == null || i17 != 126 || i18 != -1 || (stringArrayExtra = intent.getStringArrayExtra("Select_Contact")) == null) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet(kz5.b1.d(stringArrayExtra.length));
        kz5.z.u0(stringArrayExtra, hashSet);
        j75.f fVar = this.f94246g;
        if (fVar == null) {
            fVar = Q6();
            this.f94246g = fVar;
        }
        if (fVar == null) {
            return;
        }
        ap1.c2 c2Var = (ap1.c2) fVar.mo140437x75286adb();
        if (hashSet.size() == c2Var.f94163n.size()) {
            return;
        }
        if (hashSet.isEmpty()) {
            fVar.B3(new ap1.g2(false, null, 2, null));
            return;
        }
        java.util.List<ap1.a0> list = c2Var.f94162m;
        java.util.HashMap hashMap = new java.util.HashMap();
        for (ap1.a0 a0Var : list) {
            hashMap.put(a0Var.f94133a, a0Var);
        }
        java.util.Iterator it = kz5.q1.g(c2Var.f94163n, hashSet).iterator();
        while (it.hasNext()) {
            java.lang.Object obj = hashMap.get((java.lang.String) it.next());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            fVar.B3(new ap1.h2(false, (ap1.a0) obj, null, 4, null));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f94243d = new em.c4(m80380x71e92c1d());
        j75.f fVar = this.f94246g;
        if (fVar == null) {
            fVar = Q6();
            this.f94246g = fVar;
        }
        if (fVar != null) {
            fVar.L2(m158354x19263085(), new ap1.m0(this));
        }
        em.c4 c4Var = this.f94243d;
        if (c4Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        if (c4Var.f335717i == null) {
            c4Var.f335717i = (android.widget.ImageView) c4Var.f335709a.findViewById(com.p314xaae8f345.mm.R.id.sga);
        }
        c4Var.f335717i.setOnClickListener(new ap1.n0(this));
    }
}
