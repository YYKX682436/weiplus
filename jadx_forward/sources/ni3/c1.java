package ni3;

/* loaded from: classes12.dex */
public class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f419077a;

    /* renamed from: b, reason: collision with root package name */
    public long f419078b;

    /* renamed from: c, reason: collision with root package name */
    public long f419079c;

    /* renamed from: d, reason: collision with root package name */
    public long f419080d;

    /* renamed from: e, reason: collision with root package name */
    public long f419081e;

    /* renamed from: f, reason: collision with root package name */
    public long f419082f;

    /* renamed from: g, reason: collision with root package name */
    public int f419083g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.ArrayList f419084h = new java.util.ArrayList(20);

    /* renamed from: i, reason: collision with root package name */
    public final java.util.ArrayList f419085i = new java.util.ArrayList(20);

    /* renamed from: j, reason: collision with root package name */
    public boolean f419086j = false;

    public c1(java.lang.String str) {
        this.f419077a = str;
    }

    /* renamed from: toString */
    public java.lang.String m149628x9616526c() {
        return java.lang.String.format("FileResult hash(%d) root[%s], canceled[%b], dirCount[%d], fileCount[%d], totalSize[%d], fileLenInvalidCount[%d], subDirResult[%d], tempAccDirResult[%d], totalTime[%d], depth[%d]", java.lang.Integer.valueOf(hashCode()), this.f419077a, java.lang.Boolean.valueOf(this.f419086j), java.lang.Long.valueOf(this.f419078b), java.lang.Long.valueOf(this.f419079c), java.lang.Long.valueOf(this.f419080d), java.lang.Long.valueOf(this.f419081e), java.lang.Integer.valueOf(this.f419084h.size()), java.lang.Integer.valueOf(this.f419085i.size()), java.lang.Long.valueOf(this.f419082f), java.lang.Integer.valueOf(this.f419083g));
    }
}
