package hb5;

/* loaded from: classes.dex */
public class o0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f361779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21588xa00d55fe f361780c;

    public o0(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21588xa00d55fe activityC21588xa00d55fe, java.lang.String str, long j17) {
        this.f361780c = activityC21588xa00d55fe;
        this.f361778a = str;
        this.f361779b = j17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("enterprise_biz_name", this.f361778a);
            intent.putExtra("key_biz_chat_id", this.f361779b);
            intent.putExtra("key_is_biz_chat", true);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                intent.putExtra("enterprise_share_append_text", str);
            }
            com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21588xa00d55fe activityC21588xa00d55fe = this.f361780c;
            activityC21588xa00d55fe.setResult(-1, intent);
            activityC21588xa00d55fe.finish();
        }
    }
}
