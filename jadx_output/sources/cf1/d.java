package cf1;

/* loaded from: classes15.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f40881a;

    /* renamed from: e, reason: collision with root package name */
    public int f40885e;

    /* renamed from: f, reason: collision with root package name */
    public int f40886f;

    /* renamed from: g, reason: collision with root package name */
    public int f40887g;

    /* renamed from: c, reason: collision with root package name */
    public final cf1.c[] f40883c = new cf1.c[5];

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f40882b = new java.util.ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public int f40884d = -1;

    public d(int i17) {
        this.f40881a = i17;
    }

    public final void a(int i17, float f17) {
        cf1.c cVar;
        int i18 = this.f40884d;
        java.util.ArrayList arrayList = this.f40882b;
        if (i18 != 1) {
            java.util.Collections.sort(arrayList, cf1.b.f40877d);
            this.f40884d = 1;
        }
        int i19 = this.f40887g;
        cf1.c[] cVarArr = this.f40883c;
        if (i19 > 0) {
            int i27 = i19 - 1;
            this.f40887g = i27;
            cVar = cVarArr[i27];
        } else {
            cVar = new cf1.c();
        }
        kotlin.jvm.internal.o.d(cVar);
        int i28 = this.f40885e;
        this.f40885e = i28 + 1;
        cVar.f40878a = i28;
        cVar.f40879b = i17;
        cVar.f40880c = f17;
        arrayList.add(cVar);
        this.f40886f += i17;
        while (true) {
            int i29 = this.f40886f;
            int i37 = this.f40881a;
            if (i29 <= i37) {
                return;
            }
            int i38 = i29 - i37;
            java.lang.Object obj = arrayList.get(0);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            cf1.c cVar2 = (cf1.c) obj;
            int i39 = cVar2.f40879b;
            if (i39 <= i38) {
                this.f40886f -= i39;
                arrayList.remove(0);
                int i47 = this.f40887g;
                if (i47 < 5) {
                    this.f40887g = i47 + 1;
                    cVarArr[i47] = cVar2;
                }
            } else {
                cVar2.f40879b = i39 - i38;
                this.f40886f -= i38;
            }
        }
    }
}
