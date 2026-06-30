package sx5;

/* loaded from: classes13.dex */
public class r0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sx5.a1 f495287d;

    public r0(sx5.a1 a1Var) {
        this.f495287d = a1Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.p3210x3857dc.n1 n1Var = by5.s0.f118128c;
        if (n1Var != null) {
            n1Var.b(1749L, 7L, 1L);
        }
        sx5.a1 a1Var = this.f495287d;
        boolean z17 = !a1Var.R;
        a1Var.getClass();
        by5.c4.f("XWebNativeInterface", "xwebToJS, videoMute muted:" + z17);
        a1Var.f495205f.mo14660x738236e6(java.lang.String.format("xwebVideoBridge.xwebToJS_Video_MuteChange(%b);", java.lang.Boolean.valueOf(z17)), new sx5.s(a1Var));
    }
}
