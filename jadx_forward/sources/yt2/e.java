package yt2;

/* loaded from: classes3.dex */
public final class e implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yt2.g f546827d;

    public e(yt2.g gVar) {
        this.f546827d = gVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        int max;
        yt2.g gVar = this.f546827d;
        if (gVar.f546837i <= 0) {
            max = 0;
        } else {
            max = (int) java.lang.Math.max(0L, gVar.f546837i - (c01.id.c() / 1000));
        }
        if (max > 0) {
            gVar.d().setText(gVar.c(max));
            return true;
        }
        yz5.a aVar = gVar.f546836h;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        gVar.b(2);
        return false;
    }
}
