package hr3;

/* loaded from: classes5.dex */
public class s9 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365504d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a f365505e;

    public s9(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ViewOnClickListenerC16860xc669c20a viewOnClickListenerC16860xc669c20a, java.lang.String str) {
        this.f365505e = viewOnClickListenerC16860xc669c20a;
        this.f365504d = str;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (i17 == 0) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.b0.e(this.f365504d);
            android.content.Context context = this.f365505e.R;
            db5.e1.W(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571894st));
        }
    }
}
