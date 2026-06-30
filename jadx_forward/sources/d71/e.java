package d71;

/* loaded from: classes5.dex */
public final class e implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.EditText f308411d;

    /* renamed from: e, reason: collision with root package name */
    public final d71.d f308412e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f308413f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f308414g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f308415h;

    public e(android.widget.EditText editText, d71.d formatter, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editText, "editText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(formatter, "formatter");
        this.f308411d = editText;
        this.f308412e = formatter;
        this.f308413f = str;
        this.f308415h = "";
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0068 A[Catch: all -> 0x007b, Exception -> 0x007d, TRY_LEAVE, TryCatch #0 {Exception -> 0x007d, blocks: (B:17:0x002d, B:20:0x0033, B:24:0x003d, B:25:0x0062, B:27:0x0068, B:32:0x0047), top: B:16:0x002d, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.text.Editable r8) {
        /*
            r7 = this;
            boolean r0 = r7.f308414g
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.String r0 = ""
            if (r8 == 0) goto Lf
            java.lang.String r8 = r8.toString()
            if (r8 != 0) goto L10
        Lf:
            r8 = r0
        L10:
            int r1 = r8.length()
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L1a
            r1 = r2
            goto L1b
        L1a:
            r1 = r3
        L1b:
            if (r1 != 0) goto L99
            java.lang.String r1 = r7.f308415h
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r8, r1)
            if (r1 == 0) goto L27
            goto L99
        L27:
            android.widget.EditText r1 = r7.f308411d
            java.lang.String r4 = "formatAndUpdateDisplay: "
            r7.f308414g = r2
            java.lang.String r5 = r7.f308413f     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            d71.d r6 = r7.f308412e
            if (r5 == 0) goto L47
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            if (r5 <= 0) goto L3a
            goto L3b
        L3a:
            r2 = r3
        L3b:
            if (r2 == 0) goto L47
            java.lang.String r0 = r7.f308413f     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r0)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            java.lang.String r0 = r6.a(r8, r0)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            goto L62
        L47:
            r6.getClass()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            java.lang.String r2 = "\\D"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            java.lang.String r5 = "compile(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r5)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            java.util.regex.Matcher r2 = r2.matcher(r8)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            java.lang.String r0 = r2.replaceAll(r0)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            java.lang.String r2 = "replaceAll(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r2)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
        L62:
            boolean r8 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r8)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            if (r8 != 0) goto L93
            r7.f308415h = r0     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            r1.removeTextChangedListener(r7)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            r1.setText(r0)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            r1.addTextChangedListener(r7)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            int r8 = r0.length()     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            r1.setSelection(r8)     // Catch: java.lang.Throwable -> L7b java.lang.Exception -> L7d
            goto L93
        L7b:
            r8 = move-exception
            goto L96
        L7d:
            r8 = move-exception
            java.lang.String r0 = "PhoneNumberTextWatcher"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b
            r1.<init>(r4)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L7b
            r1.append(r8)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r8 = r1.toString()     // Catch: java.lang.Throwable -> L7b
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r8)     // Catch: java.lang.Throwable -> L7b
        L93:
            r7.f308414g = r3
            return
        L96:
            r7.f308414g = r3
            throw r8
        L99:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d71.e.a(android.text.Editable):void");
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        a(editable);
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
    }
}
