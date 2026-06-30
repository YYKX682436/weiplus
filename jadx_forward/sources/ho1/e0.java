package ho1;

/* loaded from: classes.dex */
public final class e0 implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f364193a;

    public e0(yz5.l lVar) {
        this.f364193a = lVar;
    }

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        yz5.l lVar = this.f364193a;
        if (i17 != -1 || intent == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("selectConversationlabels resultCode=");
            sb6.append(i17);
            sb6.append(", dataIsNull=");
            sb6.append(intent == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RoamBackup.FlutterBackupPlugin", sb6.toString());
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
            return;
        }
        java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("label_id");
        if (stringArrayListExtra != null) {
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(stringArrayListExtra)));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RoamBackup.FlutterBackupPlugin", "selectConversationlabels label is null");
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
        }
    }
}
