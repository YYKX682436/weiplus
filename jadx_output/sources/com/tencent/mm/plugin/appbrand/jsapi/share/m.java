package com.tencent.mm.plugin.appbrand.jsapi.share;

/* loaded from: classes7.dex */
public class m implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f83175a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.u f83176b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.service.c0 f83177c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f83178d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.share.l f83179e;

    public m(com.tencent.mm.plugin.appbrand.jsapi.share.l lVar, android.content.Intent intent, com.tencent.mm.plugin.appbrand.jsapi.share.u uVar, com.tencent.mm.plugin.appbrand.service.c0 c0Var, int i17) {
        this.f83179e = lVar;
        this.f83175a = intent;
        this.f83176b = uVar;
        this.f83177c = c0Var;
        this.f83178d = i17;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        com.tencent.mm.protobuf.f fVar;
        int i19 = this.f83178d;
        com.tencent.mm.plugin.appbrand.service.c0 c0Var = this.f83177c;
        com.tencent.mm.plugin.appbrand.jsapi.share.l lVar = this.f83179e;
        if (i17 != 0 || i18 != 0 || oVar == null || (fVar = oVar.f70711b.f70700a) == null || !(fVar instanceof r45.r46)) {
            lVar.f83174h = false;
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareAppMessageBase", "shareTransId fail, convert openId to username fail");
            c0Var.a(i19, lVar.o("fail:convert openId to username fail"));
            return;
        }
        r45.r46 r46Var = (r45.r46) fVar;
        if (r46Var.f384543d.f382749d == 0 && !com.tencent.mm.sdk.platformtools.t8.K0(r46Var.f384544e)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.JsApiShareAppMessageBase", "shareTransId success, username:%s", r46Var.f384544e);
            java.lang.String str2 = r46Var.f384544e;
            android.content.Intent intent = this.f83175a;
            intent.putExtra("Select_Conv_User", str2);
            intent.putExtra("KSendWording", this.f83176b.f83255a.getResources().getString(com.tencent.mm.R.string.a4x));
            this.f83179e.M(this.f83177c, this.f83178d, this.f83176b, this.f83175a, true);
            return;
        }
        lVar.f83174h = false;
        if (com.tencent.mm.sdk.platformtools.t8.K0(r46Var.f384543d.f382750e)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareAppMessageBase", "shareTransId fail, response username is null");
            c0Var.a(i19, lVar.o("fail:response username is null"));
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiShareAppMessageBase", "shareTransId fail, response error msg:%s", r46Var.f384543d.f382750e);
            c0Var.a(i19, lVar.o("fail:" + r46Var.f384543d.f382750e));
        }
    }
}
