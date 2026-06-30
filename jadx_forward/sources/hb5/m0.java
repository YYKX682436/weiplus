package hb5;

/* loaded from: classes.dex */
public class m0 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361766a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f361767b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21588xa00d55fe f361768c;

    public m0(com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21588xa00d55fe activityC21588xa00d55fe, java.lang.String str, long j17) {
        this.f361768c = activityC21588xa00d55fe;
        this.f361766a = str;
        this.f361767b = j17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j
    public void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("enterprise_biz_name", this.f361766a);
            intent.putExtra("key_biz_chat_id", this.f361767b);
            intent.putExtra("key_is_biz_chat", true);
            com.p314xaae8f345.mm.ui.p2646xfa354eeb.ActivityC21588xa00d55fe activityC21588xa00d55fe = this.f361768c;
            activityC21588xa00d55fe.setResult(-1, intent);
            activityC21588xa00d55fe.finish();
        }
    }
}
