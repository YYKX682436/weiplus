package mz4;

/* loaded from: classes12.dex */
public class i0 implements java.io.Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.regex.Pattern f414819f = java.util.regex.Pattern.compile("\\r\\n|\\r|\\n");

    /* renamed from: d, reason: collision with root package name */
    public final int f414820d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f414821e = new java.util.ArrayList();

    public i0(android.text.Spanned spanned) {
        this.f414820d = 0;
        if (spanned != null) {
            java.lang.String obj = spanned.toString();
            this.f414820d = 1;
            java.util.regex.Matcher matcher = f414819f.matcher(obj);
            int i17 = 0;
            while (matcher.find()) {
                this.f414821e.add(new oz4.o(i17, matcher.end(), this.f414820d == 1, false));
                i17 = matcher.end();
                this.f414820d++;
            }
            if (this.f414821e.size() < this.f414820d) {
                this.f414821e.add(new oz4.o(i17, obj.length(), this.f414820d == 1, true));
            }
        }
    }

    public int a(int i17) {
        java.util.ArrayList arrayList;
        int i18 = 0;
        while (true) {
            int i19 = this.f414820d;
            arrayList = this.f414821e;
            if (i18 >= i19 || i17 < ((oz4.o) arrayList.get(i18)).f414884e) {
                break;
            }
            i18++;
        }
        return java.lang.Math.min(java.lang.Math.max(0, i18), arrayList.size() - 1);
    }

    /* renamed from: toString */
    public java.lang.String m148692x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = this.f414821e.iterator();
        int i17 = 1;
        while (it.hasNext()) {
            oz4.o oVar = (oz4.o) it.next();
            int i18 = i17 + 1;
            sb6.append(i17);
            sb6.append(": ");
            sb6.append(oVar.f414883d);
            sb6.append("-");
            sb6.append(oVar.f414884e);
            sb6.append(oVar.f431827g ? "" : ", ");
            i17 = i18;
        }
        return sb6.toString();
    }
}
