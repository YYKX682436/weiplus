package o45;

/* loaded from: classes8.dex */
public class ni extends o45.zg implements o45.xg {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f424519a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f424520b = "MicroMsg.MMTypingSend";

    @Override // o45.zg
    /* renamed from: getCmdId */
    public int mo13850x7443ca3f() {
        return 636;
    }

    @Override // o45.xg
    /* renamed from: getFuncId */
    public int mo13851x19c9adf5() {
        return 100017;
    }

    @Override // o45.zg, o45.xg
    /* renamed from: isRawData */
    public boolean mo150591x182b0f68() {
        return true;
    }

    @Override // o45.xg
    /* renamed from: toProtoBuf */
    public byte[] mo13852xc3d7db06() {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            long m150617xb5887524 = m150617xb5887524() & io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.C28565x745483d5.f70718x647d53d2;
            gm0.j1.i();
            byte[] m46286xd0386423 = com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46286xd0386423(com.p314xaae8f345.mm.jni.p802x6a710b1.C10775x2f6aed54.m46299x21dcc5(java.lang.String.valueOf(m150617xb5887524).getBytes(), gm0.j1.n().c(1), "TYPING_MSG", 32), this.f424519a);
            java.io.DataOutputStream dataOutputStream = new java.io.DataOutputStream(byteArrayOutputStream);
            dataOutputStream.writeInt(100017);
            dataOutputStream.writeShort(m46286xd0386423.length);
            dataOutputStream.write(m46286xd0386423);
            dataOutputStream.close();
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f424520b, "direct merge tail failed, err=" + e17.getMessage());
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        int length = byteArray.length;
        return byteArray;
    }
}
