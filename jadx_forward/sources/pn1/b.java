package pn1;

/* loaded from: classes12.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.StringBuffer f438497a = new java.lang.StringBuffer();

    public void a(java.lang.String str, java.lang.String str2) {
        c(str);
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2);
        java.lang.StringBuffer stringBuffer = this.f438497a;
        if (K0) {
            stringBuffer.append("");
        } else if (str2.contains("]]>")) {
            stringBuffer.append("<![CDATA[" + com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.p(str2) + "]]>");
        } else {
            stringBuffer.append("<![CDATA[" + str2 + "]]>");
        }
        b(str);
    }

    public void b(java.lang.String str) {
        this.f438497a.append("</" + str + ">");
    }

    public void c(java.lang.String str) {
        this.f438497a.append("<" + str + ">");
    }

    public void d(java.lang.String str, java.util.Map map) {
        java.lang.StringBuffer stringBuffer = this.f438497a;
        stringBuffer.append("<" + str);
        for (java.lang.String str2 : map.keySet()) {
            stringBuffer.append(" " + str2 + " =  \"" + ((java.lang.String) map.get(str2)) + "\" ");
        }
        stringBuffer.append(">");
        map.clear();
    }
}
