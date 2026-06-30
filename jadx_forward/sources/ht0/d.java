package ht0;

/* loaded from: classes10.dex */
public class d implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht0.f f366222d;

    public d(ht0.f fVar) {
        this.f366222d = fVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ht0.f fVar = this.f366222d;
        if (fVar.f366225d.f366294i == null) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] final frame draw");
        ht0.s sVar = fVar.f366225d;
        sVar.f366294i.b();
        ht0.a aVar = sVar.f366293h;
        if (aVar != null) {
            aVar.f(new ht0.c(this));
        }
        sVar.I.e();
        return null;
    }
}
