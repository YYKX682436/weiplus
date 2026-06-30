package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes10.dex */
public final class u1 {

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.ThreadLocal f184122b = new java.lang.ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t1 f184123a;

    public final void a(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.StringBuilder sb6, java.util.ArrayList arrayList) {
        java.lang.String name = xmlPullParser.getName();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t1 t1Var = this.f184123a;
        if (t1Var == null || t1Var.f184078b == null) {
            return;
        }
        java.lang.String str = t1Var.f184077a;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, str)) {
            sb6.append(t1Var.f184078b);
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "_finder_keyword_")) {
            r45.my0 my0Var = t1Var.f184079c;
            java.lang.String str2 = t1Var.f184078b;
            if (my0Var != null && str2 != null) {
                if (str2.length() > 0) {
                    r45.jb4 jb4Var = new r45.jb4();
                    jb4Var.set(0, java.lang.Integer.valueOf(sb6.length()));
                    jb4Var.set(1, java.lang.Integer.valueOf(str2.length()));
                    jb4Var.set(2, my0Var);
                    sb6.append(t1Var.f184078b);
                    sb6.append("#");
                    arrayList.add(jb4Var);
                }
            }
        }
        this.f184123a = null;
    }

    public final void b(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.StringBuilder sb6) {
        java.lang.String name = xmlPullParser.getName();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t1 t1Var = this.f184123a;
        if (name == null || name.length() == 0) {
            return;
        }
        if ((t1Var != null ? t1Var.f184078b : null) != null) {
            sb6.append(t1Var.f184078b);
            this.f184123a = null;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(name, "_finder_keyword_")) {
            this.f184123a = null;
            return;
        }
        int attributeCount = xmlPullParser.getAttributeCount();
        java.lang.Long l17 = null;
        for (int i17 = 0; i17 < attributeCount; i17++) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(xmlPullParser.getAttributeName(i17), "keyword_id")) {
                java.lang.String attributeValue = xmlPullParser.getAttributeValue(i17);
                try {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(attributeValue);
                    l17 = java.lang.Long.valueOf(java.lang.Long.parseLong(attributeValue));
                } catch (java.lang.NumberFormatException unused) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderCommentSearchParser", "NumberFormatException: input = " + attributeValue);
                }
            }
        }
        if (l17 != null) {
            this.f184123a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s1("_finder_keyword_", null, l17.longValue());
        }
    }

    public final void c(org.xmlpull.v1.XmlPullParser xmlPullParser, java.lang.StringBuilder sb6, java.util.LinkedList linkedList) {
        java.lang.Object obj;
        java.lang.String text = xmlPullParser.getText();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.t1 t1Var = this.f184123a;
        if (t1Var == null) {
            sb6.append(text);
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(t1Var.f184077a, "_finder_keyword_")) {
            sb6.append(text);
            this.f184123a = null;
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s1 s1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.s1) t1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(text);
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            r45.my0 my0Var = (r45.my0) obj;
            boolean z17 = false;
            if (my0Var.m75942xfb822ef2(0) == s1Var.f184054d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(my0Var.m75945x2fec8307(1), text)) {
                z17 = true;
            }
            if (z17) {
                break;
            }
        }
        r45.my0 my0Var2 = (r45.my0) obj;
        if (my0Var2 != null) {
            s1Var.f184078b = text;
            s1Var.f184079c = my0Var2;
        } else {
            sb6.append(text);
            this.f184123a = null;
        }
    }
}
