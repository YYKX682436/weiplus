package dr;

/* loaded from: classes12.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f323923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f323924e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 f323925f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dr.p f323926g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z17, android.graphics.drawable.Drawable drawable, com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 abstractC10447x8c9cf7d9, dr.p pVar) {
        super(0);
        this.f323923d = z17;
        this.f323924e = drawable;
        this.f323925f = abstractC10447x8c9cf7d9;
        this.f323926g = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.graphics.drawable.Drawable drawable;
        boolean z17 = this.f323923d;
        dr.p pVar = this.f323926g;
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 abstractC10447x8c9cf7d9 = this.f323925f;
        if (!z17 || (drawable = this.f323924e) == null) {
            if (abstractC10447x8c9cf7d9 != null) {
                abstractC10447x8c9cf7d9.n();
            }
            dr.q qVar = pVar.f323930d;
            if (qVar != null) {
                qVar.a(false);
            }
        } else {
            if (abstractC10447x8c9cf7d9 != null) {
                abstractC10447x8c9cf7d9.setImageDrawable(drawable);
            }
            if (abstractC10447x8c9cf7d9 != null) {
                abstractC10447x8c9cf7d9.m64933xc84dc82d();
            }
            dr.q qVar2 = pVar.f323930d;
            if (qVar2 != null) {
                qVar2.a(true);
            }
        }
        return jz5.f0.f384359a;
    }
}
