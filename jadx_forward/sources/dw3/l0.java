package dw3;

/* loaded from: classes5.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f325762a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f325763b;

    /* renamed from: c, reason: collision with root package name */
    public final dw3.o0 f325764c;

    /* renamed from: d, reason: collision with root package name */
    public final dw3.k0 f325765d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Integer f325766e;

    public l0(java.lang.String selectedTemplateId, java.lang.String str, dw3.o0 o0Var, dw3.k0 k0Var, java.lang.Integer num, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        selectedTemplateId = (i17 & 1) != 0 ? "" : selectedTemplateId;
        str = (i17 & 2) != 0 ? null : str;
        o0Var = (i17 & 4) != 0 ? null : o0Var;
        k0Var = (i17 & 8) != 0 ? null : k0Var;
        num = (i17 & 16) != 0 ? null : num;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedTemplateId, "selectedTemplateId");
        this.f325762a = selectedTemplateId;
        this.f325763b = str;
        this.f325764c = o0Var;
        this.f325765d = k0Var;
        this.f325766e = num;
    }

    public final java.lang.String a() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        dw3.o0 o0Var = this.f325764c;
        if (o0Var != null) {
            sb6.append("&launchType=" + o0Var.f325783d);
        }
        java.lang.String str = this.f325762a;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
            sb6.append("&templateId=" + str);
        }
        java.lang.String str2 = this.f325763b;
        if (!(str2 == null || str2.length() == 0)) {
            sb6.append("&musicKey=" + str2);
        }
        dw3.k0 k0Var = this.f325765d;
        if (k0Var != null) {
            sb6.append("&editTabId=" + k0Var.f325760d);
        }
        java.lang.Integer num = this.f325766e;
        if (num != null) {
            sb6.append("&exportedOpenWX=" + num);
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
