package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class hc implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ScanTranslationResultEvent f101153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.PhotoTransControl$1 f101154e;

    public hc(com.tencent.mm.plugin.fav.ui.PhotoTransControl$1 photoTransControl$1, com.tencent.mm.autogen.events.ScanTranslationResultEvent scanTranslationResultEvent) {
        this.f101154e = photoTransControl$1;
        this.f101153d = scanTranslationResultEvent;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f101154e.f100447d.f101301c == this.f101153d.f54739g.f6400a) {
            this.f101154e.f100447d.b();
            am.ct ctVar = this.f101153d.f54739g;
            if (ctVar.f6402c) {
                if (com.tencent.mm.vfs.w6.j(ctVar.f6403d)) {
                    java.lang.String x27 = this.f101154e.f100447d.f101303e.x2();
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("original_file_path", x27);
                    intent.putExtra("translate_source", this.f101153d.f54739g.f6401b);
                    intent.setClassName(this.f101154e.f100447d.f101304f, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
                    intent.putExtra("fileid", this.f101154e.f100447d.f101303e.y3());
                    intent.putExtra("aeskey", this.f101154e.f100447d.f101303e.getAesKey());
                    com.tencent.mm.ui.MMActivity mMActivity = this.f101154e.f100447d.f101304f;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(mMActivity, arrayList.toArray(), "com/tencent/mm/plugin/fav/ui/PhotoTransControl$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    mMActivity.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(mMActivity, "com/tencent/mm/plugin/fav/ui/PhotoTransControl$1$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    this.f101154e.f100447d.f101304f.finish();
                    this.f101154e.f100447d.f101304f.overridePendingTransition(com.tencent.mm.R.anim.f477728p, com.tencent.mm.R.anim.f477728p);
                    return;
                }
                com.tencent.mars.xlog.Log.w("MicroMsg.PhotoTransControl", "trans result path %s not exist!", this.f101153d.f54739g.f6403d);
            }
            this.f101154e.f100447d.f101301c = 0;
            com.tencent.mm.ui.MMActivity mMActivity2 = this.f101154e.f100447d.f101304f;
            db5.e1.G(mMActivity2, mMActivity2.getString(com.tencent.mm.R.string.iaw), "", false, null);
        }
    }
}
