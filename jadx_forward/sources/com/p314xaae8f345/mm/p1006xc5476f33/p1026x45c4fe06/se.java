package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* JADX INFO: Access modifiers changed from: package-private */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/RuntimeMigrateRestartHelper$MigrateRestartPreLaunchArgs;", "kotlin.jvm.PlatformType", "args", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/plugin/appbrand/RuntimeMigrateRestartHelper$MigrateRestartPreLaunchResult;", "callback", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/RuntimeMigrateRestartHelper$MigrateRestartPreLaunchArgs;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class se<InputType, ResultType> implements com.p314xaae8f345.mm.p794xb0fa9b5e.i {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.se f170131d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.se();

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc c12362x460991bc;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc Ai;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11546x19c44775 c11546x19c44775 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11546x19c44775) obj;
        java.lang.String str = c11546x19c44775.f156412d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e.class);
        if (eVar == null || (Ai = eVar.Ai(str)) == null) {
            c12362x460991bc = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc();
        } else {
            android.os.Parcel obtain = android.os.Parcel.obtain();
            obtain.setDataPosition(0);
            Ai.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            c12362x460991bc = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.p1139xc4aaf986.C12362x460991bc(obtain);
            obtain.recycle();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.xe.a(c12362x460991bc, str, c11546x19c44775.f156413e);
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12330xa378a092(null, c12362x460991bc, false, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.re(rVar)).I();
    }
}
