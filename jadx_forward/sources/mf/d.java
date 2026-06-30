package mf;

/* loaded from: classes13.dex */
public abstract class d extends android.view.ContextThemeWrapper {

    /* renamed from: d, reason: collision with root package name */
    public static final mf.c f407525d = new mf.a();

    /* renamed from: a, reason: collision with root package name */
    public android.content.res.Resources f407526a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.LayoutInflater f407527b;

    /* renamed from: c, reason: collision with root package name */
    public final mf.c f407528c;

    public d(android.content.Context context, mf.c cVar) {
        super.attachBaseContext(context);
        this.f407528c = cVar == null ? f407525d : cVar;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        if (getAssets() == null) {
            return super.getResources();
        }
        if (this.f407526a == null) {
            android.content.res.Resources resources = super.getResources();
            this.f407526a = new mf.b(this, resources, this.f407528c.a(resources.getDisplayMetrics(), resources.getConfiguration()));
            getTheme().getResources().getDisplayMetrics().setTo(this.f407526a.getDisplayMetrics());
        }
        return this.f407526a;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if (!"layout_inflater".equals(str)) {
            return super.getSystemService(str);
        }
        android.view.LayoutInflater layoutInflater = this.f407527b;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        android.view.LayoutInflater layoutInflater2 = (android.view.LayoutInflater) super.getSystemService("layout_inflater");
        this.f407527b = layoutInflater2;
        return layoutInflater2;
    }
}
