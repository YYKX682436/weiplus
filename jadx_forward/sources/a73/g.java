package a73;

/* loaded from: classes15.dex */
public class g extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1772x193c2b20.ActivityC16083x362a71b4 f83468a;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1772x193c2b20.ActivityC16083x362a71b4 activityC16083x362a71b4) {
        this.f83468a = activityC16083x362a71b4;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if ("com.tencent.mm.gwallet.ACTION_CONSUME_REQUEST".equals(intent.getAction())) {
            java.util.ArrayList<java.lang.String> stringArrayListExtra = intent.getStringArrayListExtra("tokens");
            boolean booleanExtra = intent.getBooleanExtra("IS_FAILED_CONSUME", false);
            com.p314xaae8f345.mm.p1006xc5476f33.p1772x193c2b20.ActivityC16083x362a71b4 activityC16083x362a71b4 = this.f83468a;
            if (stringArrayListExtra == null || stringArrayListExtra.size() == 0) {
                int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1772x193c2b20.ActivityC16083x362a71b4.f223778f;
                activityC16083x362a71b4.setResult(0, null);
                activityC16083x362a71b4.finish();
            } else {
                b73.i iVar = activityC16083x362a71b4.f223779d;
                a73.f fVar = new a73.f(this, booleanExtra);
                iVar.getClass();
                s75.d.b(new b73.d(iVar, stringArrayListExtra, fVar, new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3()), "IabHelper_consumeAsync");
            }
        }
    }
}
