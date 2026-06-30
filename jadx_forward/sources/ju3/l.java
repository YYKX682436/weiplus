package ju3;

/* loaded from: classes10.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e f383500d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17012x9e3c2e c17012x9e3c2e) {
        super(0);
        this.f383500d = c17012x9e3c2e;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CameraKitPluginLayout", "recorder reset finished");
        yt3.b recordPlugin = this.f383500d.getRecordPlugin();
        if (recordPlugin != null) {
            recordPlugin.mo9066x6761d4f();
        }
        return jz5.f0.f384359a;
    }
}
