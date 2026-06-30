package ri;

/* loaded from: classes12.dex */
public class d0 {

    /* renamed from: a, reason: collision with root package name */
    public int f477392a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f477393b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f477394c;

    /* renamed from: d, reason: collision with root package name */
    public org.json.JSONObject f477395d;

    /* renamed from: e, reason: collision with root package name */
    public qi.b f477396e;

    public d0(int i17) {
        this.f477392a = i17;
    }

    /* renamed from: toString */
    public java.lang.String m162456x9616526c() {
        org.json.JSONObject jSONObject = this.f477395d;
        return java.lang.String.format("tag[%s]type[%d];key[%s];content[%s]", this.f477393b, java.lang.Integer.valueOf(this.f477392a), this.f477394c, jSONObject != null ? jSONObject.toString() : "");
    }
}
