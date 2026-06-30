package fn4;

/* loaded from: classes15.dex */
public class z implements in4.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.xn6 f346161a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f346162b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e f346163c;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e abstractActivityC18755xab3fd75e, r45.xn6 xn6Var, int i17) {
        this.f346163c = abstractActivityC18755xab3fd75e;
        this.f346161a = xn6Var;
        this.f346162b = i17;
    }

    @Override // in4.g
    public void a(java.util.Set set) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "popupWindow commit");
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e abstractActivityC18755xab3fd75e = this.f346163c;
        db5.t7.m123882x26a183b(abstractActivityC18755xab3fd75e.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.f574925k06, 0).show();
        pm4.y.a(abstractActivityC18755xab3fd75e.f256668o, this.f346161a, set, abstractActivityC18755xab3fd75e.K.e());
        abstractActivityC18755xab3fd75e.f256659J.m();
        fn4.z0 z0Var = abstractActivityC18755xab3fd75e.K;
        int i17 = this.f346162b;
        z0Var.o(i17);
        if (abstractActivityC18755xab3fd75e.K.e() == 0) {
            abstractActivityC18755xab3fd75e.finish();
            return;
        }
        if (!abstractActivityC18755xab3fd75e.U) {
            fn4.e eVar = abstractActivityC18755xab3fd75e.f256671r;
            eVar.m8155x27702c4(i17 + eVar.z());
            abstractActivityC18755xab3fd75e.f256675v.m8146xced61ae5();
        } else {
            fn4.e eVar2 = abstractActivityC18755xab3fd75e.f256675v;
            eVar2.m8155x27702c4(i17 + eVar2.z());
            abstractActivityC18755xab3fd75e.f256671r.m8146xced61ae5();
            abstractActivityC18755xab3fd75e.f256673t.mo7976xc291bbd2(0, 3);
        }
    }

    @Override // in4.g
    /* renamed from: onDismiss */
    public void mo129855xb349b3ab() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryBaseVideoUI", "popupWindow dismiss");
        com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2308x6b0147b.AbstractActivityC18755xab3fd75e abstractActivityC18755xab3fd75e = this.f346163c;
        if (abstractActivityC18755xab3fd75e.N) {
            abstractActivityC18755xab3fd75e.f256659J.k();
            abstractActivityC18755xab3fd75e.N = false;
            if (abstractActivityC18755xab3fd75e.U) {
                try {
                    ((gn4.c0) abstractActivityC18755xab3fd75e.f256659J.f346107c.mo129842x143e7d6c()).y();
                } catch (java.lang.Exception unused) {
                }
            }
        }
    }
}
