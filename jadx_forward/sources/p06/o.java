package p06;

/* loaded from: classes15.dex */
public final class o implements p06.c {

    /* renamed from: a, reason: collision with root package name */
    public final l06.o f432301a;

    /* renamed from: b, reason: collision with root package name */
    public final n16.c f432302b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f432303c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f432304d;

    public o(l06.o builtIns, n16.c fqName, java.util.Map allValueArguments, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(builtIns, "builtIns");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fqName, "fqName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(allValueArguments, "allValueArguments");
        this.f432301a = builtIns;
        this.f432302b = fqName;
        this.f432303c = allValueArguments;
        this.f432304d = jz5.h.a(jz5.i.f384363e, new p06.n(this));
    }

    @Override // p06.c
    public n16.c a() {
        return this.f432302b;
    }

    @Override // p06.c
    public java.util.Map c() {
        return this.f432303c;
    }

    @Override // p06.c
    /* renamed from: getSource */
    public o06.x1 mo9608x2fa78b11() {
        return o06.x1.f423537a;
    }

    @Override // p06.c
    /* renamed from: getType */
    public f26.o0 mo9609xfb85f7b0() {
        java.lang.Object mo141623x754a37bb = this.f432304d.mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (f26.o0) mo141623x754a37bb;
    }
}
