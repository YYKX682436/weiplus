package yr1;

/* loaded from: classes14.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1297xed8e89a9.C12995x6d6be93 f546175d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1297xed8e89a9.C12995x6d6be93 c12995x6d6be93) {
        super(2);
        this.f546175d = c12995x6d6be93;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        float floatValue = ((java.lang.Number) obj2).floatValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1297xed8e89a9.C12995x6d6be93 c12995x6d6be93 = this.f546175d;
        c12995x6d6be93.f175608n = floatValue;
        com.p314xaae8f345.mm.p2776x373aa5.p2778xb118f8f1.C22822xceb63781.a aVar = c12995x6d6be93.f175609o;
        if (aVar != null) {
            aVar.a(floatValue);
        }
        yr1.k kVar = c12995x6d6be93.f175606i;
        if (kVar != null) {
            android.content.Context context = kVar.f546181d;
            float b17 = (intValue - 0.0f) / (i65.a.b(context, 56) - 0.0f);
            float f17 = (b17 - 0.5f) * 2.0f;
            if (f17 < 0.0f) {
                f17 = 0.0f;
            }
            if (f17 > 1.0f) {
                f17 = 1.0f;
            }
            if (b17 > 1.0f) {
                b17 = 1.0f;
            }
            if (0.0f >= b17) {
                b17 = 0.0f;
            }
            int b18 = i65.a.b(context, 16);
            int b19 = i65.a.b(context, 4);
            android.view.View view = kVar.f546179b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.profile.BizDragHeaderView");
            com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1297xed8e89a9.C12996x177746f9 c12996x177746f9 = (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1297xed8e89a9.C12996x177746f9) view;
            int i17 = (int) (b19 + (b17 * (b18 - b19)));
            android.graphics.RectF rectF = c12996x177746f9.f175614e;
            rectF.left = 0.0f;
            rectF.top = 0.0f;
            rectF.right = c12996x177746f9.f175616g;
            rectF.bottom = i17;
            c12996x177746f9.postInvalidate();
            android.view.View view2 = kVar.f546180c;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/profile/BizDragHeaderComponent", "onDragTranslation", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/brandservice/ui/profile/BizDragHeaderComponent", "onDragTranslation", "(I)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        return jz5.f0.f384359a;
    }
}
