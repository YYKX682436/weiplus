package com.tencent.mm.plugin.appbrand;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/RuntimeMigrateRestartHelper$MigrateRestartPreLaunchArgs;", "kotlin.jvm.PlatformType", "args", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/plugin/appbrand/RuntimeMigrateRestartHelper$MigrateRestartPreLaunchResult;", "callback", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/RuntimeMigrateRestartHelper$MigrateRestartPreLaunchArgs;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class se<InputType, ResultType> implements com.tencent.mm.ipcinvoker.i {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.se f88598d = new com.tencent.mm.plugin.appbrand.se();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel launchParcel;
        com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel Ai;
        com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$MigrateRestartPreLaunchArgs runtimeMigrateRestartHelper$MigrateRestartPreLaunchArgs = (com.tencent.mm.plugin.appbrand.RuntimeMigrateRestartHelper$MigrateRestartPreLaunchArgs) obj;
        java.lang.String str = runtimeMigrateRestartHelper$MigrateRestartPreLaunchArgs.f74879d;
        com.tencent.mm.plugin.appbrand.task.e eVar = (com.tencent.mm.plugin.appbrand.task.e) i95.n0.c(com.tencent.mm.plugin.appbrand.task.e.class);
        if (eVar == null || (Ai = eVar.Ai(str)) == null) {
            launchParcel = new com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel();
        } else {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            obtain.setDataPosition(0);
            Ai.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            launchParcel = new com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel(obtain);
            obtain.recycle();
        }
        com.tencent.mm.plugin.appbrand.xe.a(launchParcel, str, runtimeMigrateRestartHelper$MigrateRestartPreLaunchArgs.f74880e);
        new com.tencent.mm.plugin.appbrand.launching.AppBrandPreInitTask(null, launchParcel, false, new com.tencent.mm.plugin.appbrand.re(rVar)).I();
    }
}
