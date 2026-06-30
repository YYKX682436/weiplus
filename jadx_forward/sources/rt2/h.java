package rt2;

/* loaded from: classes9.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashMap f481039a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1630x6855e30.C14966x32fb4d6b f481040b;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.shell.FinderShellInit$listener$1] */
    static {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        f481040b = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6016x3c780059>(a0Var) { // from class: com.tencent.mm.plugin.finder.shell.FinderShellInit$listener$1
            {
                this.f39173x3fe91575 = -2024436119;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6016x3c780059 c6016x3c780059) {
                java.lang.String str;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6016x3c780059 event = c6016x3c780059;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                if (!z65.c.a()) {
                    return true;
                }
                am.lu luVar = event.f136310g;
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(luVar.f88807b, "wechat.shell.FINDER_SHELL")) {
                    return true;
                }
                java.lang.String stringExtra = luVar.f88806a.getStringExtra("cmd");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.Shell", "get cmd " + stringExtra);
                java.util.HashMap hashMap = rt2.h.f481039a;
                if (stringExtra != null) {
                    java.util.Locale locale = java.util.Locale.getDefault();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(locale, "getDefault(...)");
                    str = stringExtra.toLowerCase(locale);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toLowerCase(...)");
                } else {
                    str = null;
                }
                yz5.l lVar = (yz5.l) hashMap.get(str);
                if (lVar == null) {
                    return true;
                }
                android.content.Intent intent = luVar.f88806a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(intent, "intent");
                lVar.mo146xb9724478(intent);
                return true;
            }
        };
    }
}
