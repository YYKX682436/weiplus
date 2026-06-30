package bp4;

/* loaded from: classes5.dex */
public final class w implements eb5.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bp4.x f104932a;

    public w(bp4.x xVar) {
        this.f104932a = xVar;
    }

    @Override // eb5.c
    public boolean a(int i17, android.view.View view, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 item = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        return false;
    }

    @Override // eb5.c
    public void b(int i17, android.view.View view, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078 item = (com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.p1722x633fb29.AbstractC15633xee433078) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        long j17 = item.f219967i;
        bp4.x xVar = this.f104932a;
        xVar.f104952i = j17;
        bp4.q qVar = xVar.f104951h;
        if (qVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        qVar.m8146xced61ae5();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelable("PARAM_VLOG_MULTI_IMAGE_SELECT_VALUE", item);
        xVar.f546865d.w(ju3.c0.f383405d2, bundle);
    }
}
