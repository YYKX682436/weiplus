package br1;

/* loaded from: classes11.dex */
public final class l implements com.tencent.wechat.iam.biz.w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final br1.l f23621a = new br1.l();

    @Override // com.tencent.wechat.iam.biz.w0
    public final void a(com.tencent.wechat.mm.biz.b bVar) {
        java.lang.String str = bVar.f217889e;
        if (str == null || str.length() == 0) {
            return;
        }
        hr1.a aVar = new hr1.a();
        java.lang.String biz = bVar.f217889e;
        kotlin.jvm.internal.o.f(biz, "biz");
        aVar.field_openid = jr1.j.c(biz);
        aVar.field_headImgUrl = bVar.f217892h;
        aVar.field_nickname = jr1.j.d(bVar.f217891g);
        aVar.field_serviceType = 5;
        yq1.u0.Ui().z0(aVar);
    }
}
