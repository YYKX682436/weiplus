package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.performance.adpf.x1 f67485d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f67486e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ob0.g f67487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f67488g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.tencent.mm.feature.performance.adpf.x1 x1Var, java.lang.String str, ob0.g gVar, boolean z17) {
        super(0);
        this.f67485d = x1Var;
        this.f67486e = str;
        this.f67487f = gVar;
        this.f67488g = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.List f17 = this.f67485d.f();
        com.tencent.mm.feature.performance.adpf.x1 x1Var = this.f67485d;
        java.lang.String str = this.f67486e;
        ob0.g gVar = this.f67487f;
        boolean z17 = this.f67488g;
        synchronized (f17) {
            java.util.List f18 = x1Var.f();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = f18.iterator();
            while (it.hasNext()) {
                java.lang.Object obj = ((com.tencent.mm.feature.performance.adpf.b) ((ob0.e) it.next())).f67394d;
                ob0.b bVar = obj instanceof ob0.b ? (ob0.b) obj : null;
                if (bVar != null) {
                    arrayList.add(bVar);
                }
            }
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                ob0.b bVar2 = (ob0.b) it6.next();
                if (bVar2.getClass().isAnnotationPresent(com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$OnStatesChanged.class)) {
                    java.lang.annotation.Annotation annotation = bVar2.getClass().getAnnotation(com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$OnStatesChanged.class);
                    kotlin.jvm.internal.o.d(annotation);
                    java.lang.String[] filter = ((com.tencent.mm.feature.performance.api.AdpfAnno$Callbacks$OnStatesChanged) annotation).filter();
                    if ((!(filter.length == 0)) && !kz5.z.G(filter, str)) {
                    }
                }
                bVar2.onStateChanged(gVar, str, z17);
            }
        }
        return jz5.f0.f302826a;
    }
}
