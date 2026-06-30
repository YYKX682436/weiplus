package df;

/* loaded from: classes13.dex */
public final class j extends android.content.MutableContextWrapper {

    /* renamed from: a, reason: collision with root package name */
    public android.content.res.Resources f311027a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public android.content.res.Resources getResources() {
        if (this.f311027a == null) {
            this.f311027a = new df.e1(super.getResources());
        }
        android.content.res.Resources resources = this.f311027a;
        if (resources != null) {
            return resources;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mResources");
        throw null;
    }

    @Override // android.content.MutableContextWrapper
    public void setBaseContext(android.content.Context context) {
        boolean z17 = !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(context, getBaseContext());
        super.setBaseContext(context);
        if (!z17 || this.f311027a == null) {
            return;
        }
        this.f311027a = new df.e1(super.getResources());
    }
}
