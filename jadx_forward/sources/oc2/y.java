package oc2;

/* loaded from: classes8.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    public final r45.cp5 f425844a;

    /* renamed from: b, reason: collision with root package name */
    public final int f425845b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f425846c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f425847d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f425848e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f425849f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f425850g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f425851h;

    /* renamed from: i, reason: collision with root package name */
    public oc2.a f425852i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f425853j;

    public y(r45.cp5 renderNode, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderNode, "renderNode");
        this.f425844a = renderNode;
        this.f425845b = i17;
        this.f425847d = "";
        this.f425849f = "";
        this.f425851h = "";
        this.f425853j = jz5.h.b(oc2.x.f425828d);
    }

    public final float[] a(java.lang.CharSequence content) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(content, "content");
        if (b().containsKey(content)) {
            return (float[]) b().get(content);
        }
        d(content, 0.0f);
        return (float[]) b().get(content);
    }

    public final java.util.HashMap b() {
        return (java.util.HashMap) ((jz5.n) this.f425853j).mo141623x754a37bb();
    }

    public final void c(oc2.w renderNodeType) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderNodeType, "renderNodeType");
        int ordinal = renderNodeType.ordinal();
        if (ordinal == 0) {
            this.f425846c = false;
            this.f425847d = "";
        } else if (ordinal == 1) {
            this.f425848e = false;
            this.f425849f = "";
        } else {
            if (ordinal != 2) {
                return;
            }
            this.f425850g = false;
            this.f425851h = "";
        }
    }

    public final void d(java.lang.CharSequence charSequence, float f17) {
        float[] fArr;
        if ((charSequence == null || charSequence.length() == 0) || b().containsKey(charSequence)) {
            return;
        }
        float floatValue = (f17 > 0.0f ? java.lang.Float.valueOf(f17) : java.lang.Integer.valueOf(oc2.v.n(oc2.v.f425815a, this.f425844a, null, 0.0f, 3, null))).floatValue();
        if (charSequence == null || charSequence.length() == 0) {
            fArr = new float[0];
        } else {
            android.text.TextPaint textPaint = new android.text.TextPaint();
            textPaint.setAntiAlias(true);
            textPaint.setTextSize(floatValue);
            fArr = new float[charSequence.length()];
            textPaint.getTextWidths(charSequence, 0, charSequence.length(), fArr);
        }
        b().put(charSequence, fArr);
    }

    public final void e(oc2.w renderNodeType, java.lang.String clientThumbnail) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderNodeType, "renderNodeType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clientThumbnail, "clientThumbnail");
        this.f425846c = false;
        this.f425847d = "";
        this.f425848e = false;
        this.f425849f = "";
        this.f425850g = false;
        this.f425851h = "";
        int ordinal = renderNodeType.ordinal();
        if (ordinal == 0) {
            this.f425846c = true;
            this.f425847d = clientThumbnail;
        } else if (ordinal == 1) {
            this.f425848e = true;
            this.f425849f = clientThumbnail;
        } else {
            if (ordinal != 2) {
                return;
            }
            this.f425850g = true;
            this.f425851h = clientThumbnail;
        }
    }

    /* renamed from: equals */
    public boolean m151018xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oc2.y)) {
            return false;
        }
        oc2.y yVar = (oc2.y) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f425844a, yVar.f425844a) && this.f425845b == yVar.f425845b;
    }

    /* renamed from: hashCode */
    public int m151019x8cdac1b() {
        return (this.f425844a.hashCode() * 31) + java.lang.Integer.hashCode(this.f425845b);
    }

    /* renamed from: toString */
    public java.lang.String m151020x9616526c() {
        java.lang.String str;
        r45.x80 x80Var;
        r45.x80 x80Var2;
        r45.qy3 qy3Var;
        r45.x80 x80Var3;
        r45.qy3 qy3Var2;
        r45.x80 x80Var4;
        r45.qy3 qy3Var3;
        r45.x80 x80Var5;
        r45.x80 x80Var6;
        r45.x80 x80Var7;
        r45.cp5 cp5Var = this.f425844a;
        r45.ap5 ap5Var = cp5Var.f453302e;
        r45.xy3 xy3Var = null;
        java.lang.String str2 = (ap5Var == null || (x80Var7 = ap5Var.f451711f) == null) ? null : x80Var7.f471386d;
        if (str2 == null || str2.length() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("origin=");
            r45.ap5 ap5Var2 = cp5Var.f453302e;
            sb6.append((ap5Var2 == null || (x80Var6 = ap5Var2.f451709d) == null) ? null : x80Var6.f471386d);
            sb6.append("/thumb=");
            r45.ap5 ap5Var3 = cp5Var.f453302e;
            sb6.append((ap5Var3 == null || (x80Var5 = ap5Var3.f451710e) == null) ? null : x80Var5.f471386d);
            str = sb6.toString();
        } else {
            r45.ap5 ap5Var4 = cp5Var.f453302e;
            str = (ap5Var4 == null || (x80Var = ap5Var4.f451711f) == null) ? null : x80Var.f471386d;
        }
        r45.ap5 ap5Var5 = cp5Var.f453302e;
        if (((ap5Var5 == null || (x80Var4 = ap5Var5.f451711f) == null || (qy3Var3 = x80Var4.f471387e) == null) ? null : qy3Var3.f465885e) != null) {
            if (ap5Var5 != null && (x80Var3 = ap5Var5.f451711f) != null && (qy3Var2 = x80Var3.f471387e) != null) {
                xy3Var = qy3Var2.f465885e;
            }
        } else if (ap5Var5 != null && (x80Var2 = ap5Var5.f451709d) != null && (qy3Var = x80Var2.f471387e) != null) {
            xy3Var = qy3Var.f465885e;
        }
        return "[index=" + this.f425845b + ";renderNode=" + cp5Var.f453301d + ',' + str + ',' + xy3Var + ",capsuleMarginInfo=" + this.f425852i + ']';
    }
}
