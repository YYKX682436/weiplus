package u81;

/* loaded from: classes7.dex */
public class v extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u81.w f507015a;

    public v(u81.w wVar) {
        this.f507015a = wVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null || !"android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            return;
        }
        u81.w wVar = this.f507015a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(wVar.f507018c.f506956u, "onReceive(%s)", "android.intent.action.USER_PRESENT");
        wVar.f507018c.s(u81.u.ON_SYSTEM_SCREEN_ON, null);
    }
}
