package pz0;

/* loaded from: classes10.dex */
public final class o implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f440688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pz0.r f440689e;

    public o(yz5.l lVar, pz0.r rVar) {
        this.f440688d = lVar;
        this.f440689e = rVar;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28690x6307ecb0.ActivityResultListener
    /* renamed from: onActivityResult */
    public final boolean mo63506x9d4787cb(int i17, int i18, android.content.Intent intent) {
        yz5.l lVar = this.f440688d;
        if (i17 == 1 && i18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateApiFlutterPlugin", "square finished");
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.TRUE)));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MJTemplateApiFlutterPlugin", "square not finished ");
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(java.lang.Boolean.FALSE)));
        }
        this.f440689e.f440696g = null;
        return true;
    }
}
