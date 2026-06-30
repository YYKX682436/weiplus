package kf5;

/* loaded from: classes9.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2686xc5e33a1f.C22115x12e50717 f389036d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2686xc5e33a1f.C22115x12e50717 c22115x12e50717) {
        super(3);
        this.f389036d = c22115x12e50717;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.String str;
        yz5.p pVar;
        c11.b bVar;
        java.util.List list;
        java.lang.String str2;
        int intValue = ((java.lang.Number) obj).intValue();
        android.view.View view = (android.view.View) obj2;
        c11.c cVar = (c11.c) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ui6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2686xc5e33a1f.C22115x12e50717.f286421h;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.p2681x6c9280c5.p2686xc5e33a1f.C22115x12e50717 c22115x12e50717 = this.f389036d;
        c22115x12e50717.getClass();
        int i18 = kf5.f.f389037a;
        gk0.k kVar = new gk0.k(i18, i18);
        kVar.f353967e = com.p314xaae8f345.mm.R.raw.f78812xc23c44d1;
        kVar.f353966d = 0.05f;
        java.lang.String str3 = "";
        if (cVar == null || (str = cVar.f119354a) == null) {
            str = "";
        }
        if (com.p314xaae8f345.mm.vfs.w6.j(str)) {
            gk0.n0 n0Var = (gk0.n0) i95.n0.c(gk0.n0.class);
            if (cVar != null && (str2 = cVar.f119354a) != null) {
                str3 = str2;
            }
            ((h83.g) n0Var).Ai(imageView, str3, kVar);
        } else if (cVar == null || (bVar = cVar.f119355b) == null) {
            c11.f m48328xa0ab20ce = c22115x12e50717.m48328xa0ab20ce();
            if (m48328xa0ab20ce != null && (pVar = m48328xa0ab20ce.f119376o) != null) {
                pVar.mo149xb9724478(java.lang.Integer.valueOf(intValue), imageView);
            }
        } else {
            y01.a c17 = af5.y0.c(bVar);
            java.lang.String wi6 = ((rx.h) ((gk0.k0) i95.n0.c(gk0.k0.class))).wi(kVar, c17);
            i95.m c18 = i95.n0.c(gk0.n0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            g75.z x66 = gk0.n0.x6((gk0.n0) c18, wi6, kVar, imageView, null, 8, null);
            x66.l("KeyCdnParams", c17);
            gk0.j.b(((rx.h) ((gk0.k0) i95.n0.c(gk0.k0.class))).Ai(), x66, null, 2, null);
        }
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) view.findViewById(com.p314xaae8f345.mm.R.id.ui7);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(frameLayout);
        frameLayout.removeAllViews();
        if (cVar != null && (list = cVar.f119356c) != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                frameLayout.addView((android.view.View) it.next());
            }
        }
        return jz5.f0.f384359a;
    }
}
