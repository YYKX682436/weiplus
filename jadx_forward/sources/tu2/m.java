package tu2;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final tu2.m f503679d = new tu2.m();

    public m() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        qb2.x1 x1Var = new qb2.x1();
        x1Var.f65985x114ef53e = c01.z1.r();
        qb2.t a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t80.f209599e.a();
        a17.f65868x114ef53e = c01.z1.r();
        for (int i17 = 0; i17 < 50001; i17++) {
            x1Var.f65984xbed8694c = c01.id.a() + '_' + i17 + "@findermsg";
            a17.f65866xbed8694c = c01.id.a() + '_' + i17 + "@findermsg";
            if (i17 % 2 == 0) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                g92.b bVar = g92.b.f351302e;
                sb6.append(bVar.T0());
                sb6.append('_');
                sb6.append(i17);
                x1Var.f65985x114ef53e = sb6.toString();
                a17.f65868x114ef53e = bVar.T0() + '_' + i17;
            } else {
                x1Var.f65985x114ef53e = c01.z1.r() + '_' + i17;
                a17.f65868x114ef53e = c01.z1.r() + '_' + i17;
            }
            boolean mo880xb970c2b9 = ((c61.l7) i95.n0.c(c61.l7.class)).pk().mo880xb970c2b9(x1Var);
            boolean mo880xb970c2b92 = ((c61.l7) i95.n0.c(c61.l7.class)).Kj().mo880xb970c2b9(a17);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
            sb7.append(i17);
            sb7.append(',');
            sb7.append(mo880xb970c2b9);
            sb7.append(' ');
            sb7.append(mo880xb970c2b92);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FINDER_INSERT_10W_FAKE_SESSIONINFO", sb7.toString());
        }
        return jz5.f0.f384359a;
    }
}
