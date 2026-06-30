package up3;

/* loaded from: classes.dex */
public class x implements com.p314xaae8f345.mm.app.g3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f511384a;

    public x(boolean z17) {
        this.f511384a = z17;
    }

    @Override // com.p314xaae8f345.mm.app.g3
    public void a(java.lang.String str) {
        d(str);
    }

    @Override // com.p314xaae8f345.mm.app.g3
    public void b(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(up3.d0.f511356d, "Upload canceled(%s, %s)", java.lang.Integer.valueOf(i17), str);
    }

    @Override // com.p314xaae8f345.mm.app.g3
    public void c(java.lang.String str, int i17, long j17, long j18) {
        if (i17 == 100) {
            d(str);
        }
    }

    public final void d(java.lang.String str) {
        if (str == null || !this.f511384a) {
            return;
        }
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        boolean z17 = false;
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (m17.a() && m17.f294799a.d(m17.f294800b)) {
            z17 = true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(up3.d0.f511356d, "Delete file %s, res: %s", str, java.lang.Boolean.valueOf(z17));
    }
}
