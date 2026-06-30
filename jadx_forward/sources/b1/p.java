package b1;

/* loaded from: classes14.dex */
public abstract class p {
    public static z0.t a(z0.t tVar, h1.c painter, boolean z17, z0.d dVar, s1.p pVar, float f17, e1.z zVar, int i17, java.lang.Object obj) {
        z0.d alignment;
        s1.p contentScale;
        boolean z18 = (i17 & 2) != 0 ? true : z17;
        if ((i17 & 4) != 0) {
            int i18 = z0.d.f550436a;
            alignment = z0.a.f550426e;
        } else {
            alignment = dVar;
        }
        if ((i17 & 8) != 0) {
            int i19 = s1.p.f483587a;
            contentScale = s1.o.f483580d;
        } else {
            contentScale = pVar;
        }
        float f18 = (i17 & 16) != 0 ? 1.0f : f17;
        e1.z zVar2 = (i17 & 32) != 0 ? null : zVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tVar, "<this>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(painter, "painter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(alignment, "alignment");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentScale, "contentScale");
        boolean z19 = p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.f3.f92095a;
        return tVar.k(new b1.o(painter, z18, alignment, contentScale, f18, zVar2, p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.e3.f92086d));
    }
}
