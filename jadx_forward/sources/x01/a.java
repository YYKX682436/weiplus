package x01;

/* loaded from: classes9.dex */
public class a {

    /* renamed from: f, reason: collision with root package name */
    public static final kk.j f532504f = new jt0.j(100);

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f532505a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f532506b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f532507c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f532508d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f532509e;

    public static final x01.a a(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandQALogic", "empty xml to parse");
            return null;
        }
        int indexOf = str.indexOf("<qamsg");
        if (indexOf > 0) {
            str = str.substring(indexOf);
        }
        int hashCode = str.hashCode();
        kk.j jVar = f532504f;
        x01.a aVar = (x01.a) ((lt0.f) jVar).get(java.lang.Integer.valueOf(hashCode));
        if (aVar != null) {
            return aVar;
        }
        java.util.Map d17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.aa.d(str, "qamsg", null);
        if (d17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandQALogic", "parse msg failed");
            return null;
        }
        try {
            x01.a aVar2 = new x01.a();
            aVar2.f532505a = (java.lang.String) d17.get(".qamsg.$fromUser");
            aVar2.f532506b = (java.lang.String) d17.get(".qamsg.$fromNickname");
            aVar2.f532507c = (java.lang.String) d17.get(".qamsg.question.content");
            aVar2.f532508d = (java.lang.String) d17.get(".qamsg.answer.content");
            aVar2.f532509e = (java.lang.String) d17.get(".qamsg.answer1.content");
            ((lt0.f) jVar).j(java.lang.Integer.valueOf(hashCode), aVar2);
            return aVar2;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BrandQALogic", "parse qamessage xml failed");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.BrandQALogic", e17, "", new java.lang.Object[0]);
            return null;
        }
    }
}
