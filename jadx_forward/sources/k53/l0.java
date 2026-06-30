package k53;

/* loaded from: classes8.dex */
public class l0 implements k53.s0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f385902a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k53.u0 f385903b;

    public l0(k53.u0 u0Var, int i17) {
        this.f385903b = u0Var;
        this.f385902a = i17;
    }

    @Override // k53.s0
    public void a(k53.t0 t0Var) {
        k53.u0 u0Var = this.f385903b;
        u0Var.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ksnsupload_title", t0Var.f385921a);
        intent.putExtra("Ksnsupload_imgurl", t0Var.f385923c);
        intent.putExtra("Ksnsupload_link", t0Var.f385924d);
        java.lang.String str = t0Var.f385922b;
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        android.content.Context context = u0Var.f385928a;
        if (K0) {
            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fpd);
        }
        intent.putExtra("KContentObjDesc", str);
        intent.putExtra("Ksnsupload_source", 1);
        intent.putExtra("Ksnsupload_type", 1);
        intent.putExtra("need_result", true);
        intent.putExtra("src_username", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fpd));
        intent.putExtra("src_displayname", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fpd));
        j45.l.n(context, "sns", ".ui.SnsUploadUI", intent, this.f385902a);
    }
}
