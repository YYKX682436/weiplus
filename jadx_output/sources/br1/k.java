package br1;

/* loaded from: classes11.dex */
public final class k implements com.tencent.wechat.iam.biz.w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final br1.k f23618a = new br1.k();

    @Override // com.tencent.wechat.iam.biz.w0
    public final void a(com.tencent.wechat.mm.biz.b bVar) {
        java.lang.String str = bVar.f217889e;
        if (str == null || str.length() == 0) {
            return;
        }
        hr1.a aVar = new hr1.a();
        java.lang.String biz = bVar.f217889e;
        kotlin.jvm.internal.o.f(biz, "biz");
        aVar.field_openid = jr1.j.a(biz);
        aVar.field_headImgUrl = bVar.f217892h;
        aVar.field_nickname = jr1.j.d(bVar.f217891g);
        aVar.field_serviceType = 0;
        yq1.u0.Bi().z0(aVar);
    }
}
