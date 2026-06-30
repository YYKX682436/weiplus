package rc3;

/* loaded from: classes7.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc3.w0 f475591d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f475592e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float[] f475593f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float[] f475594g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float[] f475595h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ float[] f475596i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(rc3.w0 w0Var, int i17, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        super(0);
        this.f475591d = w0Var;
        this.f475592e = i17;
        this.f475593f = fArr;
        this.f475594g = fArr2;
        this.f475595h = fArr3;
        this.f475596i = fArr4;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str;
        rc3.w0 w0Var = this.f475591d;
        java.lang.String str2 = w0Var.f475638z;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("canvas view ");
        int i17 = this.f475592e;
        sb6.append(i17);
        sb6.append(" touch rect changed...");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
        cf3.d dVar = (cf3.d) w0Var.f475629q.get(java.lang.Integer.valueOf(i17));
        float[] fArr = this.f475596i;
        float[] fArr2 = this.f475595h;
        float[] fArr3 = this.f475594g;
        float[] fArr4 = this.f475593f;
        if (dVar != null) {
            int length = fArr4.length;
            java.util.ArrayList arrayList = new java.util.ArrayList(length);
            for (int i18 = 0; i18 < length; i18++) {
                float f17 = fArr4[i18];
                float f18 = fArr3[i18];
                arrayList.add(new android.graphics.RectF(f17, f18, fArr2[i18] + f17, f18 + fArr[i18]));
            }
            if (!arrayList.isEmpty()) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((android.graphics.RectF) it.next()).toString());
                }
                java.util.Iterator it6 = arrayList2.iterator();
                if (!it6.hasNext()) {
                    throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
                }
                java.lang.Object next = it6.next();
                while (it6.hasNext()) {
                    next = ((java.lang.String) next) + ';' + ((java.lang.String) it6.next());
                }
                str = (java.lang.String) next;
            } else {
                str = "";
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            dVar.f122457i = arrayList;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1851x373aa5.TextureViewSurfaceTextureListenerC16468xc9008a26 textureViewSurfaceTextureListenerC16468xc9008a26 = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1851x373aa5.TextureViewSurfaceTextureListenerC16468xc9008a26) w0Var.f475628p.get(java.lang.Integer.valueOf(i17));
        if (textureViewSurfaceTextureListenerC16468xc9008a26 != null) {
            int length2 = fArr4.length;
            java.util.ArrayList arrayList3 = new java.util.ArrayList(length2);
            for (int i19 = 0; i19 < length2; i19++) {
                float f19 = fArr4[i19];
                float f27 = fArr3[i19];
                arrayList3.add(new android.graphics.RectF(f19, f27, fArr2[i19] + f19, fArr[i19] + f27));
            }
            textureViewSurfaceTextureListenerC16468xc9008a26.m66543x258d7899(arrayList3);
        }
        return jz5.f0.f384359a;
    }
}
