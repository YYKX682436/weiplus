package fq5;

/* loaded from: classes5.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 f347191d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 f347192e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 c22927xe8447aa8, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185) {
        super(2);
        this.f347191d = c22927xe8447aa8;
        this.f347192e = c22675xc8629185;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.widget.FrameLayout expandContainer = (android.widget.FrameLayout) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(expandContainer, "expandContainer");
        expandContainer.toString();
        expandContainer.getChildCount();
        com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 c22927xe8447aa8 = this.f347191d;
        c22927xe8447aa8.f295810f = booleanValue;
        if (expandContainer.getChildCount() == 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185 = this.f347192e;
            android.view.View inflate = android.view.LayoutInflater.from(c22675xc8629185.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.equ, (android.view.ViewGroup) null);
            c22927xe8447aa8.f295808d = inflate;
            if (inflate != null) {
                inflate.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
                c22927xe8447aa8.f295809e = new em.j4(inflate);
                expandContainer.addView(inflate);
                int dimension = (int) c22675xc8629185.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561226cs);
                int dimension2 = (int) c22675xc8629185.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
                expandContainer.setPadding(dimension2, dimension, dimension2, dimension);
            }
            if (booleanValue && c22927xe8447aa8.f295811g == null) {
                c22927xe8447aa8.U6();
            }
        }
        return jz5.f0.f384359a;
    }
}
