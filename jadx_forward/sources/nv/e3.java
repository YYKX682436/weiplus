package nv;

/* loaded from: classes11.dex */
public class e3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5714xc4ebffe7 f421854d;

    public e3(nv.f3 f3Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5714xc4ebffe7 c5714xc4ebffe7) {
        this.f421854d = c5714xc4ebffe7;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5714xc4ebffe7 c5714xc4ebffe7 = this.f421854d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BackupCore", "receive msgSynchronizeStartEvent run userCloseMsgSync[%b]", java.lang.Boolean.valueOf(c5714xc4ebffe7.f136035g.f90105c));
        am.zj zjVar = c5714xc4ebffe7.f136035g;
        if (zjVar.f90105c) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(466L, 13L, 1L, false);
            return;
        }
        byte[] bArr = zjVar.f90103a;
        if (bArr == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BackupCore", "msgsynchronize loginconfirmok key is null!");
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.mo68477x336bdfd8(466L, 14L, 1L, false);
            return;
        }
        int i17 = zjVar.f90104b;
        vi3.k kVar = vi3.k.f519134f;
        if (kVar == null) {
            vi3.k.f519134f = new vi3.k();
        } else {
            kVar.a();
            vi3.k.f519134f = new vi3.k();
        }
        vi3.k kVar2 = vi3.k.f519134f;
        java.lang.String str = zjVar.f90106d;
        kVar2.f519136b = i17;
        kVar2.d("afterLogin", "", bArr, str);
    }
}
