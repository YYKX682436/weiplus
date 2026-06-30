package c61;

/* loaded from: classes8.dex */
public final class f3 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f38971d;

    public f3(boolean z17) {
        this.f38971d = z17;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        if (this.f38971d) {
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).hj(11);
        } else {
            ((c61.w8) ((zy2.pa) i95.n0.c(zy2.pa.class))).hj(13);
        }
        com.tencent.mm.plugin.finder.report.p2.f125237a.C(5, null);
    }
}
