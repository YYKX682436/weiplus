package cf1;

/* loaded from: classes15.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f122414a;

    /* renamed from: e, reason: collision with root package name */
    public int f122418e;

    /* renamed from: f, reason: collision with root package name */
    public int f122419f;

    /* renamed from: g, reason: collision with root package name */
    public int f122420g;

    /* renamed from: c, reason: collision with root package name */
    public final cf1.c[] f122416c = new cf1.c[5];

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f122415b = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f122417d = -1;

    public d(int i17) {
        this.f122414a = i17;
    }

    public final void a(int i17, float f17) {
        cf1.c cVar;
        int i18 = this.f122417d;
        java.util.ArrayList arrayList = this.f122415b;
        if (i18 != 1) {
            java.util.Collections.sort(arrayList, cf1.b.f122410d);
            this.f122417d = 1;
        }
        int i19 = this.f122420g;
        cf1.c[] cVarArr = this.f122416c;
        if (i19 > 0) {
            int i27 = i19 - 1;
            this.f122420g = i27;
            cVar = cVarArr[i27];
        } else {
            cVar = new cf1.c();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(cVar);
        int i28 = this.f122418e;
        this.f122418e = i28 + 1;
        cVar.f122411a = i28;
        cVar.f122412b = i17;
        cVar.f122413c = f17;
        arrayList.add(cVar);
        this.f122419f += i17;
        while (true) {
            int i29 = this.f122419f;
            int i37 = this.f122414a;
            if (i29 <= i37) {
                return;
            }
            int i38 = i29 - i37;
            java.lang.Object obj = arrayList.get(0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            cf1.c cVar2 = (cf1.c) obj;
            int i39 = cVar2.f122412b;
            if (i39 <= i38) {
                this.f122419f -= i39;
                arrayList.remove(0);
                int i47 = this.f122420g;
                if (i47 < 5) {
                    this.f122420g = i47 + 1;
                    cVarArr[i47] = cVar2;
                }
            } else {
                cVar2.f122412b = i39 - i38;
                this.f122419f -= i38;
            }
        }
    }
}
