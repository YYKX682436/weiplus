package fp0;

/* loaded from: classes2.dex */
public class r extends fp0.d {

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f346810f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f346811g;

    /* renamed from: h, reason: collision with root package name */
    public int f346812h;

    public r(yz5.l task, java.lang.String id6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(task, "task");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        this.f346810f = task;
        this.f346811g = id6;
        this.f346812h = -1;
    }

    @Override // fp0.d
    public void a() {
        this.f346810f.mo146xb9724478(this);
    }

    @Override // fp0.d
    public java.lang.String d() {
        return this.f346811g;
    }

    public void e() {
    }

    /* renamed from: toString */
    public java.lang.String mo129990x9616526c() {
        return "{token=" + this.f346812h + " id=" + this.f346811g + '}';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ r(yz5.l r1, java.lang.String r2, int r3, p3321xbce91901.jvm.p3324x21ffc6bd.i r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L19
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            long r3 = java.lang.System.nanoTime()
            r2.append(r3)
            r3 = 125(0x7d, float:1.75E-43)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
        L19:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fp0.r.<init>(yz5.l, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
