package w11;

/* loaded from: classes12.dex */
public class w extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public final r45.tc f523689a = new r45.tc();

    /* renamed from: b, reason: collision with root package name */
    public int f523690b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f523691c;

    @Override // o45.xg
    /* renamed from: getFuncId */
    public int mo13851x19c9adf5() {
        return this.f523690b;
    }

    @Override // o45.zg, o45.xg
    /* renamed from: isAxAuth */
    public boolean mo150600xd46d5c49() {
        return true;
    }

    @Override // o45.xg
    /* renamed from: toProtoBuf */
    public byte[] mo13852xc3d7db06() {
        r45.he a17 = o45.bh.a(this);
        r45.tc tcVar = this.f523689a;
        tcVar.mo11509x3ab820bc(a17);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        tcVar.f467818f = wo.w0.g(true);
        fo3.s sVar = fo3.s.INSTANCE;
        tcVar.f467819g = sVar.I3(0);
        tcVar.f467820h = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j0(context);
        tcVar.f467821i = o45.wf.f424559d;
        tcVar.f467822m = com.p314xaae8f345.mm.p2621x8fb0427b.la.m0();
        java.lang.String f17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.f(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMReqRespAxAuth", "axauth lan: %s", f17);
        tcVar.f467823n = f17;
        tcVar.f467824o = "" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.k0();
        tcVar.f467825p = com.p314xaae8f345.mm.sdk.p2603x2137b148.a0.f273972b;
        try {
            byte[] h17 = sVar.h();
            r45.k57 k57Var = new r45.k57();
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(h17);
            k57Var.f459929f = cu5Var;
            r45.cu5 cu5Var2 = new r45.cu5();
            cu5Var2.d(sVar.L9());
            k57Var.f459933m = cu5Var2;
            r45.cu5 cu5Var3 = new r45.cu5();
            cu5Var3.d(k57Var.mo14344x5f01b1f6());
            tcVar.f467826q = cu5Var3;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMReqRespAxAuth", th6, "cc throws exception.", new java.lang.Object[0]);
        }
        long m46291x794c99b8 = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46291x794c99b8(tcVar.f467816d, this.f523691c, tcVar.f467817e.f453374f.f273689a);
        m150624x61501486(m46291x794c99b8);
        return com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46290xe636798c(m46291x794c99b8, tcVar.mo14344x5f01b1f6());
    }
}
