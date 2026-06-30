package b1;

/* loaded from: classes14.dex */
public abstract class p {
    public static z0.t a(z0.t tVar, h1.c painter, boolean z17, z0.d dVar, s1.p pVar, float f17, e1.z zVar, int i17, java.lang.Object obj) {
        z0.d alignment;
        s1.p contentScale;
        boolean z18 = (i17 & 2) != 0 ? true : z17;
        if ((i17 & 4) != 0) {
            int i18 = z0.d.f468903a;
            alignment = z0.a.f468893e;
        } else {
            alignment = dVar;
        }
        if ((i17 & 8) != 0) {
            int i19 = s1.p.f402054a;
            contentScale = s1.o.f402047d;
        } else {
            contentScale = pVar;
        }
        float f18 = (i17 & 16) != 0 ? 1.0f : f17;
        e1.z zVar2 = (i17 & 32) != 0 ? null : zVar;
        kotlin.jvm.internal.o.g(tVar, "<this>");
        kotlin.jvm.internal.o.g(painter, "painter");
        kotlin.jvm.internal.o.g(alignment, "alignment");
        kotlin.jvm.internal.o.g(contentScale, "contentScale");
        boolean z19 = androidx.compose.ui.platform.f3.f10562a;
        return tVar.k(new b1.o(painter, z18, alignment, contentScale, f18, zVar2, androidx.compose.ui.platform.e3.f10553d));
    }
}
