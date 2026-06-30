package ya2;

/* loaded from: classes10.dex */
public final class z1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ya2.b2 f542118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Exception f542119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f542120f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(ya2.b2 b2Var, java.lang.Exception exc, int i17) {
        super(0);
        this.f542118d = b2Var;
        this.f542119e = exc;
        this.f542120f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.database.Cursor cursor;
        java.lang.String str;
        ya2.b2 b2Var = this.f542118d;
        b2Var.getClass();
        java.lang.StackTraceElement[] stackTrace = this.f542119e.getStackTrace();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stackTrace, "getStackTrace(...)");
        java.lang.String str2 = "";
        java.lang.String str3 = "";
        for (java.lang.StackTraceElement stackTraceElement : stackTrace) {
            str3 = str3 + stackTraceElement + " \n";
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.s1) ((zy2.e6) i95.n0.c(zy2.e6.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.o80 Jj = ((c61.l7) i95.n0.c(c61.l7.class)).Jj();
        Jj.getClass();
        try {
            cursor = Jj.f208829d.f("PRAGMA table_info(FinderContact)", null, 2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderContactStorage", e17.toString());
            cursor = null;
        }
        if (cursor != null) {
            try {
                int columnCount = cursor.getColumnCount();
                java.lang.String str4 = "";
                while (cursor.moveToNext()) {
                    int columnIndex = cursor.getColumnIndex(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
                    boolean z17 = true;
                    if (columnIndex >= 0 && columnIndex < columnCount) {
                        java.lang.String string = cursor.getString(columnIndex);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        str = "" + string + ':';
                    } else {
                        str = "";
                    }
                    int columnIndex2 = cursor.getColumnIndex("type");
                    if (columnIndex2 < 0 || columnIndex2 >= columnCount) {
                        z17 = false;
                    }
                    if (z17) {
                        java.lang.String string2 = cursor.getString(columnIndex2);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                        str = str + string2;
                    }
                    str4 = str4 + str + ';';
                }
                vz5.b.a(cursor, null);
                str2 = str4;
            } finally {
            }
        }
        java.lang.String str5 = "[colCount=" + this.f542120f + "]###\n[" + b2Var.N2 + "]###\n[" + b2Var.M2 + "]###\n[" + str2 + "]###\n[error: " + str3 + ']';
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str5, "<set-?>");
        b2Var.N2 = str5;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LocalFinderContact", str5);
        pm0.z.b(xy2.b.f539688b, "KeyContactConvertError", false, null, null, false, false, new ya2.y1(b2Var), 60, null);
        return jz5.f0.f384359a;
    }
}
