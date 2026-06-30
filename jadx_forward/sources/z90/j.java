package z90;

/* loaded from: classes4.dex */
public class j implements com.p314xaae8f345.mm.p944x882e457a.j1 {
    @Override // com.p314xaae8f345.mm.p944x882e457a.j1
    /* renamed from: onSceneEnd */
    public void mo10099x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (gm0.j1.a()) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = java.lang.Integer.valueOf(m1Var == null ? -1 : m1Var.mo808xfb85f7b0());
            objArr[1] = java.lang.Integer.valueOf(i17);
            objArr[2] = java.lang.Integer.valueOf(i18);
            objArr[3] = str;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubCoreBaseMonitor", "summerhv onIDKeyCallback onSceneEnd[%d][%d, %d, %s]", objArr);
            if (i17 == 0 && i18 == 0) {
                ((ku5.t0) ku5.t0.f394148d).g(new z90.i(this));
            }
        }
    }
}
