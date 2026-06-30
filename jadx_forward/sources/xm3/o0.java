package xm3;

/* loaded from: classes4.dex */
public final class o0 implements a75.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f536897a;

    /* renamed from: b, reason: collision with root package name */
    public final int f536898b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f536899c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f536900d;

    /* renamed from: e, reason: collision with root package name */
    public final int f536901e;

    public o0(java.util.List latestList, int i17, java.util.List diffActionList, java.util.List submitTypeList, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(latestList, "latestList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(diffActionList, "diffActionList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(submitTypeList, "submitTypeList");
        this.f536897a = latestList;
        this.f536898b = i17;
        this.f536899c = diffActionList;
        this.f536900d = submitTypeList;
        this.f536901e = i18;
    }

    @Override // a75.a
    /* renamed from: getKey */
    public java.lang.String mo786xb5884f29() {
        return "MvvmListPendingData";
    }

    @Override // a75.a
    /* renamed from: mergeEvent */
    public a75.a mo787xbd89c142(a75.a newEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newEvent, "newEvent");
        xm3.o0 o0Var = (xm3.o0) newEvent;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(this.f536900d);
        arrayList.addAll(o0Var.f536900d);
        return new xm3.o0(o0Var.f536897a, o0Var.f536898b, o0Var.f536899c, arrayList, this.f536901e + 1);
    }

    public /* synthetic */ o0(java.util.List list, int i17, java.util.List list2, java.util.List list3, int i18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(list, i17, list2, list3, (i19 & 16) != 0 ? 0 : i18);
    }
}
