package androidx.window.embedding;

@kotlin.Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J%\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u001bH\u0000¢\u0006\u0002\b\u001cJ \u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002¨\u0006\u001f"}, d2 = {"Landroidx/window/embedding/SplitRuleParser;", "", "()V", "buildClassName", "Landroid/content/ComponentName;", "pkg", "", "clsSeq", "", "parseActivityFilter", "Landroidx/window/embedding/ActivityFilter;", "context", "Landroid/content/Context;", "parser", "Landroid/content/res/XmlResourceParser;", "parseSplitActivityRule", "Landroidx/window/embedding/ActivityRule;", "parseSplitPairFilter", "Landroidx/window/embedding/SplitPairFilter;", "parseSplitPairRule", "Landroidx/window/embedding/SplitPairRule;", "parseSplitPlaceholderRule", "Landroidx/window/embedding/SplitPlaceholderRule;", "parseSplitRules", "", "Landroidx/window/embedding/EmbeddingRule;", "staticRuleResourceId", "", "parseSplitRules$window_release", "parseSplitXml", "splitResourceId", "window_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes14.dex */
public final class SplitRuleParser {
    private final android.content.ComponentName buildClassName(java.lang.String pkg, java.lang.CharSequence clsSeq) {
        if (clsSeq != null) {
            if (!(clsSeq.length() == 0)) {
                java.lang.String obj = clsSeq.toString();
                if (obj.charAt(0) == '.') {
                    return new android.content.ComponentName(pkg, kotlin.jvm.internal.o.m(pkg, obj));
                }
                int K = r26.n0.K(obj, '/', 0, false, 6, null);
                if (K > 0) {
                    pkg = obj.substring(0, K);
                    kotlin.jvm.internal.o.f(pkg, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    obj = obj.substring(K + 1);
                    kotlin.jvm.internal.o.f(obj, "(this as java.lang.String).substring(startIndex)");
                }
                if (kotlin.jvm.internal.o.b(obj, "*") || r26.n0.K(obj, '.', 0, false, 6, null) >= 0) {
                    return new android.content.ComponentName(pkg, obj);
                }
                return new android.content.ComponentName(pkg, pkg + '.' + obj);
            }
        }
        throw new java.lang.IllegalArgumentException("Activity name must not be null");
    }

    private final androidx.window.embedding.ActivityFilter parseActivityFilter(android.content.Context context, android.content.res.XmlResourceParser parser) {
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(parser, androidx.window.R.styleable.ActivityFilter, 0, 0);
        java.lang.String string = obtainStyledAttributes.getString(androidx.window.R.styleable.ActivityFilter_activityName);
        java.lang.String string2 = obtainStyledAttributes.getString(androidx.window.R.styleable.ActivityFilter_activityAction);
        java.lang.String packageName = context.getApplicationContext().getPackageName();
        kotlin.jvm.internal.o.f(packageName, "packageName");
        return new androidx.window.embedding.ActivityFilter(buildClassName(packageName, string), string2);
    }

    private final androidx.window.embedding.ActivityRule parseSplitActivityRule(android.content.Context context, android.content.res.XmlResourceParser parser) {
        return new androidx.window.embedding.ActivityRule(kz5.r0.f314002d, context.getTheme().obtainStyledAttributes(parser, androidx.window.R.styleable.ActivityRule, 0, 0).getBoolean(androidx.window.R.styleable.ActivityRule_alwaysExpand, false));
    }

    private final androidx.window.embedding.SplitPairFilter parseSplitPairFilter(android.content.Context context, android.content.res.XmlResourceParser parser) {
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(parser, androidx.window.R.styleable.SplitPairFilter, 0, 0);
        java.lang.String string = obtainStyledAttributes.getString(androidx.window.R.styleable.SplitPairFilter_primaryActivityName);
        java.lang.String string2 = obtainStyledAttributes.getString(androidx.window.R.styleable.SplitPairFilter_secondaryActivityName);
        java.lang.String string3 = obtainStyledAttributes.getString(androidx.window.R.styleable.SplitPairFilter_secondaryActivityAction);
        java.lang.String packageName = context.getApplicationContext().getPackageName();
        kotlin.jvm.internal.o.f(packageName, "packageName");
        return new androidx.window.embedding.SplitPairFilter(buildClassName(packageName, string), buildClassName(packageName, string2), string3);
    }

    private final androidx.window.embedding.SplitPairRule parseSplitPairRule(android.content.Context context, android.content.res.XmlResourceParser parser) {
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(parser, androidx.window.R.styleable.SplitPairRule, 0, 0);
        float f17 = obtainStyledAttributes.getFloat(androidx.window.R.styleable.SplitPairRule_splitRatio, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(androidx.window.R.styleable.SplitPairRule_splitMinWidth, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(androidx.window.R.styleable.SplitPairRule_splitMinSmallestWidth, 0.0f);
        int i17 = obtainStyledAttributes.getInt(androidx.window.R.styleable.SplitPairRule_splitLayoutDirection, 3);
        return new androidx.window.embedding.SplitPairRule(kz5.r0.f314002d, obtainStyledAttributes.getBoolean(androidx.window.R.styleable.SplitPairRule_finishPrimaryWithSecondary, false), obtainStyledAttributes.getBoolean(androidx.window.R.styleable.SplitPairRule_finishSecondaryWithPrimary, true), obtainStyledAttributes.getBoolean(androidx.window.R.styleable.SplitPairRule_clearTop, false), dimension, dimension2, f17, i17);
    }

    private final androidx.window.embedding.SplitPlaceholderRule parseSplitPlaceholderRule(android.content.Context context, android.content.res.XmlResourceParser parser) {
        android.content.res.TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(parser, androidx.window.R.styleable.SplitPlaceholderRule, 0, 0);
        java.lang.String string = obtainStyledAttributes.getString(androidx.window.R.styleable.SplitPlaceholderRule_placeholderActivityName);
        float f17 = obtainStyledAttributes.getFloat(androidx.window.R.styleable.SplitPlaceholderRule_splitRatio, 0.0f);
        int dimension = (int) obtainStyledAttributes.getDimension(androidx.window.R.styleable.SplitPlaceholderRule_splitMinWidth, 0.0f);
        int dimension2 = (int) obtainStyledAttributes.getDimension(androidx.window.R.styleable.SplitPlaceholderRule_splitMinSmallestWidth, 0.0f);
        int i17 = obtainStyledAttributes.getInt(androidx.window.R.styleable.SplitPlaceholderRule_splitLayoutDirection, 3);
        java.lang.String packageName = context.getApplicationContext().getPackageName();
        kotlin.jvm.internal.o.f(packageName, "packageName");
        android.content.ComponentName buildClassName = buildClassName(packageName, string);
        kz5.r0 r0Var = kz5.r0.f314002d;
        android.content.Intent component = new android.content.Intent().setComponent(buildClassName);
        kotlin.jvm.internal.o.f(component, "Intent().setComponent(pl…eholderActivityClassName)");
        return new androidx.window.embedding.SplitPlaceholderRule(r0Var, component, dimension, dimension2, f17, i17);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:26:0x0049. Please report as an issue. */
    private final java.util.Set<androidx.window.embedding.EmbeddingRule> parseSplitXml(android.content.Context context, int splitResourceId) {
        androidx.window.embedding.SplitPlaceholderRule plus$window_release;
        androidx.window.embedding.ActivityRule plus$window_release2;
        androidx.window.embedding.SplitPairRule parseSplitPairRule;
        try {
            android.content.res.XmlResourceParser xml = context.getResources().getXml(splitResourceId);
            kotlin.jvm.internal.o.f(xml, "resources.getXml(splitResourceId)");
            java.util.HashSet hashSet = new java.util.HashSet();
            int depth = xml.getDepth();
            int next = xml.next();
            androidx.window.embedding.ActivityRule activityRule = null;
            androidx.window.embedding.SplitPairRule splitPairRule = null;
            androidx.window.embedding.SplitPlaceholderRule splitPlaceholderRule = null;
            while (next != 1 && (next != 3 || xml.getDepth() > depth)) {
                if (xml.getEventType() != 2 || kotlin.jvm.internal.o.b("split-config", xml.getName())) {
                    next = xml.next();
                } else {
                    java.lang.String name = xml.getName();
                    if (name != null) {
                        switch (name.hashCode()) {
                            case 511422343:
                                if (name.equals("ActivityFilter")) {
                                    if (activityRule != null || splitPlaceholderRule != null) {
                                        androidx.window.embedding.ActivityFilter parseActivityFilter = parseActivityFilter(context, xml);
                                        if (activityRule == null) {
                                            if (splitPlaceholderRule != null) {
                                                hashSet.remove(splitPlaceholderRule);
                                                plus$window_release = splitPlaceholderRule.plus$window_release(parseActivityFilter);
                                                hashSet.add(plus$window_release);
                                                splitPlaceholderRule = plus$window_release;
                                                break;
                                            }
                                        } else {
                                            hashSet.remove(activityRule);
                                            plus$window_release2 = activityRule.plus$window_release(parseActivityFilter);
                                            hashSet.add(plus$window_release2);
                                            activityRule = plus$window_release2;
                                            break;
                                        }
                                    } else {
                                        throw new java.lang.IllegalArgumentException("Found orphaned ActivityFilter");
                                    }
                                }
                                break;
                            case 520447504:
                                if (name.equals("SplitPairRule")) {
                                    parseSplitPairRule = parseSplitPairRule(context, xml);
                                    hashSet.add(parseSplitPairRule);
                                    activityRule = null;
                                    splitPlaceholderRule = null;
                                    splitPairRule = parseSplitPairRule;
                                    break;
                                }
                                break;
                            case 1579230604:
                                if (name.equals("SplitPairFilter")) {
                                    if (splitPairRule == null) {
                                        throw new java.lang.IllegalArgumentException("Found orphaned SplitPairFilter outside of SplitPairRule");
                                    }
                                    androidx.window.embedding.SplitPairFilter parseSplitPairFilter = parseSplitPairFilter(context, xml);
                                    hashSet.remove(splitPairRule);
                                    parseSplitPairRule = splitPairRule.plus$window_release(parseSplitPairFilter);
                                    hashSet.add(parseSplitPairRule);
                                    splitPairRule = parseSplitPairRule;
                                    break;
                                }
                                break;
                            case 1793077963:
                                if (name.equals("ActivityRule")) {
                                    plus$window_release2 = parseSplitActivityRule(context, xml);
                                    hashSet.add(plus$window_release2);
                                    splitPairRule = null;
                                    splitPlaceholderRule = null;
                                    activityRule = plus$window_release2;
                                    break;
                                }
                                break;
                            case 2050988213:
                                if (name.equals("SplitPlaceholderRule")) {
                                    plus$window_release = parseSplitPlaceholderRule(context, xml);
                                    hashSet.add(plus$window_release);
                                    activityRule = null;
                                    splitPairRule = null;
                                    splitPlaceholderRule = plus$window_release;
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

    public final java.util.Set<androidx.window.embedding.EmbeddingRule> parseSplitRules$window_release(android.content.Context context, int staticRuleResourceId) {
        kotlin.jvm.internal.o.g(context, "context");
        return parseSplitXml(context, staticRuleResourceId);
    }
}
