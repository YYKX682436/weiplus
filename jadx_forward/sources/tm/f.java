package tm;

/* loaded from: classes.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f501958a = null;

    /* renamed from: b, reason: collision with root package name */
    public long f501959b = 0;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f501960c = null;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f501961d = new java.util.HashMap();

    /* renamed from: toString */
    public java.lang.String m166774x9616526c() {
        java.util.Iterator it = ((java.util.HashMap) this.f501961d).keySet().iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            str = str + ((java.lang.Integer) it.next()) + ",";
        }
        if (str.length() > 0) {
            str = str.substring(0, str.length() - 1);
        }
        return java.lang.String.format("NoticeInfo(%d){noticeID[%s], disasterTick[%d], content[%s], posistions[%s]}", java.lang.Integer.valueOf(hashCode()), this.f501958a, java.lang.Long.valueOf(this.f501959b), this.f501960c, str);
    }
}
