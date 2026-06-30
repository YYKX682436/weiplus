package kj2;

/* loaded from: classes10.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kj2.e0 f389927d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(kj2.e0 e0Var) {
        super(1);
        this.f389927d = e0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(new android.graphics.drawable.ColorDrawable[]{new android.graphics.drawable.ColorDrawable(((java.lang.Number) obj).intValue()), new android.graphics.drawable.ColorDrawable(android.graphics.Color.parseColor("#80000000"))});
        kj2.e0 e0Var = this.f389927d;
        e0Var.N = layerDrawable;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22645x24069159 c22645x24069159 = e0Var.L;
        if (c22645x24069159 != null) {
            c22645x24069159.setBackgroundDrawable(e0Var.mo124438x9f24d53a());
        }
        return jz5.f0.f384359a;
    }
}
