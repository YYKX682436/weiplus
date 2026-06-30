package du2;

@j95.b
/* loaded from: classes2.dex */
public final class j extends i95.w implements zy2.ob {

    /* renamed from: d, reason: collision with root package name */
    public static final du2.i f325009d = new du2.i(null);

    public final boolean wi(cw2.wa waVar, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae88;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14989xf862ae88 c14989xf862ae882;
        java.lang.Integer num = null;
        java.lang.Integer valueOf = (waVar == null || (c14989xf862ae882 = waVar.f305632f) == null) ? null : java.lang.Integer.valueOf(c14989xf862ae882.getMediaType());
        du2.i iVar = f325009d;
        if (valueOf != null && valueOf.intValue() == 4) {
            return iVar.b();
        }
        if (valueOf != null && valueOf.intValue() == 9) {
            return iVar.a();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("mediaType = ");
        if (waVar != null && (c14989xf862ae88 = waVar.f305632f) != null) {
            num = java.lang.Integer.valueOf(c14989xf862ae88.getMediaType());
        }
        sb6.append(num);
        sb6.append(", source = ");
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderSystemPlayerController", sb6.toString());
        return false;
    }
}
