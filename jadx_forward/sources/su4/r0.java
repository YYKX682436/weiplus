package su4;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f494588a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f494589b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f494590c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f494591d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f494592e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f494593f;

    public r0(java.lang.String userName, java.lang.String matchWord, java.lang.String nickName, java.lang.String remark, java.lang.String alias, java.lang.String desc) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(matchWord, "matchWord");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickName, "nickName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(remark, "remark");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alias, "alias");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(desc, "desc");
        this.f494588a = userName;
        this.f494589b = matchWord;
        this.f494590c = nickName;
        this.f494591d = remark;
        this.f494592e = alias;
        this.f494593f = desc;
    }

    public final org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("userName", this.f494588a);
        jSONObject.put("matchWord", this.f494589b);
        jSONObject.put("nickName", this.f494590c);
        jSONObject.put("remark", this.f494591d);
        jSONObject.put("alias", this.f494592e);
        jSONObject.put("desc", this.f494593f);
        return jSONObject;
    }

    /* renamed from: equals */
    public boolean m165305xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof su4.r0)) {
            return false;
        }
        su4.r0 r0Var = (su4.r0) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494588a, r0Var.f494588a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494589b, r0Var.f494589b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494590c, r0Var.f494590c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494591d, r0Var.f494591d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494592e, r0Var.f494592e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f494593f, r0Var.f494593f);
    }

    /* renamed from: hashCode */
    public int m165306x8cdac1b() {
        return (((((((((this.f494588a.hashCode() * 31) + this.f494589b.hashCode()) * 31) + this.f494590c.hashCode()) * 31) + this.f494591d.hashCode()) * 31) + this.f494592e.hashCode()) * 31) + this.f494593f.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m165307x9616526c() {
        return "FTSMatchUserItem(userName=" + this.f494588a + ", matchWord=" + this.f494589b + ", nickName=" + this.f494590c + ", remark=" + this.f494591d + ", alias=" + this.f494592e + ", desc=" + this.f494593f + ')';
    }
}
