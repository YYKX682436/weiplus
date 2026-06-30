package com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44;

/* loaded from: classes5.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t2 f151875d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t2 t2Var) {
        super(2);
        this.f151875d = t2Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        p012xc85e97e9.p093xedfae76a.y lifecycleOwner = (p012xc85e97e9.p093xedfae76a.y) obj;
        p012xc85e97e9.p093xedfae76a.m event = (p012xc85e97e9.p093xedfae76a.m) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p012xc85e97e9.p093xedfae76a.m mVar = p012xc85e97e9.p093xedfae76a.m.ON_PAUSE;
        com.p314xaae8f345.mm.p916x4268f0dc.sns.p925x38a77192.p926xd1075a44.t2 t2Var = this.f151875d;
        if (event == mVar) {
            t2Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicSearchPanel", "pausePlay: ");
            gz0.h hVar = t2Var.f151778r;
            if (hVar != null) {
                hVar.a();
            }
        } else if (event == p012xc85e97e9.p093xedfae76a.m.ON_RESUME) {
            t2Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicSearchPanel", "startPlay: ");
            gz0.h hVar2 = t2Var.f151778r;
            if (hVar2 != null) {
                hVar2.b();
            }
        }
        return jz5.f0.f384359a;
    }
}
