package p012xc85e97e9.p016x746ad0e3.app;

/* loaded from: classes13.dex */
public class j extends android.widget.ArrayAdapter {
    public j(android.content.Context context, int i17, int i18, java.lang.CharSequence[] charSequenceArr) {
        super(context, i17, i18, charSequenceArr);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
