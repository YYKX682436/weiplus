package xf2;

/* loaded from: classes.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f535786d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f535787e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.du1 f535788f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.graphics.Bitmap bitmap, boolean z17, r45.du1 du1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f535786d = bitmap;
        this.f535787e = z17;
        this.f535788f = du1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xf2.c(this.f535786d, this.f535787e, this.f535788f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xf2.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        android.graphics.Bitmap bitmap = this.f535786d;
        float width = bitmap.getWidth() / bitmap.getHeight();
        boolean z17 = this.f535787e;
        if (!z17) {
            r45.du1 du1Var = this.f535788f;
            if (((r45.ua5) du1Var.m75936x14adae67(8)) != null && ((r45.ua5) du1Var.m75936x14adae67(9)) != null) {
                r45.ua5 ua5Var = (r45.ua5) du1Var.m75936x14adae67(9);
                float m75938x746dc8a6 = ua5Var != null ? ua5Var.m75938x746dc8a6(0) : 0.0f;
                r45.ua5 ua5Var2 = (r45.ua5) du1Var.m75936x14adae67(8);
                if (m75938x746dc8a6 - (ua5Var2 != null ? ua5Var2.m75938x746dc8a6(0) : 0.0f) > 0.0f) {
                    r45.ua5 ua5Var3 = (r45.ua5) du1Var.m75936x14adae67(9);
                    float m75938x746dc8a62 = ua5Var3 != null ? ua5Var3.m75938x746dc8a6(1) : 0.0f;
                    r45.ua5 ua5Var4 = (r45.ua5) du1Var.m75936x14adae67(8);
                    if (m75938x746dc8a62 - (ua5Var4 != null ? ua5Var4.m75938x746dc8a6(1) : 0.0f) > 0.0f && du1Var.m75939xb282bd08(13) != 0 && du1Var.m75939xb282bd08(14) != 0 && java.lang.Math.abs((du1Var.m75939xb282bd08(14) / du1Var.m75939xb282bd08(13)) - width) < width * 0.1d) {
                        r45.ua5 ua5Var5 = (r45.ua5) du1Var.m75936x14adae67(9);
                        float m75938x746dc8a63 = ua5Var5 != null ? ua5Var5.m75938x746dc8a6(0) : 0.0f;
                        r45.ua5 ua5Var6 = (r45.ua5) du1Var.m75936x14adae67(8);
                        float m75938x746dc8a64 = (m75938x746dc8a63 - (ua5Var6 != null ? ua5Var6.m75938x746dc8a6(0) : 0.0f)) * bitmap.getWidth();
                        r45.ua5 ua5Var7 = (r45.ua5) du1Var.m75936x14adae67(8);
                        float m75938x746dc8a65 = (ua5Var7 != null ? ua5Var7.m75938x746dc8a6(0) : 0.0f) * bitmap.getWidth();
                        r45.ua5 ua5Var8 = (r45.ua5) du1Var.m75936x14adae67(9);
                        float m75938x746dc8a66 = ua5Var8 != null ? ua5Var8.m75938x746dc8a6(1) : 0.0f;
                        r45.ua5 ua5Var9 = (r45.ua5) du1Var.m75936x14adae67(8);
                        float m75938x746dc8a67 = (m75938x746dc8a66 - (ua5Var9 != null ? ua5Var9.m75938x746dc8a6(1) : 0.0f)) * bitmap.getHeight();
                        r45.ua5 ua5Var10 = (r45.ua5) du1Var.m75936x14adae67(9);
                        return new int[]{(int) m75938x746dc8a65, (int) m75938x746dc8a64, (int) ((1.0f - (ua5Var10 != null ? ua5Var10.m75938x746dc8a6(1) : 0.0f)) * bitmap.getHeight()), (int) m75938x746dc8a67};
                    }
                }
            }
        }
        if (!z17) {
            if (!(width == 1.7777778f)) {
                if (!(width == 0.5625f)) {
                    if (bitmap.getWidth() > bitmap.getHeight()) {
                        if (width < 1.7777778f) {
                            int width2 = bitmap.getWidth();
                            int i17 = (int) (width2 / 1.7777778f);
                            return new int[]{0, width2, (bitmap.getHeight() - i17) / 2, i17};
                        }
                        int height = bitmap.getHeight();
                        int i18 = (int) (height * 1.7777778f);
                        return new int[]{(bitmap.getWidth() - i18) / 2, i18, 0, height};
                    }
                    if (width < 0.5625f) {
                        int width3 = bitmap.getWidth();
                        int i19 = (int) (width3 / 0.5625f);
                        return new int[]{0, width3, (bitmap.getHeight() - i19) / 2, i19};
                    }
                    int height2 = bitmap.getHeight();
                    int i27 = (int) (height2 * 0.5625f);
                    return new int[]{(bitmap.getWidth() - i27) / 2, i27, 0, height2};
                }
            }
        }
        return new int[]{0, bitmap.getWidth(), 0, bitmap.getHeight()};
    }
}
