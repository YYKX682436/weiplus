package eu0;

/* loaded from: classes5.dex */
public final class d implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.a f338243a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.a f338244b;

    public d(yz5.a aVar, yz5.a aVar2) {
        this.f338243a = aVar;
        this.f338244b = aVar2;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.LiteAppStore", "startLiteApp failed");
        this.f338244b.mo152xb9724478();
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.LiteAppStore", "startLiteApp success");
        this.f338243a.mo152xb9724478();
    }
}
