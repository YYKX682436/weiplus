package ej2;

/* loaded from: classes10.dex */
public final class l implements si2.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ej2.n f334847a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gk2.e f334848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.View f334849c;

    public l(ej2.n nVar, gk2.e eVar, android.view.View view) {
        this.f334847a = nVar;
        this.f334848b = eVar;
        this.f334849c = view;
    }

    @Override // si2.c
    public void b(int i17, km2.q hungupUser) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(hungupUser, "hungupUser");
        if (i17 != -1) {
            ej2.n nVar = this.f334847a;
            if (i17 < nVar.a().mo1894x7e414b06()) {
                hungupUser.z();
                ((mm2.o4) this.f334848b.a(mm2.o4.class)).O7(hungupUser);
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.u7) nVar.f334851o).b(hungupUser);
                nVar.a().m8147xed6e4d18(i17);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // si2.c
    public void c(int i17, km2.q selectedUser) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedUser, "selectedUser");
        ej2.n nVar = this.f334847a;
        java.util.Iterator it = nVar.f334842l.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            km2.q qVar = ((vi2.i) next).f519085d;
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(qVar != null ? qVar.f390703a : null, selectedUser.f390703a)) {
                str = next;
                break;
            }
        }
        if (str == null) {
            android.view.View view = this.f334849c;
            db5.t7.m123883x26a183b(view.getContext(), view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dnn), 0).show();
            return;
        }
        gk2.e eVar = nVar.f334832b;
        if (eVar == null || !(((mm2.y2) eVar.a(mm2.y2.class)).O6(true) ^ true)) {
            int j17 = nVar.a().j(selectedUser);
            yh2.k a17 = nVar.a();
            nVar.getClass();
            if (j17 == -1 || j17 >= a17.mo1894x7e414b06()) {
                return;
            }
            selectedUser.z();
            gk2.e eVar2 = nVar.f334832b;
            if (eVar2 != null) {
                ((mm2.o4) eVar2.a(mm2.o4.class)).O7(selectedUser);
            }
            zh2.e eVar3 = nVar.f334851o;
            if (eVar3 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.u7) eVar3).a(selectedUser);
            }
            a17.m8147xed6e4d18(j17);
        }
    }
}
