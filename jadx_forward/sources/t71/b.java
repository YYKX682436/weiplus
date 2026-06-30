package t71;

/* loaded from: classes12.dex */
public final class b implements java.util.function.IntConsumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t71.c f497567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f497568b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f497569c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f497570d;

    public b(t71.c cVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, int i17, java.lang.StringBuilder sb6) {
        this.f497567a = cVar;
        this.f497568b = f0Var;
        this.f497569c = i17;
        this.f497570d = sb6;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i17) {
        char[] chars = java.lang.Character.toChars(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(chars, "toChars(...)");
        java.lang.String str = new java.lang.String(chars);
        byte[] bytes = str.getBytes(this.f497567a.f497572e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        int length = bytes.length;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f497568b;
        if (f0Var.f391649d + length <= this.f497569c) {
            this.f497570d.append(str);
            f0Var.f391649d += length;
        }
    }
}
