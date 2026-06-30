package ym5;

/* loaded from: classes10.dex */
public class o implements qk.u9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ym5.h f544983a;

    public o(ym5.h hVar) {
        this.f544983a = hVar;
    }

    @Override // qk.u9
    public void a(com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseDrawingView", "[onSelectedEmoji] emojiInfo:%s", interfaceC4987x84e327cb);
        ((l45.n) this.f544983a.m177317xc879b3f2()).r(interfaceC4987x84e327cb);
        mo9754xc39a57c1();
    }

    @Override // qk.u9
    /* renamed from: onHide */
    public void mo9754xc39a57c1() {
        ym5.h hVar = this.f544983a;
        hVar.mo160421xeaaa6c37(true);
        hVar.c(true);
        hVar.mo160423x2f328115(true);
    }
}
