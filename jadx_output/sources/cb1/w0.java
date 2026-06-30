package cb1;

/* loaded from: classes4.dex */
public class w0 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yb f40328d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f40329e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f40330f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cb1.y0 f40331g;

    public w0(cb1.y0 y0Var, r45.yb ybVar, com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17) {
        this.f40331g = y0Var;
        this.f40328d = ybVar;
        this.f40329e = v5Var;
        this.f40330f = i17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRequestAuthUserAutoFillData", "do accept the auto fill data protocol");
        r45.yb ybVar = this.f40328d;
        ybVar.f390941f = true;
        cb1.y0 y0Var = this.f40331g;
        java.lang.String o17 = y0Var.o("ok");
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f40329e;
        v5Var.a(this.f40330f, o17);
        cb1.y0.C(y0Var, v5Var, ybVar);
    }
}
