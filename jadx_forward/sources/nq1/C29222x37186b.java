package nq1;

/* renamed from: nq1.x$$c */
/* loaded from: classes11.dex */
public final /* synthetic */ class C29222x37186b implements ak0.m {
    @Override // ak0.m
    public final int a(java.io.File file) {
        ak0.e a17 = ak0.g.a(file);
        if (a17 == null) {
            return -24;
        }
        java.lang.String property = ((ak0.f) a17).f87070a.getProperty("patch.basepack.client.ver");
        return (property == null || !property.equalsIgnoreCase(lp0.a.f401782c)) ? -25 : 0;
    }
}
