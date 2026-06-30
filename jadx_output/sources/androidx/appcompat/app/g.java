package androidx.appcompat.app;

/* loaded from: classes13.dex */
public class g implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AlertController$RecycleListView f9105d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.k f9106e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.h f9107f;

    public g(androidx.appcompat.app.h hVar, androidx.appcompat.app.AlertController$RecycleListView alertController$RecycleListView, androidx.appcompat.app.k kVar) {
        this.f9107f = hVar;
        this.f9105d = alertController$RecycleListView;
        this.f9106e = kVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        androidx.appcompat.app.h hVar = this.f9107f;
        boolean[] zArr = hVar.f9145q;
        androidx.appcompat.app.AlertController$RecycleListView alertController$RecycleListView = this.f9105d;
        if (zArr != null) {
            zArr[i17] = alertController$RecycleListView.isItemChecked(i17);
        }
        hVar.f9149u.onClick(this.f9106e.f9160b, i17, alertController$RecycleListView.isItemChecked(i17));
    }
}
