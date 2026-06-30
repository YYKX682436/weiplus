package m22;

/* loaded from: classes12.dex */
public final class l extends m22.p {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3 f404588a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f404589b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21052x34cf13a3 info) {
        super(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        this.f404588a = info;
        this.f404589b = new java.util.LinkedList();
    }

    @Override // m22.i
    public java.lang.String a() {
        java.lang.String str = this.f404588a.f68544x5cf9de70;
        return str == null ? "" : str;
    }

    @Override // m22.i
    public java.lang.String b() {
        java.lang.String str = this.f404588a.f68543x4b6e619a;
        return str == null ? "" : str;
    }

    @Override // m22.i
    public java.lang.String c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = this.f404588a.f68545x29dd02d3;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append('(');
        sb6.append(this.f404589b.size());
        sb6.append(')');
        return sb6.toString();
    }
}
