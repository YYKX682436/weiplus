package mr1;

/* loaded from: classes11.dex */
public final class a implements wn.b {
    @Override // wn.b
    public java.util.List a(int i17) {
        nr1.f fVar = (nr1.f) c();
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr = tk.s.f501403d;
        return d(fVar.J0(jr1.j.c(((ox.r) d0Var).Bi(2).c()), 0, i17, 60));
    }

    @Override // wn.b
    public java.util.List b() {
        nr1.f fVar = (nr1.f) c();
        rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
        tk.s[] sVarArr = tk.s.f501403d;
        return d(fVar.J0(jr1.j.c(((ox.r) d0Var).Bi(2).c()), 0, 0, 15));
    }

    @Override // wn.b
    public l75.n0 c() {
        nr1.f Vi = yq1.u0.Vi();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Vi, "getBizPhotoFansConversationStorage(...)");
        return Vi;
    }

    public final java.util.List d(java.util.List list) {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_fans_greet_box_enable, 0) == 1) {
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            java.lang.String str = ((hr1.e) obj).f66326xbed8694c;
            if (!(!(str == null || str.length() == 0) && (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "bizfansgreetholder@bizfansmsg") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "bizphotofansgreetholder@picfansmsg")))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
