package vx4;

/* loaded from: classes8.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ak3.c f522847d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ak3.c cVar) {
        super(0);
        this.f522847d = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Intent mo2160x1e885992 = this.f522847d.mo2160x1e885992();
        if (mo2160x1e885992 != null) {
            return (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) mo2160x1e885992.getParcelableExtra("fts_multi_task_info");
        }
        return null;
    }
}
