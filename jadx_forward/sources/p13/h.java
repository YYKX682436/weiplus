package p13;

/* loaded from: classes12.dex */
public class h implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public p13.p f432623d;

    /* renamed from: e, reason: collision with root package name */
    public int f432624e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f432625f = -1;

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        return this.f432624e - ((p13.h) obj).f432624e;
    }

    public boolean h() {
        return (this.f432624e == -1 || this.f432625f == -1) ? false : true;
    }

    /* renamed from: toString */
    public java.lang.String m157683x9616526c() {
        java.lang.Object[] objArr = new java.lang.Object[3];
        p13.p pVar = this.f432623d;
        objArr[0] = pVar == null ? "" : pVar.a().replaceAll("\u200b", ",");
        objArr[1] = java.lang.Integer.valueOf(this.f432624e);
        objArr[2] = java.lang.Integer.valueOf(this.f432625f);
        return java.lang.String.format("FTSQueryHLRequest.Item %s %d %d", objArr);
    }
}
