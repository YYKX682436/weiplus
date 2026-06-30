package vm1;

/* loaded from: classes8.dex */
public final class q implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f519575d;

    public q(yz5.l lVar) {
        this.f519575d = lVar;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        yz5.l lVar = this.f519575d;
        if (m75939xb282bd08 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "black list succ");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24950x48e49199(0L, "", new byte[0]))));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "black list failed");
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(new com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.C24950x48e49199(1L, "", new byte[0]))));
        }
    }
}
