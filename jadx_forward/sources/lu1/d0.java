package lu1;

/* loaded from: classes15.dex */
public class d0 implements p11.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f402857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f402858b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f402859c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f402860d;

    public d0(android.widget.ImageView imageView, int i17, android.content.Context context, int i18) {
        this.f402857a = imageView;
        this.f402858b = i17;
        this.f402859c = context;
        this.f402860d = i18;
    }

    @Override // p11.h
    public void a(java.lang.String str, android.view.View view) {
    }

    @Override // p11.h
    public void b(java.lang.String str, android.view.View view, q11.b bVar) {
        android.graphics.Bitmap bitmap = bVar.f441067d;
        if (bitmap != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new lu1.c0(this, bitmap));
            return;
        }
        lu1.g0.d(this.f402859c, this.f402857a, this.f402860d, this.f402858b);
    }

    @Override // p11.h
    public android.graphics.Bitmap c(java.lang.String str, android.view.View view, q11.b bVar) {
        return null;
    }
}
