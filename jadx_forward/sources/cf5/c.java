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
            sVar = d(sVar, ((v11.a) it.next()).f513858h);
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
            int i19 = sVar2.f513991a;
            if (!(i19 >= 0 && sVar2.f513992b >= i19 && (i18 = sVar2.f513993c) >= 0 && sVar2.f513994d >= i18)) {
                sVar2 = null;
            }
            if (sVar2 != null) {
                if (sVar != null) {
                    int i27 = sVar.f513991a;
                    if (!(i27 >= 0 && sVar.f513992b >= i27 && (i17 = sVar.f513993c) >= 0 && sVar.f513994d >= i17)) {
                        sVar = null;
                    }
                    if (sVar != null) {
                        return new v11.s(sVar.f513991a, sVar2.f513992b, sVar.f513993c, sVar2.f513994d);
                    }
                }
                return sVar2;
            }
        }
        return sVar;
    }

    public static final v11.s e(xv5.h hVar) {
        if (!hVar.m176056x6e095e9(3)) {
            return null;
        }
        xv5.c cVar = hVar.m176056x6e095e9(3) ? hVar.f539017f : new xv5.c();
        return new v11.s((int) cVar.f538982d, (int) cVar.f538983e, (int) cVar.f538984f, (int) cVar.f538985g);
    }
}
