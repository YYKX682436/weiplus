package dg5;

/* loaded from: classes11.dex */
public class i implements dg5.v {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 f313903d;

    /* renamed from: e, reason: collision with root package name */
    public final dg5.h f313904e;

    /* renamed from: f, reason: collision with root package name */
    public long f313905f;

    /* renamed from: g, reason: collision with root package name */
    public final dg5.g f313906g = new dg5.g(this, null);

    public i(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8, dg5.h hVar) {
        this.f313903d = activityC22359x66709fa8;
        this.f313904e = hVar;
    }

    @Override // dg5.v
    public boolean a(android.view.View view, android.graphics.Point point, int i17, long j17, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7 p7Var) {
        s01.b bVar = p7Var.f289499d;
        if (bVar == null) {
            return false;
        }
        int i18 = point.x;
        int i19 = point.y;
        dg5.g gVar = this.f313906g;
        if (gVar.f313896e == null) {
            gVar.f313895d = new dg5.d(gVar);
            gVar.f313896e = new rl5.r(gVar.f313902n.f313903d);
        }
        gVar.f313899h = bVar;
        gVar.f313900i = bVar.f69065x75756b18;
        gVar.f313901m = bVar.f69064xa6206081;
        gVar.f313896e.g(view, i17, j17, gVar, gVar.f313895d, i18, i19);
        return true;
    }

    @Override // dg5.v
    public void b(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p7 p7Var) {
        s01.b bVar = p7Var.f289499d;
        if (bVar == null) {
            return;
        }
        java.lang.String str = bVar.f69065x75756b18;
        long j17 = bVar.f69064xa6206081;
        if (str == null) {
            return;
        }
        this.f313905f = j17;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("key_biz_chat_id", j17);
        bundle.putBoolean("key_need_send_video", false);
        bundle.putBoolean("key_is_biz_chat", true);
        this.f313903d.m80491x5d4f20c8(str, bundle, true);
    }
}
