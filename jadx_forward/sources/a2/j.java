package a2;

/* loaded from: classes14.dex */
public final class j implements a2.o {

    /* renamed from: a, reason: collision with root package name */
    public final a2.d f82281a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f82282b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f82283c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f82284d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f82285e;

    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.util.ArrayList] */
    public j(a2.d dVar, a2.o1 o1Var, java.util.List placeholders, p2.f density, f2.g fontFamilyResolver) {
        int i17;
        java.lang.String str;
        int i18;
        ?? r102;
        int i19;
        int i27;
        a2.d annotatedString = dVar;
        a2.o1 style = o1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(annotatedString, "annotatedString");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(style, "style");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(placeholders, "placeholders");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(density, "density");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fontFamilyResolver, "fontFamilyResolver");
        this.f82281a = annotatedString;
        this.f82282b = placeholders;
        jz5.i iVar = jz5.i.f384364f;
        this.f82283c = jz5.h.a(iVar, new a2.i(this));
        this.f82284d = jz5.h.a(iVar, new a2.h(this));
        a2.d dVar2 = a2.e.f82220a;
        a2.p defaultParagraphStyle = style.f82324b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(defaultParagraphStyle, "defaultParagraphStyle");
        int length = annotatedString.f82214d.length();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = annotatedString.f82216f;
        int size = list.size();
        int i28 = 0;
        int i29 = 0;
        while (i28 < size) {
            a2.c cVar = (a2.c) list.get(i28);
            a2.p pVar = (a2.p) cVar.f82208a;
            int i37 = cVar.f82209b;
            if (i37 != i29) {
                arrayList.add(new a2.c(defaultParagraphStyle, i29, i37));
            }
            a2.p a17 = defaultParagraphStyle.a(pVar);
            int i38 = cVar.f82210c;
            arrayList.add(new a2.c(a17, i37, i38));
            i28++;
            i29 = i38;
        }
        if (i29 != length) {
            arrayList.add(new a2.c(defaultParagraphStyle, i29, length));
        }
        if (arrayList.isEmpty()) {
            i17 = 0;
            arrayList.add(new a2.c(defaultParagraphStyle, 0, 0));
        } else {
            i17 = 0;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        int size2 = arrayList.size();
        int i39 = i17;
        while (i39 < size2) {
            a2.c cVar2 = (a2.c) arrayList.get(i39);
            int i47 = cVar2.f82209b;
            java.lang.String str2 = annotatedString.f82214d;
            int i48 = cVar2.f82210c;
            if (i47 != i48) {
                str = str2.substring(i47, i48);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                str = "";
            }
            kz5.p0 paragraphStyles = kz5.p0.f395529d;
            if (i47 == i48) {
                i18 = i39;
                i19 = size2;
                r102 = paragraphStyles;
            } else {
                i18 = i39;
                r102 = annotatedString.f82215e;
                if (i47 != 0 || i48 < str2.length()) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(r102.size());
                    int size3 = r102.size();
                    i19 = size2;
                    int i49 = 0;
                    java.util.List list2 = r102;
                    while (i49 < size3) {
                        int i57 = size3;
                        java.lang.Object obj = list2.get(i49);
                        java.util.List list3 = list2;
                        a2.c cVar3 = (a2.c) obj;
                        if (a2.e.b(i47, i48, cVar3.f82209b, cVar3.f82210c)) {
                            arrayList3.add(obj);
                        }
                        i49++;
                        size3 = i57;
                        list2 = list3;
                    }
                    r102 = new java.util.ArrayList(arrayList3.size());
                    int size4 = arrayList3.size();
                    int i58 = 0;
                    while (i58 < size4) {
                        a2.c cVar4 = (a2.c) arrayList3.get(i58);
                        r102.add(new a2.c(cVar4.f82208a, e06.p.f(cVar4.f82209b, i47, i48) - i47, e06.p.f(cVar4.f82210c, i47, i48) - i47));
                        i58++;
                        size4 = size4;
                        arrayList3 = arrayList3;
                    }
                } else {
                    i19 = size2;
                }
            }
            kz5.p0 spanStyles = r102;
            spanStyles = (4 & 2) != 0 ? paragraphStyles : spanStyles;
            paragraphStyles = (4 & 4) == 0 ? null : paragraphStyles;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(spanStyles, "spanStyles");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paragraphStyles, "paragraphStyles");
            int i59 = -1;
            int i66 = 0;
            while (i66 < 0) {
                a2.c cVar5 = (a2.c) paragraphStyles.get(i66);
                if (!(cVar5.f82209b >= i59)) {
                    throw new java.lang.IllegalArgumentException("ParagraphStyle should not overlap".toString());
                }
                int length2 = str.length();
                int i67 = cVar5.f82210c;
                if (!(i67 <= length2)) {
                    throw new java.lang.IllegalArgumentException(("ParagraphStyle range [" + cVar5.f82209b + ", " + i67 + ") is out of boundary").toString());
                }
                i66++;
                i59 = i67;
            }
            a2.p pVar2 = (a2.p) cVar2.f82208a;
            a2.o1 o1Var2 = new a2.o1(style.f82323a, defaultParagraphStyle.a(pVar2.f82327b == null ? new a2.p(pVar2.f82326a, defaultParagraphStyle.f82327b, pVar2.f82328c, pVar2.f82329d, pVar2.f82330e, pVar2.f82331f, null) : pVar2));
            java.util.List list4 = this.f82282b;
            java.util.ArrayList arrayList4 = new java.util.ArrayList(list4.size());
            int size5 = list4.size();
            int i68 = 0;
            while (true) {
                i27 = cVar2.f82209b;
                if (i68 >= size5) {
                    break;
                }
                java.lang.Object obj2 = list4.get(i68);
                java.util.List list5 = list4;
                a2.c cVar6 = (a2.c) obj2;
                a2.p pVar3 = defaultParagraphStyle;
                if (a2.e.b(i27, i48, cVar6.f82209b, cVar6.f82210c)) {
                    arrayList4.add(obj2);
                }
                i68++;
                list4 = list5;
                defaultParagraphStyle = pVar3;
            }
            a2.p pVar4 = defaultParagraphStyle;
            java.util.ArrayList arrayList5 = new java.util.ArrayList(arrayList4.size());
            int i69 = 0;
            for (int size6 = arrayList4.size(); i69 < size6; size6 = size6) {
                a2.c cVar7 = (a2.c) arrayList4.get(i69);
                int i76 = cVar7.f82209b;
                int i77 = cVar7.f82210c;
                if (!(i27 <= i76 && i77 <= i48)) {
                    throw new java.lang.IllegalArgumentException("placeholder can not overlap with paragraph.".toString());
                }
                arrayList5.add(new a2.c(cVar7.f82208a, i76 - i27, i77 - i27));
                i69++;
            }
            arrayList2.add(new a2.n(new i2.e(str, o1Var2, spanStyles, arrayList5, fontFamilyResolver, density), i27, i48));
            i39 = i18 + 1;
            annotatedString = dVar;
            style = o1Var;
            size2 = i19;
            defaultParagraphStyle = pVar4;
        }
        this.f82285e = arrayList2;
    }

    @Override // a2.o
    public boolean a() {
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f82285e;
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (((a2.n) arrayList.get(i17)).f82317a.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // a2.o
    public float b() {
        return ((java.lang.Number) this.f82283c.mo141623x754a37bb()).floatValue();
    }

    @Override // a2.o
    public float c() {
        return ((java.lang.Number) this.f82284d.mo141623x754a37bb()).floatValue();
    }
}
