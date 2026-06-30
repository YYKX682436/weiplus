package n;

/* loaded from: classes13.dex */
public class d extends android.content.ContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public int f414896a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.res.Resources.Theme f414897b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.LayoutInflater f414898c;

    /* renamed from: d, reason: collision with root package name */
    public android.content.res.Resources f414899d;

    public d(android.content.Context context, int i17) {
        super(context);
        this.f414896a = i17;
    }

    public final void a() {
        if (this.f414897b == null) {
            this.f414897b = getResources().newTheme();
            android.content.res.Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f414897b.setTo(theme);
            }
        }
        this.f414897b.applyStyle(this.f414896a, true);
    }

    @Override // android.content.ContextWrapper
    public void attachBaseContext(android.content.Context context) {
        super.attachBaseContext(context);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        if (this.f414899d == null) {
            this.f414899d = super.getResources();
        }
        return this.f414899d;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public java.lang.Object getSystemService(java.lang.String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f414898c == null) {
            this.f414898c = android.view.LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f414898c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources.Theme getTheme() {
        android.content.res.Resources.Theme theme = this.f414897b;
        if (theme != null) {
            return theme;
        }
        if (this.f414896a == 0) {
            this.f414896a = com.p314xaae8f345.mm.R.C30868x68b1db1.ra;
        }
        a();
        return this.f414897b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i17) {
        if (this.f414896a != i17) {
            this.f414896a = i17;
            a();
        }
    }

    public d(android.content.Context context, android.content.res.Resources.Theme theme) {
        super(context);
        this.f414897b = theme;
    }
}
