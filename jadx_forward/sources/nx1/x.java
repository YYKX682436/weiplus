package nx1;

/* loaded from: classes12.dex */
public class x implements java.io.Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.regex.Pattern f422858f = java.util.regex.Pattern.compile("\\r\\n|\\r|\\n");

    /* renamed from: d, reason: collision with root package name */
    public final int f422859d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f422860e = new java.util.ArrayList();

    public x(android.text.Spanned spanned) {
        this.f422859d = 0;
        if (spanned != null) {
            java.lang.String obj = spanned.toString();
            this.f422859d = 1;
            java.util.regex.Matcher matcher = f422858f.matcher(obj);
            int i17 = 0;
            while (matcher.find()) {
                this.f422860e.add(new px1.l(i17, matcher.end(), this.f422859d == 1, false));
                i17 = matcher.end();
                this.f422859d++;
            }
            if (this.f422860e.size() < this.f422859d) {
                this.f422860e.add(new px1.l(i17, obj.length(), this.f422859d == 1, true));
            }
        }
    }

    public int a(int i17) {
        java.util.ArrayList arrayList;
        int i18 = 0;
        while (true) {
            int i19 = this.f422859d;
            arrayList = this.f422860e;
            if (i18 >= i19 || i17 < ((px1.l) arrayList.get(i18)).f422849e) {
                break;
            }
            i18++;
        }
        return java.lang.Math.min(java.lang.Math.max(0, i18), arrayList.size() - 1);
    }

    /* renamed from: toString */
    public java.lang.String m150286x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = this.f422860e.iterator();
        int i17 = 1;
        while (it.hasNext()) {
            px1.l lVar = (px1.l) it.next();
            int i18 = i17 + 1;
            sb6.append(i17);
            sb6.append(": ");
            sb6.append(lVar.f422848d);
            sb6.append("-");
            sb6.append(lVar.f422849e);
            sb6.append(lVar.f440364g ? "" : ", ");
            i17 = i18;
        }
        return sb6.toString();
    }
}
