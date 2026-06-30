package mn2;

/* loaded from: classes15.dex */
public final class z extends mn2.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(mn2.k4 maxSize) {
        super(maxSize.f411572d);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(maxSize, "maxSize");
    }

    @Override // com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.e
    public hp0.g a(ip0.a url, dp0.a aVar) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        java.lang.String b17 = b(url, aVar);
        jt0.i iVar = this.f411469a;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) iVar.get(b17);
        hp0.g gVar = bitmap != null ? new hp0.g(bitmap) : null;
        if (gVar != null) {
            return gVar;
        }
        java.lang.Object obj = url.f375106a;
        if (!(((mn2.h3) obj) instanceof mn2.n)) {
            obj = null;
        }
        mn2.h3 h3Var = (mn2.h3) obj;
        if (h3Var != null) {
            mn2.n nVar = (mn2.n) h3Var;
            if (!android.text.TextUtils.equals(nVar.f411593e, nVar.f411597i)) {
                jz5.g gVar2 = nVar.f411599n;
                if (aVar == null || (str = aVar.b((java.lang.String) ((jz5.n) gVar2).mo141623x754a37bb())) == null) {
                    str = (java.lang.String) ((jz5.n) gVar2).mo141623x754a37bb();
                }
                android.graphics.Bitmap bitmap2 = (android.graphics.Bitmap) iVar.get(str);
                if (bitmap2 != null) {
                    return new hp0.g(bitmap2);
                }
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p836xbe953013.p837x5a0af82.p838xbfc2bd01.e
    public java.lang.String b(ip0.a aVar, dp0.a aVar2) {
        java.lang.String str;
        mn2.h3 h3Var;
        java.lang.String b17 = super.b(aVar, aVar2);
        yo0.i iVar = (aVar == null || (h3Var = (mn2.h3) aVar.f375106a) == null) ? null : ((mn2.a) h3Var).f411439d;
        if (iVar != null) {
            int i17 = (iVar.f545633e + iVar.f545634f) / 2;
            if (1 <= i17 && i17 < 1000) {
                str = "SMALL";
            } else {
                if (1000 <= i17 && i17 < 2000) {
                    str = "MEDIUM";
                } else if (i17 > 2000) {
                    str = "LARGE";
                }
            }
            return b17 + '_' + str;
        }
        str = "";
        return b17 + '_' + str;
    }
}
