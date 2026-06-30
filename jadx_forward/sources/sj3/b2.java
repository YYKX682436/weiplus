package sj3;

/* loaded from: classes8.dex */
public final class b2 implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f489973d;

    public b2(sj3.g3 g3Var) {
        this.f489973d = g3Var;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bool);
        if (bool.booleanValue()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.p1890x17af21cb.C16589x63693fe8 d17 = this.f489973d.d();
            java.lang.String r17 = c01.z1.r();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
            d17.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MT.MultiTalkAvatarLayout", "selectUser: ".concat(r17));
            tj3.p pVar = (tj3.p) d17.f231896d.get(r17);
            if (pVar != null) {
                if (!(pVar.f501323i != d17.f231900h)) {
                    pVar = null;
                }
                if (pVar != null) {
                    d17.b(pVar);
                }
            }
        }
    }
}
