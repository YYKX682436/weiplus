package vm1;

/* loaded from: classes.dex */
public final class y implements r35.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f519611a;

    public y(yz5.l lVar) {
        this.f519611a = lVar;
    }

    @Override // r35.n3
    public final void a(int i17) {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "showAddContactDialog, res:" + i17);
            yz5.l lVar = this.f519611a;
            if (i17 == 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FlutterBizAudioInteractPlugin", "add OK, result send success");
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE)));
            } else {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE)));
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FlutterBizAudioInteractPlugin", "showAddContactDialog, tingResult send exception e:" + e17.getMessage());
        }
    }
}
