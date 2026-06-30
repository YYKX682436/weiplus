package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes13.dex */
public class b0 extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0077x141f33d1 f91052d;

    public b0(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0077x141f33d1 c0077x141f33d1) {
        this.f91052d = c0077x141f33d1;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        throw null;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        getItemViewType(i17);
        throw null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        return 0;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        getItemViewType(i17);
        p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0077x141f33d1 c0077x141f33d1 = this.f91052d;
        if (view == null || view.getId() != com.p314xaae8f345.mm.R.id.i3i) {
            view = android.view.LayoutInflater.from(c0077x141f33d1.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569417al, viewGroup, false);
        }
        c0077x141f33d1.getContext().getPackageManager();
        getItem(i17);
        throw null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }
}
