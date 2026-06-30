package aa3;

/* loaded from: classes15.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public aa3.d f2579a;

    /* renamed from: b, reason: collision with root package name */
    public aa3.c f2580b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f2581c;

    /* renamed from: d, reason: collision with root package name */
    public int f2582d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f2583e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f2584f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f2585g;

    /* renamed from: h, reason: collision with root package name */
    public int f2586h = 1;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f2587i = kz5.c1.k(new jz5.l("Digit", 2), new jz5.l("Number", 0), new jz5.l("IDCard", 1));

    /* renamed from: j, reason: collision with root package name */
    public final aa3.b f2588j = new aa3.o(this);

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Runnable f2589k = new aa3.p(this);

    public final aa3.c a(android.view.inputmethod.InputConnection inputConnection, aa3.m mVar) {
        synchronized ("MicroMsg.LiteAppExtendInputClient") {
            aa3.c cVar = this.f2580b;
            if (cVar != null && kotlin.jvm.internal.o.b(this.f2584f, this.f2585g)) {
                if (inputConnection != null) {
                    cVar.i(inputConnection);
                }
                return cVar;
            }
            aa3.c cVar2 = null;
            if (this.f2584f == null) {
                return null;
            }
            if (!this.f2581c) {
                return null;
            }
            if ((f(this.f2583e) || kotlin.jvm.internal.o.b(this.f2583e, "Pay") || kotlin.jvm.internal.o.b(this.f2583e, "PayNumber") || kotlin.jvm.internal.o.b(this.f2583e, "SafePassword") || kotlin.jvm.internal.o.b(this.f2583e, "PayIDCard")) && inputConnection == null) {
                return null;
            }
            aa3.d dVar = this.f2579a;
            if (dVar != null && dVar.b() != null) {
                java.lang.String str = this.f2583e;
                kotlin.jvm.internal.o.d(str);
                this.f2580b = b(str, inputConnection, mVar);
                aa3.d dVar2 = this.f2579a;
                kotlin.jvm.internal.o.d(dVar2);
                android.view.View b17 = dVar2.b();
                if (b17 != null) {
                    b17.setOnApplyWindowInsetsListener(aa3.n.f2565d);
                }
                this.f2585g = this.f2584f;
                cVar2 = this.f2580b;
            } else if (!kotlin.jvm.internal.o.b(this.f2584f, this.f2585g)) {
                aa3.c cVar3 = this.f2580b;
                if (cVar3 != null) {
                    cVar3.setXMode(this.f2586h);
                    cVar3.b();
                }
                this.f2585g = this.f2584f;
            }
            return cVar2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0213, code lost:
    
        r5 = r6.getString("pwdNonce");
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x021f, code lost:
    
        if (r6.has("pwdSoftSalt") == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0221, code lost:
    
        r8 = r6.getString("pwdSoftSalt");
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x022b, code lost:
    
        if (r6.has("pwdTimestamp") == false) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x022d, code lost:
    
        r1 = java.lang.Long.valueOf(r6.getLong("pwdTimestamp"));
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0235, code lost:
    
        kotlin.jvm.internal.o.g(r14, "pwdEncryptMode");
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0238, code lost:
    
        if (r13 != null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x023b, code lost:
    
        r13.setPwdEncryptMode(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x023e, code lost:
    
        if (r13 != null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0241, code lost:
    
        r13.setPwdNonce(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0244, code lost:
    
        if (r13 != null) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0247, code lost:
    
        r13.setPwdTimestamp(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x024a, code lost:
    
        if (r13 != null) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x024d, code lost:
    
        r13.setPwdSoftSalt(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0226, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0218, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01e9, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01d8, code lost:
    
        if (r6.equals("hksoft_md5") == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b9, code lost:
    
        if (r6.equals("hksoft_pbkdf2") == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01dc, code lost:
    
        if (r0 != null) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01de, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.LiteAppExtendInputClient", "extraData is null, hkwallet password keyboard required extraData");
        r6 = new org.json.JSONObject();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01ea, code lost:
    
        r6.put("pwdEncryptMode", r14);
        r14 = aa3.z0.f2632f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01f5, code lost:
    
        if (r6.has("pwdEncryptMode") == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01f7, code lost:
    
        r14 = r6.getString("pwdEncryptMode");
        kotlin.jvm.internal.o.f(r14, "getString(...)");
        r14 = r14.toUpperCase(r5);
        kotlin.jvm.internal.o.f(r14, "toUpperCase(...)");
        r14 = aa3.z0.valueOf(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0211, code lost:
    
        if (r6.has("pwdNonce") == false) goto L113;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final aa3.c b(java.lang.String r12, android.view.inputmethod.InputConnection r13, aa3.m r14) {
        /*
            Method dump skipped, instructions count: 692
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aa3.q.b(java.lang.String, android.view.inputmethod.InputConnection, aa3.m):aa3.c");
    }

    public boolean c(org.json.JSONObject jSONObject, android.view.inputmethod.InputConnection inputConnection) {
        aa3.c a17;
        if (this.f2579a != null && (a17 = a(null, null)) != null) {
            a17.hideKeyboard();
            a17.a(false);
        }
        e(android.graphics.Insets.of(0, 0, 0, 0));
        this.f2583e = null;
        this.f2584f = null;
        this.f2581c = false;
        this.f2580b = null;
        return false;
    }

    public final void d() {
        android.view.View b17;
        android.view.View b18;
        int i17 = this.f2582d;
        java.lang.Runnable runnable = this.f2589k;
        if (i17 == 0) {
            aa3.d dVar = this.f2579a;
            if (dVar == null || (b18 = dVar.b()) == null) {
                return;
            }
            b18.post(runnable);
            return;
        }
        aa3.d dVar2 = this.f2579a;
        if (dVar2 == null || (b17 = dVar2.b()) == null) {
            return;
        }
        b17.postOnAnimationDelayed(runnable, 100L);
    }

    public final void e(android.graphics.Insets insets) {
        android.view.WindowInsets build;
        aa3.d dVar;
        android.view.View b17;
        android.graphics.Insets insets2;
        aa3.d dVar2 = this.f2579a;
        android.app.Activity a17 = q75.a.a(dVar2 != null ? dVar2.a() : null);
        if (a17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppExtendInputClient", "send keyboard height, but activity is null");
            return;
        }
        aa3.d dVar3 = this.f2579a;
        if (dVar3 == null || dVar3.b() == null) {
            return;
        }
        android.view.WindowInsets b18 = com.tencent.mm.ui.qk.b(a17);
        int i17 = android.os.Build.VERSION.SDK_INT;
        int c17 = i17 >= 30 ? (b18 == null || (insets2 = b18.getInsets(android.view.WindowInsets.Type.navigationBars())) == null) ? com.tencent.mm.ui.bl.c(a17) : insets2.bottom : com.tencent.mm.ui.bl.c(a17);
        if (b18 != null) {
            if (insets != null) {
                build = i17 >= 30 ? new android.view.WindowInsets.Builder(b18).setInsets(android.view.WindowInsets.Type.ime(), insets).build() : i17 >= 29 ? new android.view.WindowInsets.Builder(b18).setSystemWindowInsets(insets).build() : b18.replaceSystemWindowInsets(insets.left, insets.top, insets.right, insets.bottom);
            } else if (i17 >= 30) {
                android.graphics.Insets insets3 = b18.getInsets(android.view.WindowInsets.Type.ime());
                kotlin.jvm.internal.o.f(insets3, "getInsets(...)");
                build = new android.view.WindowInsets.Builder(b18).setInsets(android.view.WindowInsets.Type.ime(), android.graphics.Insets.of(insets3.left, insets3.top, insets3.right, insets3.bottom - c17)).build();
            } else {
                build = i17 >= 29 ? new android.view.WindowInsets.Builder(b18).setSystemWindowInsets(android.graphics.Insets.of(b18.getSystemWindowInsetLeft(), b18.getSystemWindowInsetTop(), b18.getSystemWindowInsetRight(), b18.getSystemWindowInsetBottom() - c17)).build() : b18.replaceSystemWindowInsets(b18.getSystemWindowInsetLeft(), b18.getSystemWindowInsetTop(), b18.getSystemWindowInsetRight(), b18.getSystemWindowInsetBottom() - c17);
            }
            if (build != null && (dVar = this.f2579a) != null && (b17 = dVar.b()) != null) {
                b17.onApplyWindowInsets(build);
            }
            aa3.h0 h0Var = aa3.h0.f2526a;
            if (insets == null) {
                b18.getSystemWindowInsetBottom();
            }
            java.util.Iterator it = aa3.h0.f2532g.iterator();
            if (it.hasNext()) {
                android.support.v4.media.f.a(it.next());
                throw null;
            }
        }
    }

    public final boolean f(java.lang.String str) {
        return kotlin.jvm.internal.o.b(str, "Number") || kotlin.jvm.internal.o.b(str, "Digit") || kotlin.jvm.internal.o.b(str, "IDCard");
    }
}
