package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes12.dex */
public final class s1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1 f149018d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f149019e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ob0.g f149020f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f149021g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1 x1Var, java.lang.String str, ob0.g gVar, boolean z17) {
        super(0);
        this.f149018d = x1Var;
        this.f149019e = str;
        this.f149020f = gVar;
        this.f149021g = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.List f17 = this.f149018d.f();
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.x1 x1Var = this.f149018d;
        java.lang.String str = this.f149019e;
        ob0.g gVar = this.f149020f;
        boolean z17 = this.f149021g;
        synchronized (f17) {
            java.util.List f18 = x1Var.f();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = f18.iterator();
            while (it.hasNext()) {
                java.lang.Object obj = ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.b) ((ob0.e) it.next())).f148927d;
                ob0.b bVar = obj instanceof ob0.b ? (ob0.b) obj : null;
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                ob0.b bVar2 = (ob0.b) it6.next();
                if (bVar2.getClass().isAnnotationPresent(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10647xe75d5c00.class)) {
                    java.lang.annotation.Annotation annotation = bVar2.getClass().getAnnotation(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10647xe75d5c00.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(annotation);
                    java.lang.String[] m45131xb408cb78 = ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.api.InterfaceC10647xe75d5c00) annotation).m45131xb408cb78();
                    if ((!(m45131xb408cb78.length == 0)) && !kz5.z.G(m45131xb408cb78, str)) {
                    }
                }
                bVar2.mo46782xaba1ac62(gVar, str, z17);
            }
        }
        return jz5.f0.f384359a;
    }
}
