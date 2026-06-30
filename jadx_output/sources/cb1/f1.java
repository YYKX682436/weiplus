package cb1;

/* loaded from: classes7.dex */
public class f1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f40239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f40240e;

    public f1(cb1.h1 h1Var, android.content.Context context, yz5.l lVar) {
        this.f40239d = context;
        this.f40240e = lVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.content.Context context = this.f40239d;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.appbrand.ui.AppBrandRedirectUI.class);
        intent.putExtra("key_from_scene", 0);
        nf.g.a(context).j(intent, new cb1.e1(this));
    }
}
