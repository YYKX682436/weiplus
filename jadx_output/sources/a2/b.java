package a2;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.StringBuilder f668a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f669b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f670c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f671d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f672e;

    public b(int i17, int i18, kotlin.jvm.internal.i iVar) {
        this.f668a = new java.lang.StringBuilder((i18 & 1) != 0 ? 16 : i17);
        this.f669b = new java.util.ArrayList();
        this.f670c = new java.util.ArrayList();
        this.f671d = new java.util.ArrayList();
        this.f672e = new java.util.ArrayList();
    }

    public final void a(a2.g1 style, int i17, int i18) {
        kotlin.jvm.internal.o.g(style, "style");
        ((java.util.ArrayList) this.f669b).add(new a2.a(style, i17, i18, null, 8, null));
    }

    public final void b(a2.d text) {
        kotlin.jvm.internal.o.g(text, "text");
        java.lang.StringBuilder sb6 = this.f668a;
        int length = sb6.length();
        sb6.append(text.f681d);
        java.util.List list = text.f682e;
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            a2.c cVar = (a2.c) list.get(i17);
            a((a2.g1) cVar.f675a, cVar.f676b + length, cVar.f677c + length);
        }
        java.util.List list2 = text.f683f;
        int size2 = list2.size();
        for (int i18 = 0; i18 < size2; i18++) {
            a2.c cVar2 = (a2.c) list2.get(i18);
            a2.p style = (a2.p) cVar2.f675a;
            int i19 = length + cVar2.f676b;
            int i27 = length + cVar2.f677c;
            kotlin.jvm.internal.o.g(style, "style");
            ((java.util.ArrayList) this.f670c).add(new a2.a(style, i19, i27, null, 8, null));
        }
        java.util.List list3 = text.f684g;
        int size3 = list3.size();
        for (int i28 = 0; i28 < size3; i28++) {
            a2.c cVar3 = (a2.c) list3.get(i28);
            ((java.util.ArrayList) this.f671d).add(new a2.a(cVar3.f675a, cVar3.f676b + length, cVar3.f677c + length, cVar3.f678d));
        }
    }

    public final void c(int i17) {
        java.util.List list = this.f672e;
        if (!(i17 < ((java.util.ArrayList) list).size())) {
            throw new java.lang.IllegalStateException((i17 + " should be less than " + ((java.util.ArrayList) list).size()).toString());
        }
        while (((java.util.ArrayList) list).size() - 1 >= i17) {
            java.util.ArrayList arrayList = (java.util.ArrayList) list;
            if (!(!arrayList.isEmpty())) {
                throw new java.lang.IllegalStateException("Nothing to pop.".toString());
            }
            ((a2.a) arrayList.remove(arrayList.size() - 1)).f664c = this.f668a.length();
        }
    }

    public final int d(a2.g1 style) {
        kotlin.jvm.internal.o.g(style, "style");
        a2.a aVar = new a2.a(style, this.f668a.length(), 0, null, 12, null);
        ((java.util.ArrayList) this.f672e).add(aVar);
        ((java.util.ArrayList) this.f669b).add(aVar);
        return ((java.util.ArrayList) r9).size() - 1;
    }

    public final a2.d e() {
        java.lang.StringBuilder sb6 = this.f668a;
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "text.toString()");
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f669b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            arrayList2.add(((a2.a) arrayList.get(i17)).a(sb6.length()));
        }
        java.util.ArrayList arrayList3 = (java.util.ArrayList) this.f670c;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList3.size());
        int size2 = arrayList3.size();
        for (int i18 = 0; i18 < size2; i18++) {
            arrayList4.add(((a2.a) arrayList3.get(i18)).a(sb6.length()));
        }
        java.util.ArrayList arrayList5 = (java.util.ArrayList) this.f671d;
        java.util.ArrayList arrayList6 = new java.util.ArrayList(arrayList5.size());
        int size3 = arrayList5.size();
        for (int i19 = 0; i19 < size3; i19++) {
            arrayList6.add(((a2.a) arrayList5.get(i19)).a(sb6.length()));
        }
        return new a2.d(sb7, arrayList2, arrayList4, arrayList6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(a2.d text) {
        this(0, 1, null);
        kotlin.jvm.internal.o.g(text, "text");
        b(text);
    }
}
