package jf5;

/* loaded from: classes11.dex */
public final class j0 implements jf5.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.TextView f381007a;

    /* renamed from: b, reason: collision with root package name */
    public final jf5.l0 f381008b;

    public j0(android.widget.TextView textView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(textView, "textView");
        this.f381007a = textView;
        this.f381008b = new jf5.l0();
        textView.setTextIsSelectable(false);
    }

    public final jf5.k a(android.text.Spanned spanned, java.util.List list, int i17) {
        java.lang.Object obj;
        q26.h hVar = (q26.h) ((q26.i) q26.h0.i(kz5.n0.J(list), new jf5.g0(spanned, i17))).mo144672x467c086e();
        if (hVar.hasNext()) {
            java.lang.Object next = hVar.next();
            while (hVar.hasNext()) {
                java.lang.Object next2 = hVar.next();
                jf5.k kVar = (jf5.k) next;
                jf5.k kVar2 = (jf5.k) next2;
                if (mz5.a.b(java.lang.Integer.valueOf(spanned.getSpanEnd(kVar) - spanned.getSpanStart(kVar)), java.lang.Integer.valueOf(spanned.getSpanEnd(kVar2) - spanned.getSpanStart(kVar2))) > 0) {
                    next = next2;
                }
            }
            obj = next;
        } else {
            obj = null;
        }
        return (jf5.k) obj;
    }

    public final jf5.k b(android.text.Spanned spanned, java.util.List list, int i17) {
        java.lang.Object next;
        q26.h hVar = new q26.h((q26.i) q26.h0.i(kz5.n0.J(list), new jf5.i0(spanned, i17)));
        if (hVar.hasNext()) {
            next = hVar.next();
            if (hVar.hasNext()) {
                v11.s sVar = ((jf5.k) next).f381009a;
                int i18 = sVar == null ? Integer.MIN_VALUE : sVar.f513994d - sVar.f513993c;
                do {
                    java.lang.Object next2 = hVar.next();
                    v11.s sVar2 = ((jf5.k) next2).f381009a;
                    int i19 = sVar2 == null ? Integer.MIN_VALUE : sVar2.f513994d - sVar2.f513993c;
                    if (i18 < i19) {
                        next = next2;
                        i18 = i19;
                    }
                } while (hVar.hasNext());
            }
        } else {
            next = null;
        }
        return (jf5.k) next;
    }

    public java.lang.CharSequence c() {
        java.lang.CharSequence text = this.f381007a.getText();
        return text == null ? "" : text;
    }

    public java.lang.Integer d(int i17) {
        java.lang.Integer num;
        v11.s sVar;
        java.lang.Object next;
        java.lang.Object next2;
        java.lang.CharSequence c17 = c();
        int f17 = e06.p.f(i17, 0, c17.length());
        android.text.Spanned spanned = c17 instanceof android.text.Spanned ? (android.text.Spanned) c17 : null;
        if (spanned == null) {
            return null;
        }
        java.util.List d17 = jf5.k0.d(spanned, 0, c17.length());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) d17).iterator();
        while (it.hasNext()) {
            java.lang.Object next3 = it.next();
            if (((jf5.k) next3).f381009a != null) {
                arrayList.add(next3);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (f17 == 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                v11.s sVar2 = ((jf5.k) it6.next()).f381009a;
                if (sVar2 != null) {
                    arrayList2.add(sVar2);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.Iterator it7 = arrayList2.iterator();
            while (it7.hasNext()) {
                java.lang.Object next4 = it7.next();
                if (jf5.k0.f((v11.s) next4)) {
                    arrayList3.add(next4);
                }
            }
            java.util.Iterator it8 = arrayList3.iterator();
            if (it8.hasNext()) {
                next2 = it8.next();
                if (it8.hasNext()) {
                    int i18 = ((v11.s) next2).f513993c;
                    do {
                        java.lang.Object next5 = it8.next();
                        int i19 = ((v11.s) next5).f513993c;
                        if (i18 > i19) {
                            next2 = next5;
                            i18 = i19;
                        }
                    } while (it8.hasNext());
                }
            } else {
                next2 = null;
            }
            v11.s sVar3 = (v11.s) next2;
            if (sVar3 != null) {
                return java.lang.Integer.valueOf(sVar3.f513993c);
            }
            return null;
        }
        if (f17 != c17.length()) {
            int length = spanned.length();
            if (f17 <= length) {
                while (true) {
                    jf5.k b17 = b(spanned, arrayList, f17);
                    if (b17 == null) {
                        b17 = a(spanned, arrayList, f17);
                    }
                    if (b17 == null) {
                        if (f17 == length) {
                            break;
                        }
                        f17++;
                    } else {
                        num = java.lang.Integer.valueOf(f17);
                        break;
                    }
                }
            }
            num = null;
            if (num == null) {
                return null;
            }
            int intValue = num.intValue();
            jf5.k b18 = b(spanned, arrayList, intValue);
            if ((b18 == null && (b18 = a(spanned, arrayList, intValue)) == null) || (sVar = b18.f381009a) == null || !jf5.k0.f(sVar)) {
                return null;
            }
            int spanStart = spanned.getSpanStart(b18);
            return intValue == spanStart ? java.lang.Integer.valueOf(sVar.f513993c) : e(intValue, spanStart, spanned.getSpanEnd(b18), sVar);
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it9 = arrayList.iterator();
        while (it9.hasNext()) {
            v11.s sVar4 = ((jf5.k) it9.next()).f381009a;
            if (sVar4 != null) {
                arrayList4.add(sVar4);
            }
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.Iterator it10 = arrayList4.iterator();
        while (it10.hasNext()) {
            java.lang.Object next6 = it10.next();
            if (jf5.k0.f((v11.s) next6)) {
                arrayList5.add(next6);
            }
        }
        java.util.Iterator it11 = arrayList5.iterator();
        if (it11.hasNext()) {
            next = it11.next();
            if (it11.hasNext()) {
                int i27 = ((v11.s) next).f513994d;
                do {
                    java.lang.Object next7 = it11.next();
                    int i28 = ((v11.s) next7).f513994d;
                    if (i27 < i28) {
                        next = next7;
                        i27 = i28;
                    }
                } while (it11.hasNext());
            }
        } else {
            next = null;
        }
        v11.s sVar5 = (v11.s) next;
        if (sVar5 != null) {
            return java.lang.Integer.valueOf(sVar5.f513994d);
        }
        return null;
    }

    public final java.lang.Integer e(int i17, int i18, int i19, v11.s sVar) {
        if (i17 >= i18 && i17 <= i19) {
            java.lang.String obj = c().toString();
            int codePointCount = obj.codePointCount(i18, i17);
            int codePointCount2 = obj.codePointCount(i17, i19);
            int i27 = sVar.f513991a;
            int i28 = i27 + codePointCount;
            int i29 = sVar.f513992b;
            int i37 = i29 - codePointCount2;
            if (codePointCount > codePointCount2) {
                i28 = i37;
            }
            if (i28 >= i27 && i28 <= i29) {
                return java.lang.Integer.valueOf(i28);
            }
        }
        return null;
    }

    public int f(jf5.i handleType, int i17, boolean z17, boolean z18) {
        int ordinal;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handleType, "handleType");
        java.lang.CharSequence c17 = c();
        if (c17.length() == 0) {
            return 0;
        }
        int f17 = e06.p.f(i17, 0, c17.length());
        if (!z17 || !z18 || (ordinal = this.f381008b.f381012a.ordinal()) == 0 || ordinal == 1 || ordinal == 2) {
            return f17;
        }
        throw new jz5.j();
    }
}
