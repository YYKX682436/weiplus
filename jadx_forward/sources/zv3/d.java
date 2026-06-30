package zv3;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final float[] f557962a;

    /* renamed from: b, reason: collision with root package name */
    public final float[] f557963b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f557964c;

    /* renamed from: d, reason: collision with root package name */
    public final int f557965d;

    /* renamed from: e, reason: collision with root package name */
    public final int f557966e;

    /* renamed from: f, reason: collision with root package name */
    public final int f557967f;

    /* renamed from: g, reason: collision with root package name */
    public final int f557968g;

    /* renamed from: h, reason: collision with root package name */
    public final int f557969h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f557970i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f557971j;

    public d(float[] drawingRect, float[] fArr, java.util.List editorItems, int i17, int i18, int i19, int i27, int i28, boolean z17, java.lang.String blurBgPath) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(drawingRect, "drawingRect");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editorItems, "editorItems");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(blurBgPath, "blurBgPath");
        this.f557962a = drawingRect;
        this.f557963b = fArr;
        this.f557964c = editorItems;
        this.f557965d = i17;
        this.f557966e = i18;
        this.f557967f = i19;
        this.f557968g = i27;
        this.f557969h = i28;
        this.f557970i = z17;
        this.f557971j = blurBgPath;
    }

    /* renamed from: equals */
    public boolean m179783xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zv3.d)) {
            return false;
        }
        zv3.d dVar = (zv3.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557962a, dVar.f557962a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557963b, dVar.f557963b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557964c, dVar.f557964c) && this.f557965d == dVar.f557965d && this.f557966e == dVar.f557966e && this.f557967f == dVar.f557967f && this.f557968g == dVar.f557968g && this.f557969h == dVar.f557969h && this.f557970i == dVar.f557970i && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f557971j, dVar.f557971j);
    }

    /* renamed from: hashCode */
    public int m179784x8cdac1b() {
        int hashCode = java.util.Arrays.hashCode(this.f557962a) * 31;
        float[] fArr = this.f557963b;
        return ((((((((((((((((hashCode + (fArr == null ? 0 : java.util.Arrays.hashCode(fArr))) * 31) + this.f557964c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f557965d)) * 31) + java.lang.Integer.hashCode(this.f557966e)) * 31) + java.lang.Integer.hashCode(this.f557967f)) * 31) + java.lang.Integer.hashCode(this.f557968g)) * 31) + java.lang.Integer.hashCode(this.f557969h)) * 31) + java.lang.Boolean.hashCode(this.f557970i)) * 31) + this.f557971j.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m179785x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("RetrieverData(drawingRect=");
        java.lang.String arrays = java.util.Arrays.toString(this.f557962a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
        sb6.append(arrays);
        sb6.append(", validRect=");
        float[] fArr = this.f557963b;
        if (fArr != null) {
            str = java.util.Arrays.toString(fArr);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
        } else {
            str = null;
        }
        sb6.append(str);
        sb6.append(", editorItems=");
        sb6.append(this.f557964c);
        sb6.append(", width=");
        sb6.append(this.f557965d);
        sb6.append(", height=");
        sb6.append(this.f557966e);
        sb6.append(", videoWidth=");
        sb6.append(this.f557967f);
        sb6.append(", videoHeight=");
        sb6.append(this.f557968g);
        sb6.append(", rotate=");
        sb6.append(this.f557969h);
        sb6.append(", isForMix=");
        sb6.append(this.f557970i);
        sb6.append(", blurBgPath='");
        sb6.append(this.f557971j);
        sb6.append("')");
        return sb6.toString();
    }

    public /* synthetic */ d(float[] fArr, float[] fArr2, java.util.List list, int i17, int i18, int i19, int i27, int i28, boolean z17, java.lang.String str, int i29, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(fArr, (i29 & 2) != 0 ? null : fArr2, list, i17, i18, i19, i27, i28, (i29 & 256) != 0 ? false : z17, (i29 & 512) != 0 ? "" : str);
    }
}
