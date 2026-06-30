package ch2;

/* loaded from: classes10.dex */
public final class z extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41498d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ch2.o2 o2Var) {
        super(1);
        this.f41498d = o2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            ch2.o2 o2Var = this.f41498d;
            android.content.Context O6 = o2Var.O6();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(O6);
            e4Var.f211776c = o2Var.O6().getString(com.tencent.mm.R.string.mnc);
            e4Var.c();
        } else {
            com.tencent.mars.xlog.Log.e("FinderLiveKTVSingController", "stop play song failed");
        }
        return jz5.f0.f302826a;
    }
}
