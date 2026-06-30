package e72;

/* loaded from: classes14.dex */
public class b implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public short[] f331419a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e72.e f331420b;

    public b(e72.e eVar) {
        this.f331420b = eVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceVoiceRecordLogic", "onRecError state = " + i17 + " detailState = " + i18);
        e72.e eVar = this.f331420b;
        com.p314xaae8f345.mm.vfs.w6.h(eVar.f331426c);
        e72.d dVar = eVar.f331424a;
        if (dVar != null) {
            ((e72.u) dVar).a(2);
        }
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        int i18;
        short[] sArr = this.f331419a;
        if (sArr == null || sArr.length < i17 / 2) {
            this.f331419a = new short[i17 / 2];
        }
        int i19 = 0;
        while (true) {
            i18 = i17 / 2;
            if (i19 >= i18) {
                break;
            }
            int i27 = i19 * 2;
            this.f331419a[i19] = (short) ((bArr[i27 + 1] << 8) | (bArr[i27] & 255));
            i19++;
        }
        short[] sArr2 = this.f331419a;
        e72.e eVar = this.f331420b;
        eVar.getClass();
        for (int i28 = 0; i28 < i18; i28++) {
            short s17 = sArr2[i28];
            if (s17 > eVar.f331430g) {
                eVar.f331430g = s17;
            }
        }
        e72.d dVar = eVar.f331424a;
        if (dVar != null) {
            ((e72.u) dVar).a(1);
            com.p314xaae8f345.mm.vfs.w6.h(eVar.f331426c);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceVoiceRecordLogic", "mVoiceSilentDetectAPI is null");
    }
}
