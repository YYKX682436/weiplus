package i53;

/* loaded from: classes5.dex */
public class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i53.w2 f370294d;

    public v2(i53.w2 w2Var) {
        this.f370294d = w2Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        i53.w2 w2Var = this.f370294d;
        android.view.View inflate = android.view.LayoutInflater.from(w2Var.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bg6, (android.view.ViewGroup) w2Var, false);
        y9.i iVar = new y9.i(w2Var.getContext(), 0);
        iVar.setContentView(inflate);
        android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.gio);
        l01.d0.f396294a.b(imageView, "https://" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t9.a(com.p314xaae8f345.mm.R.C30867xcad56011.fyh) + "/wechatgame/product/cdn/null/photo_3x_a59269f6.png", null, null);
        ((android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.gip)).setOnClickListener(new i53.r2(w2Var, iVar));
        iVar.show();
        w2Var.b(503, 1, null);
    }
}
