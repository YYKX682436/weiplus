package au2;

/* loaded from: classes7.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ au2.q f95608d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f95609e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(au2.q qVar, android.content.Context context) {
        super(0);
        this.f95608d = qVar;
        this.f95609e = context;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object m143895xf1229813;
        java.lang.String str;
        java.lang.String str2;
        android.content.Context context = this.f95609e;
        this.f95608d.getClass();
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(m95.a.a(context.getResources(), com.p314xaae8f345.mm.R.raw.f79551xc9d82f1a, 3.0f));
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.String str3 = null;
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = null;
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) m143895xf1229813;
        if (bitmap != null) {
            java.lang.String string = context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o6h);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
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
                java.lang.String str4 = au2.q.f95618i;
                sb6.append(str4);
                sb6.append(0);
                java.lang.String sb7 = sb6.toString();
                java.lang.String g17 = wo.w0.g(true);
                ((zd0.e) hVar).getClass();
                java.lang.String h17 = xp1.c.h(sb7, g17);
                if (h17 != null) {
                    ae0.h hVar2 = (ae0.h) i95.n0.c(ae0.h.class);
                    byte[] bytes = h17.getBytes(r26.c.f450398a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
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
                    byte[] bytes2 = h18.getBytes(r26.c.f450398a);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes2, "getBytes(...)");
                    ((zd0.e) hVar4).getClass();
                    str3 = xp1.c.o(bytes2);
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShortcutsService", "getShortcutId, shortcutId = " + str2 + ", \n shortcutIdByAndroidId = " + str3);
                str = str2;
            } else {
                str = null;
            }
            try {
                ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
                xp1.c.b(context, intent2, str3, str, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1635x8725aced.C14987xccb3e0bb.class);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderShortcutsService", "add shortcut success");
            } catch (java.lang.IllegalStateException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderShortcutsService", e17.toString());
            }
        }
        return jz5.f0.f384359a;
    }
}
