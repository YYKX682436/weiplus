package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes10.dex */
public final class u1 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.ThreadLocal f102589b = new java.lang.ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.assist.t1 f102590a;

    public final void a(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.StringBuilder sb6, java.util.ArrayList arrayList) {
        java.lang.String name = xmlPullParser.getName();
        com.tencent.mm.plugin.finder.assist.t1 t1Var = this.f102590a;
        if (t1Var == null || t1Var.f102545b == null) {
            return;
        }
        java.lang.String str = t1Var.f102544a;
        if (!kotlin.jvm.internal.o.b(name, str)) {
            sb6.append(t1Var.f102545b);
        } else if (kotlin.jvm.internal.o.b(str, "_finder_keyword_")) {
            r45.my0 my0Var = t1Var.f102546c;
            java.lang.String str2 = t1Var.f102545b;
            if (my0Var != null && str2 != null) {
                if (str2.length() > 0) {
                    r45.jb4 jb4Var = new r45.jb4();
                    jb4Var.set(0, java.lang.Integer.valueOf(sb6.length()));
                    jb4Var.set(1, java.lang.Integer.valueOf(str2.length()));
                    jb4Var.set(2, my0Var);
                    sb6.append(t1Var.f102545b);
                    sb6.append("#");
                    arrayList.add(jb4Var);
                }
            }
        }
        this.f102590a = null;
    }

    public final void b(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.StringBuilder sb6) {
        java.lang.String name = xmlPullParser.getName();
        com.tencent.mm.plugin.finder.assist.t1 t1Var = this.f102590a;
        if (name == null || name.length() == 0) {
            return;
        }
        if ((t1Var != null ? t1Var.f102545b : null) != null) {
            sb6.append(t1Var.f102545b);
            this.f102590a = null;
        }
        if (!kotlin.jvm.internal.o.b(name, "_finder_keyword_")) {
            this.f102590a = null;
            return;
        }
        int attributeCount = xmlPullParser.getAttributeCount();
        java.lang.Long l17 = null;
        for (int i17 = 0; i17 < attributeCount; i17++) {
            if (kotlin.jvm.internal.o.b(xmlPullParser.getAttributeName(i17), "keyword_id")) {
                java.lang.String attributeValue = xmlPullParser.getAttributeValue(i17);
                try {
                    kotlin.jvm.internal.o.d(attributeValue);
                    l17 = java.lang.Long.valueOf(java.lang.Long.parseLong(attributeValue));
                } catch (java.lang.NumberFormatException unused) {
                    com.tencent.mars.xlog.Log.e("FinderCommentSearchParser", "NumberFormatException: input = " + attributeValue);
                }
            }
        }
        if (l17 != null) {
            this.f102590a = new com.tencent.mm.plugin.finder.assist.s1("_finder_keyword_", null, l17.longValue());
        }
    }

    public final void c(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.StringBuilder sb6, java.util.LinkedList linkedList) {
        java.lang.Object obj;
        java.lang.String text = xmlPullParser.getText();
        com.tencent.mm.plugin.finder.assist.t1 t1Var = this.f102590a;
        if (t1Var == null) {
            sb6.append(text);
            return;
        }
        if (!kotlin.jvm.internal.o.b(t1Var.f102544a, "_finder_keyword_")) {
            sb6.append(text);
            this.f102590a = null;
            return;
        }
        com.tencent.mm.plugin.finder.assist.s1 s1Var = (com.tencent.mm.plugin.finder.assist.s1) t1Var;
        kotlin.jvm.internal.o.d(text);
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            r45.my0 my0Var = (r45.my0) obj;
            boolean z17 = false;
            if (my0Var.getLong(0) == s1Var.f102521d && kotlin.jvm.internal.o.b(my0Var.getString(1), text)) {
                z17 = true;
            }
            if (z17) {
                break;
            }
        }
        r45.my0 my0Var2 = (r45.my0) obj;
        if (my0Var2 != null) {
            s1Var.f102545b = text;
            s1Var.f102546c = my0Var2;
        } else {
            sb6.append(text);
            this.f102590a = null;
        }
    }
}
