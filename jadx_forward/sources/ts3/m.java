package ts3;

/* loaded from: classes4.dex */
public class m extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final int[] f503213d = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192};

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f503214e;

    /* renamed from: f, reason: collision with root package name */
    public int f503215f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String[] f503216g;

    /* renamed from: h, reason: collision with root package name */
    public int f503217h;

    public m(android.content.Context context, int i17) {
        this.f503216g = null;
        int i18 = 0;
        this.f503217h = 0;
        this.f503214e = context;
        this.f503215f = i17;
        this.f503216g = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hrk).split(";");
        int i19 = 0;
        while (true) {
            int[] iArr = this.f503213d;
            if (i18 >= iArr.length) {
                this.f503217h = i19;
                return;
            } else {
                if ((iArr[i18] & i17) != 0) {
                    i19++;
                }
                i18++;
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f503216g.length;
    }

    @Override // android.widget.Adapter
    public java.lang.Object getItem(int i17) {
        return this.f503216g[i17];
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int i17, android.view.View view, android.view.ViewGroup viewGroup) {
        android.view.View view2;
        ts3.l lVar;
        if (view == null) {
            lVar = new ts3.l();
            view2 = android.view.View.inflate(this.f503214e, com.p314xaae8f345.mm.R.C30864xbddafb2a.cc8, null);
            lVar.f503211a = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.ljq);
            lVar.f503212b = (android.widget.CheckBox) view2.findViewById(com.p314xaae8f345.mm.R.id.ljp);
            view2.setTag(lVar);
        } else {
            view2 = view;
            lVar = (ts3.l) view.getTag();
        }
        lVar.f503211a.setText(this.f503216g[i17]);
        lVar.f503212b.setChecked((this.f503213d[i17] & this.f503215f) != 0);
        return view2;
    }
}
