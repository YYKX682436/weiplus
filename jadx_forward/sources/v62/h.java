package v62;

/* loaded from: classes12.dex */
public class h {
    public v62.i a(java.lang.String str, boolean z17) {
        if (!com.p314xaae8f345.mm.vfs.w6.j(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtQbarYuvRetrieverFactory", "hy: handle not exist");
            return null;
        }
        byte[] N = com.p314xaae8f345.mm.vfs.w6.N(str, 0, -1);
        if (N == null || N.length <= 14) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ExtQbarYuvRetrieverFactory", "hy: invalid yuv handle file!!");
            return null;
        }
        java.lang.String g17 = z17 ? kk.k.g(N) : null;
        byte[] bArr = new byte[4];
        java.lang.System.arraycopy(N, 0, bArr, 0, 4);
        byte[] bArr2 = new byte[4];
        java.lang.System.arraycopy(N, 4, bArr2, 0, 4);
        byte[] bArr3 = new byte[4];
        java.lang.System.arraycopy(N, 8, bArr3, 0, 4);
        byte[] bArr4 = new byte[4];
        java.lang.System.arraycopy(N, 12, bArr4, 0, 4);
        byte[] bArr5 = new byte[4];
        java.lang.System.arraycopy(N, 16, bArr5, 0, 4);
        byte[] bArr6 = new byte[4];
        java.lang.System.arraycopy(N, 20, bArr6, 0, 4);
        byte[] bArr7 = new byte[4];
        java.lang.System.arraycopy(N, 24, bArr7, 0, 4);
        int length = N.length - 28;
        android.util.SparseArray sparseArray = v62.j.f515049a;
        byte[] bArr8 = (byte[]) sparseArray.get(length);
        if (bArr8 == null) {
            bArr8 = new byte[length];
            sparseArray.put(length, bArr8);
        }
        java.lang.System.arraycopy(N, 28, bArr8, 0, length);
        int a17 = v62.j.a(bArr);
        int a18 = v62.j.a(bArr2);
        int a19 = v62.j.a(bArr3);
        int a27 = v62.j.a(bArr4);
        v62.i iVar = new v62.i(bArr8, a17, a18, v62.j.a(bArr7), new android.graphics.Rect(a19, a27, v62.j.a(bArr5) + a19, v62.j.a(bArr6) + a27), g17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtQbarYuvRetrieverFactory", "hy: retrieved result: %s", iVar);
        return iVar;
    }
}
