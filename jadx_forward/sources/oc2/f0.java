package oc2;

/* loaded from: classes8.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f425701a;

    /* renamed from: b, reason: collision with root package name */
    public final int f425702b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f425703c;

    /* renamed from: d, reason: collision with root package name */
    public final int f425704d;

    /* renamed from: e, reason: collision with root package name */
    public final float f425705e;

    /* renamed from: f, reason: collision with root package name */
    public final int f425706f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f425707g;

    public f0(int i17, int i18, java.lang.Object data, int i19, float f17, int i27) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        this.f425701a = i17;
        this.f425702b = i18;
        this.f425703c = data;
        this.f425704d = i19;
        this.f425705e = f17;
        this.f425706f = i27;
        this.f425707g = "";
    }

    public final void a(java.lang.String tag, java.lang.String replaceChar, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(replaceChar, "replaceChar");
        java.lang.Object obj = this.f425703c;
        if (obj instanceof java.lang.CharSequence) {
            this.f425707g = obj.toString();
        } else if (obj instanceof android.graphics.drawable.Drawable) {
            if (f17 > 0.0f) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(this.f425703c, "null cannot be cast to non-null type android.graphics.drawable.Drawable");
                int ceil = (int) java.lang.Math.ceil(((android.graphics.drawable.Drawable) r1).getBounds().width() / f17);
                for (int i17 = 0; i17 < ceil; i17++) {
                    sb6.append(replaceChar);
                }
                replaceChar = sb6.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(replaceChar);
            }
            this.f425707g = replaceChar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(tag, "GlobalCapsuleItem " + this + ',' + this.f425707g);
    }

    public final void b(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "<set-?>");
        this.f425703c = obj;
    }

    /* renamed from: equals */
    public boolean m150986xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc2.f0)) {
            return false;
        }
        oc2.f0 f0Var = (oc2.f0) obj;
        return this.f425701a == f0Var.f425701a && this.f425702b == f0Var.f425702b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f425703c, f0Var.f425703c) && this.f425704d == f0Var.f425704d && java.lang.Float.compare(this.f425705e, f0Var.f425705e) == 0 && this.f425706f == f0Var.f425706f;
    }

    /* renamed from: hashCode */
    public int m150987x8cdac1b() {
        return (((((((((java.lang.Integer.hashCode(this.f425701a) * 31) + java.lang.Integer.hashCode(this.f425702b)) * 31) + this.f425703c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f425704d)) * 31) + java.lang.Float.hashCode(this.f425705e)) * 31) + java.lang.Integer.hashCode(this.f425706f);
    }

    /* renamed from: toString */
    public java.lang.String m150988x9616526c() {
        return "GlobalCapsuleItem(style=" + this.f425701a + ", index=" + this.f425702b + ", data=" + this.f425703c + ", color=" + this.f425704d + ", size=" + this.f425705e + ", fontWeight=" + this.f425706f + ')';
    }
}
