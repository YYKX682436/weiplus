package im2;

/* loaded from: classes2.dex */
public final class l6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.o6 f373966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5493x8cca4def f373967e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(im2.o6 o6Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5493x8cca4def c5493x8cca4def) {
        super(0);
        this.f373966d = o6Var;
        this.f373967e = c5493x8cca4def;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        im2.o6 o6Var = this.f373966d;
        java.util.List list = o6Var.f374006i;
        java.lang.Object obj = null;
        if (list == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("pageList");
            throw null;
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c4) next).f198502a == 1) {
                obj = next;
                break;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c4 c4Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c4) obj;
        if (c4Var != null) {
            c4Var.f198504c = this.f373967e.f135826g.f89904a;
        }
        o6Var.f374003f.m8147xed6e4d18(1);
        return jz5.f0.f384359a;
    }
}
