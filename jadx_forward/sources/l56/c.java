package l56;

/* loaded from: classes13.dex */
public class c extends l56.f {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Map f398210g;

    public c(l56.j jVar, java.lang.String str) {
        super(jVar, str);
        this.f398210g = new java.util.HashMap();
    }

    public void d(java.lang.String str, java.lang.String str2) {
        java.util.Map map = this.f398210g;
        if (!str.startsWith("oauth_") && !str.equals("scope")) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("OAuth parameters must either be '%s' or start with '%s'", "scope", "oauth_"));
        }
        ((java.util.HashMap) map).put(str, str2);
    }

    /* renamed from: toString */
    public java.lang.String m145168x9616526c() {
        return java.lang.String.format("@OAuthRequest(%s, %s)", this.f398215b, this.f398214a);
    }
}
