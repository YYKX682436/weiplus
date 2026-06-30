package ck5;

/* loaded from: classes5.dex */
public class f extends ck5.a {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f124091c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f124092d;

    /* renamed from: e, reason: collision with root package name */
    public int f124093e;

    /* renamed from: f, reason: collision with root package name */
    public int f124094f;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f124096h;

    /* renamed from: i, reason: collision with root package name */
    public ck5.e f124097i;

    /* renamed from: b, reason: collision with root package name */
    public boolean f124090b = true;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2740x696c9db.t4 f124095g = com.p314xaae8f345.mm.ui.p2740x696c9db.t4.MODE_CHINESE_AS_2;

    /* renamed from: a, reason: collision with root package name */
    public boolean f124089a = false;

    public f(java.lang.ref.WeakReference weakReference) {
        this.f124091c = weakReference;
    }

    public static ck5.f b(android.widget.EditText editText) {
        return new ck5.f(new java.lang.ref.WeakReference(editText));
    }

    public static java.lang.String e(java.lang.String str, int i17) {
        int c17;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return str;
        }
        int f17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(str);
        com.p314xaae8f345.mm.ui.p2740x696c9db.v4.d(i17, str);
        return (f17 <= i17 || (c17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.c(i17, str)) <= 0 || c17 >= i17 || c17 >= str.length()) ? str : str.substring(0, c17);
    }

    public int a() {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f124092d)) {
            java.lang.ref.WeakReference weakReference = this.f124091c;
            if (weakReference == null) {
                return 1;
            }
            this.f124092d = ((android.widget.EditText) weakReference.get()).getText().toString().trim();
        }
        int e17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.e(this.f124092d, this.f124095g);
        if (e17 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.InputTextBoundaryCheck", "you are crazy =.=!that is 2 GB character!");
            return 2;
        }
        if (e17 < this.f124094f) {
            return 1;
        }
        return e17 > this.f124093e ? 2 : 0;
    }

    public void c() {
        if (!this.f124089a) {
            java.lang.ref.WeakReference weakReference = this.f124091c;
            if (weakReference == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.InputTextBoundaryCheck", "edit text view is null");
                return;
            } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(this.f124096h)) {
                ((android.widget.EditText) weakReference.get()).setFilters(new android.text.InputFilter[]{f(this.f124093e, this.f124095g)});
            } else {
                this.f124096h.add(f(this.f124093e, this.f124095g));
                java.util.ArrayList arrayList = this.f124096h;
                ((android.widget.EditText) weakReference.get()).setFilters((android.text.InputFilter[]) arrayList.toArray(new android.text.InputFilter[arrayList.size()]));
            }
        }
        if (this.f124097i != null) {
            int a17 = a();
            if (a17 == 0) {
                this.f124097i.c1(this.f124092d);
            } else if (a17 == 1) {
                this.f124097i.R5(this.f124092d);
            } else {
                if (a17 != 2) {
                    return;
                }
                this.f124097i.w0(this.f124092d);
            }
        }
    }

    public void d(ck5.e eVar) {
        this.f124097i = eVar;
        c();
    }

    public com.p314xaae8f345.mm.ui.p2740x696c9db.v4 f(int i17, com.p314xaae8f345.mm.ui.p2740x696c9db.t4 t4Var) {
        return new com.p314xaae8f345.mm.ui.p2740x696c9db.v4(i17, t4Var, this.f124090b, new ck5.d(this));
    }

    public f(java.lang.String str) {
        this.f124092d = str;
    }
}
