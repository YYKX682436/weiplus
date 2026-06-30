package o2;

/* loaded from: classes14.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final p2.o f423880a = new p2.o(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final r26.t f423881b = new r26.t("(\\d+)|([,])|([*])|([:])|L|(P\\([^)]*\\))|(C(\\(([^)]*)\\))?)|@");

    /* renamed from: c, reason: collision with root package name */
    public static final r26.t f423882c = new r26.t("(\\d+)|,|[!P()]|:([^,!)]+)");

    public static final java.lang.reflect.Field a(java.lang.Class cls, java.lang.String str) {
        java.lang.reflect.Field field;
        java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(declaredFields, "declaredFields");
        int length = declaredFields.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                field = null;
                break;
            }
            field = declaredFields[i17];
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(field.getName(), str)) {
                break;
            }
            i17++;
        }
        if (field == null) {
            return null;
        }
        field.setAccessible(true);
        return field;
    }

    public static final o2.c b(y0.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<this>");
        y0.b bVar = (y0.b) kz5.n0.Y(aVar.d());
        return bVar != null ? c(bVar, null) : o2.b.f423862h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x06f1 A[Catch: all -> 0x07c7, TryCatch #5 {all -> 0x07c7, blocks: (B:152:0x06c5, B:154:0x06cb, B:156:0x06db, B:160:0x06f1, B:162:0x06f4, B:171:0x0703, B:173:0x0718, B:175:0x071e, B:177:0x0725, B:179:0x072b, B:180:0x073a, B:182:0x0742, B:185:0x075d, B:190:0x077a, B:193:0x0783, B:197:0x07a1, B:207:0x0733), top: B:151:0x06c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x06f4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04d2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0359 A[LOOP:0: B:15:0x0084->B:27:0x0359, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x03a8 A[EDGE_INSN: B:28:0x03a8->B:29:0x03a8 BREAK  A[LOOP:0: B:15:0x0084->B:27:0x0359], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:326:0x01db A[Catch: NumberFormatException | g -> 0x0250, TryCatch #8 {NumberFormatException | g -> 0x0250, blocks: (B:298:0x016d, B:305:0x0179, B:308:0x0184, B:314:0x01aa, B:316:0x01b6, B:318:0x01ba, B:320:0x01c4, B:326:0x01db, B:327:0x01e1, B:334:0x01f4, B:336:0x0204, B:337:0x0205, B:346:0x021b, B:347:0x0226, B:349:0x022c), top: B:297:0x016d }] */
    /* JADX WARN: Removed duplicated region for block: B:329:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x03e3 A[LOOP:1: B:34:0x03da->B:36:0x03e3, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x03f1 A[EDGE_INSN: B:37:0x03f1->B:38:0x03f1 BREAK  A[LOOP:1: B:34:0x03da->B:36:0x03e3], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0563  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x056d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0587  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x05cd  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x05d9  */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final o2.c c(y0.b r36, o2.j r37) {
        /*
            Method dump skipped, instructions count: 2013
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.i.c(y0.b, o2.j):o2.c");
    }

    public static final java.lang.String d(r26.m mVar) {
        return (java.lang.String) ((r26.q) mVar).a().get(0);
    }

    public static final boolean e(r26.m mVar, java.lang.String str) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d(mVar), str);
    }

    public static final boolean f(r26.m mVar) {
        return ((r26.p) ((r26.q) mVar).f450444c).e(1) != null;
    }

    public static final int g(r26.m mVar) {
        try {
            return java.lang.Integer.parseInt((java.lang.String) ((r26.q) mVar).a().get(1));
        } catch (java.lang.NumberFormatException unused) {
            throw new o2.g();
        }
    }

    public static final void h(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str) {
        r26.m mVar = (r26.m) h0Var.f391656d;
        if (mVar == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d(mVar), str)) {
            throw new o2.g();
        }
        l(h0Var);
    }

    public static final java.lang.String i(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        r26.m mVar = (r26.m) h0Var.f391656d;
        if (mVar != null) {
            if (((r26.p) ((r26.q) mVar).f450444c).e(2) != null) {
                l(h0Var);
                java.lang.String substring = d(mVar).substring(1);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "this as java.lang.String).substring(startIndex)");
                if (!r26.i0.y(substring, "c#", false)) {
                    return substring;
                }
                java.lang.String substring2 = substring.substring(2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "this as java.lang.String).substring(startIndex)");
                return "androidx.compose.".concat(substring2);
            }
        }
        throw new o2.g();
    }

    public static final int j(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        r26.m mVar = (r26.m) h0Var.f391656d;
        if (mVar != null) {
            if (((r26.p) ((r26.q) mVar).f450444c).e(1) != null) {
                l(h0Var);
                try {
                    return java.lang.Integer.parseInt(d(mVar));
                } catch (java.lang.NumberFormatException unused) {
                    throw new o2.g();
                }
            }
        }
        throw new o2.g();
    }

    public static final boolean k(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, java.lang.String str) {
        r26.m mVar = (r26.m) h0Var.f391656d;
        return mVar == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d(mVar), str);
    }

    public static final r26.m l(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        r26.m mVar = (r26.m) h0Var.f391656d;
        if (mVar != null) {
            h0Var.f391656d = ((r26.q) mVar).d();
        }
        return (r26.m) h0Var.f391656d;
    }

    public static final r26.m m(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        r26.m mVar = (r26.m) h0Var.f391656d;
        if (mVar != null) {
            h0Var.f391656d = ((r26.q) mVar).d();
        }
        return (r26.m) h0Var.f391656d;
    }
}
