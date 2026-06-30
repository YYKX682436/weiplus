package zq5;

/* loaded from: classes11.dex */
public abstract class f {
    public static final zq5.e a(zq5.e rotateInSpace, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rotateInSpace, "$this$rotateInSpace");
        if (!(i17 % 90 == 0)) {
            throw new java.lang.IllegalArgumentException(("rotation must be a multiple of 90, rotation: " + i17).toString());
        }
        int i18 = i17 % com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
        if (i18 < 0) {
            i18 += com.p314xaae8f345.p3206x37e841.C27807xedfc512a.f60968xdd9691f3;
        }
        int i19 = rotateInSpace.f556596c;
        int i27 = rotateInSpace.f556595b;
        int i28 = rotateInSpace.f556594a;
        int i29 = rotateInSpace.f556597d;
        if (i18 == 90) {
            return new zq5.e(zq5.g.b(j17) - i29, i28, zq5.g.b(j17) - i27, i19);
        }
        if (i18 == 180) {
            int i37 = zq5.g.f556599c;
            int i38 = (int) (j17 >> 32);
            return new zq5.e(i38 - i19, zq5.g.b(j17) - i29, i38 - i28, zq5.g.b(j17) - i27);
        }
        if (i18 != 270) {
            return rotateInSpace;
        }
        int i39 = zq5.g.f556599c;
        int i47 = (int) (j17 >> 32);
        return new zq5.e(i27, i47 - i19, i29, i47 - i28);
    }

    public static final java.lang.String b(zq5.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<this>");
        return "[" + eVar.f556594a + 'x' + eVar.f556595b + ',' + eVar.f556596c + 'x' + eVar.f556597d + ']';
    }
}
