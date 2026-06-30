package aq1;

/* loaded from: classes12.dex */
public class h1 implements com.tencent.wcdb.database.SQLiteTrace {
    public h1(aq1.l1 l1Var) {
    }

    @Override // com.tencent.wcdb.database.SQLiteTrace
    public void onConnectionObtained(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, long j17, boolean z17) {
    }

    @Override // com.tencent.wcdb.database.SQLiteTrace
    public void onConnectionPoolBusy(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, long j17, boolean z17, java.util.List list, java.util.List list2) {
        com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().startPerformance(com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcDBEnable(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcDBDelayWrite(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcDBCPU(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcDBIO(), com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcDBThr() ? gm0.j1.e().c() : 0, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcDBTimeoutBusy(), 501, com.tencent.mm.hardcoder.WXHardCoderJNI.getInstance().getHcDBActionWrite(), "MicroMsg.PluginBigBallOfMud");
    }

    @Override // com.tencent.wcdb.database.SQLiteTrace
    public void onDatabaseCorrupted(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase) {
    }

    @Override // com.tencent.wcdb.database.SQLiteTrace
    public void onSQLExecuted(com.tencent.wcdb.database.SQLiteDatabase sQLiteDatabase, java.lang.String str, int i17, long j17) {
    }
}
