package cf2;

/* loaded from: classes3.dex */
public class f implements com.tencent.mm.ui.widget.dialog.q3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cf2.h f40910a;

    public f(cf2.h hVar) {
        this.f40910a = hVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.q3
    public void dismiss() {
        com.tencent.mars.xlog.Log.i("NoticeCancelEditTipsDialog", "#dismiss");
        com.tencent.mm.ui.tools.f5 f5Var = this.f40910a.S;
        if (f5Var != null) {
            f5Var.d();
        }
    }
}
