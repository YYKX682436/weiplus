package qj4;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f445444a;

    /* renamed from: b, reason: collision with root package name */
    public int f445445b;

    /* renamed from: c, reason: collision with root package name */
    public int f445446c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f445447d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f445448e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f445449f;

    public h(int i17, int i18, int i19, java.util.List custom_icon_list, java.util.List custom_word_list, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i27 & 1) != 0 ? 0 : i17;
        i18 = (i27 & 2) != 0 ? 0 : i18;
        i19 = (i27 & 4) != 0 ? 0 : i19;
        custom_icon_list = (i27 & 8) != 0 ? new java.util.ArrayList() : custom_icon_list;
        custom_word_list = (i27 & 16) != 0 ? new java.util.ArrayList() : custom_word_list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(custom_icon_list, "custom_icon_list");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(custom_word_list, "custom_word_list");
        this.f445444a = i17;
        this.f445445b = i18;
        this.f445446c = i19;
        this.f445447d = custom_icon_list;
        this.f445448e = custom_word_list;
        this.f445449f = "MicroMsg.TextStatusIconPickerCustomStatusSdkReportModel";
    }

    /* renamed from: equals */
    public boolean m160257xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qj4.h)) {
            return false;
        }
        qj4.h hVar = (qj4.h) obj;
        return this.f445444a == hVar.f445444a && this.f445445b == hVar.f445445b && this.f445446c == hVar.f445446c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f445447d, hVar.f445447d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f445448e, hVar.f445448e);
    }

    /* renamed from: hashCode */
    public int m160258x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f445444a) * 31) + java.lang.Integer.hashCode(this.f445445b)) * 31) + java.lang.Integer.hashCode(this.f445446c)) * 31) + this.f445447d.hashCode()) * 31) + this.f445448e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m160259x9616526c() {
        return "TextStatusIconPickerCustomStatusSdkReportModel(clk_custom_icon_pv=" + this.f445444a + ", clk_cancel_pv=" + this.f445445b + ", clk_finish_pv=" + this.f445446c + ", custom_icon_list=" + this.f445447d + ", custom_word_list=" + this.f445448e + ')';
    }
}
