package dl4;

/* loaded from: classes3.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f316888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f316889f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dl4.m0 f316890g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ff0.r f316891h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, dl4.m0 m0Var, ff0.r rVar) {
        super(0);
        this.f316887d = str;
        this.f316888e = view;
        this.f316889f = bitmap;
        this.f316890g = m0Var;
        this.f316891h = rVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        android.view.View view = this.f316888e;
        java.util.Objects.toString(view != null ? view.getTag(com.p314xaae8f345.mm.R.id.f568843o93) : null);
        android.graphics.Bitmap bitmap = this.f316889f;
        java.util.Objects.toString(bitmap);
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(view != null ? view.getTag(com.p314xaae8f345.mm.R.id.f568843o93) : null, this.f316887d);
        ff0.r rVar = this.f316891h;
        if (b17) {
            this.f316890g.getClass();
            pm0.v.X(new dl4.j0(bitmap, view));
            if (rVar != null) {
                z17 = (bitmap == null || bitmap.isRecycled()) ? false : true;
                yz5.l lVar = ((dl4.i0) rVar).f316946a;
                if (lVar != null) {
                    lVar.mo146xb9724478(java.lang.Boolean.valueOf(z17));
                }
            }
        } else if (rVar != null) {
            z17 = view == null;
            yz5.l lVar2 = ((dl4.i0) rVar).f316946a;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(java.lang.Boolean.valueOf(z17));
            }
        }
        return jz5.f0.f384359a;
    }
}
