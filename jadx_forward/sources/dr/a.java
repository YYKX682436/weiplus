package dr;

/* loaded from: classes12.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dr.d f323905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.Drawable f323906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 f323907f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f323908g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(dr.d dVar, android.graphics.drawable.Drawable drawable, com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 abstractC10447x8c9cf7d9, boolean z17) {
        super(0);
        this.f323905d = dVar;
        this.f323906e = drawable;
        this.f323907f = abstractC10447x8c9cf7d9;
        this.f323908g = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = ar.b.f94888a;
        dr.d dVar = this.f323905d;
        java.lang.String str = dVar.f323911g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiLoader.AnimateCache", "put " + str);
        android.graphics.drawable.Drawable drawable = this.f323906e;
        if (str != null) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var2 = ar.b.f94888a;
            if (drawable != null) {
                r2Var2.put(str, new java.lang.ref.WeakReference(drawable));
            } else {
                r2Var2.m77803xc84af884(str);
            }
        }
        com.p314xaae8f345.mm.p679x5c28046.p684x373aa5.AbstractC10447x8c9cf7d9 abstractC10447x8c9cf7d9 = this.f323907f;
        if (abstractC10447x8c9cf7d9 != null) {
            abstractC10447x8c9cf7d9.setImageDrawable(drawable);
        }
        if (abstractC10447x8c9cf7d9 != null) {
            abstractC10447x8c9cf7d9.m64933xc84dc82d();
        }
        dr.q qVar = dVar.f323930d;
        if (qVar != null) {
            qVar.a(this.f323908g && drawable != null);
        }
        return jz5.f0.f384359a;
    }
}
