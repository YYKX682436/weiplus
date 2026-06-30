package l83;

/* loaded from: classes14.dex */
public class a implements com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l83.c f398620a;

    public a(l83.c cVar) {
        this.f398620a = cVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.b
    public int a(byte[] bArr, int i17) {
        if (!this.f398620a.f398625c) {
            return -1;
        }
        int m72837xcbf69b99 = com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni().f406250a.m72837xcbf69b99(bArr, i17);
        if (m72837xcbf69b99 >= 0) {
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.IPCallAudioPlayer", "playCallback, error: %d", java.lang.Integer.valueOf(m72837xcbf69b99));
        return -1;
    }
}
