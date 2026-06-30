package com.p314xaae8f345.mm.p1006xc5476f33.fav.ui;

/* loaded from: classes12.dex */
public class hc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 f182686d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13583x9afc4394 f182687e;

    public hc(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.C13583x9afc4394 c13583x9afc4394, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 c5974x1d8a7409) {
        this.f182687e = c13583x9afc4394;
        this.f182686d = c5974x1d8a7409;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f182687e.f181980d.f182834c == this.f182686d.f136272g.f87933a) {
            this.f182687e.f181980d.b();
            am.ct ctVar = this.f182686d.f136272g;
            if (ctVar.f87935c) {
                if (com.p314xaae8f345.mm.vfs.w6.j(ctVar.f87936d)) {
                    java.lang.String x27 = this.f182687e.f181980d.f182836e.x2();
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("original_file_path", x27);
                    intent.putExtra("translate_source", this.f182686d.f136272g.f87934b);
                    intent.setClassName(this.f182687e.f181980d.f182837f, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
                    intent.putExtra("fileid", this.f182687e.f181980d.f182836e.y3());
                    intent.putExtra("aeskey", this.f182687e.f181980d.f182836e.mo54574x1061ea06());
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f182687e.f181980d.f182837f;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(abstractActivityC21394xb3d2c0cf, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/PhotoTransControl$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    abstractActivityC21394xb3d2c0cf.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(abstractActivityC21394xb3d2c0cf, "com/tencent/mm/plugin/fav/ui/PhotoTransControl$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    this.f182687e.f181980d.f182837f.finish();
                    this.f182687e.f181980d.f182837f.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PhotoTransControl", "trans result path %s not exist!", this.f182686d.f136272g.f87936d);
            }
            this.f182687e.f181980d.f182834c = 0;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf2 = this.f182687e.f181980d.f182837f;
            db5.e1.G(abstractActivityC21394xb3d2c0cf2, abstractActivityC21394xb3d2c0cf2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iaw), "", false, null);
        }
    }
}
