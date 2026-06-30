package ho;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final jz5.g f364148a = jz5.h.b(ho.a.f364147d);

    public static final void a(y01.a aVar, android.widget.ImageView imageView, gk0.k kVar) {
        if (imageView == null || aVar == null || kVar == null) {
            return;
        }
        java.lang.String wi6 = ((rx.h) ((gk0.k0) i95.n0.c(gk0.k0.class))).wi(kVar, aVar);
        g75.z Ui = ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Ui(wi6, kVar, imageView, aVar.f540109e);
        Ui.l("KeyCdnParams", aVar);
        Ui.l("KeyAppMsgSubType", 24);
        Ui.l("KeyFileMd5", aVar.f540110f);
        gk0.j.b((gk0.j) ((jz5.n) f364148a).mo141623x754a37bb(), Ui, null, 2, null);
    }

    public static final void b(android.view.ViewGroup mask, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mask, "mask");
        int childCount = mask.getChildCount();
        boolean z17 = false;
        int i19 = 0;
        while (true) {
            if (i19 >= childCount) {
                z17 = true;
                break;
            }
            android.view.View childAt = mask.getChildAt(i19);
            if (childAt.getVisibility() == 0 || childAt.getVisibility() == 4) {
                break;
            } else {
                i19++;
            }
        }
        if (z17) {
            mask.setBackground(mask.getContext().getDrawable(i17));
        } else {
            mask.setBackground(mask.getContext().getDrawable(i18));
        }
    }
}
