package p012xc85e97e9.p117xd10bdbf0.p119xac0c4757;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J%\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\b\u001cJ \u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002¨\u0006\u001f"}, d2 = {"Landroidx/window/embedding/SplitRuleParser;", "", "()V", "buildClassName", "Landroid/content/ComponentName;", "pkg", "", "clsSeq", "", "parseActivityFilter", "Landroidx/window/embedding/ActivityFilter;", "context", "Landroid/content/Context;", "parser", "Landroid/content/res/XmlResourceParser;", "parseSplitActivityRule", "Landroidx/window/embedding/ActivityRule;", "parseSplitPairFilter", "Landroidx/window/embedding/SplitPairFilter;", "parseSplitPairRule", "Landroidx/window/embedding/SplitPairRule;", "parseSplitPlaceholderRule", "Landroidx/window/embedding/SplitPlaceholderRule;", "parseSplitRules", "", "Landroidx/window/embedding/EmbeddingRule;", "staticRuleResourceId", "", "parseSplitRules$window_release", "parseSplitXml", "splitResourceId", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: androidx.window.embedding.SplitRuleParser */
/* loaded from: classes14.dex */
public final class C1223x74a1a8d5 {
    /* renamed from: buildClassName */
    private final android.content.ComponentName m8506x54acd155(java.lang.String pkg, java.lang.CharSequence clsSeq) {
        if (clsSeq != null) {
            if (!(clsSeq.length() == 0)) {
                java.lang.String obj = clsSeq.toString();
                if (obj.charAt(0) == '.') {
                    return new android.content.ComponentName(pkg, p3321xbce91901.jvm.p3324x21ffc6bd.o.m(pkg, obj));
                }
                int K = r26.n0.K(obj, '/', 0, false, 6, null);
                if (K > 0) {
                    pkg = obj.substring(0, K);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pkg, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    obj = obj.substring(K + 1);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "(this as java.lang.String).substring(startIndex)");
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, "*") || r26.n0.K(obj, '.', 0, false, 6, null) >= 0) {
                    return new android.content.ComponentName(pkg, obj);
                }
                return new android.content.ComponentName(pkg, pkg + '.' + obj);
            }
        }
        throw new java.lang.IllegalArgumentException("Activity name must not be null");
    }

    /* renamed from: parseActivityFilter */
    private final p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1199x1e7baf87 m8507x480994fa(android.content.Context context, android.content.res.XmlResourceParser parser) {
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(parser, p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3762x1e7baf87, 0, 0);
        java.lang.String string = obtainStyledAttributes.getString(p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3764x1de02ff2);
        java.lang.String string2 = obtainStyledAttributes.getString(p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3763x108475dd);
        java.lang.String packageName = context.getApplicationContext().getPackageName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageName, "packageName");
        return new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1199x1e7baf87(m8506x54acd155(packageName, string), string2);
    }

    /* renamed from: parseSplitActivityRule */
    private final p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1200x6ae032cb m8508x994bf872(android.content.Context context, android.content.res.XmlResourceParser parser) {
        return new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1200x6ae032cb(kz5.r0.f395535d, context.getTheme().obtainStyledAttributes(parser, p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3765x6ae032cb, 0, 0).getBoolean(p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3766x44ae7d, false));
    }

    /* renamed from: parseSplitPairFilter */
    private final p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1219x5e21258c m8509x664fee79(android.content.Context context, android.content.res.XmlResourceParser parser) {
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(parser, p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3767x5e21258c, 0, 0);
        java.lang.String string = obtainStyledAttributes.getString(p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3768x63cda629);
        java.lang.String string2 = obtainStyledAttributes.getString(p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3770xa6a76f5b);
        java.lang.String string3 = obtainStyledAttributes.getString(p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3769x84797f06);
        java.lang.String packageName = context.getApplicationContext().getPackageName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageName, "packageName");
        return new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1219x5e21258c(m8506x54acd155(packageName, string), m8506x54acd155(packageName, string2), string3);
    }

    /* renamed from: parseSplitPairRule */
    private final p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1220x1f056610 m8510x9c3b863d(android.content.Context context, android.content.res.XmlResourceParser parser) {
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(parser, p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3771x1f056610, 0, 0);
        float f17 = obtainStyledAttributes.getFloat(p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3778x2ab6aaa0, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3777x33a9dbdf, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3776xc3edb00, 0.0f);
        int i17 = obtainStyledAttributes.getInt(p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3775xd523ffca, 3);
        return new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1220x1f056610(kz5.r0.f395535d, obtainStyledAttributes.getBoolean(p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3773xd98d152e, false), obtainStyledAttributes.getBoolean(p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3774xa7da710a, true), obtainStyledAttributes.getBoolean(p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3772xb2c47117, false), dimension, dimension2, f17, i17);
    }

    /* renamed from: parseSplitPlaceholderRule */
    private final p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1221x7a3f98b5 m8511x3c7a5be8(android.content.Context context, android.content.res.XmlResourceParser parser) {
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(parser, p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3779x7a3f98b5, 0, 0);
        java.lang.String string = obtainStyledAttributes.getString(p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3780x9f7515c3);
        float f17 = obtainStyledAttributes.getFloat(p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3784xf08cedb, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3783x269009c4, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3782x61df53e5, 0.0f);
        int i17 = obtainStyledAttributes.getInt(p012xc85e97e9.p117xd10bdbf0.R.C1194x6ba0728b.f3781x74ce5645, 3);
        java.lang.String packageName = context.getApplicationContext().getPackageName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(packageName, "packageName");
        android.content.ComponentName m8506x54acd155 = m8506x54acd155(packageName, string);
        kz5.r0 r0Var = kz5.r0.f395535d;
        android.content.Intent component = new android.content.Intent().setComponent(m8506x54acd155);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(component, "Intent().setComponent(pl…eholderActivityClassName)");
        return new p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1221x7a3f98b5(r0Var, component, dimension, dimension2, f17, i17);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0049. Please report as an issue. */
    /* renamed from: parseSplitXml */
    private final java.util.Set<p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.AbstractC1211xe320fed3> m8512x5e7c4a70(android.content.Context context, int splitResourceId) {
        p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1221x7a3f98b5 m8498xabd3f702;
        p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1200x6ae032cb m8399xabd3f702;
        p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1220x1f056610 m8510x9c3b863d;
        try {
            android.content.res.XmlResourceParser xml = context.getResources().getXml(splitResourceId);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(xml, "resources.getXml(splitResourceId)");
            java.util.HashSet hashSet = new java.util.HashSet();
            int depth = xml.getDepth();
            int next = xml.next();
            p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1200x6ae032cb c1200x6ae032cb = null;
            p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1220x1f056610 c1220x1f056610 = null;
            p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1221x7a3f98b5 c1221x7a3f98b5 = null;
            while (next != 1 && (next != 3 || xml.getDepth() > depth)) {
                if (xml.getEventType() != 2 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b("split-config", xml.getName())) {
                    next = xml.next();
                } else {
                    java.lang.String name = xml.getName();
                    if (name != null) {
                        switch (name.hashCode()) {
                            case 511422343:
                                if (name.equals("ActivityFilter")) {
                                    if (c1200x6ae032cb != null || c1221x7a3f98b5 != null) {
                                        p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1199x1e7baf87 m8507x480994fa = m8507x480994fa(context, xml);
                                        if (c1200x6ae032cb == null) {
                                            if (c1221x7a3f98b5 != null) {
                                                hashSet.remove(c1221x7a3f98b5);
                                                m8498xabd3f702 = c1221x7a3f98b5.m8498xabd3f702(m8507x480994fa);
                                                hashSet.add(m8498xabd3f702);
                                                c1221x7a3f98b5 = m8498xabd3f702;
                                                break;
                                            }
                                        } else {
                                            hashSet.remove(c1200x6ae032cb);
                                            m8399xabd3f702 = c1200x6ae032cb.m8399xabd3f702(m8507x480994fa);
                                            hashSet.add(m8399xabd3f702);
                                            c1200x6ae032cb = m8399xabd3f702;
                                            break;
                                        }
                                    } else {
                                        throw new java.lang.IllegalArgumentException("Found orphaned ActivityFilter");
                                    }
                                }
                                break;
                            case 520447504:
                                if (name.equals("SplitPairRule")) {
                                    m8510x9c3b863d = m8510x9c3b863d(context, xml);
                                    hashSet.add(m8510x9c3b863d);
                                    c1200x6ae032cb = null;
                                    c1221x7a3f98b5 = null;
                                    c1220x1f056610 = m8510x9c3b863d;
                                    break;
                                }
                                break;
                            case 1579230604:
                                if (name.equals("SplitPairFilter")) {
                                    if (c1220x1f056610 == null) {
                                        throw new java.lang.IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                                    }
                                    p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.C1219x5e21258c m8509x664fee79 = m8509x664fee79(context, xml);
                                    hashSet.remove(c1220x1f056610);
                                    m8510x9c3b863d = c1220x1f056610.m8495xabd3f702(m8509x664fee79);
                                    hashSet.add(m8510x9c3b863d);
                                    c1220x1f056610 = m8510x9c3b863d;
                                    break;
                                }
                                break;
                            case 1793077963:
                                if (name.equals("ActivityRule")) {
                                    m8399xabd3f702 = m8508x994bf872(context, xml);
                                    hashSet.add(m8399xabd3f702);
                                    c1220x1f056610 = null;
                                    c1221x7a3f98b5 = null;
                                    c1200x6ae032cb = m8399xabd3f702;
                                    break;
                                }
                                break;
                            case 2050988213:
                                if (name.equals("SplitPlaceholderRule")) {
                                    m8498xabd3f702 = m8511x3c7a5be8(context, xml);
                                    hashSet.add(m8498xabd3f702);
                                    c1200x6ae032cb = null;
                                    c1220x1f056610 = null;
                                    c1221x7a3f98b5 = m8498xabd3f702;
                                    break;
                                }
                                break;
                        }
                    }
                    next = xml.next();
                }
            }
            return hashSet;
        } catch (android.content.res.Resources.NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: parseSplitRules$window_release */
    public final java.util.Set<p012xc85e97e9.p117xd10bdbf0.p119xac0c4757.AbstractC1211xe320fed3> m8513xccdbd8cc(android.content.Context context, int staticRuleResourceId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return m8512x5e7c4a70(context, staticRuleResourceId);
    }
}
