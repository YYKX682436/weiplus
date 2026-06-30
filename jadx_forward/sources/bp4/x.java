package bp4;

/* loaded from: classes5.dex */
public final class x extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f104949f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayList f104950g;

    /* renamed from: h, reason: collision with root package name */
    public bp4.q f104951h;

    /* renamed from: i, reason: collision with root package name */
    public long f104952i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.p f104953m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recycler, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recycler, "recycler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f104949f = recycler;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f104950g = arrayList;
        recycler.m7963x830bc99d(true);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(recycler.getContext());
        c1162x665295de.Q(0);
        c1162x665295de.m8091xc21abdf5(true);
        recycler.mo7967x900dcbe1(c1162x665295de);
        recycler.m7964x8d4ad49c(new p012xc85e97e9.p103xe821e364.p104xd1075a44.z());
        recycler.N(new bp4.v(this));
        bp4.q qVar = new bp4.q(this);
        this.f104951h = qVar;
        qVar.E(arrayList);
        bp4.q qVar2 = this.f104951h;
        if (qVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        new p012xc85e97e9.p103xe821e364.p104xd1075a44.g1(new bp4.t(this, qVar2)).d(recycler);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var = this.f104951h;
        if (f2Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        recycler.mo7960x6cab2c8d(f2Var);
        bp4.q qVar3 = this.f104951h;
        if (qVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        qVar3.f332455e = new bp4.w(this);
        recycler.setVisibility(0);
    }

    public final void A(int i17) {
        java.util.ArrayList arrayList = this.f104950g;
        boolean z17 = false;
        if (i17 >= 0 && i17 < arrayList.size()) {
            z17 = true;
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 abstractC15633xee433078 = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) arrayList.get(i17);
            this.f104952i = abstractC15633xee433078.f219967i;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putParcelable("PARAM_VLOG_MULTI_IMAGE_SELECT_VALUE", abstractC15633xee433078);
            this.f546865d.w(ju3.c0.f383405d2, bundle);
        }
    }

    public final void B(java.util.ArrayList list) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditFooterRecyclerPlugin", "updateList = " + list.size());
        java.util.ArrayList arrayList = this.f104950g;
        arrayList.clear();
        arrayList.addAll(list);
        bp4.q qVar = this.f104951h;
        if (qVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        qVar.E(arrayList);
        bp4.q qVar2 = this.f104951h;
        if (qVar2 != null) {
            qVar2.m8146xced61ae5();
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        bp4.q qVar = this.f104951h;
        if (qVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        int size = qVar.f332454d.size();
        qVar.f332454d.clear();
        qVar.m8154xdb81fc7f(0, size);
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f104949f.setVisibility(i17);
    }

    public final int z() {
        int i17 = 0;
        for (java.lang.Object obj : this.f104950g) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) obj).f219967i == this.f104952i) {
                return i17;
            }
            i17 = i18;
        }
        return 0;
    }
}
