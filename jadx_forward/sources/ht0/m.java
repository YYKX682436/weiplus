package ht0;

/* loaded from: classes10.dex */
public class m implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht0.s f366240d;

    public m(ht0.s sVar) {
        this.f366240d = sVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yz5.a aVar = this.f366240d.X;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        gs0.b bVar = this.f366240d.f366294i;
        if (bVar != null) {
            bVar.a(0L);
        }
        ht0.s sVar = this.f366240d;
        if (sVar.f366294i == null || sVar.f366300o.f334572a != ei3.l.WaitStop) {
            return null;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Media.MediaCodecMP4MuxRecorder", "[" + hashCode() + "] final frame draw");
        ((ku5.t0) ku5.t0.f394148d).A("record_stop_timeout");
        this.f366240d.f366294i.b();
        ht0.a aVar2 = this.f366240d.f366293h;
        if (aVar2 != null) {
            aVar2.f(new ht0.l(this));
        }
        this.f366240d.I.e();
        return null;
    }
}
