package a73;

/* loaded from: classes15.dex */
public class f implements b73.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f83466a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a73.g f83467b;

    public f(a73.g gVar, boolean z17) {
        this.f83467b = gVar;
        this.f83466a = z17;
    }

    @Override // b73.h
    public void a(b73.j jVar, android.content.Intent intent) {
        java.util.Objects.toString(jVar);
        java.util.Objects.toString(intent);
        android.content.Intent intent2 = new android.content.Intent("com.tencent.mm.gwallet.ACTION_CONSUME_RESPONSE");
        if (this.f83466a) {
            intent2.putExtra("RESPONSE_CODE", 100000001);
        } else {
            intent2.putExtra("RESPONSE_CODE", 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1772x193c2b20.ActivityC16083x362a71b4 activityC16083x362a71b4 = this.f83467b.f83468a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1772x193c2b20.ActivityC16083x362a71b4.f223778f;
        activityC16083x362a71b4.setResult(-1, intent2);
        activityC16083x362a71b4.finish();
    }
}
