package au2;

/* loaded from: classes7.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ au2.q f14075d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f14076e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(au2.q qVar, android.content.Context context) {
        super(0);
        this.f14075d = qVar;
        this.f14076e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object m521constructorimpl;
        java.lang.String str;
        java.lang.String str2;
        android.content.Context context = this.f14076e;
        this.f14075d.getClass();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(m95.a.a(context.getResources(), com.tencent.mm.R.raw.icon_finder_shortcuts, 3.0f));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.String str3 = null;
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
            m521constructorimpl = null;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) m521constructorimpl;
        if (bitmap != null) {
            java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.o6h);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            android.content.Intent intent = new android.content.Intent("com.tencent.mm.action.WX_SHORTCUT");
            intent.putExtra("type", 5);
            intent.setPackage(context.getPackageName());
            intent.addFlags(67108864);
            android.content.Intent intent2 = new android.content.Intent("com.android.launcher.action.INSTALL_SHORTCUT");
            intent2.putExtra("android.intent.extra.shortcut.NAME", string);
            intent2.putExtra("duplicate", false);
            intent2.putExtra("android.intent.extra.shortcut.INTENT", intent);
            intent2.putExtra("android.intent.extra.shortcut.ICON", bitmap);
            intent2.putExtra("shortcut_is_adaptive_icon", true);
            if (((android.content.Intent) intent2.getParcelableExtra("android.intent.extra.shortcut.INTENT")) != null) {
                ae0.h hVar = (ae0.h) i95.n0.c(ae0.h.class);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                java.lang.String str4 = au2.q.f14085i;
                sb6.append(str4);
                sb6.append(0);
                java.lang.String sb7 = sb6.toString();
                java.lang.String g17 = wo.w0.g(true);
                ((zd0.e) hVar).getClass();
                java.lang.String h17 = xp1.c.h(sb7, g17);
                if (h17 != null) {
                    ae0.h hVar2 = (ae0.h) i95.n0.c(ae0.h.class);
                    byte[] bytes = h17.getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                    ((zd0.e) hVar2).getClass();
                    str2 = xp1.c.o(bytes);
                } else {
                    str2 = null;
                }
                ae0.h hVar3 = (ae0.h) i95.n0.c(ae0.h.class);
                java.lang.String str5 = str4 + 0;
                java.lang.String c17 = wo.w0.c();
                ((zd0.e) hVar3).getClass();
                java.lang.String h18 = xp1.c.h(str5, c17);
                if (h18 != null) {
                    ae0.h hVar4 = (ae0.h) i95.n0.c(ae0.h.class);
                    byte[] bytes2 = h18.getBytes(r26.c.f368865a);
                    kotlin.jvm.internal.o.f(bytes2, "getBytes(...)");
                    ((zd0.e) hVar4).getClass();
                    str3 = xp1.c.o(bytes2);
                }
                com.tencent.mars.xlog.Log.i("FinderShortcutsService", "getShortcutId, shortcutId = " + str2 + ", \n shortcutIdByAndroidId = " + str3);
                str = str2;
            } else {
                str = null;
            }
            try {
                ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
                xp1.c.b(context, intent2, str3, str, false, com.tencent.mm.plugin.finder.shortcuts.FinderShortcutReceiver.class);
                com.tencent.mars.xlog.Log.i("FinderShortcutsService", "add shortcut success");
            } catch (java.lang.IllegalStateException e17) {
                com.tencent.mars.xlog.Log.e("FinderShortcutsService", e17.toString());
            }
        }
        return jz5.f0.f302826a;
    }
}
