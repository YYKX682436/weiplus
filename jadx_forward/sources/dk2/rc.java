package dk2;

/* loaded from: classes3.dex */
public final class rc {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f315565a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f315566b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f315567c;

    /* renamed from: d, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f315568d;

    public rc(java.lang.ref.WeakReference rContext) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rContext, "rContext");
        this.f315565a = rContext;
        this.f315566b = "Finder.LiveRotationHelper";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(dk2.rc r20, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa r21, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r22) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.rc.a(dk2.rc, com.tencent.mm.plugin.finder.ui.MMFinderUI, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean b() {
        boolean z17;
        df2.ug ugVar;
        android.content.res.Resources resources;
        android.content.res.Configuration configuration;
        java.lang.ref.WeakReference weakReference = this.f315565a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) weakReference.get();
        java.lang.Integer valueOf = (abstractActivityC15087xee12defa == null || (resources = abstractActivityC15087xee12defa.getResources()) == null || (configuration = resources.getConfiguration()) == null) ? null : java.lang.Integer.valueOf(configuration.orientation);
        if (valueOf == null || valueOf.intValue() != 2) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) weakReference.get();
        if (abstractActivityC15087xee12defa2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
            if (k0Var != null && (ugVar = (df2.ug) k0Var.mo57658x143f1b92(df2.ug.class)) != null) {
                ugVar.c7("changeScreenToPortrait");
            }
            z17 = true;
            abstractActivityC15087xee12defa2.b7(true);
            abstractActivityC15087xee12defa2.setRequestedOrientation(1);
        } else {
            z17 = false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("changeScreenToPortrait curOrientation:");
        sb6.append(valueOf);
        sb6.append(",requestOrientation:");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa abstractActivityC15087xee12defa3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa) weakReference.get();
        sb6.append(abstractActivityC15087xee12defa3 != null ? java.lang.Integer.valueOf(abstractActivityC15087xee12defa3.getRequestedOrientation()) : null);
        sb6.append(",change:");
        sb6.append(z17);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = this.f315566b;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb7);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "disableAutoRotation");
        this.f315567c = false;
        return z17;
    }
}
