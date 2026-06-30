package li2;

/* loaded from: classes10.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ li2.o f400303d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(li2.o oVar) {
        super(1);
        this.f400303d = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.ColorDrawable[]{new android.graphics.drawable.ColorDrawable(((java.lang.Number) obj).intValue()), new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor("#80000000"))});
        li2.o oVar = this.f400303d;
        oVar.f400304p0 = layerDrawable;
        android.view.ViewGroup m145799x4723753 = oVar.m145799x4723753();
        if (m145799x4723753 != null) {
            m145799x4723753.setBackgroundDrawable(oVar.mo124438x9f24d53a());
        }
        return jz5.f0.f384359a;
    }
}
