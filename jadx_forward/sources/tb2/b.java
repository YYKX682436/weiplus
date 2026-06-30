package tb2;

/* loaded from: classes2.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f498487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f498488e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tb2.f f498489f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.mb4 f498490g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f498491h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.widget.ImageView imageView, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, tb2.f fVar, r45.mb4 mb4Var, android.view.View view) {
        super(1);
        this.f498487d = imageView;
        this.f498488e = abstractC14490x69736cb5;
        this.f498489f = fVar;
        this.f498490g = mb4Var;
        this.f498491h = view;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.widget.ImageView imageView = this.f498487d;
        android.view.ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f498488e;
        int a17 = abstractC14490x69736cb5.getFeedObject().m59311x25315bf4() ? (int) (this.f498489f.f498503h * intValue) : bu2.z.a(bu2.z.g(this.f498490g), intValue, abstractC14490x69736cb5.getFeedObject().m59311x25315bf4());
        if (a17 > 0) {
            layoutParams.width = intValue;
            layoutParams.height = a17;
            imageView.setLayoutParams(layoutParams);
            android.view.View view = this.f498491h;
            view.getLayoutParams().width = layoutParams.width;
            view.getLayoutParams().height = layoutParams.height;
        }
        return jz5.f0.f384359a;
    }
}
