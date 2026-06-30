package gd2;

/* loaded from: classes3.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gd2.x f352095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 f352096e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(gd2.x xVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 c5974x1d8a7409) {
        super(0);
        this.f352095d = xVar;
        this.f352096e = c5974x1d8a7409;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        gd2.x xVar = this.f352095d;
        int i17 = xVar.f352103g;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 c5974x1d8a7409 = this.f352096e;
        if (i17 == c5974x1d8a7409.f136272g.f87933a) {
            xVar.c();
            am.ct ctVar = c5974x1d8a7409.f136272g;
            boolean z17 = ctVar.f87935c;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = xVar.f352097a;
            if (!z17) {
                db5.e1.G(abstractActivityC21394xb3d2c0cf, abstractActivityC21394xb3d2c0cf.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iaw), "", false, null);
            } else if (com.p314xaae8f345.mm.vfs.w6.j(ctVar.f87936d)) {
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("original_file_path", xVar.f352104h);
                intent.putExtra("translate_source", ctVar.f87934b);
                intent.setClassName(abstractActivityC21394xb3d2c0cf, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = xVar.f352097a;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(abstractActivityC21394xb3d2c0cf2, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/commentimage/menu/FinderCommentImageTransAndOcrLogic", "handleTranslationResultEvent", "(Lcom/tencent/mm/autogen/events/ScanTranslationResultEvent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                abstractActivityC21394xb3d2c0cf2.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(abstractActivityC21394xb3d2c0cf2, "com/tencent/mm/plugin/finder/feed/ui/commentimage/menu/FinderCommentImageTransAndOcrLogic", "handleTranslationResultEvent", "(Lcom/tencent/mm/autogen/events/ScanTranslationResultEvent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("FinderCommentImageTransAndOcrLogic", "trans result path %s not exist!", ctVar.f87936d);
            }
            xVar.f352103g = 0;
            xVar.f352104h = null;
        }
        return jz5.f0.f384359a;
    }
}
