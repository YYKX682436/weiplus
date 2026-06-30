package m16;

/* loaded from: classes15.dex */
public abstract class i implements k16.g {

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.List f404428d;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String[] f404429a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f404430b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f404431c;

    static {
        java.lang.String g07 = kz5.n0.g0(kz5.c0.i('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);
        java.util.List i17 = kz5.c0.i(g07.concat("/Any"), g07.concat("/Nothing"), g07.concat("/Unit"), g07.concat("/Throwable"), g07.concat("/Number"), g07.concat("/Byte"), g07.concat("/Double"), g07.concat("/Float"), g07.concat("/Int"), g07.concat("/Long"), g07.concat("/Short"), g07.concat("/Boolean"), g07.concat("/Char"), g07.concat("/CharSequence"), g07.concat("/String"), g07.concat("/Comparable"), g07.concat("/Enum"), g07.concat("/Array"), g07.concat("/ByteArray"), g07.concat("/DoubleArray"), g07.concat("/FloatArray"), g07.concat("/IntArray"), g07.concat("/LongArray"), g07.concat("/ShortArray"), g07.concat("/BooleanArray"), g07.concat("/CharArray"), g07.concat("/Cloneable"), g07.concat("/Annotation"), g07.concat("/collections/Iterable"), g07.concat("/collections/MutableIterable"), g07.concat("/collections/Collection"), g07.concat("/collections/MutableCollection"), g07.concat("/collections/List"), g07.concat("/collections/MutableList"), g07.concat("/collections/Set"), g07.concat("/collections/MutableSet"), g07.concat("/collections/Map"), g07.concat("/collections/MutableMap"), g07.concat("/collections/Map.Entry"), g07.concat("/collections/MutableMap.MutableEntry"), g07.concat("/collections/Iterator"), g07.concat("/collections/MutableIterator"), g07.concat("/collections/ListIterator"), g07.concat("/collections/MutableListIterator"));
        f404428d = i17;
        java.lang.Iterable Z0 = kz5.n0.Z0(i17);
        int d17 = kz5.b1.d(kz5.d0.q(Z0, 10));
        if (d17 < 16) {
            d17 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17);
        java.util.Iterator it = ((kz5.v0) Z0).iterator();
        while (true) {
            kz5.w0 w0Var = (kz5.w0) it;
            if (!w0Var.hasNext()) {
                return;
            }
            kz5.u0 u0Var = (kz5.u0) w0Var.next();
            linkedHashMap.put((java.lang.String) u0Var.f395549b, java.lang.Integer.valueOf(u0Var.f395548a));
        }
    }

    public i(java.lang.String[] strings, java.util.Set localNameIndices, java.util.List records) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(strings, "strings");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(localNameIndices, "localNameIndices");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(records, "records");
        this.f404429a = strings;
        this.f404430b = localNameIndices;
        this.f404431c = records;
    }

    @Override // k16.g
    public java.lang.String a(int i17) {
        return mo141776x2fec8307(i17);
    }

    @Override // k16.g
    public boolean b(int i17) {
        return this.f404430b.contains(java.lang.Integer.valueOf(i17));
    }

    @Override // k16.g
    /* renamed from: getString */
    public java.lang.String mo141776x2fec8307(int i17) {
        java.lang.String str;
        l16.p pVar = (l16.p) this.f404431c.get(i17);
        int i18 = pVar.f396606e;
        if ((i18 & 4) == 4) {
            java.lang.Object obj = pVar.f396609h;
            if (obj instanceof java.lang.String) {
                str = (java.lang.String) obj;
            } else {
                p16.g gVar = (p16.g) obj;
                gVar.getClass();
                try {
                    java.lang.String r17 = gVar.r(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
                    if (gVar.l()) {
                        pVar.f396609h = r17;
                    }
                    str = r17;
                } catch (java.io.UnsupportedEncodingException e17) {
                    throw new java.lang.RuntimeException("UTF-8 not supported?", e17);
                }
            }
        } else {
            if ((i18 & 2) == 2) {
                java.util.List list = f404428d;
                int size = list.size();
                int i19 = pVar.f396608g;
                if (i19 >= 0 && i19 < size) {
                    str = (java.lang.String) list.get(i19);
                }
            }
            str = this.f404429a[i17];
        }
        if (pVar.f396611m.size() >= 2) {
            java.util.List list2 = pVar.f396611m;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list2);
            java.lang.Integer num = (java.lang.Integer) list2.get(0);
            java.lang.Integer num2 = (java.lang.Integer) list2.get(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            if (num.intValue() >= 0) {
                int intValue = num.intValue();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
                if (intValue <= num2.intValue() && num2.intValue() <= str.length()) {
                    str = str.substring(num.intValue(), num2.intValue());
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "substring(...)");
                }
            }
        }
        java.lang.String str2 = str;
        if (pVar.f396613o.size() >= 2) {
            java.util.List list3 = pVar.f396613o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(list3);
            java.lang.Integer num3 = (java.lang.Integer) list3.get(0);
            java.lang.Integer num4 = (java.lang.Integer) list3.get(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            str2 = r26.i0.u(str2, (char) num3.intValue(), (char) num4.intValue(), false, 4, null);
        }
        java.lang.String str3 = str2;
        l16.o oVar = pVar.f396610i;
        if (oVar == null) {
            oVar = l16.o.NONE;
        }
        int ordinal = oVar.ordinal();
        if (ordinal == 1) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
            str3 = r26.i0.u(str3, '$', '.', false, 4, null);
        } else if (ordinal == 2) {
            if (str3.length() >= 2) {
                str3 = str3.substring(1, str3.length() - 1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "substring(...)");
            }
            str3 = r26.i0.u(str3, '$', '.', false, 4, null);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
        return str3;
    }
}
