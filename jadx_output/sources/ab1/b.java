package ab1;

/* loaded from: classes.dex */
public final class b {
    public b(kotlin.jvm.internal.i iVar) {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final ab1.c a(java.lang.String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -987485392:
                    if (str.equals("province")) {
                        return ab1.c.f2710f;
                    }
                    break;
                case -934795532:
                    if (str.equals("region")) {
                        return ab1.c.f2712h;
                    }
                    break;
                case 3053931:
                    if (str.equals("city")) {
                        return ab1.c.f2711g;
                    }
                    break;
                case 649134203:
                    if (str.equals("sub-district")) {
                        return ab1.c.f2713i;
                    }
                    break;
            }
        }
        return null;
    }
}
