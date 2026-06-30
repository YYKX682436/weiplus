package zc;

/* loaded from: classes15.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 f552905d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238) {
        super(1);
        this.f552905d = c3646xcf902238;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.Window window;
        android.view.View decorView;
        android.view.Window window2;
        android.view.View decorView2;
        android.view.Window window3;
        android.view.View decorView3;
        android.view.Window window4;
        android.view.View decorView4;
        android.content.res.Configuration it = (android.content.res.Configuration) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p362xadfe2b3.C3646xcf902238 c3646xcf902238 = this.f552905d;
        c3646xcf902238.getClass();
        boolean m65381x1cd9fc48 = com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65381x1cd9fc48();
        if (m65381x1cd9fc48 != c3646xcf902238.A) {
            kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "DarkMode change %b", java.lang.Boolean.valueOf(m65381x1cd9fc48));
            c3646xcf902238.A = m65381x1cd9fc48;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65509x9ba0b622(m65381x1cd9fc48);
        }
        int i17 = it.orientation;
        android.app.Activity activity = c3646xcf902238.f127508q;
        int i18 = 0;
        if (i17 == 2 && !c3646xcf902238.f127517z) {
            c3646xcf902238.f127517z = true;
            c3646xcf902238.e();
            int i19 = c3646xcf902238.F;
            if (i19 != 2 && i19 != 4) {
                if (activity != null && (window4 = activity.getWindow()) != null && (decorView4 = window4.getDecorView()) != null) {
                    i18 = decorView4.getSystemUiVisibility();
                }
                int i27 = i18 | 4100;
                if (activity != null && (window3 = activity.getWindow()) != null && (decorView3 = window3.getDecorView()) != null) {
                    decorView3.setSystemUiVisibility(i27);
                }
            }
        } else if (i17 == 1 && c3646xcf902238.f127517z) {
            c3646xcf902238.f127517z = false;
            c3646xcf902238.e();
            int i28 = c3646xcf902238.F;
            if (i28 != 2 && i28 != 4) {
                if (activity != null && (window2 = activity.getWindow()) != null && (decorView2 = window2.getDecorView()) != null) {
                    i18 = decorView2.getSystemUiVisibility();
                }
                int i29 = i18 & (-4101);
                if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
                    decorView.setSystemUiVisibility(i29);
                }
            }
        } else {
            float f17 = it.fontScale;
            if (!(f17 == c3646xcf902238.B) && com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.f37146x33108b1b) {
                kd.c.c("LiteApp.WxaLiteAppWidgetAdapter", "fontScale change %b", java.lang.Float.valueOf(f17));
                float f18 = it.fontScale;
                c3646xcf902238.B = f18;
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.AbstractC16186x8412d8a8.m65513xeb611f72(f18);
            }
        }
        return jz5.f0.f384359a;
    }
}
