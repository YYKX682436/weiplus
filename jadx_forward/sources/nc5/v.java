package nc5;

/* loaded from: classes3.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nc5.w f417769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 f417770e;

    public v(nc5.w wVar, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 c5974x1d8a7409) {
        this.f417769d = wVar;
        this.f417770e = c5974x1d8a7409;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nc5.w wVar = this.f417769d;
        int i17 = wVar.f417771a;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5974x1d8a7409 c5974x1d8a7409 = this.f417770e;
        am.ct ctVar = c5974x1d8a7409.f136272g;
        if (i17 == ctVar.f87933a) {
            if (ctVar.f87935c && wVar.f417772b != null && wVar.f417773c != null) {
                if (com.p314xaae8f345.mm.vfs.w6.j(ctVar.f87936d)) {
                    android.content.Intent intent = new android.content.Intent();
                    android.app.Activity activity = wVar.f417772b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity);
                    android.content.Intent className = intent.setClassName(activity, "com.tencent.mm.plugin.scanner.ui.TranslationResultUI");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(className, "setClassName(...)");
                    className.putExtra("original_file_path", wVar.f417774d);
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = wVar.f417773c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f9Var);
                    className.putExtra("msg_id", f9Var.m124847x74d37ac6());
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var2 = wVar.f417773c;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(f9Var2);
                    className.putExtra("msg_talker", f9Var2.Q0());
                    className.putExtra("translate_source", c5974x1d8a7409.f136272g.f87934b);
                    m11.b0 b0Var = wVar.f417775e;
                    if (b0Var != null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b0Var);
                        className.putExtra("fileid", b0Var.f());
                        m11.b0 b0Var2 = wVar.f417775e;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b0Var2);
                        className.putExtra("aeskey", b0Var2.d());
                    }
                    android.app.Activity activity2 = wVar.f417772b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(className);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(activity2, arrayList.toArray(), "com/tencent/mm/ui/chatting/gallery/query/ScanTransImage$scanTranslationResultEventListener$1$callback$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    activity2.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(activity2, "com/tencent/mm/ui/chatting/gallery/query/ScanTransImage$scanTranslationResultEventListener$1$callback$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    android.app.Activity activity3 = wVar.f417772b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity3);
                    activity3.finish();
                    android.app.Activity activity4 = wVar.f417772b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(activity4);
                    activity4.overridePendingTransition(com.p314xaae8f345.mm.R.C30854x2dc211.f559261p, com.p314xaae8f345.mm.R.C30854x2dc211.f559261p);
                    return;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ScanTransImageUtil", "trans result path %s not exist!", c5974x1d8a7409.f136272g.f87936d);
            }
            android.app.Activity activity5 = wVar.f417772b;
            db5.e1.G(activity5, activity5 != null ? activity5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iaw) : null, "", false, null);
        }
    }
}
