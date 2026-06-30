package ay3;

/* loaded from: classes.dex */
public final class n implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f15294a;

    public n(com.tencent.mm.ui.widget.dialog.z2 z2Var) {
        this.f15294a = z2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        this.f15294a.B();
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("mmkv_ringtone_info");
        kotlin.jvm.internal.o.f(M, "getMMKV(...)");
        M.putBoolean("ringtone_exclusive_has_been_educated", true);
    }
}
