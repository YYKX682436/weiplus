package br1;

/* loaded from: classes11.dex */
public final class x implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f23644a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ br1.y f23645b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f23646c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f23647d;

    public x(java.util.LinkedList linkedList, br1.y yVar, java.lang.String str, int i17) {
        this.f23644a = linkedList;
        this.f23645b = yVar;
        this.f23646c = str;
        this.f23647d = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        com.tencent.mars.xlog.Log.i("BizFans.BizFansContactLooper", "cgi batch get profile contact. errCode: " + i18);
        int i19 = this.f23647d;
        br1.y yVar = this.f23645b;
        if (i17 == 0 && i18 == 0 && oVar != null && (fVar = oVar.f70711b.f70700a) != null && (fVar instanceof r45.nv6)) {
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.UserAttrResp");
            r45.nv6 nv6Var = (r45.nv6) fVar;
            com.tencent.mars.xlog.Log.i("BizFans.BizFansContactLooper", "has get profile contact list: " + nv6Var.f381698d);
            java.util.LinkedList<r45.lv6> list = nv6Var.f381698d;
            kotlin.jvm.internal.o.f(list, "list");
            for (r45.lv6 lv6Var : list) {
                hr1.a aVar = new hr1.a();
                java.lang.String openid = lv6Var.f379860d;
                kotlin.jvm.internal.o.f(openid, "openid");
                aVar.field_openid = jr1.j.b(openid, i19);
                aVar.field_headImgUrl = lv6Var.f379861e;
                aVar.field_nickname = lv6Var.f379862f;
                aVar.field_identityType = lv6Var.f379864h;
                aVar.field_headType = lv6Var.f379863g;
                aVar.field_identityName = lv6Var.f379865i;
                aVar.field_cacheLifetime = lv6Var.f379866m;
                aVar.field_serviceType = lv6Var.f379867n;
                if (i19 == 5) {
                    yq1.u0.Ui().z0(aVar);
                } else {
                    yq1.u0.Bi().z0(aVar);
                }
                yVar.f23648a.b(true, i19, aVar);
            }
        } else {
            for (java.lang.String str2 : this.f23644a) {
                br1.w wVar = yVar.f23648a;
                hr1.a aVar2 = new hr1.a();
                kotlin.jvm.internal.o.d(str2);
                aVar2.field_openid = jr1.j.a(str2);
                wVar.b(false, i19, aVar2);
            }
        }
        yVar.f23650c.set(false);
        yVar.b(this.f23646c, i19);
    }
}
