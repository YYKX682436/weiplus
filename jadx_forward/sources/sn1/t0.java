package sn1;

/* loaded from: classes12.dex */
public class t0 extends sn1.i {

    /* renamed from: u, reason: collision with root package name */
    public final wn1.q f491633u;

    /* renamed from: v, reason: collision with root package name */
    public final wn1.r f491634v;

    public t0(java.lang.String str) {
        wn1.q qVar = new wn1.q();
        this.f491633u = qVar;
        this.f491634v = new wn1.r();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupStartScene", "BackupStartScene, id[%s]", str);
        qVar.f528986d = str;
    }

    @Override // sn1.i
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f M() {
        return this.f491633u;
    }

    @Override // sn1.i
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f N() {
        return this.f491634v;
    }

    @Override // sn1.i
    public void P(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupStartScene", "onSceneEnd.");
        int i18 = this.f491634v.f528997g;
        if (i18 != 0) {
            J(4, i18, "BackupStartScene onSceneEnd failed");
        } else {
            J(0, i18, "BackupStartScene onSceneEnd success");
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.m1
    /* renamed from: getType */
    public int mo808xfb85f7b0() {
        return 3;
    }
}
