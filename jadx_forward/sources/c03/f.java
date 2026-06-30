package c03;

/* loaded from: classes2.dex */
public final class f extends hx2.h {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c03.g f119186b;

    public f(c03.g gVar) {
        this.f119186b = gVar;
    }

    @Override // hx2.i
    public void b(gx2.q layout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23879xfb507da3 c23879xfb507da3 = this.f119186b.f119189f;
        if (c23879xfb507da3 != null) {
            c23879xfb507da3.m88502x3c8eedd8(c03.e.f119185d);
        }
    }

    @Override // hx2.i
    public void f(gx2.q layout, gx2.r closeAction) {
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23878x4bcb0c82 enumC23878x4bcb0c82;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(layout, "layout");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(closeAction, "closeAction");
        super.f(layout, closeAction);
        int ordinal = closeAction.ordinal();
        if (ordinal == 0) {
            enumC23878x4bcb0c82 = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23878x4bcb0c82.f42513x19d1382a;
        } else if (ordinal == 1) {
            enumC23878x4bcb0c82 = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23878x4bcb0c82.f42509x64adc67c;
        } else if (ordinal == 2) {
            enumC23878x4bcb0c82 = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23878x4bcb0c82.f42512x202534;
        } else {
            if (ordinal != 3) {
                throw new jz5.j();
            }
            enumC23878x4bcb0c82 = com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.EnumC23878x4bcb0c82.f42508xcd8604aa;
        }
        c03.g gVar = this.f119186b;
        if (enumC23878x4bcb0c82 == gVar.f119192i) {
            return;
        }
        gVar.f119192i = enumC23878x4bcb0c82;
        java.util.Objects.toString(gVar.f119189f);
        com.p314xaae8f345.p2845xc516c4b6.p2858xb4097826.C23879xfb507da3 c23879xfb507da3 = gVar.f119189f;
        if (c23879xfb507da3 != null) {
            c23879xfb507da3.m88503x7668805a(enumC23878x4bcb0c82, new c03.a(gVar));
        }
    }
}
