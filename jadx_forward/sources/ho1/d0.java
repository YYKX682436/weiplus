package ho1;

/* loaded from: classes5.dex */
public final class d0 implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f364182a;

    public d0(yz5.l lVar) {
        this.f364182a = lVar;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        yz5.l lVar = this.f364182a;
        if (i17 != -1 || intent == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("selectConversationByName resultCode=");
            sb6.append(i17);
            sb6.append(", dataIsNull=");
            sb6.append(intent == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RoamBackup.FlutterBackupPlugin", sb6.toString());
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
            return;
        }
        java.lang.String[] stringArrayExtra = intent.getStringArrayExtra("Select_Contact");
        if (stringArrayExtra == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RoamBackup.FlutterBackupPlugin", "selectConversationByName selectedUser is null");
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
        } else {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(com.p314xaae8f345.mm.sdk.p2603x2137b148.h2.b(stringArrayExtra))));
        }
    }
}
