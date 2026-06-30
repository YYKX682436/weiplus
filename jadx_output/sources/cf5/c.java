package cf5;

/* loaded from: classes11.dex */
public abstract class c {
    public static final boolean a(int i17, int i18) {
        return (i17 & i18) != 0;
    }

    public static final v11.s b(java.util.List list) {
        java.util.Iterator it = list.iterator();
        v11.s sVar = null;
        while (it.hasNext()) {
            sVar = d(sVar, ((v11.a) it.next()).f432325h);
        }
        return sVar;
    }

    public static final v11.s c(java.util.List list) {
        java.util.Iterator it = list.iterator();
        v11.s sVar = null;
        while (it.hasNext()) {
            sVar = d(sVar, e((xv5.h) it.next()));
        }
        return sVar;
    }

    public static final v11.s d(v11.s sVar, v11.s sVar2) {
        int i17;
        int i18;
        if (sVar2 != null) {
            int i19 = sVar2.f432458a;
            if (!(i19 >= 0 && sVar2.f432459b >= i19 && (i18 = sVar2.f432460c) >= 0 && sVar2.f432461d >= i18)) {
                sVar2 = null;
            }
            if (sVar2 != null) {
                if (sVar != null) {
                    int i27 = sVar.f432458a;
                    if (!(i27 >= 0 && sVar.f432459b >= i27 && (i17 = sVar.f432460c) >= 0 && sVar.f432461d >= i17)) {
                        sVar = null;
                    }
                    if (sVar != null) {
                        return new v11.s(sVar.f432458a, sVar2.f432459b, sVar.f432460c, sVar2.f432461d);
                    }
                }
                return sVar2;
            }
        }
        return sVar;
    }

    public static final v11.s e(xv5.h hVar) {
        if (!hVar.hasFieldNumber(3)) {
            return null;
        }
        xv5.c cVar = hVar.hasFieldNumber(3) ? hVar.f457484f : new xv5.c();
        return new v11.s((int) cVar.f457449d, (int) cVar.f457450e, (int) cVar.f457451f, (int) cVar.f457452g);
    }
}
