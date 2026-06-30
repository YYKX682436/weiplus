package w00;

/* loaded from: classes8.dex */
public final class b implements t00.s0 {
    @Override // t00.s0
    public t00.m a() {
        t00.m mVar = t00.n.f495853a;
        return t00.n.I;
    }

    @Override // t00.s0
    public java.lang.String b(int i17, android.content.Context context, org.json.JSONObject data, c00.p3 actionReturn) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionReturn, "actionReturn");
        boolean Vi = ((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Vi();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetEcsSectionActionSync", "handleAction: " + data + ",switchOn:" + Vi);
        if (!Vi) {
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.i) actionReturn).a(null);
        }
        x02.h Bi = ((g20.g) ((c00.x3) i95.n0.c(c00.x3.class))).Bi();
        if (Bi == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetEcsSectionActionSync", "orderAndCardCgiMgr is null");
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.i) actionReturn).a(null);
        }
        t00.y yVar = t00.a0.f495795a;
        bw5.z7 a17 = yVar.a(data);
        if (a17 == null || a17.f117379f.isEmpty()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reqScene:");
            sb6.append(a17 != null ? java.lang.Integer.valueOf(a17.f117378e) : null);
            sb6.append(" section list isEmpty");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetEcsSectionActionSync", sb6.toString());
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.i) actionReturn).a(null);
        }
        long c17 = c01.id.c();
        byte[] mo14344x5f01b1f6 = a17.mo14344x5f01b1f6();
        long m105978x2737f10 = ((x02.i) Bi).m105978x2737f10();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
        byte[] m169979x21ba69f2 = p3380x6a61f93.p3384xf5161200.C30567x21b1f1a0.m169979x21ba69f2(m105978x2737f10, mo14344x5f01b1f6);
        bw5.i9 i9Var = m169979x21ba69f2 != null ? (bw5.i9) x02.a.a(m169979x21ba69f2, new bw5.i9()) : null;
        if (i9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GetEcsSectionActionSync", "resp is null");
            return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.i) actionReturn).a(null);
        }
        org.json.JSONObject b17 = yVar.b(i9Var, c17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetEcsSectionActionSync", "reqScene:" + a17.f117378e + " onSuccess, result count: " + i9Var.f110034d.size() + ',' + i9Var.f110035e);
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.ecs.p1085x60b7c31.i) actionReturn).b(b17);
    }
}
