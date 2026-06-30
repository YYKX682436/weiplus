package androidx.appcompat.app;

/* loaded from: classes13.dex */
public class f implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.k f9102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.h f9103e;

    public f(androidx.appcompat.app.h hVar, androidx.appcompat.app.k kVar) {
        this.f9103e = hVar;
        this.f9102d = kVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        androidx.appcompat.app.h hVar = this.f9103e;
        android.content.DialogInterface.OnClickListener onClickListener = hVar.f9143o;
        androidx.appcompat.app.k kVar = this.f9102d;
        onClickListener.onClick(kVar.f9160b, i17);
        if (hVar.f9147s) {
            return;
        }
        kVar.f9160b.dismiss();
    }
}
