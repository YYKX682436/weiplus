package l31;

/* loaded from: classes9.dex */
public final class q extends l31.b {

    /* renamed from: e, reason: collision with root package name */
    public e31.l f396915e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f396916f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f396917g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f396918h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f396919i;

    /* renamed from: j, reason: collision with root package name */
    public f31.f f396920j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(java.lang.String username, java.lang.String appId, java.lang.String subscribeUrl, java.util.List templateIdList, java.lang.String extInfo, k31.a aVar, e31.l lVar) {
        super(username);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(subscribeUrl, "subscribeUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(templateIdList, "templateIdList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extInfo, "extInfo");
        this.f396916f = "";
        this.f396917g = "";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f396918h = arrayList;
        this.f396919i = "";
        if (!(username.length() > 0)) {
            username = appId.length() > 0 ? appId : "";
        }
        this.f396846a = username;
        this.f396917g = appId;
        this.f396915e = lVar;
        this.f396916f = subscribeUrl;
        arrayList.addAll(templateIdList);
        this.f396919i = extInfo;
    }

    @Override // l31.b
    public void a() {
        this.f396849d = true;
        java.lang.Object[] objArr = new java.lang.Object[1];
        f31.f fVar = this.f396920j;
        objArr[0] = fVar != null ? java.lang.Integer.valueOf(fVar.hashCode()) : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetSubscribeMsgListForDialogTask", "getSubscribeMsgForDialogTask cancel task: %s", objArr);
        this.f396915e = null;
        f31.b.f340802a.b(this.f396920j);
    }

    @Override // l31.u
    public void run() {
        l31.p pVar = new l31.p(this);
        boolean z17 = this.f396917g.length() > 0;
        java.util.ArrayList arrayList = this.f396918h;
        f31.c cVar = f31.d.f340804a;
        f31.f a17 = z17 ? cVar.a("", this.f396917g, this.f396916f, arrayList, this.f396919i, pVar) : cVar.a(this.f396846a, "", this.f396916f, arrayList, this.f396919i, pVar);
        this.f396920j = a17;
        c(a17);
    }
}
