package lz2;

/* loaded from: classes9.dex */
public class k extends lz2.n {

    /* renamed from: f, reason: collision with root package name */
    public boolean f403873f;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.ActivityC15521xdb435b6d activityC15521xdb435b6d) {
        super(activityC15521xdb435b6d);
        this.f403873f = true;
        re4.n.f476076a = 1;
    }

    @Override // lz2.n
    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdAuthUI", "do prepare ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.ActivityC15521xdb435b6d activityC15521xdb435b6d = this.f403879d;
        activityC15521xdb435b6d.m83137x918cb44a();
        this.f403877b.a(activityC15521xdb435b6d, new lz2.j(this), this.f403880e);
    }

    @Override // lz2.n
    public int c() {
        return 0;
    }

    @Override // lz2.n
    public boolean d() {
        return false;
    }

    @Override // lz2.n
    public void e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdAuthUI", "do verify face id");
        a();
    }

    @Override // lz2.n
    public void g() {
        j(false);
    }

    @Override // lz2.n
    public void h() {
        j(false);
    }

    @Override // lz2.n
    public boolean i(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (this.f403877b.mo148635x76e0bfae(i17, i18, str, m1Var)) {
            return true;
        }
        if (!(m1Var instanceof ss4.e0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.p1694xb393c038.p1695x2ddda8.ActivityC15521xdb435b6d activityC15521xdb435b6d = this.f403879d;
        activityC15521xdb435b6d.m83114xe5d7a18f();
        j(true);
        if (this.f403873f) {
            dp.a.m125853x26a183b(activityC15521xdb435b6d, com.p314xaae8f345.mm.R.C30867xcad56011.f_l, 0).show();
        }
        return true;
    }

    public final void j(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WalletFaceIdAuthUI", "do end process");
        android.os.Bundle bundle = new android.os.Bundle();
        if (z17) {
            bundle.putInt("key_process_result_code", -1);
        }
        com.p314xaae8f345.mm.p2802xd031a825.a.c(this.f403879d, bundle, 0);
    }
}
