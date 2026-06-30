package f32;

/* loaded from: classes10.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t85.j f340832d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13407x91e79130 f340833e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(t85.j jVar, com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13407x91e79130 c13407x91e79130) {
        super(0);
        this.f340832d = jVar;
        this.f340833e = c13407x91e79130;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        int a17;
        t85.j jVar = this.f340832d;
        java.lang.String str = jVar != null ? jVar.f498010d : null;
        boolean z17 = true;
        int i18 = 0;
        boolean z18 = str == null || str.length() == 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1384xed08e3c8.C13407x91e79130 c13407x91e79130 = this.f340833e;
        if (z18) {
            c13407x91e79130.C.c(null, -16777216, y22.n.a(-16777216));
        } else {
            java.lang.String stringColor = jVar != null ? jVar.f498011e : null;
            java.lang.String stringColor2 = jVar != null ? jVar.f498012f : null;
            if (stringColor == null || r26.n0.N(stringColor)) {
                i17 = -1;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stringColor, "stringColor");
                if (r26.i0.y(stringColor, "#", false)) {
                    i17 = android.graphics.Color.parseColor(stringColor);
                } else {
                    try {
                        r26.a.a(16);
                        i17 = (java.lang.Integer.parseInt(stringColor, 16) & (-1)) | (-16777216);
                    } catch (java.lang.Exception unused) {
                        i17 = 0;
                    }
                }
            }
            if (stringColor2 != null && !r26.n0.N(stringColor2)) {
                z17 = false;
            }
            if (z17) {
                a17 = y22.n.a(i17);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stringColor2, "stringColor");
                if (r26.i0.y(stringColor2, "#", false)) {
                    a17 = android.graphics.Color.parseColor(stringColor2);
                } else {
                    try {
                        r26.a.a(16);
                        i18 = (java.lang.Integer.parseInt(stringColor2, 16) & (-1)) | (-16777216);
                    } catch (java.lang.Exception unused2) {
                    }
                    a17 = i18;
                }
            }
            c13407x91e79130.C.c(jVar != null ? jVar.f498010d : null, i17, a17);
        }
        c13407x91e79130.B.m77909xcf65b334(jVar);
        return jz5.f0.f384359a;
    }
}
