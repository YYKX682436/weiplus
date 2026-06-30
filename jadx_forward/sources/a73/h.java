package a73;

/* loaded from: classes15.dex */
public class h implements b73.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f83469a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1772x193c2b20.ActivityC16083x362a71b4 f83470b;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1772x193c2b20.ActivityC16083x362a71b4 activityC16083x362a71b4, boolean z17) {
        this.f83470b = activityC16083x362a71b4;
        this.f83469a = z17;
    }

    @Override // b73.h
    public void a(b73.j jVar, android.content.Intent intent) {
        java.util.Objects.toString(intent);
        if (intent == null) {
            intent = new android.content.Intent("com.tencent.mm.gwallet.ACTION_QUERY_RESPONSE");
            intent.putExtra("RESPONSE_CODE", jVar.a());
        } else {
            intent.setAction("com.tencent.mm.gwallet.ACTION_QUERY_RESPONSE");
        }
        if (!this.f83469a) {
            intent.putExtra("is_direct", false);
        }
        this.f83470b.sendBroadcast(intent);
    }
}
