package b00;

@j95.b
/* loaded from: classes7.dex */
public final class n0 extends i95.w implements c00.d4 {

    /* renamed from: e, reason: collision with root package name */
    public static c00.n3 f16729e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.List f16730f = kz5.c0.i(new ce3.a("MagicEcsShop"), new ce3.d("MagicEcsShop"), new vd3.f(), new vd3.d(), new md3.t(), new rd3.j(), new rd3.k(), new sd3.c(), new sd3.b(), new vd3.c(), new md3.q(), new md3.u(), new md3.l());

    /* renamed from: d, reason: collision with root package name */
    public iq0.c f16731d;

    public void wi(java.lang.String event, java.lang.String str) {
        kotlin.jvm.internal.o.g(event, "event");
        iq0.c cVar = this.f16731d;
        if (cVar != null) {
            gq0.t tVar = (gq0.t) i95.n0.c(gq0.t.class);
            if (str == null) {
                str = "";
            }
            ((nq0.p) tVar).Ui(cVar, new com.tencent.mm.plugin.magicbrush.base.MBJsEventBase(event, str));
        }
    }
}
