package ue2;

/* loaded from: classes3.dex */
public final class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f508347d;

    public g0(yz5.a aVar) {
        this.f508347d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveChatPreviewMigrationHelper", "executeMigrationAnimation: 动画完成");
            yz5.a aVar = this.f508347d;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiveChatPreviewMigrationHelper", "executeMigrationAnimation: 动画结束处理异常", e17);
        }
    }
}
