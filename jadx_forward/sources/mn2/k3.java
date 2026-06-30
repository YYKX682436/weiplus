package mn2;

/* loaded from: classes2.dex */
public class k3 extends fp0.r {

    /* renamed from: i, reason: collision with root package name */
    public p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f411568i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k3(yz5.l r1, java.lang.String r2, int r3, p3321xbce91901.jvm.p3324x21ffc6bd.i r4) {
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
            java.lang.String r3 = "task"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r3)
            java.lang.String r3 = "id"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r3)
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mn2.k3.<init>(yz5.l, java.lang.String, int, kotlin.jvm.internal.i):void");
    }

    @Override // fp0.r, fp0.d
    public void a() {
        this.f346810f.mo146xb9724478(this);
    }

    @Override // fp0.d
    public void b(fp0.u status) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = this.f411568i;
        if (interfaceC29045xdcb5ca57 != null) {
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(status));
        }
        this.f411568i = null;
    }

    @Override // fp0.r, fp0.d
    public java.lang.String d() {
        return this.f346811g;
    }

    @Override // fp0.r
    public void e() {
    }

    @Override // fp0.r
    /* renamed from: toString */
    public java.lang.String mo129990x9616526c() {
        return "{token=" + this.f346812h + " id=" + this.f346811g + '}';
    }
}
