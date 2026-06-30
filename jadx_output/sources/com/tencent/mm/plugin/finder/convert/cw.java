package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class cw implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.ew f103099d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.dw f103100e;

    public cw(com.tencent.mm.plugin.finder.convert.ew ewVar, com.tencent.mm.plugin.finder.convert.dw dwVar) {
        this.f103099d = ewVar;
        this.f103100e = dwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.convert.ew ewVar = this.f103099d;
        android.view.View view = ewVar.f103307v;
        if (view != null) {
            boolean n17 = com.tencent.mm.plugin.finder.convert.ew.n(ewVar, view);
            com.tencent.mm.plugin.finder.convert.dw dwVar = this.f103100e;
            boolean z17 = dwVar.f103204d;
            com.tencent.mm.plugin.finder.convert.fv fvVar = ewVar.f103308w;
            if (!z17 && n17) {
                dwVar.f103204d = true;
                fvVar.f103425c = java.lang.System.currentTimeMillis();
                return;
            }
            if (!z17 || n17) {
                return;
            }
            dwVar.f103204d = false;
            com.tencent.mm.plugin.finder.feed.ys ysVar = fvVar.f103423a;
            if (ysVar != null) {
                long currentTimeMillis = java.lang.System.currentTimeMillis() - fvVar.f103425c;
                int indexOf = ewVar.f103293e.C.getDataListJustForAdapter().indexOf(ysVar);
                com.tencent.mm.plugin.finder.report.x4 x4Var = com.tencent.mm.plugin.finder.report.x4.f125435a;
                java.lang.String string = ysVar.f111192d.getString(1);
                if (string == null) {
                    string = "";
                }
                java.lang.String str = string;
                r45.qt2 qt2Var = ewVar.f103296h;
                if (qt2Var != null) {
                    x4Var.a(str, ysVar, indexOf, currentTimeMillis, qt2Var);
                } else {
                    kotlin.jvm.internal.o.o("contextObj");
                    throw null;
                }
            }
        }
    }
}
