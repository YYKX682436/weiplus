package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes10.dex */
public final class w1 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104832a;

    public w1(in5.s0 s0Var) {
        this.f104832a = s0Var;
    }

    @Override // ym5.n0
    public long getExposedId(android.view.View view) {
        java.util.ArrayList arrayList;
        r45.jb4 jb4Var;
        r45.my0 my0Var;
        kotlin.jvm.internal.o.g(view, "view");
        so2.y0 y0Var = (so2.y0) this.f104832a.f293125i;
        if (y0Var == null || (arrayList = y0Var.A) == null || (jb4Var = (r45.jb4) kz5.n0.Z(arrayList)) == null || (my0Var = (r45.my0) jb4Var.getCustom(2)) == null) {
            return 0L;
        }
        return my0Var.getLong(0);
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        java.util.ArrayList<r45.jb4> arrayList;
        java.lang.String str;
        java.lang.String string;
        kotlin.jvm.internal.o.g(view, "view");
        in5.s0 s0Var = this.f104832a;
        so2.y0 y0Var = (so2.y0) s0Var.f293125i;
        if (z17) {
            java.util.ArrayList arrayList2 = y0Var.A;
            if ((arrayList2 == null || arrayList2.isEmpty()) || (arrayList = y0Var.A) == null) {
                return;
            }
            for (r45.jb4 jb4Var : arrayList) {
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                android.content.Context context = s0Var.f293121e;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
                int adapterPosition = s0Var.getAdapterPosition();
                r45.my0 my0Var = (r45.my0) jb4Var.getCustom(2);
                if (my0Var == null || (str = my0Var.getString(1)) == null) {
                    str = "";
                }
                r45.my0 my0Var2 = (r45.my0) jb4Var.getCustom(2);
                o3Var.Jk(V6, false, adapterPosition, str, (my0Var2 == null || (string = my0Var2.getString(4)) == null) ? "" : string);
            }
        }
    }
}
