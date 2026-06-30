package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class l implements androidx.compose.ui.platform.q1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.ClipboardManager f10621a;

    public l(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("clipboard");
        if (systemService == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.content.ClipboardManager");
        }
        this.f10621a = (android.content.ClipboardManager) systemService;
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0119, code lost:
    
        if (r3 == 2) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0216, code lost:
    
        r15 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cc, code lost:
    
        r15 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a2.d a() {
        /*
            Method dump skipped, instructions count: 575
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.l.a():a2.d");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(a2.d annotatedString) {
        byte b17;
        kotlin.jvm.internal.o.g(annotatedString, "annotatedString");
        java.util.List list = annotatedString.f682e;
        boolean isEmpty = list.isEmpty();
        java.lang.String str = annotatedString.f681d;
        if (!isEmpty) {
            android.text.SpannableString spannableString = new android.text.SpannableString(str);
            androidx.compose.ui.platform.w2 w2Var = new androidx.compose.ui.platform.w2();
            int size = list.size();
            for (int i17 = 0; i17 < size; i17++) {
                a2.c cVar = (a2.c) list.get(i17);
                a2.g1 spanStyle = (a2.g1) cVar.f675a;
                w2Var.f10784a.recycle();
                android.os.Parcel obtain = android.os.Parcel.obtain();
                kotlin.jvm.internal.o.f(obtain, "obtain()");
                w2Var.f10784a = obtain;
                kotlin.jvm.internal.o.g(spanStyle, "spanStyle");
                long a17 = spanStyle.a();
                long j17 = e1.y.f246320k;
                if (!e1.y.c(a17, j17)) {
                    w2Var.a((byte) 1);
                    w2Var.f10784a.writeLong(spanStyle.a());
                }
                long j18 = p2.t.f351401c;
                long j19 = spanStyle.f724b;
                if (!p2.t.a(j19, j18)) {
                    w2Var.a((byte) 2);
                    w2Var.c(j19);
                }
                f2.r rVar = spanStyle.f725c;
                if (rVar != null) {
                    w2Var.a((byte) 3);
                    w2Var.f10784a.writeInt(rVar.f258825d);
                }
                f2.p pVar = spanStyle.f726d;
                if (pVar != null) {
                    w2Var.a((byte) 4);
                    int i18 = pVar.f258816a;
                    if (!(i18 == 0)) {
                        if (i18 == 1) {
                            b17 = 1;
                            w2Var.a(b17);
                        }
                    }
                    b17 = 0;
                    w2Var.a(b17);
                }
                f2.q qVar = spanStyle.f727e;
                if (qVar != null) {
                    w2Var.a((byte) 5);
                    int i19 = qVar.f258817a;
                    if (!(i19 == 0)) {
                        if (!(i19 == 1)) {
                            if (i19 == 2) {
                                r9 = 2;
                            } else if ((i19 != 3 ? (byte) 0 : (byte) 1) != 0) {
                                r9 = 3;
                            }
                        }
                        w2Var.a(r9);
                    }
                    r9 = 0;
                    w2Var.a(r9);
                }
                java.lang.String str2 = spanStyle.f729g;
                if (str2 != null) {
                    w2Var.a((byte) 6);
                    w2Var.f10784a.writeString(str2);
                }
                long j27 = spanStyle.f730h;
                if (!p2.t.a(j27, j18)) {
                    w2Var.a((byte) 7);
                    w2Var.c(j27);
                }
                l2.a aVar = spanStyle.f731i;
                if (aVar != null) {
                    w2Var.a((byte) 8);
                    w2Var.b(aVar.f315106a);
                }
                l2.m mVar = spanStyle.f732j;
                if (mVar != null) {
                    w2Var.a((byte) 9);
                    w2Var.b(mVar.f315126a);
                    w2Var.b(mVar.f315127b);
                }
                long j28 = spanStyle.f734l;
                if (!e1.y.c(j28, j17)) {
                    w2Var.a((byte) 10);
                    w2Var.f10784a.writeLong(j28);
                }
                l2.g gVar = spanStyle.f735m;
                if (gVar != null) {
                    w2Var.a((byte) 11);
                    w2Var.f10784a.writeInt(gVar.f315120a);
                }
                e1.z0 z0Var = spanStyle.f736n;
                if (z0Var != null) {
                    w2Var.a((byte) 12);
                    w2Var.f10784a.writeLong(z0Var.f246327a);
                    long j29 = z0Var.f246328b;
                    w2Var.b(d1.e.c(j29));
                    w2Var.b(d1.e.d(j29));
                    w2Var.b(z0Var.f246329c);
                }
                java.lang.String encodeToString = android.util.Base64.encodeToString(w2Var.f10784a.marshall(), 0);
                kotlin.jvm.internal.o.f(encodeToString, "encodeToString(bytes, Base64.DEFAULT)");
                spannableString.setSpan(new android.text.Annotation("androidx.compose.text.SpanStyle", encodeToString), cVar.f676b, cVar.f677c, 33);
            }
            str = spannableString;
        }
        this.f10621a.setPrimaryClip(android.content.ClipData.newPlainText("plain text", str));
    }
}
