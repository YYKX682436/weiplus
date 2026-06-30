package e04;

/* loaded from: classes5.dex */
public abstract class g2 {
    public static final void a(android.content.Context context, c01.ka kaVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("openMyQrCodePage scene: ");
        sb6.append(kaVar != null ? java.lang.Integer.valueOf(kaVar.f118821a) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanMyQrCodeHelper", sb6.toString());
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class);
        pf5.j0.a(intent, b04.z.class);
        intent.putExtra("key_enter_scene", kaVar != null ? kaVar.f118821a : 0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(b04.f.class);
        if (((yz3.m) ((kd0.r2) i95.n0.c(kd0.r2.class))).f550068e) {
            ((gh0.e) i95.n0.c(gh0.e.class)).getClass();
            arrayList.add(com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8.class);
        }
        arrayList.add(b04.j0.class);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((java.lang.Class) it.next()).getName());
        }
        intent.putExtra("code_item_uic_clz", (java.lang.String[]) arrayList2.toArray(new java.lang.String[0]));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            pf5.j0.a(intent, (java.lang.Class) it6.next());
        }
        ((vd0.w2) ((wd0.v1) i95.n0.c(wd0.v1.class))).getClass();
        pf5.j0.a(intent, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0.class);
        if (!(context instanceof android.app.Activity)) {
            intent.addFlags(268435456);
        }
        ((zp5.f) ((gh0.e) i95.n0.c(gh0.e.class))).getClass();
        cq5.i.f303076a.i();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        arrayList3.add(intent);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(context, arrayList3.toArray(), "com/tencent/mm/plugin/scanner/util/ScanMyQrCodeHelper", "openMyQrCodePage", "(Landroid/content/Context;Lcom/tencent/mm/model/MyQRCodeParams;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList3.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/scanner/util/ScanMyQrCodeHelper", "openMyQrCodePage", "(Landroid/content/Context;Lcom/tencent/mm/model/MyQRCodeParams;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
