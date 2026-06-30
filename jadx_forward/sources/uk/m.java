package uk;

/* loaded from: classes11.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f510039a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f510040b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final int f510041c;

    public m(java.lang.String str, int i17) {
        if (str == null) {
            this.f510039a = "http://dldir1v6.qq.com/weixin/android/";
        } else {
            this.f510039a = str;
        }
        this.f510041c = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00bf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static uk.m a(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.m.a(java.lang.String):uk.m");
    }

    public java.lang.String b() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Map map = this.f510040b;
        sb6.append(java.lang.String.format("<patchupdate base=\"%s\" count=\"%d\" versioncode=\"%d\">", this.f510039a, java.lang.Integer.valueOf(((java.util.HashMap) map).size()), java.lang.Integer.valueOf(this.f510041c)));
        java.util.Iterator it = ((java.util.HashMap) map).entrySet().iterator();
        while (it.hasNext()) {
            uk.l lVar = (uk.l) ((java.util.Map.Entry) it.next()).getValue();
            sb6.append(java.lang.String.format("<item old=\"%s\" new=\"%s\" patch=\"%s\" url=\"%s\" size=\"%s\"></item>", lVar.f510034a, lVar.f510035b, lVar.f510036c, lVar.f510037d, java.lang.Integer.valueOf(lVar.f510038e)));
        }
        sb6.append("</patchupdate>");
        return sb6.toString();
    }
}
