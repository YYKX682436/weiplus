package bt;

@j95.b
/* loaded from: classes8.dex */
public final class u0 extends i95.w implements ct.a3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f24126d = "LauncherUIFeatureService";

    /* renamed from: e, reason: collision with root package name */
    public int f24127e;

    public final int wi() {
        com.tencent.mm.ui.LauncherUI launcherUI = com.tencent.mm.ui.LauncherUI.getInstance();
        java.lang.Object findViewById = launcherUI != null ? launcherUI.findViewById(com.tencent.mm.R.id.huj) : null;
        com.tencent.mm.ui.t1 t1Var = findViewById instanceof com.tencent.mm.ui.t1 ? (com.tencent.mm.ui.t1) findViewById : null;
        if (t1Var == null) {
            return 0;
        }
        if (t1Var.getFriendTabUnread() > 0) {
            return 2;
        }
        return t1Var.getShowFriendPoint() ? 1 : 0;
    }
}
