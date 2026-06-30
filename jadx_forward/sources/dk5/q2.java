package dk5;

/* loaded from: classes9.dex */
public class q2 implements lo.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316359a;

    public q2(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93) {
        this.f316359a = activityC22571x51759e93;
    }

    @Override // lo.j
    public void a(int i17, java.lang.String str, java.util.ArrayList arrayList) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelectConversationUI", "resultCode:%d filePaths:%s", java.lang.Integer.valueOf(i17), arrayList);
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316359a;
        if (i17 == -1) {
            android.content.Intent intent = new android.content.Intent();
            intent.putParcelableArrayListExtra("FILEPATHS", arrayList);
            activityC22571x51759e93.setResult(-1, intent);
            activityC22571x51759e93.finish();
            return;
        }
        if (i17 != 1) {
            return;
        }
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("ERRMSG", str);
        activityC22571x51759e93.setResult(1, intent2);
        activityC22571x51759e93.finish();
    }
}
