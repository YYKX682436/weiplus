package h03;

/* loaded from: classes2.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 f359431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f359432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h03.q f359433f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.p2845xc516c4b6.p2872x1e6ee6e.C24451x12373195 c24451x12373195, java.lang.String str, h03.q qVar) {
        super(0);
        this.f359431d = c24451x12373195;
        this.f359432e = str;
        this.f359433f = qVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = c03.i.a(this.f359431d);
        if (a17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.LVFinderPlugin", "shareFeedToUser :" + this.f359432e + " feed to finderItem is null");
        } else {
            android.app.Activity activity = this.f359433f.f359445f;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = activity instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity : null;
            if (activityC0065xcd7aa112 != null) {
                java.lang.String str = this.f359432e;
                db5.h4 h4Var = new db5.h4(activityC0065xcd7aa112, 0, 0);
                h4Var.A = str;
                ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).Mj(activityC0065xcd7aa112, str, h4Var, a17, null);
            }
        }
        return jz5.f0.f384359a;
    }
}
