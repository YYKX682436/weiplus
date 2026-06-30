package ga3;

/* loaded from: classes15.dex */
public class n implements kh1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ga3.v f351394a;

    public n(ga3.v vVar) {
        this.f351394a = vVar;
    }

    @Override // kh1.d
    public void a(byte[] bArr, int i17, boolean z17) {
        ga3.v vVar = this.f351394a;
        vVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppRecordMgr", "onFrameRecorded  buffSize:%d, isLastFrame:%b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        if (!vVar.f351430w || bArr == null || i17 <= 0 || vVar.f351417j <= 0) {
            return;
        }
        if (i17 < bArr.length) {
            byte[] bArr2 = new byte[i17];
            java.lang.System.arraycopy(bArr, 0, bArr2, 0, i17);
            bArr = bArr2;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65402x18bbdb63(vVar.f351417j, bArr, z17);
    }
}
