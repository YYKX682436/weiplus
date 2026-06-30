package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a;

/* loaded from: classes12.dex */
public class j1 implements le0.t {
    public static final kk.j I = new jt0.j(500);

    /* renamed from: J, reason: collision with root package name */
    public static final java.lang.Class[] f272754J = {al5.w.class, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0.class, android.text.style.ForegroundColorSpan.class, jg5.b.class};
    public static java.lang.Boolean K = null;
    public static java.lang.Boolean L = null;
    public static final java.util.regex.Pattern M = java.util.regex.Pattern.compile("href\\s*=\\s*[\"|']");
    public android.content.Context A;
    public java.lang.String C;
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.a E;
    public int F;
    public boolean G;
    public java.lang.Object H;

    /* renamed from: a, reason: collision with root package name */
    public java.util.ArrayList f272755a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.ArrayList f272756b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f272757c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f272758d = null;

    /* renamed from: e, reason: collision with root package name */
    public boolean f272759e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f272760f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f272761g = true;

    /* renamed from: h, reason: collision with root package name */
    public boolean f272762h = false;

    /* renamed from: i, reason: collision with root package name */
    public boolean f272763i = false;

    /* renamed from: j, reason: collision with root package name */
    public boolean f272764j = true;

    /* renamed from: k, reason: collision with root package name */
    public boolean f272765k = true;

    /* renamed from: l, reason: collision with root package name */
    public boolean f272766l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f272767m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f272768n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f272769o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f272770p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f272771q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f272772r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f272773s = true;

    /* renamed from: t, reason: collision with root package name */
    public boolean f272774t = true;

    /* renamed from: u, reason: collision with root package name */
    public boolean f272775u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f272776v = false;

    /* renamed from: w, reason: collision with root package name */
    public java.util.Set f272777w = null;

    /* renamed from: x, reason: collision with root package name */
    public boolean f272778x = false;

    /* renamed from: y, reason: collision with root package name */
    public int f272779y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f272780z = 0;
    public boolean B = false;
    public int D = 0;

    public j1(android.content.Context context) {
        this.f272755a = new java.util.ArrayList();
        this.f272756b = new java.util.ArrayList();
        this.f272757c = new java.util.ArrayList();
        this.A = null;
        this.f272755a = new java.util.ArrayList();
        this.f272756b = new java.util.ArrayList();
        this.f272757c = new java.util.ArrayList();
        this.A = context;
    }

    public static boolean b(java.lang.String str) {
        boolean booleanValue;
        java.lang.Boolean bool = L;
        if (bool != null) {
            booleanValue = bool.booleanValue();
        } else {
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_wxa_appbrand_link_long_string, 0) == 1);
            L = valueOf;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpanProcessor", "useAppBrandLinkLongStringLogic:%b", valueOf);
            java.lang.Boolean bool2 = L;
            booleanValue = bool2 == null ? false : bool2.booleanValue();
        }
        if (booleanValue && str != null && str.length() > 300) {
            int length = str.length();
            java.util.regex.Matcher matcher = M.matcher(str);
            while (matcher.find()) {
                int end = matcher.end();
                char charAt = str.charAt(end - 1);
                int min = java.lang.Math.min(length, end + 300 + 1);
                int i17 = end;
                while (true) {
                    if (i17 >= min) {
                        i17 = -1;
                        break;
                    }
                    if (str.charAt(i17) == charAt) {
                        break;
                    }
                    i17++;
                }
                if (i17 < 0) {
                    if (min - end > 300) {
                        return true;
                    }
                } else if (i17 - end > 300) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean i() {
        java.lang.Boolean bool = K;
        if (bool != null) {
            return bool.booleanValue();
        }
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_android_wxa_appbrand_link_string_logic, 0) == 1);
        K = valueOf;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpanProcessor", "useAppBrandLinkLogic:%b", valueOf);
        return K.booleanValue();
    }

    public final boolean a(java.lang.String str, int i17, int i18) {
        r35.m3 a17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.b.a(this.A, str, i17, i18, 0, 0);
        if (a17 == null) {
            return false;
        }
        java.lang.Object obj = this.H;
        if (obj != null) {
            a17.f450729e = obj;
        }
        this.f272755a.add(a17);
        this.f272756b.add(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.i1(this, i17, i18));
        return true;
    }

    public final void c(android.text.Spannable spannable) {
        if (this.f272758d == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(spannable.toString())) {
            return;
        }
        if (x51.o1.F) {
            this.f272758d.setText(spannable, android.widget.TextView.BufferType.SPANNABLE);
        } else {
            this.f272758d.setText(spannable);
        }
    }

    public final void d(android.text.SpannableString spannableString) {
        boolean z17;
        boolean z18 = false;
        if (this.f272758d != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0 y0Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(this.f272758d.getContext());
            y0Var.f272839i = this.C;
            y0Var.f272841n = this.E;
            y0Var.f272842o = 0;
            y0Var.f272843p = this.F;
            java.lang.Object obj = this.H;
            if (obj instanceof android.os.Bundle) {
                z18 = ((android.os.Bundle) obj).getBoolean("SHOULD_PERFORM_CLICK", false);
                z17 = ((android.os.Bundle) this.H).getBoolean("SHOULD_PERFORM_LONG_CLICK", false);
            } else {
                z17 = false;
            }
            if (z18) {
                y0Var.f272847t = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.g1(this);
            }
            if (z17) {
                y0Var.f272844q = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.h1(this);
            }
            this.f272758d.setOnTouchListener(y0Var);
            return;
        }
        if (spannableString != null) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[] z0VarArr = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0[]) spannableString.getSpans(0, spannableString.length(), com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0.class);
            if (z0VarArr != null && z0VarArr.length > 0 && this.C != null) {
                for (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 z0Var : z0VarArr) {
                    z0Var.m75737x7ffb700f(this.C);
                }
            }
            if (z0VarArr == null || z0VarArr.length <= 0) {
                return;
            }
            for (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z0 z0Var2 : z0VarArr) {
                z0Var2.m75732xc006eab8(this.E, 0);
                z0Var2.m75733xbf229af9(this.F);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.text.SpannableString e(java.lang.CharSequence r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1.e(java.lang.CharSequence, int, boolean):android.text.SpannableString");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 712
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    public final android.text.SpannableString f(java.lang.CharSequence r26, boolean r27, boolean r28) {
        /*
            Method dump skipped, instructions count: 3201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1.f(java.lang.CharSequence, boolean, boolean):android.text.SpannableString");
    }

    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.j1 g(android.widget.TextView textView) {
        this.f272758d = textView;
        if (textView != null) {
            this.A = textView.getContext();
        }
        return this;
    }

    public final void h(r35.m3 m3Var) {
        java.lang.Object obj = this.H;
        if (obj == null || !(obj instanceof android.os.Bundle)) {
            return;
        }
        byte[] byteArray = ((android.os.Bundle) obj).getByteArray("adExtInfo");
        java.lang.String str = m3Var.f450727c;
        if (byteArray != null) {
            java.lang.String str2 = "";
            try {
                r45.x76 x76Var = new r45.x76();
                java.util.LinkedList linkedList = x76Var.f471381d;
                x76Var.mo11468x92b714fd(byteArray);
                if (linkedList != null) {
                    for (int i17 = 0; i17 < linkedList.size(); i17++) {
                        r45.y76 y76Var = (r45.y76) linkedList.get(i17);
                        if (str != null && y76Var != null && str.equals(y76Var.f472374d)) {
                            str2 = y76Var.f472375e;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SpanProcessor", "Ad first Comment url:%s AppendURL:%s", str, str2);
                        }
                    }
                }
            } catch (java.io.IOException unused) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SpanProcessor", "parse adExtInfo error");
            }
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                return;
            }
            ((android.os.Bundle) this.H).putString("AppendURL_" + str, str2);
        }
    }

    public final boolean b(java.util.ArrayList arrayList, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.i1 i1Var) {
        boolean z17;
        java.util.Iterator it = arrayList.iterator();
        do {
            z17 = false;
            if (!it.hasNext()) {
                return false;
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.i1 i1Var2 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.i1) it.next();
            i1Var2.getClass();
            if (i1Var2.f272751b > i1Var.f272750a && i1Var.f272751b > i1Var2.f272750a) {
                z17 = true;
            }
        } while (!z17);
        return true;
    }
}
