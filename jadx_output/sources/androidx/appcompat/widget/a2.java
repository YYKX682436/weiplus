package androidx.appcompat.widget;

/* loaded from: classes15.dex */
public class a2 implements android.widget.AdapterView.OnItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.widget.SearchView f9510d;

    public a2(androidx.appcompat.widget.SearchView searchView) {
        this.f9510d = searchView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        this.f9510d.o(i17, 0, null);
    }
}
