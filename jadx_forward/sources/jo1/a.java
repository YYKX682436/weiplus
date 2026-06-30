package jo1;

/* loaded from: classes.dex */
public final class a implements q80.f0 {
    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RoamBackupLiteAppManager", "start LiteApp failed");
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("BACKUP_CONFIG", 4).edit().putString("last_backup_query", jo1.b.f382410a).apply();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RoamBackupLiteAppManager", ya.b.f77504xbb80cbe3);
    }
}
