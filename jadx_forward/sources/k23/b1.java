package k23;

/* loaded from: classes12.dex */
public final class b1 implements k23.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k23.c1 f385057a;

    public b1(k23.c1 c1Var) {
        this.f385057a = c1Var;
    }

    @Override // k23.v2
    public void b(java.lang.String result, java.lang.String voiceID) {
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(voiceID, "voiceID");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSFloatingVoiceV3UIC", "onResult(" + result + ')');
        if (result.length() > 0) {
            z13.a aVar = z13.f.f550930s;
            k23.c1 c1Var = this.f385057a;
            aVar.a(c1Var.m80379x76847179()).h7(result, k23.r2.f385217f, voiceID, false);
            z50.c.f551695a.e(c1Var.m80379x76847179(), result, k23.s2.a(aVar.a(c1Var.m80379x76847179()).f550939o) ? com.p314xaae8f345.p3006xb8ff1437.p3028x2eaf9f.p3042xc53e9ae1.InterfaceC26399x617a50af.f53180x5a1baf5 : 17, 238, aVar.a(c1Var.m80379x76847179()).a7(), aVar.a(c1Var.m80379x76847179()).c7());
        }
        k23.z zVar = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1716x6b2e132.ActivityC15617x8cb23e95.f219737f;
        java.lang.ref.WeakReference weakReference = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1716x6b2e132.ActivityC15617x8cb23e95.f219739h;
        if (weakReference == null || (abstractActivityC21394xb3d2c0cf = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) weakReference.get()) == null) {
            return;
        }
        abstractActivityC21394xb3d2c0cf.finish();
    }

    @Override // k23.v2
    /* renamed from: onCancel */
    public void mo63604x3d6f0539() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSFloatingVoiceV3UIC", "onCancel");
    }
}
