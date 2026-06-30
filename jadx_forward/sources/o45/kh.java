package o45;

/* loaded from: classes12.dex */
public class kh implements o45.wg {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o45.zg f424506a;

    public kh(o45.lh lhVar, o45.zg zgVar) {
        this.f424506a = zgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o45.wg
    public boolean a(com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc1, int i17, byte[] bArr, byte[] bArr2, byte[] bArr3, int i18, boolean z17, int i19, int i27) {
        o45.zg zgVar = this.f424506a;
        o45.xg xgVar = (o45.xg) zgVar;
        long m150617xb5887524 = zgVar.m150617xb5887524();
        if (z65.c.a() && m150617xb5887524 == 0) {
            m150617xb5887524 = o45.wf.f424561f;
        }
        o45.pi m150614x960aaed8 = zgVar.m150614x960aaed8();
        if (i17 == 722) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMEncryptCheckResUpdate", "MMEncryptCheckResUpdate reqToBuf rsaReqData");
            r45.gk0 gk0Var = ((o45.lh) zgVar).f424508a;
            byte[][] e17 = com.p314xaae8f345.mm.p944x882e457a.r2.e(m150617xb5887524, gk0Var.f456842d, gk0Var.f456843e);
            if (e17 == null) {
                return false;
            }
            if (com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75990xd812f975(c19764x527bffc1, bArr2, zgVar.m150608xbdf72767(), (int) m150617xb5887524, xgVar.mo13851x19c9adf5(), m150614x960aaed8.f424532c, e17[0], e17[1], m150614x960aaed8.f424530a.getBytes(), m150614x960aaed8.f424531b.getBytes(), zgVar.m150611xe973858(), i19, ((o45.lh) zgVar).m150613x966afe1(), 0)) {
                int length = c19764x527bffc1.f38861x6ac9171.length;
                return true;
            }
        } else if (i17 == 784) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMEncryptCheckResUpdate", "summerauths rsaInfo[%s] EcdhMgr.USE_ECDH[%s] engine[%s]", java.lang.Integer.valueOf(m150614x960aaed8.f424532c), java.lang.Boolean.valueOf(o45.ag.f424425a), java.lang.Long.valueOf(((o45.xg) zgVar).m150598x11b0e25a()));
            ((o45.xg) zgVar).mo13851x19c9adf5();
            com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1 c19764x527bffc12 = new com.p314xaae8f345.mm.p2493x1bc889d6.C19764x527bffc1();
            byte[] mo13852xc3d7db06 = ((o45.xg) zgVar).mo13852xc3d7db06();
            if (mo13852xc3d7db06 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.f("MicroMsg.MMEncryptCheckResUpdate", "protobuf is null");
                return false;
            }
            long d17 = o45.ag.d(null);
            zgVar.m150624x61501486(d17);
            boolean m75991x3a8014b7 = com.p314xaae8f345.mm.p2496xc50a8ce6.C19776x5804ff1f.m75991x3a8014b7(c19764x527bffc12, bArr2, zgVar.m150608xbdf72767(), (int) m150617xb5887524, xgVar.mo13851x19c9adf5(), o45.ag.a(), com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46301xd94956a7(d17, mo13852xc3d7db06), i19, xgVar.m150599x966afe1(), 0, 12);
            o45.ag.a();
            int length2 = c19764x527bffc12.f38861x6ac9171.length;
            return m75991x3a8014b7;
        }
        return false;
    }
}
