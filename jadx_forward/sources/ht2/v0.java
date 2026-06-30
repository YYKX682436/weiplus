package ht2;

/* loaded from: classes2.dex */
public final class v0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f366452d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zy2.r6 f366453e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f366454f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ht2.y0 f366455g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725, zy2.r6 r6Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352, ht2.y0 y0Var) {
        super(2);
        this.f366452d = c19792x256d2725;
        this.f366453e = r6Var;
        this.f366454f = c22699x3dcdb352;
        this.f366455g = y0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String url = (java.lang.String) obj;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[setIconInTimeLineFeedLike] ");
        sb6.append(pm0.v.u(this.f366452d.m76784x5db1b11()));
        sb6.append(" bitmap is null?");
        sb6.append(bitmap == null);
        sb6.append(" url=");
        sb6.append(url);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.DynamicIconResService", sb6.toString());
        zy2.r6 r6Var = this.f366453e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f366454f;
        if (bitmap != null) {
            if (r6Var.f559084b) {
                c22699x3dcdb352.setAlpha(1.0f);
            } else {
                c22699x3dcdb352.setAlpha(0.8f);
            }
            c22699x3dcdb352.setImageDrawable(new android.graphics.drawable.BitmapDrawable(c22699x3dcdb352.getResources(), bitmap));
        } else {
            this.f366455g.rj(c22699x3dcdb352, r6Var);
        }
        return jz5.f0.f384359a;
    }
}
