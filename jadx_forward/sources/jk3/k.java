package jk3;

/* loaded from: classes8.dex */
public final class k implements jk3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jk3.v f381624a;

    public k(jk3.v vVar) {
        this.f381624a = vVar;
    }

    @Override // jk3.d
    public void a(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c) {
        java.lang.String str;
        jk3.v vVar = this.f381624a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c2 = vVar.f381610a;
        if (c16601x7ed0e40c2 != null && c16601x7ed0e40c != null) {
            if ((c16601x7ed0e40c2 != null ? c16601x7ed0e40c2.f66791xc8a07680 : null) != null && (str = c16601x7ed0e40c.f66791xc8a07680) != null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16601x7ed0e40c2);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, c16601x7ed0e40c2.f66791xc8a07680)) {
                    vVar.Y(i17, c16601x7ed0e40c);
                    return;
                }
                return;
            }
        }
        vVar.Y(i17, c16601x7ed0e40c);
    }
}
