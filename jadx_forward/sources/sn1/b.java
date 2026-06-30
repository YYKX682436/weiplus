package sn1;

/* loaded from: classes12.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f491515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f491516e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f491517f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f491518g;

    public b(boolean z17, int i17, byte[] bArr, int i18) {
        this.f491515d = z17;
        this.f491516e = i17;
        this.f491517f = bArr;
        this.f491518g = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        sn1.h hVar = sn1.i.f491548i;
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BackupBaseScene", "callbackToNotify, onNotify is null");
            return;
        }
        hVar.b(this.f491515d, this.f491516e, this.f491517f, this.f491518g);
    }
}
