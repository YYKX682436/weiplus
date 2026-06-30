package wq5;

/* loaded from: classes13.dex */
public class j {

    /* renamed from: e, reason: collision with root package name */
    public static final wq5.j f530253e = new wq5.j();

    /* renamed from: a, reason: collision with root package name */
    public boolean f530254a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f530255b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f530256c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f530257d;

    static {
        wq5.j jVar = new wq5.j();
        new wq5.j(jVar.f530254a, "__content__", false, jVar.f530257d).f530254a = true;
    }

    public j() {
        this.f530254a = false;
        this.f530255b = "__content__";
        this.f530256c = false;
        this.f530257d = java.util.Collections.emptyMap();
    }

    /* renamed from: clone */
    public java.lang.Object m174334x5a5dd5d() {
        return new wq5.j(this.f530254a, this.f530255b, this.f530256c, this.f530257d);
    }

    public j(boolean z17, java.lang.String str, boolean z18, java.util.Map map) {
        this.f530254a = z17;
        this.f530255b = str;
        this.f530256c = z18;
        this.f530257d = java.util.Collections.unmodifiableMap(map);
    }
}
