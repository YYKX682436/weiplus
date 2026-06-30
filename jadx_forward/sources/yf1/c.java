package yf1;

/* loaded from: classes7.dex */
public class c implements fb1.h {

    /* renamed from: d, reason: collision with root package name */
    public boolean f543166d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.y f543167e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tf.w f543168f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yf1.e f543169g;

    public c(yf1.e eVar, p012xc85e97e9.p093xedfae76a.y yVar, tf.w wVar) {
        this.f543169g = eVar;
        this.f543167e = yVar;
        this.f543168f = wVar;
    }

    @Override // fb1.h
    public void a(fb1.c cVar) {
        wf.b bVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.AppBrandLivePlayerCustomHandler", "checkCanInsertLivePlayer, onStatusChange, status: %s", cVar);
        if ((cVar instanceof fb1.b) && (bVar = this.f543169g.f543171a) != null && bVar.B) {
            final wf.b bVar2 = this.f543169g.f543171a;
            bVar2.getClass();
            bVar2.L(new java.lang.Runnable() { // from class: wf.b$$f
                @Override // java.lang.Runnable
                public final void run() {
                    wf.b bVar3 = wf.b.this;
                    if (bVar3.B) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SameLayer.LivePlayerPluginHandler", "unMutePlayInHighPriorityTask");
                        bVar3.B = false;
                        if (bVar3.C) {
                            bVar3.P();
                        }
                    }
                }
            });
        } else if (cVar instanceof fb1.a) {
            this.f543168f.m();
            this.f543166d = true;
        } else if (this.f543166d) {
            this.f543166d = false;
            this.f543168f.o();
        }
    }

    @Override // fb1.h
    /* renamed from: getLifecycleOwner */
    public p012xc85e97e9.p093xedfae76a.y mo10388x95c7fa5f() {
        return this.f543167e;
    }
}
