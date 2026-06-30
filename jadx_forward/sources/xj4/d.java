package xj4;

/* loaded from: classes11.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834 f536410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f536411e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834 activityC18678x2dd96834, java.lang.Object obj) {
        super(0);
        this.f536410d = activityC18678x2dd96834;
        this.f536411e = obj;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f536410d.D = false;
        if (this.f536410d.f255421z || this.f536410d.isFinishing() || this.f536410d.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusFlutterPublishActivity", "onBackPressed: activity already finishing, drop result=" + ((java.lang.Object) p3321xbce91901.C29043x91b2b43d.m143904x7003d4e1(this.f536411e)));
        } else {
            java.lang.Object obj = this.f536411e;
            com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834 activityC18678x2dd96834 = this.f536410d;
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(obj);
            if (m143898xd4a2fc34 == null) {
                com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24923xd8b43e97 c24923xd8b43e97 = (com.p314xaae8f345.p2845xc516c4b6.p2881xcacdcff2.C24923xd8b43e97) obj;
                if (c24923xd8b43e97.m92292xe591acbc() != 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusFlutterPublishActivity", "onBackPressed: Flutter intercepted, errCode=" + c24923xd8b43e97.m92292xe591acbc() + ", errMsg=" + c24923xd8b43e97.m92293x17ec12d2() + ", skip dismiss");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusFlutterPublishActivity", "onBackPressed: Flutter allows dismiss, super.onBackPressed()");
                    super/*com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity*/.finish();
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusFlutterPublishActivity", "onBackPressed: send callback failed, fallback to super, err=" + m143898xd4a2fc34.getMessage());
                super/*com.tencent.mm.plugin.flutter.ui.MMFlutterViewActivity*/.finish();
            }
        }
        return jz5.f0.f384359a;
    }
}
