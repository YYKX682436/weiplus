package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes3.dex */
public final class ah implements com.tencent.mm.ui.widget.dialog.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.v71 f106293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zy2.i5 f106294b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f106295c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f106296d;

    public ah(r45.v71 v71Var, zy2.i5 i5Var, java.lang.String str, com.tencent.mm.ui.MMActivity mMActivity) {
        this.f106293a = v71Var;
        this.f106294b = i5Var;
        this.f106295c = str;
        this.f106296d = mMActivity;
    }

    @Override // com.tencent.mm.ui.widget.dialog.w1
    public final void a(boolean z17, java.lang.String str) {
        zy2.i5 i5Var = this.f106294b;
        if (!z17) {
            i5Var.a(1);
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
        ml2.y4 y4Var = ml2.j0.f327583i;
        y4Var.getClass();
        y4Var.f328286a = "temp_13";
        java.lang.String Gj = ((c61.l7) i95.n0.c(c61.l7.class)).Gj(15, 2, 65);
        r45.aa2 aa2Var = (r45.aa2) this.f106293a.getCustom(2);
        if (aa2Var != null) {
            long j17 = aa2Var.getLong(0);
            long j18 = aa2Var.getLong(2);
            java.lang.String string = aa2Var.getString(1);
            if (string == null) {
                string = "";
            }
            r45.m84 m84Var = new r45.m84();
            m84Var.set(0, java.lang.Long.valueOf(j17));
            m84Var.set(1, java.lang.Long.valueOf(j18));
            m84Var.set(2, string);
            m84Var.set(3, "");
            m84Var.set(4, "");
            m84Var.set(5, "");
            m84Var.set(6, null);
            r45.wk0 wk0Var = new r45.wk0();
            wk0Var.set(0, Gj);
            wk0Var.set(1, "");
            wk0Var.set(3, -1);
            wk0Var.set(4, -1);
            wk0Var.set(5, 1);
            java.lang.String str2 = this.f106295c;
            kotlin.jvm.internal.o.d(str2);
            if (str2.length() > 0) {
                ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).Cj(intent, str2, null);
            }
            ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
            androidx.appcompat.app.AppCompatActivity context = this.f106296d.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            ((vd2.f1) e0Var).Ri(context, intent, m84Var, true, wk0Var, null);
        }
        i5Var.a(2);
    }
}
