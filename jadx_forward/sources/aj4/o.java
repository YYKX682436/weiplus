package aj4;

/* loaded from: classes10.dex */
public final class o implements xj4.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834 f86876b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f86877c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f86879e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f86880f;

    public o(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834 activityC18678x2dd96834, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str, yz5.a aVar, yz5.a aVar2) {
        this.f86875a = i17;
        this.f86876b = activityC18678x2dd96834;
        this.f86877c = h0Var;
        this.f86878d = str;
        this.f86879e = aVar;
        this.f86880f = aVar2;
    }

    @Override // xj4.b
    public final void a(int i17, java.lang.String[] strArr, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(strArr, "<anonymous parameter 1>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        if (i17 != this.f86875a) {
            return;
        }
        java.lang.Object obj = this.f86877c.f391656d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834 activityC18678x2dd96834 = this.f86876b;
        activityC18678x2dd96834.getClass();
        activityC18678x2dd96834.C.remove((xj4.b) obj);
        boolean z17 = ((grantResults.length == 0) ^ true) && grantResults[0] == 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusFlutterMediaProvider", "checkPermissionThenRun: permission=" + this.f86878d + ", granted=" + z17);
        (z17 ? this.f86879e : this.f86880f).mo152xb9724478();
    }
}
