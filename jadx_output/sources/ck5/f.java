package ck5;

/* loaded from: classes5.dex */
public class f extends ck5.a {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.ref.WeakReference f42558c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f42559d;

    /* renamed from: e, reason: collision with root package name */
    public int f42560e;

    /* renamed from: f, reason: collision with root package name */
    public int f42561f;

    /* renamed from: h, reason: collision with root package name */
    public java.util.ArrayList f42563h;

    /* renamed from: i, reason: collision with root package name */
    public ck5.e f42564i;

    /* renamed from: b, reason: collision with root package name */
    public boolean f42557b = true;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.tools.t4 f42562g = com.tencent.mm.ui.tools.t4.MODE_CHINESE_AS_2;

    /* renamed from: a, reason: collision with root package name */
    public boolean f42556a = false;

    public f(java.lang.ref.WeakReference weakReference) {
        this.f42558c = weakReference;
    }

    public static ck5.f b(android.widget.EditText editText) {
        return new ck5.f(new java.lang.ref.WeakReference(editText));
    }

    public static java.lang.String e(java.lang.String str, int i17) {
        int c17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return str;
        }
        int f17 = com.tencent.mm.ui.tools.v4.f(str);
        com.tencent.mm.ui.tools.v4.d(i17, str);
        return (f17 <= i17 || (c17 = com.tencent.mm.ui.tools.v4.c(i17, str)) <= 0 || c17 >= i17 || c17 >= str.length()) ? str : str.substring(0, c17);
    }

    public int a() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f42559d)) {
            java.lang.ref.WeakReference weakReference = this.f42558c;
            if (weakReference == null) {
                return 1;
            }
            this.f42559d = ((android.widget.EditText) weakReference.get()).getText().toString().trim();
        }
        int e17 = com.tencent.mm.ui.tools.v4.e(this.f42559d, this.f42562g);
        if (e17 < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.InputTextBoundaryCheck", "you are crazy =.=!that is 2 GB character!");
            return 2;
        }
        if (e17 < this.f42561f) {
            return 1;
        }
        return e17 > this.f42560e ? 2 : 0;
    }

    public void c() {
        if (!this.f42556a) {
            java.lang.ref.WeakReference weakReference = this.f42558c;
            if (weakReference == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.InputTextBoundaryCheck", "edit text view is null");
                return;
            } else if (com.tencent.mm.sdk.platformtools.t8.L0(this.f42563h)) {
                ((android.widget.EditText) weakReference.get()).setFilters(new android.text.InputFilter[]{f(this.f42560e, this.f42562g)});
            } else {
                this.f42563h.add(f(this.f42560e, this.f42562g));
                java.util.ArrayList arrayList = this.f42563h;
                ((android.widget.EditText) weakReference.get()).setFilters((android.text.InputFilter[]) arrayList.toArray(new android.text.InputFilter[arrayList.size()]));
            }
        }
        if (this.f42564i != null) {
            int a17 = a();
            if (a17 == 0) {
                this.f42564i.c1(this.f42559d);
            } else if (a17 == 1) {
                this.f42564i.R5(this.f42559d);
            } else {
                if (a17 != 2) {
                    return;
                }
                this.f42564i.w0(this.f42559d);
            }
        }
    }

    public void d(ck5.e eVar) {
        this.f42564i = eVar;
        c();
    }

    public com.tencent.mm.ui.tools.v4 f(int i17, com.tencent.mm.ui.tools.t4 t4Var) {
        return new com.tencent.mm.ui.tools.v4(i17, t4Var, this.f42557b, new ck5.d(this));
    }

    public f(java.lang.String str) {
        this.f42559d = str;
    }
}
