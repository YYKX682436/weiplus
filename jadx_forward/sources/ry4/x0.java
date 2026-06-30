package ry4;

/* loaded from: classes.dex */
public final class x0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ry4.d1 f483220d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(ry4.d1 d1Var) {
        super(3);
        this.f483220d = d1Var;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8 item = (com.p314xaae8f345.mm.p1006xc5476f33.p2441xd0ce9a2d.p2442xeb95dc46.C19510x90fb7cb8) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        android.view.View anchorView = (android.view.View) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorView, "anchorView");
        ry4.d1 d1Var = this.f483220d;
        rl5.r rVar = d1Var.f483147m;
        if (rVar != null) {
            rVar.g(anchorView, intValue, -1L, new ry4.z0(d1Var), new ry4.a1(d1Var, intValue), 0, 0);
        }
        return jz5.f0.f384359a;
    }
}
