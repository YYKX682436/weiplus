package com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\n\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/accessibility/uitl/IdUtil;", "", "()V", "ID_MASK", "", "LAYOUT_ID_MASK", "STRING_MASK", "nameCache", "", "", "getName", dm.i4.f66865x76d1ec5a, "getType", "Lcom/tencent/mm/accessibility/type/IdType;", "plugin-autoaccessibility_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.mm.accessibility.uitl.IdUtil */
/* loaded from: classes.dex */
public final class C4968x823b57dd {
    private static final int ID_MASK = 2131296256;
    private static final int LAYOUT_ID_MASK = 2131492864;
    private static final int STRING_MASK = 2131755008;

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4968x823b57dd f21368x4fbc8495 = new com.p314xaae8f345.mm.p606xf34bc14e.p614x36c80c.C4968x823b57dd();
    private static final java.util.Map<java.lang.Integer, java.lang.String> nameCache = new java.util.LinkedHashMap();

    /* renamed from: $stable */
    public static final int f21366x3b2de05f = 8;

    private C4968x823b57dd() {
    }

    /* renamed from: getName */
    public final java.lang.String m42859xfb82e301(int id6) {
        try {
            java.util.Map<java.lang.Integer, java.lang.String> map = nameCache;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(id6);
            java.lang.String str = map.get(valueOf);
            if (str == null) {
                str = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getResourceName(id6);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getResourceName(...)");
                map.put(valueOf, str);
            }
            return str;
        } catch (java.lang.Throwable unused) {
            nameCache.put(java.lang.Integer.valueOf(id6), "unknow Resource");
            return "unknow Resource";
        }
    }

    /* renamed from: getType */
    public final com.p314xaae8f345.mm.p606xf34bc14e.p613x368f3a.EnumC4963x823af715 m42860xfb85f7b0(int id6) {
        return (id6 & com.p314xaae8f345.mm.R.C30864xbddafb2a.bkq) == com.p314xaae8f345.mm.R.C30864xbddafb2a.bkq ? com.p314xaae8f345.mm.p606xf34bc14e.p613x368f3a.EnumC4963x823af715.f21340x873fe74a : (id6 & com.p314xaae8f345.mm.R.id.f563781b) == com.p314xaae8f345.mm.R.id.f563781b ? com.p314xaae8f345.mm.p606xf34bc14e.p613x368f3a.EnumC4963x823af715.Id : (id6 & com.p314xaae8f345.mm.R.C30867xcad56011.f571233a) == com.p314xaae8f345.mm.R.C30867xcad56011.f571233a ? com.p314xaae8f345.mm.p606xf34bc14e.p613x368f3a.EnumC4963x823af715.f21341x943a4c31 : com.p314xaae8f345.mm.p606xf34bc14e.p613x368f3a.EnumC4963x823af715.f21342x974c54c4;
    }
}
