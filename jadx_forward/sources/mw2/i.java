package mw2;

/* loaded from: classes2.dex */
public final class i extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mw2.j f413254d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(mw2.j jVar) {
        super(3);
        this.f413254d = jVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        mw2.e eVar;
        android.widget.ImageView imageView;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        int intValue2 = ((java.lang.Number) obj3).intValue();
        if (bitmap != null) {
            mw2.j jVar = this.f413254d;
            r45.ir2 a17 = jVar.a();
            if (a17 != null) {
                int m75939xb282bd08 = a17.m75939xb282bd08(5);
                int m75939xb282bd082 = a17.m75939xb282bd08(4);
                if (m75939xb282bd08 <= 0 || m75939xb282bd082 <= 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderSpritePreviewController", "Invalid image dimensions: " + m75939xb282bd08 + " x " + m75939xb282bd082);
                } else {
                    int i17 = intValue2 * m75939xb282bd08;
                    int i18 = intValue * m75939xb282bd082;
                    if (i17 < 0 || i18 < 0 || i17 + m75939xb282bd08 > bitmap.getWidth() || i18 + m75939xb282bd082 > bitmap.getHeight()) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderSpritePreviewController", "Crop area out of bounds: " + i17 + ',' + i18 + ',' + (i17 + m75939xb282bd08) + ',' + (i18 + m75939xb282bd082) + " vs " + bitmap.getWidth() + 'x' + bitmap.getHeight());
                    } else {
                        eVar = new mw2.e(i17, i18, m75939xb282bd08, m75939xb282bd082);
                        if (eVar != null && (imageView = jVar.f413256b) != null) {
                            imageView.post(new mw2.h(jVar, eVar, bitmap));
                        }
                    }
                }
            }
            eVar = null;
            if (eVar != null) {
                imageView.post(new mw2.h(jVar, eVar, bitmap));
            }
        }
        return jz5.f0.f384359a;
    }
}
