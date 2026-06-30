package e43;

/* loaded from: classes8.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f330885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f330886e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330887f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330888g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f330889h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e43.b f330890i;

    public a(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, boolean z17, java.lang.String str, java.lang.String str2, java.lang.String str3, e43.b bVar) {
        this.f330885d = h0Var;
        this.f330886e = z17;
        this.f330887f = str;
        this.f330888g = str2;
        this.f330889h = str3;
        this.f330890i = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = (java.lang.String) this.f330885d.f391656d;
        dn.m mVar = new dn.m();
        mVar.f323318d = "task_GameChatRoomMediaUploader";
        mVar.f69601xaca5bdda = str;
        mVar.f323320f = this.f330890i;
        mVar.f69595x6d25b0d9 = this.f330888g;
        mVar.f69606xccdbf540 = false;
        mVar.f69609xd84b8349 = 3;
        java.lang.String str2 = this.f330887f;
        if (android.webkit.URLUtil.isHttpUrl(str2) || android.webkit.URLUtil.isHttpsUrl(str2)) {
            mVar.f69592xf1ebe47b = 2;
            mVar.f323344z = str2;
            mVar.f69582x4e093552 = "";
        } else {
            mVar.f69591xf9dbbe9c = str2;
            mVar.f69575xf11df5f5 = this.f330889h;
            if (this.f330886e) {
                mVar.f69592xf1ebe47b = 3;
            } else {
                mVar.f69592xf1ebe47b = 2;
            }
        }
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).wi(mVar);
    }
}
