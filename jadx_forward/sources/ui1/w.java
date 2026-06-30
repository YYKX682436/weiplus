package ui1;

/* loaded from: classes7.dex */
public abstract class w {

    /* renamed from: a, reason: collision with root package name */
    public static final ui1.v f509620a = new ui1.v();

    public static final ui1.z a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l component, ui1.y listener, java.util.List list) {
        ui1.z ih6;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(component, "component");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        ui1.x xVar = (ui1.x) component.q(ui1.x.class);
        return (xVar == null || (ih6 = xVar.ih(component, listener, list)) == null) ? f509620a.ih(component, listener, list) : ih6;
    }
}
