package n;

/* loaded from: classes15.dex */
public class g extends android.view.ActionMode {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f414910a;

    /* renamed from: b, reason: collision with root package name */
    public final n.b f414911b;

    public g(android.content.Context context, n.b bVar) {
        this.f414910a = context;
        this.f414911b = bVar;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f414911b.a();
    }

    @Override // android.view.ActionMode
    public android.view.View getCustomView() {
        return this.f414911b.c();
    }

    @Override // android.view.ActionMode
    public android.view.Menu getMenu() {
        return new o.j0(this.f414910a, (g3.a) this.f414911b.e());
    }

    @Override // android.view.ActionMode
    public android.view.MenuInflater getMenuInflater() {
        return this.f414911b.f();
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getSubtitle() {
        return this.f414911b.g();
    }

    @Override // android.view.ActionMode
    public java.lang.Object getTag() {
        return this.f414911b.f414894d;
    }

    @Override // android.view.ActionMode
    public java.lang.CharSequence getTitle() {
        return this.f414911b.h();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f414911b.f414895e;
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f414911b.i();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f414911b.j();
    }

    @Override // android.view.ActionMode
    public void setCustomView(android.view.View view) {
        this.f414911b.k(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(java.lang.CharSequence charSequence) {
        this.f414911b.m(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(java.lang.Object obj) {
        this.f414911b.f414894d = obj;
    }

    @Override // android.view.ActionMode
    public void setTitle(java.lang.CharSequence charSequence) {
        this.f414911b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z17) {
        this.f414911b.p(z17);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i17) {
        this.f414911b.l(i17);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i17) {
        this.f414911b.n(i17);
    }
}
