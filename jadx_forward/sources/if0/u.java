package if0;

/* loaded from: classes9.dex */
public final class u implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ if0.w f372579a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.zs4 f372580b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f372581c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f372582d;

    public u(if0.w wVar, r45.zs4 zs4Var, java.lang.String str, android.view.View view) {
        this.f372579a = wVar;
        this.f372580b = zs4Var;
        this.f372581c = str;
        this.f372582d = view;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        if (!z17 || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f372579a.Ai(this.f372580b, this.f372581c, this.f372582d, bitmap);
    }
}
