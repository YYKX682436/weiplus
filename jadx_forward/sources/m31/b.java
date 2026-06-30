package m31;

/* loaded from: classes9.dex */
public final class b implements java.util.Comparator {
    public b(m31.f fVar) {
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) obj;
        com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d32 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) obj2;
        if (c11159x8f55e6d3 != null && c11159x8f55e6d32 != null) {
            int i17 = c11159x8f55e6d32.f153353z;
            int i18 = c11159x8f55e6d3.f153353z;
            if (i18 == 1 && i17 != 1) {
                return 1;
            }
            if (i18 != 1 && i17 == 1) {
                return -1;
            }
        }
        return 0;
    }
}
