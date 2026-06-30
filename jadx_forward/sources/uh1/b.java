package uh1;

/* loaded from: classes7.dex */
public class b implements vh1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f509295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ uh1.d f509296b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ uh1.f f509297c;

    public b(uh1.f fVar, java.lang.String str, uh1.d dVar) {
        this.f509297c = fVar;
        this.f509295a = str;
        this.f509296b = dVar;
    }

    @Override // vh1.a
    public void a(org.json.JSONObject jSONObject) {
        this.f509296b.a(jSONObject);
    }

    @Override // vh1.a
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, long j17, java.util.Map map) {
        this.f509297c.a(this.f509295a);
        this.f509296b.c(0, str2, str, i17, j17, map);
    }

    @Override // vh1.a
    public void c(java.lang.String str, java.lang.String str2) {
    }

    @Override // vh1.a
    public void d(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this.f509297c.a(this.f509295a);
        this.f509296b.d(-1, str3, i17);
    }

    @Override // vh1.a
    public void e(java.lang.String str) {
        this.f509297c.f509323g.remove(str);
    }

    @Override // vh1.a
    public void f(java.lang.String str, java.lang.String str2, int i17, long j17, long j18) {
        this.f509296b.b(i17, j17, j18);
    }
}
