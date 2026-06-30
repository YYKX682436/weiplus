package oj2;

/* loaded from: classes10.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oj2.f f427293d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(oj2.f fVar) {
        super(1);
        this.f427293d = fVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.ColorDrawable[]{new android.graphics.drawable.ColorDrawable(((java.lang.Number) obj).intValue()), new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor("#80000000"))});
        oj2.f fVar = this.f427293d;
        fVar.f427298p0 = layerDrawable;
        android.view.ViewGroup m151508x4723753 = fVar.m151508x4723753();
        if (m151508x4723753 != null) {
            m151508x4723753.setBackgroundDrawable(fVar.mo124438x9f24d53a());
        }
        return jz5.f0.f384359a;
    }
}
