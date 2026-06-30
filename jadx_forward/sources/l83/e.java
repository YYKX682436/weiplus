package l83;

/* loaded from: classes14.dex */
public class e implements tl.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l83.h f398634a;

    public e(l83.h hVar) {
        this.f398634a = hVar;
    }

    @Override // tl.c
    public void a(int i17, int i18) {
    }

    @Override // tl.c
    public void b(byte[] bArr, int i17) {
        synchronized (this.f398634a.f398638b) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.bj().f224015a == 5) {
                l83.h hVar = this.f398634a;
                if (hVar.f398641e) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallRecorder", "isFirstRecordCallback");
                    hVar.f398641e = false;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.p1786x633fb29.r.Ni().f406250a.m72838xe4580fb6(bArr, i17);
            }
        }
    }
}
